package com.liuzh.deviceinfo.pro.account.mode;

import androidx.annotation.Keep;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class Account {
    public static final int $stable = 0;
    private final String email;
    private final Huawei huawei;
    private final Wechat wechat;

    public Account(String str, Wechat wechat, Huawei huawei) {
        this.email = str;
        this.wechat = wechat;
        this.huawei = huawei;
    }

    public static /* synthetic */ Account copy$default(Account account, String str, Wechat wechat, Huawei huawei, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = account.email;
        }
        if ((i4 & 2) != 0) {
            wechat = account.wechat;
        }
        if ((i4 & 4) != 0) {
            huawei = account.huawei;
        }
        return account.copy(str, wechat, huawei);
    }

    public final String component1() {
        return this.email;
    }

    public final Wechat component2() {
        return this.wechat;
    }

    public final Huawei component3() {
        return this.huawei;
    }

    public final Account copy(String str, Wechat wechat, Huawei huawei) {
        return new Account(str, wechat, huawei);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        return k.a(this.email, account.email) && k.a(this.wechat, account.wechat) && k.a(this.huawei, account.huawei);
    }

    public final String getEmail() {
        return this.email;
    }

    public final Huawei getHuawei() {
        return this.huawei;
    }

    public final Wechat getWechat() {
        return this.wechat;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Wechat wechat = this.wechat;
        int iHashCode2 = (iHashCode + (wechat == null ? 0 : wechat.hashCode())) * 31;
        Huawei huawei = this.huawei;
        return iHashCode2 + (huawei != null ? huawei.hashCode() : 0);
    }

    public String toString() {
        return "Account(email=" + this.email + ", wechat=" + this.wechat + ", huawei=" + this.huawei + ")";
    }
}
