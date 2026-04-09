package i7;

import android.graphics.PointF;
import com.google.android.gms.internal.play_billing.m1;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25888i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i4, List list) {
        super(list);
        this.f25888i = i4;
        switch (i4) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new s7.c();
                break;
            default:
                int iMax = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    m7.c cVar = (m7.c) ((s7.a) list.get(i10)).f33484b;
                    if (cVar != null) {
                        iMax = Math.max(iMax, cVar.f28883b.length);
                    }
                }
                this.j = new m7.c(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // i7.e
    public final Object f(s7.a aVar, float f10) {
        Object obj;
        float f11;
        switch (this.f25888i) {
            case 0:
                m7.c cVar = (m7.c) this.j;
                m7.c cVar2 = (m7.c) aVar.f33484b;
                m7.c cVar3 = (m7.c) aVar.f33485c;
                int[] iArr = cVar.f28883b;
                float[] fArr = cVar.f28882a;
                boolean zEquals = cVar2.equals(cVar3);
                int[] iArr2 = cVar2.f28883b;
                if (zEquals || f10 <= 0.0f) {
                    cVar.a(cVar2);
                } else if (f10 >= 1.0f) {
                    cVar.a(cVar3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = cVar3.f28883b;
                    if (length != iArr3.length) {
                        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb2.append(iArr2.length);
                        sb2.append(" vs ");
                        throw new IllegalArgumentException(r5.c.j(iArr3.length, ")", sb2));
                    }
                    for (int i4 = 0; i4 < iArr2.length; i4++) {
                        fArr[i4] = r7.h.f(cVar2.f28882a[i4], cVar3.f28882a[i4], f10);
                        iArr[i4] = m1.j(f10, iArr2[i4], iArr3[i4]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return cVar;
            case 1:
                return l(aVar, f10, f10, f10);
            default:
                s7.c cVar4 = (s7.c) this.j;
                Object obj2 = aVar.f33484b;
                if (obj2 == null || (obj = aVar.f33485c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                s7.c cVar5 = (s7.c) obj2;
                s7.c cVar6 = (s7.c) obj;
                km.o oVar = this.f25876e;
                if (oVar != null) {
                    f11 = f10;
                    s7.c cVar7 = (s7.c) oVar.l(aVar.g, aVar.f33489h.floatValue(), cVar5, cVar6, f11, d(), this.f25875d);
                    if (cVar7 != null) {
                        return cVar7;
                    }
                } else {
                    f11 = f10;
                }
                float f12 = r7.h.f(cVar5.f33503a, cVar6.f33503a, f11);
                float f13 = r7.h.f(cVar5.f33504b, cVar6.f33504b, f11);
                cVar4.f33503a = f12;
                cVar4.f33504b = f13;
                return cVar4;
        }
    }

    @Override // i7.e
    public /* bridge */ /* synthetic */ Object g(s7.a aVar, float f10, float f11, float f12) {
        switch (this.f25888i) {
            case 1:
                return l(aVar, f10, f11, f12);
            default:
                return super.g(aVar, f10, f11, f12);
        }
    }

    public PointF l(s7.a aVar, float f10, float f11, float f12) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = aVar.f33484b;
        if (obj2 == null || (obj = aVar.f33485c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        km.o oVar = this.f25876e;
        if (oVar != null && (pointF = (PointF) oVar.l(aVar.g, aVar.f33489h.floatValue(), pointF3, pointF4, f10, d(), this.f25875d)) != null) {
            return pointF;
        }
        float f13 = pointF3.x;
        float fC = r5.c.c(pointF4.x, f13, f11, f13);
        float f14 = pointF3.y;
        pointF2.set(fC, r5.c.c(pointF4.y, f14, f12, f14));
        return pointF2;
    }
}
