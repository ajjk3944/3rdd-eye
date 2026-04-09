package k2;

import android.graphics.PointF;
import i2.z;
import java.util.ArrayList;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5271d;
import n2.C5347a;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes.dex */
public final class q implements s, AbstractC5268a.InterfaceC0489a {

    /* renamed from: a, reason: collision with root package name */
    public final z f43278a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5268a<Float, Float> f43279b;

    /* renamed from: c, reason: collision with root package name */
    public p2.n f43280c;

    public q(z zVar, q2.b bVar, p2.m mVar) {
        this.f43278a = zVar;
        mVar.getClass();
        C5271d c5271dA = mVar.f45068a.a();
        this.f43279b = c5271dA;
        bVar.e(c5271dA);
        c5271dA.a(this);
    }

    public static int c(int i, int i10) {
        int i11 = i / i10;
        if ((i ^ i10) < 0 && i11 * i10 != i) {
            i11--;
        }
        return i - (i11 * i10);
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43278a.invalidateSelf();
    }

    @Override // k2.s
    public final p2.n f(p2.n nVar) {
        ArrayList arrayList;
        boolean z10;
        int i;
        p2.n nVar2 = nVar;
        ArrayList arrayList2 = nVar2.f45069a;
        if (arrayList2.size() > 2) {
            float fFloatValue = this.f43279b.f().floatValue();
            if (fFloatValue != 0.0f) {
                ArrayList arrayList3 = nVar2.f45069a;
                boolean z11 = nVar2.f45071c;
                boolean z12 = true;
                int size = arrayList3.size() - 1;
                int i10 = 0;
                while (size >= 0) {
                    C5347a c5347a = (C5347a) arrayList3.get(size);
                    C5347a c5347a2 = (C5347a) arrayList3.get(c(size - 1, arrayList3.size()));
                    PointF pointF = (size != 0 || z11) ? c5347a2.f44247c : nVar2.f45070b;
                    i10 = (((size != 0 || z11) ? c5347a2.f44246b : pointF).equals(pointF) && c5347a.f44245a.equals(pointF) && !(!nVar2.f45071c && (size == 0 || size == arrayList3.size() - 1))) ? i10 + 2 : i10 + 1;
                    size--;
                }
                p2.n nVar3 = this.f43280c;
                if (nVar3 == null || nVar3.f45069a.size() != i10) {
                    ArrayList arrayList4 = new ArrayList(i10);
                    for (int i11 = 0; i11 < i10; i11++) {
                        arrayList4.add(new C5347a());
                    }
                    this.f43280c = new p2.n(new PointF(0.0f, 0.0f), false, arrayList4);
                }
                p2.n nVar4 = this.f43280c;
                nVar4.f45071c = z11;
                PointF pointF2 = nVar2.f45070b;
                nVar4.a(pointF2.x, pointF2.y);
                ArrayList arrayList5 = nVar4.f45069a;
                boolean z13 = nVar2.f45071c;
                int i12 = 0;
                int i13 = 0;
                while (i12 < arrayList2.size()) {
                    C5347a c5347a3 = (C5347a) arrayList2.get(i12);
                    C5347a c5347a4 = (C5347a) arrayList2.get(c(i12 - 1, arrayList2.size()));
                    C5347a c5347a5 = (C5347a) arrayList2.get(c(i12 - 2, arrayList2.size()));
                    PointF pointF3 = (i12 != 0 || z13) ? c5347a4.f44247c : nVar2.f45070b;
                    PointF pointF4 = (i12 != 0 || z13) ? c5347a4.f44246b : pointF3;
                    boolean z14 = z12;
                    PointF pointF5 = c5347a3.f44245a;
                    PointF pointF6 = c5347a5.f44247c;
                    boolean z15 = (nVar2.f45071c || !(i12 == 0 || i12 == arrayList2.size() + (-1))) ? false : z14;
                    if (pointF4.equals(pointF3) && pointF5.equals(pointF3) && !z15) {
                        float f10 = pointF3.x;
                        float f11 = f10 - pointF6.x;
                        float f12 = pointF3.y;
                        float f13 = f12 - pointF6.y;
                        PointF pointF7 = c5347a3.f44247c;
                        float f14 = pointF7.x - f10;
                        float f15 = pointF7.y - f12;
                        arrayList = arrayList2;
                        double d10 = f11;
                        z10 = z13;
                        i = i12;
                        float fHypot = (float) Math.hypot(d10, f13);
                        float fHypot2 = (float) Math.hypot(f14, f15);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f16 = pointF3.x;
                        float fE = com.google.android.gms.measurement.internal.a.e(pointF6.x, f16, fMin, f16);
                        float f17 = pointF3.y;
                        float fE2 = com.google.android.gms.measurement.internal.a.e(pointF6.y, f17, fMin, f17);
                        float fE3 = com.google.android.gms.measurement.internal.a.e(pointF7.x, f16, fMin2, f16);
                        float fE4 = com.google.android.gms.measurement.internal.a.e(pointF7.y, f17, fMin2, f17);
                        float f18 = fE - ((fE - f16) * 0.5519f);
                        float f19 = fE2 - ((fE2 - f17) * 0.5519f);
                        float f20 = fE3 - ((fE3 - f16) * 0.5519f);
                        float f21 = fE4 - ((fE4 - f17) * 0.5519f);
                        C5347a c5347a6 = (C5347a) arrayList5.get(c(i13 - 1, arrayList5.size()));
                        C5347a c5347a7 = (C5347a) arrayList5.get(i13);
                        c5347a6.f44246b.set(fE, fE2);
                        c5347a6.f44247c.set(fE, fE2);
                        if (i == 0) {
                            nVar4.a(fE, fE2);
                        }
                        c5347a7.f44245a.set(f18, f19);
                        C5347a c5347a8 = (C5347a) arrayList5.get(i13 + 1);
                        c5347a7.f44246b.set(f20, f21);
                        c5347a7.f44247c.set(fE3, fE4);
                        c5347a8.f44245a.set(fE3, fE4);
                        i13 += 2;
                    } else {
                        arrayList = arrayList2;
                        z10 = z13;
                        i = i12;
                        C5347a c5347a9 = (C5347a) arrayList5.get(c(i13 - 1, arrayList5.size()));
                        C5347a c5347a10 = (C5347a) arrayList5.get(i13);
                        PointF pointF8 = c5347a4.f44246b;
                        c5347a9.f44246b.set(pointF8.x, pointF8.y);
                        PointF pointF9 = c5347a4.f44247c;
                        c5347a9.f44247c.set(pointF9.x, pointF9.y);
                        PointF pointF10 = c5347a3.f44245a;
                        c5347a10.f44245a.set(pointF10.x, pointF10.y);
                        i13++;
                    }
                    i12 = i + 1;
                    nVar2 = nVar;
                    z13 = z10;
                    z12 = z14;
                    arrayList2 = arrayList;
                }
                return nVar4;
            }
        }
        return nVar2;
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
    }
}
