package u8;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23465i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10, List list) {
        super(list);
        this.f23465i = i10;
        switch (i10) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new f9.b();
                break;
            default:
                int iMax = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    z8.c cVar = (z8.c) ((f9.a) list.get(i11)).f8705b;
                    if (cVar != null) {
                        iMax = Math.max(iMax, cVar.f26715b.length);
                    }
                }
                this.j = new z8.c(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // u8.d
    public final Object g(f9.a aVar, float f10) {
        Object obj;
        float f11;
        switch (this.f23465i) {
            case 0:
                z8.c cVar = (z8.c) this.j;
                z8.c cVar2 = (z8.c) aVar.f8705b;
                z8.c cVar3 = (z8.c) aVar.f8706c;
                int[] iArr = cVar.f26715b;
                float[] fArr = cVar.f26714a;
                boolean zEquals = cVar2.equals(cVar3);
                int[] iArr2 = cVar2.f26715b;
                if (zEquals || f10 <= 0.0f) {
                    cVar.a(cVar2);
                } else if (f10 >= 1.0f) {
                    cVar.a(cVar3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = cVar3.f26715b;
                    if (length != iArr3.length) {
                        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb2.append(iArr2.length);
                        sb2.append(" vs ");
                        throw new IllegalArgumentException(h0.b.i(iArr3.length, ")", sb2));
                    }
                    for (int i10 = 0; i10 < iArr2.length; i10++) {
                        fArr[i10] = e9.g.f(cVar2.f26714a[i10], cVar3.f26714a[i10], f10);
                        iArr[i10] = kc.f.u(iArr2[i10], f10, iArr3[i10]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return cVar;
            case 1:
                return m(aVar, f10, f10, f10);
            default:
                f9.b bVar = (f9.b) this.j;
                Object obj2 = aVar.f8705b;
                if (obj2 == null || (obj = aVar.f8706c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                f9.b bVar2 = (f9.b) obj2;
                f9.b bVar3 = (f9.b) obj;
                bm.e eVar = this.f23451e;
                if (eVar != null) {
                    f11 = f10;
                    f9.b bVar4 = (f9.b) eVar.B(aVar.f8710g, aVar.f8711h.floatValue(), bVar2, bVar3, f11, e(), this.f23450d);
                    if (bVar4 != null) {
                        return bVar4;
                    }
                } else {
                    f11 = f10;
                }
                float f12 = e9.g.f(bVar2.f8718a, bVar3.f8718a, f11);
                float f13 = e9.g.f(bVar2.f8719b, bVar3.f8719b, f11);
                bVar.f8718a = f12;
                bVar.f8719b = f13;
                return bVar;
        }
    }

    @Override // u8.d
    public /* bridge */ /* synthetic */ Object h(f9.a aVar, float f10, float f11, float f12) {
        switch (this.f23465i) {
            case 1:
                return m(aVar, f10, f11, f12);
            default:
                return super.h(aVar, f10, f11, f12);
        }
    }

    public PointF m(f9.a aVar, float f10, float f11, float f12) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = aVar.f8705b;
        if (obj2 == null || (obj = aVar.f8706c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        bm.e eVar = this.f23451e;
        if (eVar != null && (pointF = (PointF) eVar.B(aVar.f8710g, aVar.f8711h.floatValue(), pointF3, pointF4, f10, e(), this.f23450d)) != null) {
            return pointF;
        }
        float f13 = pointF3.x;
        float fA = c7.a.a(pointF4.x, f13, f11, f13);
        float f14 = pointF3.y;
        pointF2.set(fA, c7.a.a(pointF4.y, f14, f12, f14));
        return pointF2;
    }
}
