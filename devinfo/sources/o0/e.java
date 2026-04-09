package o0;

import i1.m;
import i2.v0;
import je.u;
import nk.k;
import s2.h0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f30337a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f30338b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.d f30339c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30340d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30341e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30342f;
    public final int g;

    public e(String str, h0 h0Var, v2.d dVar, int i4, boolean z3, int i10, int i11) {
        this.f30337a = str;
        this.f30338b = h0Var;
        this.f30339c = dVar;
        this.f30340d = i4;
        this.f30341e = z3;
        this.f30342f = i10;
        this.g = i11;
    }

    @Override // i2.v0
    public final m d() {
        h hVar = new h();
        hVar.f30349o = this.f30337a;
        hVar.f30350p = this.f30338b;
        hVar.f30351q = this.f30339c;
        hVar.f30352r = this.f30340d;
        hVar.f30353s = this.f30341e;
        hVar.f30354t = this.f30342f;
        hVar.f30355u = this.g;
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // i2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(i1.m r12) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.e.e(i1.m):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.a(this.f30337a, eVar.f30337a) && k.a(this.f30338b, eVar.f30338b) && k.a(this.f30339c, eVar.f30339c) && this.f30340d == eVar.f30340d && this.f30341e == eVar.f30341e && this.f30342f == eVar.f30342f && this.g == eVar.g;
    }

    public final int hashCode() {
        return (((((((((this.f30339c.hashCode() + u.n(this.f30338b, this.f30337a.hashCode() * 31, 31)) * 31) + this.f30340d) * 31) + (this.f30341e ? 1231 : 1237)) * 31) + this.f30342f) * 31) + this.g) * 31;
    }
}
