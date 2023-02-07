package com.dependency.injection.profiles;

import com.dependency.injection.DI.services.ServiceInterface;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("ProfileService")
@Profile({"First", "default"})
public class ProfileInjectionServiceFirst implements ServiceInterface {
    @Override
    public String executeService() {
        return "Profile Injected: First";
    }
}
