package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class VQ extends AbstractC1102eR implements Comparable {

    /* renamed from: C, reason: collision with root package name */
    public final int f11993C;

    /* renamed from: D, reason: collision with root package name */
    public final int f11994D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f11995E;

    /* renamed from: F, reason: collision with root package name */
    public final int f11996F;

    /* renamed from: G, reason: collision with root package name */
    public final int f11997G;

    /* renamed from: H, reason: collision with root package name */
    public final int f11998H;

    /* renamed from: I, reason: collision with root package name */
    public final int f11999I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f12000J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f12001K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f12002L;

    /* renamed from: e, reason: collision with root package name */
    public final int f12003e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12004f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12005g;

    /* renamed from: h, reason: collision with root package name */
    public final C0884aR f12006h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12007j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12008k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12009l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12010m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f12011n;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VQ(int r14, com.google.android.gms.internal.ads.C2108x8 r15, int r16, com.google.android.gms.internal.ads.C0884aR r17, int r18, boolean r19, com.google.android.gms.internal.ads.WQ r20) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.VQ.<init>(int, com.google.android.gms.internal.ads.x8, int, com.google.android.gms.internal.ads.aR, int, boolean, com.google.android.gms.internal.ads.WQ):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1102eR
    public final int a() {
        return this.f12003e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1102eR
    public final /* bridge */ /* synthetic */ boolean b(AbstractC1102eR abstractC1102eR) {
        String str;
        int i;
        VQ vq = (VQ) abstractC1102eR;
        this.f12006h.getClass();
        TP tp = this.f13905d;
        int i3 = tp.f11378E;
        if (i3 == -1) {
            return false;
        }
        TP tp2 = vq.f13905d;
        return i3 == tp2.f11378E && (str = tp.f11397m) != null && TextUtils.equals(str, tp2.f11397m) && (i = tp.f11379F) != -1 && i == tp2.f11379F && this.f12000J == vq.f12000J && this.f12001K == vq.f12001K;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(VQ vq) {
        boolean z6 = this.i;
        boolean z7 = this.f12004f;
        Comparator c1573nC = (z7 && z6) ? C0911b.f13269k : new C1573nC();
        EB ebD = EB.f7923a.d(z6, vq.i);
        Integer numValueOf = Integer.valueOf(this.f12008k);
        Integer numValueOf2 = Integer.valueOf(vq.f12008k);
        C1033dC c1033dC = C1033dC.f13742c;
        EB ebA = ebD.a(numValueOf, numValueOf2, c1033dC).b(this.f12007j, vq.f12007j).b(this.f12009l, vq.f12009l).a(Integer.valueOf(this.f12010m), Integer.valueOf(vq.f12010m), c1033dC).d(this.f11995E, vq.f11995E).d(this.f12011n, vq.f12011n).a(Integer.valueOf(this.f11993C), Integer.valueOf(vq.f11993C), c1033dC).b(this.f11994D, vq.f11994D).d(z7, vq.f12004f).a(Integer.valueOf(this.f11999I), Integer.valueOf(vq.f11999I), c1033dC);
        this.f12006h.getClass();
        EB ebA2 = ebA.d(this.f12000J, vq.f12000J).d(this.f12001K, vq.f12001K).d(this.f12002L, vq.f12002L).a(Integer.valueOf(this.f11996F), Integer.valueOf(vq.f11996F), c1573nC).a(Integer.valueOf(this.f11997G), Integer.valueOf(vq.f11997G), c1573nC);
        if (Objects.equals(this.f12005g, vq.f12005g)) {
            ebA2 = ebA2.a(Integer.valueOf(this.f11998H), Integer.valueOf(vq.f11998H), c1573nC);
        }
        return ebA2.e();
    }
}
