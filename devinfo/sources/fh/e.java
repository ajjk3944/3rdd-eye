package fh;

import com.liuzh.deviceinfo.pro.account.mode.ApiException;
import je.u;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    @uf.b("status")
    private final String f24043a;

    /* renamed from: b, reason: collision with root package name */
    @uf.b("msg")
    private final String f24044b;

    /* renamed from: c, reason: collision with root package name */
    @uf.b("err_code")
    private final int f24045c;

    /* renamed from: d, reason: collision with root package name */
    @uf.b("data")
    private final T f24046d;

    public final ApiException a() {
        return new ApiException(this.f24045c, null, 2, null);
    }

    public final Object b() {
        return this.f24046d;
    }

    public final int c() {
        return this.f24045c;
    }

    public final boolean d() {
        return k.a(this.f24043a, "suc");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.a(this.f24043a, eVar.f24043a) && k.a(this.f24044b, eVar.f24044b) && this.f24045c == eVar.f24045c && k.a(this.f24046d, eVar.f24046d);
    }

    public final int hashCode() {
        int iM = (u.m(this.f24043a.hashCode() * 31, 31, this.f24044b) + this.f24045c) * 31;
        T t10 = this.f24046d;
        return iM + (t10 == null ? 0 : t10.hashCode());
    }

    public final String toString() {
        String str = this.f24043a;
        String str2 = this.f24044b;
        int i4 = this.f24045c;
        T t10 = this.f24046d;
        StringBuilder sbO = r5.c.o("ApiResult(status=", str, ", msg=", str2, ", errCode=");
        sbO.append(i4);
        sbO.append(", data=");
        sbO.append(t10);
        sbO.append(")");
        return sbO.toString();
    }
}
