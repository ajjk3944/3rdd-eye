package com.liuzh.deviceinfo.pro.account.mode;

import androidx.annotation.Keep;
import nk.k;
import r5.c;
import uf.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class User {
    public static final int $stable = 0;
    private final Account account;
    private final String avatar;
    private final String nickname;

    @b("register_time")
    private final long registerTime;
    private final String uid;
    private final Vip vip;

    public User(String str, String str2, String str3, long j, Vip vip, Account account) {
        k.e(str, "uid");
        k.e(vip, "vip");
        k.e(account, "account");
        this.uid = str;
        this.nickname = str2;
        this.avatar = str3;
        this.registerTime = j;
        this.vip = vip;
        this.account = account;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, long j, Vip vip, Account account, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = user.uid;
        }
        if ((i4 & 2) != 0) {
            str2 = user.nickname;
        }
        if ((i4 & 4) != 0) {
            str3 = user.avatar;
        }
        if ((i4 & 8) != 0) {
            j = user.registerTime;
        }
        if ((i4 & 16) != 0) {
            vip = user.vip;
        }
        if ((i4 & 32) != 0) {
            account = user.account;
        }
        long j8 = j;
        String str4 = str3;
        return user.copy(str, str2, str4, j8, vip, account);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.nickname;
    }

    public final String component3() {
        return this.avatar;
    }

    public final long component4() {
        return this.registerTime;
    }

    public final Vip component5() {
        return this.vip;
    }

    public final Account component6() {
        return this.account;
    }

    public final User copy(String str, String str2, String str3, long j, Vip vip, Account account) {
        k.e(str, "uid");
        k.e(vip, "vip");
        k.e(account, "account");
        return new User(str, str2, str3, j, vip, account);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return k.a(this.uid, user.uid) && k.a(this.nickname, user.nickname) && k.a(this.avatar, user.avatar) && this.registerTime == user.registerTime && k.a(this.vip, user.vip) && k.a(this.account, user.account);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final long getRegisterTime() {
        return this.registerTime;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Vip getVip() {
        return this.vip;
    }

    public int hashCode() {
        int iHashCode = this.uid.hashCode() * 31;
        String str = this.nickname;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        long j = this.registerTime;
        return this.account.hashCode() + ((this.vip.hashCode() + ((((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.nickname;
        String str3 = this.avatar;
        long j = this.registerTime;
        Vip vip = this.vip;
        Account account = this.account;
        StringBuilder sbO = c.o("User(uid=", str, ", nickname=", str2, ", avatar=");
        sbO.append(str3);
        sbO.append(", registerTime=");
        sbO.append(j);
        sbO.append(", vip=");
        sbO.append(vip);
        sbO.append(", account=");
        sbO.append(account);
        sbO.append(")");
        return sbO.toString();
    }
}
