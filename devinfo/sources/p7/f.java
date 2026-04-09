package p7;

import android.graphics.Color;
import android.graphics.PointF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f31408b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f31409c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f31410d = new f(2);

    /* renamed from: e, reason: collision with root package name */
    public static final f f31411e = new f(3);

    /* renamed from: f, reason: collision with root package name */
    public static final f f31412f = new f(4);
    public static final f g = new f(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31413a;

    public /* synthetic */ f(int i4) {
        this.f31413a = i4;
    }

    @Override // p7.d0
    public final Object b(q7.a aVar, float f10) {
        switch (this.f31413a) {
            case 0:
                boolean z3 = aVar.F() == 1;
                if (z3) {
                    aVar.c();
                }
                double dY = aVar.y();
                double dY2 = aVar.y();
                double dY3 = aVar.y();
                double dY4 = aVar.F() == 7 ? aVar.y() : 1.0d;
                if (z3) {
                    aVar.g();
                }
                if (dY <= 1.0d && dY2 <= 1.0d && dY3 <= 1.0d) {
                    dY *= 255.0d;
                    dY2 *= 255.0d;
                    dY3 *= 255.0d;
                    if (dY4 <= 1.0d) {
                        dY4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dY4, (int) dY, (int) dY2, (int) dY3));
            case 1:
                return Float.valueOf(n.d(aVar) * f10);
            case 2:
                return Integer.valueOf(Math.round(n.d(aVar) * f10));
            case 3:
                return n.b(aVar, f10);
            case 4:
                int iF = aVar.F();
                if (iF == 1) {
                    return n.b(aVar, f10);
                }
                if (iF == 3) {
                    return n.b(aVar, f10);
                }
                if (iF != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(je.u.D(iF)));
                }
                PointF pointF = new PointF(((float) aVar.y()) * f10, ((float) aVar.y()) * f10);
                while (aVar.v()) {
                    aVar.O();
                }
                return pointF;
            default:
                boolean z10 = aVar.F() == 1;
                if (z10) {
                    aVar.c();
                }
                float fY = (float) aVar.y();
                float fY2 = (float) aVar.y();
                while (aVar.v()) {
                    aVar.O();
                }
                if (z10) {
                    aVar.g();
                }
                return new s7.c((fY / 100.0f) * f10, (fY2 / 100.0f) * f10);
        }
    }
}
