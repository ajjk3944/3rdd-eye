package com.liuzh.deviceinfo.pro.account.mode;

import androidx.annotation.Keep;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class LoginData {
    public static final int $stable = 0;
    private final String ltoken;
    private final boolean register;
    private final User user;

    public LoginData(String str, User user, boolean z3) {
        k.e(str, "ltoken");
        k.e(user, "user");
        this.ltoken = str;
        this.user = user;
        this.register = z3;
    }

    public static /* synthetic */ LoginData copy$default(LoginData loginData, String str, User user, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = loginData.ltoken;
        }
        if ((i4 & 2) != 0) {
            user = loginData.user;
        }
        if ((i4 & 4) != 0) {
            z3 = loginData.register;
        }
        return loginData.copy(str, user, z3);
    }

    public final String component1() {
        return this.ltoken;
    }

    public final User component2() {
        return this.user;
    }

    public final boolean component3() {
        return this.register;
    }

    public final LoginData copy(String str, User user, boolean z3) {
        k.e(str, "ltoken");
        k.e(user, "user");
        return new LoginData(str, user, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginData)) {
            return false;
        }
        LoginData loginData = (LoginData) obj;
        return k.a(this.ltoken, loginData.ltoken) && k.a(this.user, loginData.user) && this.register == loginData.register;
    }

    public final String getLtoken() {
        return this.ltoken;
    }

    public final boolean getRegister() {
        return this.register;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        return ((this.user.hashCode() + (this.ltoken.hashCode() * 31)) * 31) + (this.register ? 1231 : 1237);
    }

    public String toString() {
        return "LoginData(ltoken=" + this.ltoken + ", user=" + this.user + ", register=" + this.register + ")";
    }
}
