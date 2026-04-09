package q2;

import H6.I;
import N7.G8;
import i2.C4448h;
import java.util.List;
import java.util.Locale;
import o2.C5411b;
import o2.C5413d;
import o2.C5417h;
import p2.EnumC5447g;
import p2.InterfaceC5442b;
import v2.C5673a;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<InterfaceC5442b> f45374a;

    /* renamed from: b, reason: collision with root package name */
    public final C4448h f45375b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45376c;

    /* renamed from: d, reason: collision with root package name */
    public final long f45377d;

    /* renamed from: e, reason: collision with root package name */
    public final a f45378e;

    /* renamed from: f, reason: collision with root package name */
    public final long f45379f;

    /* renamed from: g, reason: collision with root package name */
    public final String f45380g;

    /* renamed from: h, reason: collision with root package name */
    public final List<p2.h> f45381h;
    public final C5417h i;

    /* renamed from: j, reason: collision with root package name */
    public final int f45382j;

    /* renamed from: k, reason: collision with root package name */
    public final int f45383k;

    /* renamed from: l, reason: collision with root package name */
    public final int f45384l;

    /* renamed from: m, reason: collision with root package name */
    public final float f45385m;

    /* renamed from: n, reason: collision with root package name */
    public final float f45386n;

    /* renamed from: o, reason: collision with root package name */
    public final float f45387o;

    /* renamed from: p, reason: collision with root package name */
    public final float f45388p;

    /* renamed from: q, reason: collision with root package name */
    public final C5413d f45389q;

    /* renamed from: r, reason: collision with root package name */
    public final B0.f f45390r;

    /* renamed from: s, reason: collision with root package name */
    public final C5411b f45391s;

    /* renamed from: t, reason: collision with root package name */
    public final List<C5673a<Float>> f45392t;

    /* renamed from: u, reason: collision with root package name */
    public final b f45393u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f45394v;

    /* renamed from: w, reason: collision with root package name */
    public final I f45395w;

    /* renamed from: x, reason: collision with root package name */
    public final D3.d f45396x;

    /* renamed from: y, reason: collision with root package name */
    public final EnumC5447g f45397y;

    /* compiled from: Layer.java */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<InterfaceC5442b> list, C4448h c4448h, String str, long j4, a aVar, long j10, String str2, List<p2.h> list2, C5417h c5417h, int i, int i10, int i11, float f10, float f11, float f12, float f13, C5413d c5413d, B0.f fVar, List<C5673a<Float>> list3, b bVar, C5411b c5411b, boolean z10, I i12, D3.d dVar, EnumC5447g enumC5447g) {
        this.f45374a = list;
        this.f45375b = c4448h;
        this.f45376c = str;
        this.f45377d = j4;
        this.f45378e = aVar;
        this.f45379f = j10;
        this.f45380g = str2;
        this.f45381h = list2;
        this.i = c5417h;
        this.f45382j = i;
        this.f45383k = i10;
        this.f45384l = i11;
        this.f45385m = f10;
        this.f45386n = f11;
        this.f45387o = f12;
        this.f45388p = f13;
        this.f45389q = c5413d;
        this.f45390r = fVar;
        this.f45392t = list3;
        this.f45393u = bVar;
        this.f45391s = c5411b;
        this.f45394v = z10;
        this.f45395w = i12;
        this.f45396x = dVar;
        this.f45397y = enumC5447g;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbU = G8.u(str);
        sbU.append(this.f45376c);
        sbU.append("\n");
        C4448h c4448h = this.f45375b;
        e eVarE = c4448h.i.e(this.f45379f);
        if (eVarE != null) {
            sbU.append("\t\tParents: ");
            sbU.append(eVarE.f45376c);
            for (e eVarE2 = c4448h.i.e(eVarE.f45379f); eVarE2 != null; eVarE2 = c4448h.i.e(eVarE2.f45379f)) {
                sbU.append("->");
                sbU.append(eVarE2.f45376c);
            }
            sbU.append(str);
            sbU.append("\n");
        }
        List<p2.h> list = this.f45381h;
        if (!list.isEmpty()) {
            sbU.append(str);
            sbU.append("\tMasks: ");
            sbU.append(list.size());
            sbU.append("\n");
        }
        int i10 = this.f45382j;
        if (i10 != 0 && (i = this.f45383k) != 0) {
            sbU.append(str);
            sbU.append("\tBackground: ");
            sbU.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i10), Integer.valueOf(i), Integer.valueOf(this.f45384l)));
        }
        List<InterfaceC5442b> list2 = this.f45374a;
        if (!list2.isEmpty()) {
            sbU.append(str);
            sbU.append("\tShapes:\n");
            for (InterfaceC5442b interfaceC5442b : list2) {
                sbU.append(str);
                sbU.append("\t\t");
                sbU.append(interfaceC5442b);
                sbU.append("\n");
            }
        }
        return sbU.toString();
    }

    public final String toString() {
        return a("");
    }
}
