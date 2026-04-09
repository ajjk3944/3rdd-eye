package s0;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.W0;
import m0.k1;
import m0.l1;

/* loaded from: classes.dex */
public final class r extends o {

    /* renamed from: a, reason: collision with root package name */
    private final String f60999a;

    /* renamed from: b, reason: collision with root package name */
    private final List f61000b;

    /* renamed from: c, reason: collision with root package name */
    private final int f61001c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6713l0 f61002d;

    /* renamed from: e, reason: collision with root package name */
    private final float f61003e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC6713l0 f61004f;

    /* renamed from: g, reason: collision with root package name */
    private final float f61005g;

    /* renamed from: h, reason: collision with root package name */
    private final float f61006h;

    /* renamed from: i, reason: collision with root package name */
    private final int f61007i;

    /* renamed from: j, reason: collision with root package name */
    private final int f61008j;

    /* renamed from: k, reason: collision with root package name */
    private final float f61009k;

    /* renamed from: l, reason: collision with root package name */
    private final float f61010l;

    /* renamed from: m, reason: collision with root package name */
    private final float f61011m;

    /* renamed from: n, reason: collision with root package name */
    private final float f61012n;

    public /* synthetic */ r(String str, List list, int i10, AbstractC6713l0 abstractC6713l0, float f10, AbstractC6713l0 abstractC6713l02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i10, abstractC6713l0, f10, abstractC6713l02, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    public final AbstractC6713l0 b() {
        return this.f61002d;
    }

    public final float e() {
        return this.f61003e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            return AbstractC6492s.d(this.f60999a, rVar.f60999a) && AbstractC6492s.d(this.f61002d, rVar.f61002d) && this.f61003e == rVar.f61003e && AbstractC6492s.d(this.f61004f, rVar.f61004f) && this.f61005g == rVar.f61005g && this.f61006h == rVar.f61006h && k1.e(this.f61007i, rVar.f61007i) && l1.e(this.f61008j, rVar.f61008j) && this.f61009k == rVar.f61009k && this.f61010l == rVar.f61010l && this.f61011m == rVar.f61011m && this.f61012n == rVar.f61012n && W0.d(this.f61001c, rVar.f61001c) && AbstractC6492s.d(this.f61000b, rVar.f61000b);
        }
        return false;
    }

    public final String f() {
        return this.f60999a;
    }

    public final List g() {
        return this.f61000b;
    }

    public int hashCode() {
        int iHashCode = ((this.f60999a.hashCode() * 31) + this.f61000b.hashCode()) * 31;
        AbstractC6713l0 abstractC6713l0 = this.f61002d;
        int iHashCode2 = (((iHashCode + (abstractC6713l0 != null ? abstractC6713l0.hashCode() : 0)) * 31) + Float.hashCode(this.f61003e)) * 31;
        AbstractC6713l0 abstractC6713l02 = this.f61004f;
        return ((((((((((((((((((iHashCode2 + (abstractC6713l02 != null ? abstractC6713l02.hashCode() : 0)) * 31) + Float.hashCode(this.f61005g)) * 31) + Float.hashCode(this.f61006h)) * 31) + k1.f(this.f61007i)) * 31) + l1.f(this.f61008j)) * 31) + Float.hashCode(this.f61009k)) * 31) + Float.hashCode(this.f61010l)) * 31) + Float.hashCode(this.f61011m)) * 31) + Float.hashCode(this.f61012n)) * 31) + W0.e(this.f61001c);
    }

    public final int i() {
        return this.f61001c;
    }

    public final AbstractC6713l0 j() {
        return this.f61004f;
    }

    public final float k() {
        return this.f61005g;
    }

    public final int q() {
        return this.f61007i;
    }

    public final int s() {
        return this.f61008j;
    }

    public final float u() {
        return this.f61009k;
    }

    public final float v() {
        return this.f61006h;
    }

    public final float w() {
        return this.f61011m;
    }

    public final float x() {
        return this.f61012n;
    }

    public final float y() {
        return this.f61010l;
    }

    private r(String str, List list, int i10, AbstractC6713l0 abstractC6713l0, float f10, AbstractC6713l0 abstractC6713l02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super(null);
        this.f60999a = str;
        this.f61000b = list;
        this.f61001c = i10;
        this.f61002d = abstractC6713l0;
        this.f61003e = f10;
        this.f61004f = abstractC6713l02;
        this.f61005g = f11;
        this.f61006h = f12;
        this.f61007i = i11;
        this.f61008j = i12;
        this.f61009k = f13;
        this.f61010l = f14;
        this.f61011m = f15;
        this.f61012n = f16;
    }
}
