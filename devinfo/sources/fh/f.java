package fh;

import com.liuzh.deviceinfo.pro.account.mode.User;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @uf.b("user")
    private final User f24047a;

    /* renamed from: b, reason: collision with root package name */
    @uf.b("from_user_info_sync")
    private final boolean f24048b;

    public final boolean a() {
        return this.f24048b;
    }

    public final User b() {
        return this.f24047a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.a(this.f24047a, fVar.f24047a) && this.f24048b == fVar.f24048b;
    }

    public final int hashCode() {
        return (this.f24047a.hashCode() * 31) + (this.f24048b ? 1231 : 1237);
    }

    public final String toString() {
        return "BindHuaweiOrderResult(user=" + this.f24047a + ", fromUserinfoSync=" + this.f24048b + ")";
    }
}
