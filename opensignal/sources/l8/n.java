package l8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14948a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f14949b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f14950c;

    /* renamed from: d, reason: collision with root package name */
    public final m8.h f14951d;

    /* renamed from: e, reason: collision with root package name */
    public final m8.g f14952e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14953f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14954g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14955h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14956i;
    public final ou.s j;
    public final r k;

    /* renamed from: l, reason: collision with root package name */
    public final o f14957l;

    /* renamed from: m, reason: collision with root package name */
    public final b f14958m;

    /* renamed from: n, reason: collision with root package name */
    public final b f14959n;

    /* renamed from: o, reason: collision with root package name */
    public final b f14960o;

    public n(Context context, Bitmap.Config config, ColorSpace colorSpace, m8.h hVar, m8.g gVar, boolean z10, boolean z11, boolean z12, String str, ou.s sVar, r rVar, o oVar, b bVar, b bVar2, b bVar3) {
        this.f14948a = context;
        this.f14949b = config;
        this.f14950c = colorSpace;
        this.f14951d = hVar;
        this.f14952e = gVar;
        this.f14953f = z10;
        this.f14954g = z11;
        this.f14955h = z12;
        this.f14956i = str;
        this.j = sVar;
        this.k = rVar;
        this.f14957l = oVar;
        this.f14958m = bVar;
        this.f14959n = bVar2;
        this.f14960o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (br.l.a(this.f14948a, nVar.f14948a) && this.f14949b == nVar.f14949b) {
            return (Build.VERSION.SDK_INT < 26 || br.l.a(this.f14950c, nVar.f14950c)) && br.l.a(this.f14951d, nVar.f14951d) && this.f14952e == nVar.f14952e && this.f14953f == nVar.f14953f && this.f14954g == nVar.f14954g && this.f14955h == nVar.f14955h && br.l.a(this.f14956i, nVar.f14956i) && br.l.a(this.j, nVar.j) && br.l.a(this.k, nVar.k) && br.l.a(this.f14957l, nVar.f14957l) && this.f14958m == nVar.f14958m && this.f14959n == nVar.f14959n && this.f14960o == nVar.f14960o;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14949b.hashCode() + (this.f14948a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f14950c;
        int iB = w.g.b(w.g.b(w.g.b((this.f14952e.hashCode() + ((this.f14951d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, this.f14953f, 31), this.f14954g, 31), this.f14955h, 31);
        String str = this.f14956i;
        return this.f14960o.hashCode() + ((this.f14959n.hashCode() + ((this.f14958m.hashCode() + ((this.f14957l.f14962a.hashCode() + ((this.k.f14971a.hashCode() + ((((iB + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.j.f19966a)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
