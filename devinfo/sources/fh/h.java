package fh;

import com.liuzh.deviceinfo.pro.account.mode.User;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @uf.b("active_days")
    private final int f24049a;

    /* renamed from: b, reason: collision with root package name */
    @uf.b("user")
    private final User f24050b;

    /* renamed from: c, reason: collision with root package name */
    @uf.b("from_user_info_sync")
    private final boolean f24051c;

    public h(User user) {
        k.e(user, "user");
        this.f24049a = -1;
        this.f24050b = user;
        this.f24051c = true;
    }

    public final boolean a() {
        return this.f24051c;
    }

    public final User b() {
        return this.f24050b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f24049a == hVar.f24049a && k.a(this.f24050b, hVar.f24050b) && this.f24051c == hVar.f24051c;
    }

    public final int hashCode() {
        return ((this.f24050b.hashCode() + (this.f24049a * 31)) * 31) + (this.f24051c ? 1231 : 1237);
    }

    public final String toString() {
        return "RedeemResult(activeDays=" + this.f24049a + ", user=" + this.f24050b + ", fromUserinfoSync=" + this.f24051c + ")";
    }
}
