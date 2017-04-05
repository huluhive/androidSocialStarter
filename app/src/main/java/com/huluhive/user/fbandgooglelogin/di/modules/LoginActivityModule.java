package com.huluhive.user.fbandgooglelogin.di.modules;

import android.content.Context;

import com.huluhive.user.fbandgooglelogin.di.scopes.PerActivity;
import com.huluhive.user.fbandgooglelogin.mvp.view.LoginView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import dagger.Module;
import dagger.Provides;

/**
 * Created by User on 4/5/2017.
 */
@Module
public class LoginActivityModule {
    private LoginView mLoginView;
    private Context context;
    public interface ResultCallback{
        void onSuccess(GoogleSignInAccount acct);
    }
    public LoginActivityModule(LoginView loginView, Context context){
        mLoginView=loginView;
        this.context=context;
    }

    @Provides
    @PerActivity
    LoginView providesLoginView(){
        return mLoginView;
    }
    @Provides
    @PerActivity
    Context providesContext(){
        return context;
    }


}
