package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993cR extends AbstractC1102eR implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f13558e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13559f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13560g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13561h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13562j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13563k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13564l;

    /* renamed from: m, reason: collision with root package name */
    public final int f13565m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13566n;

    public C0993cR(int i, C2108x8 c2108x8, int i3, C0884aR c0884aR, int i6, String str, String str2) {
        int iF;
        super(i, c2108x8, i3);
        int i7 = 0;
        this.f13559f = AbstractC1135f5.x(i6, false);
        int i8 = this.f13905d.f11390e;
        c0884aR.getClass();
        LB lb = c0884aR.f12028r;
        this.f13560g = 1 == (i8 & 1);
        this.f13561h = (i8 & 2) != 0;
        LB lbI = str2 != null ? LB.i(str2) : lb.isEmpty() ? LB.i("") : lb;
        int i9 = 0;
        while (true) {
            if (i9 >= lbI.size()) {
                iF = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                iF = C0911b.f(this.f13905d, (String) lbI.get(i9), false);
                if (iF > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.i = i9;
        this.f13562j = iF;
        int i10 = str2 != null ? 1088 : 0;
        int i11 = this.f13905d.f11391f;
        int iBitCount = (i11 == 0 || i11 != i10) ? Integer.bitCount(i10 & i11) : Integer.MAX_VALUE;
        this.f13563k = iBitCount;
        TP tp = this.f13905d;
        this.f13566n = (1088 & tp.f11391f) != 0;
        int iG = C0911b.g(tp, c0884aR.f12029s);
        this.f13564l = iG;
        int iF2 = C0911b.f(this.f13905d, str, C0911b.e(str) == null);
        this.f13565m = iF2;
        boolean z6 = iF > 0 || (lb.isEmpty() && iBitCount > 0) || ((lb.isEmpty() && iG != Integer.MAX_VALUE) || this.f13560g || (this.f13561h && iF2 > 0));
        if (AbstractC1135f5.x(i6, c0884aR.f13127B) && z6) {
            i7 = 1;
        }
        this.f13558e = i7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1102eR
    public final int a() {
        return this.f13558e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1102eR
    public final /* bridge */ /* synthetic */ boolean b(AbstractC1102eR abstractC1102eR) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0993cR c0993cR) {
        EB ebD = EB.f7923a.d(this.f13559f, c0993cR.f13559f);
        Integer numValueOf = Integer.valueOf(this.i);
        Integer numValueOf2 = Integer.valueOf(c0993cR.i);
        C1033dC c1033dC = C1033dC.f13741b;
        C1033dC c1033dC2 = C1033dC.f13742c;
        EB ebA = ebD.a(numValueOf, numValueOf2, c1033dC2);
        int i = c0993cR.f13562j;
        int i3 = this.f13562j;
        EB ebB = ebA.b(i3, i);
        int i6 = c0993cR.f13563k;
        int i7 = this.f13563k;
        EB ebD2 = ebB.b(i7, i6).a(Integer.valueOf(this.f13564l), Integer.valueOf(c0993cR.f13564l), c1033dC2).d(this.f13560g, c0993cR.f13560g);
        Boolean boolValueOf = Boolean.valueOf(this.f13561h);
        Boolean boolValueOf2 = Boolean.valueOf(c0993cR.f13561h);
        if (i3 != 0) {
            c1033dC = c1033dC2;
        }
        EB ebB2 = ebD2.a(boolValueOf, boolValueOf2, c1033dC).b(this.f13565m, c0993cR.f13565m);
        if (i7 == 0) {
            ebB2 = ebB2.c(this.f13566n, c0993cR.f13566n);
        }
        return ebB2.e();
    }
}
