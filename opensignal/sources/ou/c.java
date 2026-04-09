package ou;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final qu.e f19880a;

    /* renamed from: d, reason: collision with root package name */
    public final String f19881d;

    /* renamed from: g, reason: collision with root package name */
    public final String f19882g;

    /* renamed from: r, reason: collision with root package name */
    public final cv.z f19883r;

    public c(qu.e eVar, String str, String str2) {
        this.f19880a = eVar;
        this.f19881d = str;
        this.f19882g = str2;
        this.f19883r = a.a.e(new c8.c((cv.f0) eVar.f21082g.get(1), this));
    }

    @Override // ou.e0
    public final long b() {
        String str = this.f19882g;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = pu.b.f20645a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // ou.e0
    public final v f() {
        String str = this.f19881d;
        if (str == null) {
            return null;
        }
        Pattern pattern = v.f19976c;
        try {
            return d.e(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // ou.e0
    public final cv.i h() {
        return this.f19883r;
    }
}
