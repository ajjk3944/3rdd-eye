package c9;

import android.graphics.Color;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class f implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3405a;

    /* renamed from: d, reason: collision with root package name */
    public static final f f3400d = new f(0);

    /* renamed from: g, reason: collision with root package name */
    public static final f f3401g = new f(1);

    /* renamed from: r, reason: collision with root package name */
    public static final f f3402r = new f(2);

    /* renamed from: x, reason: collision with root package name */
    public static final f f3403x = new f(3);

    /* renamed from: y, reason: collision with root package name */
    public static final f f3404y = new f(4);
    public static final f B = new f(5);

    public /* synthetic */ f(int i10) {
        this.f3405a = i10;
    }

    @Override // c9.g0
    public final Object a(d9.b bVar, float f10) {
        switch (this.f3405a) {
            case 0:
                boolean z10 = bVar.V() == d9.a.BEGIN_ARRAY;
                if (z10) {
                    bVar.b();
                }
                double dG = bVar.G();
                double dG2 = bVar.G();
                double dG3 = bVar.G();
                double dG4 = bVar.V() == d9.a.NUMBER ? bVar.G() : 1.0d;
                if (z10) {
                    bVar.h();
                }
                if (dG <= 1.0d && dG2 <= 1.0d && dG3 <= 1.0d) {
                    dG *= 255.0d;
                    dG2 *= 255.0d;
                    dG3 *= 255.0d;
                    if (dG4 <= 1.0d) {
                        dG4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dG4, (int) dG, (int) dG2, (int) dG3));
            case 1:
                return Float.valueOf(p.d(bVar) * f10);
            case 2:
                return Integer.valueOf(Math.round(p.d(bVar) * f10));
            case 3:
                return p.b(bVar, f10);
            case 4:
                d9.a aVarV = bVar.V();
                if (aVarV == d9.a.BEGIN_ARRAY) {
                    return p.b(bVar, f10);
                }
                if (aVarV == d9.a.BEGIN_OBJECT) {
                    return p.b(bVar, f10);
                }
                if (aVarV != d9.a.NUMBER) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is " + aVarV);
                }
                PointF pointF = new PointF(((float) bVar.G()) * f10, ((float) bVar.G()) * f10);
                while (bVar.w()) {
                    bVar.i0();
                }
                return pointF;
            default:
                boolean z11 = bVar.V() == d9.a.BEGIN_ARRAY;
                if (z11) {
                    bVar.b();
                }
                float fG = (float) bVar.G();
                float fG2 = (float) bVar.G();
                while (bVar.w()) {
                    bVar.i0();
                }
                if (z11) {
                    bVar.h();
                }
                return new f9.b((fG / 100.0f) * f10, (fG2 / 100.0f) * f10);
        }
    }
}
