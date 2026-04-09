package com.liuzh.deviceinfo.pro.account.mode;

import a0.g;
import androidx.annotation.Keep;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class Wechat {
    public static final int $stable = 0;
    private final String avatar;
    private final String nickname;

    public Wechat(String str, String str2) {
        k.e(str, "nickname");
        this.nickname = str;
        this.avatar = str2;
    }

    public static /* synthetic */ Wechat copy$default(Wechat wechat, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = wechat.nickname;
        }
        if ((i4 & 2) != 0) {
            str2 = wechat.avatar;
        }
        return wechat.copy(str, str2);
    }

    public final String component1() {
        return this.nickname;
    }

    public final String component2() {
        return this.avatar;
    }

    public final Wechat copy(String str, String str2) {
        k.e(str, "nickname");
        return new Wechat(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wechat)) {
            return false;
        }
        Wechat wechat = (Wechat) obj;
        return k.a(this.nickname, wechat.nickname) && k.a(this.avatar, wechat.avatar);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public int hashCode() {
        int iHashCode = this.nickname.hashCode() * 31;
        String str = this.avatar;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return g.n("Wechat(nickname=", this.nickname, ", avatar=", this.avatar, ")");
    }
}
