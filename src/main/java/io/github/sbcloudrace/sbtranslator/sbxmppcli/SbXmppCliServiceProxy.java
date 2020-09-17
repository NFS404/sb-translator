package io.github.sbcloudrace.sbtranslator.sbxmppcli;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "sb-xmpp-cli", url = "localhost:8201", path = "/sb-xmpp-cli")
public interface SbXmppCliServiceProxy {

    @RequestMapping(value = "/powerups/activated/{securityToken}/{targetId}/{powerupHash}/{receivers}",
            method = RequestMethod.PUT)
    void activated(@PathVariable String securityToken,
                   @PathVariable("targetId") Long targetId,
                   @PathVariable Integer powerupHash,
                   @PathVariable("receivers") String receivers);
}