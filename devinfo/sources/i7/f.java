package i7;

import android.graphics.PointF;
import com.google.android.gms.internal.play_billing.m1;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25879i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i4, List list) {
        super(list);
        this.f25879i = i4;
    }

    @Override // i7.e
    public final Object f(s7.a aVar, float f10) {
        int i4;
        int iIntValue;
        Integer num;
        Object obj;
        switch (this.f25879i) {
            case 0:
                return Integer.valueOf(l(aVar, f10));
            case 1:
                Object obj2 = aVar.f33484b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = aVar.f33485c;
                if (obj3 == null) {
                    if (aVar.f33491k == 784923401) {
                        aVar.f33491k = ((Integer) obj2).intValue();
                    }
                    i4 = aVar.f33491k;
                } else {
                    if (aVar.f33492l == 784923401) {
                        aVar.f33492l = ((Integer) obj3).intValue();
                    }
                    i4 = aVar.f33492l;
                }
                int i10 = i4;
                km.o oVar = this.f25876e;
                if (oVar == null || (num = (Integer) oVar.l(aVar.g, aVar.f33489h.floatValue(), (Integer) obj2, Integer.valueOf(i10), f10, d(), this.f25875d)) == null) {
                    if (aVar.f33491k == 784923401) {
                        aVar.f33491k = ((Integer) obj2).intValue();
                    }
                    int i11 = aVar.f33491k;
                    PointF pointF = r7.h.f32867a;
                    iIntValue = (int) (((i10 - i11) * f10) + i11);
                } else {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            default:
                Object obj4 = aVar.f33484b;
                km.o oVar2 = this.f25876e;
                if (oVar2 == null) {
                    return (f10 != 1.0f || (obj = aVar.f33485c) == null) ? (k7.b) obj4 : (k7.b) obj;
                }
                float f11 = aVar.g;
                Float f12 = aVar.f33489h;
                float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
                k7.b bVar = (k7.b) obj4;
                Object obj5 = aVar.f33485c;
                return (k7.b) oVar2.l(f11, fFloatValue, bVar, obj5 == null ? bVar : (k7.b) obj5, f10, c(), this.f25875d);
        }
    }

    public int l(s7.a aVar, float f10) {
        float f11;
        Float f12;
        Object obj = aVar.f33484b;
        Object obj2 = aVar.f33484b;
        if (obj == null || aVar.f33485c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        km.o oVar = this.f25876e;
        if (oVar == null || (f12 = aVar.f33489h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) oVar.l(aVar.g, f12.floatValue(), (Integer) obj2, (Integer) aVar.f33485c, f11, d(), this.f25875d);
            if (num != null) {
                return num.intValue();
            }
        }
        return m1.j(r7.h.b(f11, 0.0f, 1.0f), ((Integer) obj2).intValue(), ((Integer) aVar.f33485c).intValue());
    }
}
