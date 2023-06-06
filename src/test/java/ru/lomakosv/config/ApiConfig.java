package ru.lomakosv.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/test.properties",
        "system:properties"
})
public interface ApiConfig extends Config {

    @Key("api.token.github")
    String getAccessToken();

    @Key("login.gitHub")
    String getGitHubLogin();

    @Key("password.gitHub")
    String getGitHubPassword();

}
