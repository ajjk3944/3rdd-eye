package u8;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23455i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, List list) {
        super(list);
        this.f23455i = i10;
    }

    @Override // u8.d
    public final Object g(f9.a aVar, float f10) {
        int i10;
        int iIntValue;
        Integer num;
        Object obj;
        switch (this.f23455i) {
            case 0:
                return Integer.valueOf(m(aVar, f10));
            case 1:
                Object obj2 = aVar.f8705b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = aVar.f8706c;
                if (obj3 == null) {
                    if (aVar.k == 784923401) {
                        aVar.k = ((Integer) obj2).intValue();
                    }
                    i10 = aVar.k;
                } else {
                    if (aVar.f8713l == 784923401) {
                        aVar.f8713l = ((Integer) obj3).intValue();
                    }
                    i10 = aVar.f8713l;
                }
                int i11 = i10;
                bm.e eVar = this.f23451e;
                if (eVar == null || (num = (Integer) eVar.B(aVar.f8710g, aVar.f8711h.floatValue(), (Integer) obj2, Integer.valueOf(i11), f10, e(), this.f23450d)) == null) {
                    if (aVar.k == 784923401) {
                        aVar.k = ((Integer) obj2).intValue();
                    }
                    int i12 = aVar.k;
                    PointF pointF = e9.g.f7994a;
                    iIntValue = (int) (((i11 - i12) * f10) + i12);
                } else {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            default:
                Object obj4 = aVar.f8705b;
                bm.e eVar2 = this.f23451e;
                if (eVar2 == null) {
                    return (f10 != 1.0f || (obj = aVar.f8706c) == null) ? (x8.c) obj4 : (x8.c) obj;
                }
                float f11 = aVar.f8710g;
                Float f12 = aVar.f8711h;
                float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
                x8.c cVar = (x8.c) obj4;
                Object obj5 = aVar.f8706c;
                return (x8.c) eVar2.B(f11, fFloatValue, cVar, obj5 == null ? cVar : (x8.c) obj5, f10, d(), this.f23450d);
        }
    }

    public int m(f9.a aVar, float f10) {
        float f11;
        Float f12;
        Object obj = aVar.f8705b;
        Object obj2 = aVar.f8705b;
        if (obj == null || aVar.f8706c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bm.e eVar = this.f23451e;
        if (eVar == null || (f12 = aVar.f8711h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) eVar.B(aVar.f8710g, f12.floatValue(), (Integer) obj2, (Integer) aVar.f8706c, f11, e(), this.f23450d);
            if (num != null) {
                return num.intValue();
            }
        }
        return kc.f.u(((Integer) obj2).intValue(), e9.g.b(f11, 0.0f, 1.0f), ((Integer) aVar.f8706c).intValue());
    }
}
