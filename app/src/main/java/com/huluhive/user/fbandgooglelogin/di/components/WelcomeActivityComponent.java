package com.huluhive.user.fbandgooglelogin.di.components;

import com.huluhive.user.fbandgooglelogin.di.modules.WelcomeActivityModule;
import com.huluhive.user.fbandgooglelogin.di.scopes.PerActivity;
import com.huluhive.user.fbandgooglelogin.ui.activities.WelcomActivity;

import dagger.Component;

/**
 * Created by User on 4/5/2017.
 */
@Component(dependencies = LoginApplicationComponent.class,modules = WelcomeActivityModule.class)
@PerActivity
public interface WelcomeActivityComponent {

    void inject(WelcomActivity welcomActivity);

}
