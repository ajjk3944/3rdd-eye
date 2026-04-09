package com.liuzh.deviceinfo.pro.account.mode;

import androidx.annotation.Keep;
import uf.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class Vip {
    public static final int $stable = 0;
    private final boolean available;

    @b("vip_expire")
    private final long vipExpire;

    public Vip(long j, boolean z3) {
        this.vipExpire = j;
        this.available = z3;
    }

    public static /* synthetic */ Vip copy$default(Vip vip, long j, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = vip.vipExpire;
        }
        if ((i4 & 2) != 0) {
            z3 = vip.available;
        }
        return vip.copy(j, z3);
    }

    public final long component1() {
        return this.vipExpire;
    }

    public final boolean component2() {
        return this.available;
    }

    public final Vip copy(long j, boolean z3) {
        return new Vip(j, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vip)) {
            return false;
        }
        Vip vip = (Vip) obj;
        return this.vipExpire == vip.vipExpire && this.available == vip.available;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final long getVipExpire() {
        return this.vipExpire;
    }

    public int hashCode() {
        long j = this.vipExpire;
        return (((int) (j ^ (j >>> 32))) * 31) + (this.available ? 1231 : 1237);
    }

    public String toString() {
        return "Vip(vipExpire=" + this.vipExpire + ", available=" + this.available + ")";
    }
}
