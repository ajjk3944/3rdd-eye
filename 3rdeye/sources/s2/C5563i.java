package s2;

import android.graphics.PointF;
import java.io.IOException;
import n2.C5348b;
import t2.AbstractC5601b;

/* compiled from: DocumentDataParser.java */
/* renamed from: s2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5563i implements K<C5348b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5563i f45980a = new C5563i();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5601b.a f45981b = AbstractC5601b.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // s2.K
    public final C5348b a(AbstractC5601b abstractC5601b, float f10) throws IOException {
        C5348b.a aVar = C5348b.a.CENTER;
        abstractC5601b.c();
        String strD = null;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iB = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zN = true;
        String strD2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC5601b.l()) {
            switch (abstractC5601b.k0(f45981b)) {
                case 0:
                    strD = abstractC5601b.D();
                    break;
                case 1:
                    strD2 = abstractC5601b.D();
                    break;
                case 2:
                    fA = (float) abstractC5601b.A();
                    break;
                case 3:
                    int iB2 = abstractC5601b.B();
                    C5348b.a aVar2 = C5348b.a.CENTER;
                    if (iB2 <= aVar2.ordinal() && iB2 >= 0) {
                        aVar = C5348b.a.values()[iB2];
                        break;
                    } else {
                        aVar = aVar2;
                        break;
                    }
                    break;
                case 4:
                    iB = abstractC5601b.B();
                    break;
                case 5:
                    fA2 = (float) abstractC5601b.A();
                    break;
                case 6:
                    fA3 = (float) abstractC5601b.A();
                    break;
                case 7:
                    iA = r.a(abstractC5601b);
                    break;
                case 8:
                    iA2 = r.a(abstractC5601b);
                    break;
                case 9:
                    fA4 = (float) abstractC5601b.A();
                    break;
                case 10:
                    zN = abstractC5601b.n();
                    break;
                case 11:
                    abstractC5601b.a();
                    pointF = new PointF(((float) abstractC5601b.A()) * f10, ((float) abstractC5601b.A()) * f10);
                    abstractC5601b.d();
                    break;
                case 12:
                    abstractC5601b.a();
                    pointF2 = new PointF(((float) abstractC5601b.A()) * f10, ((float) abstractC5601b.A()) * f10);
                    abstractC5601b.d();
                    break;
                default:
                    abstractC5601b.m0();
                    abstractC5601b.p0();
                    break;
            }
        }
        abstractC5601b.e();
        C5348b c5348b = new C5348b();
        c5348b.f44248a = strD;
        c5348b.f44249b = strD2;
        c5348b.f44250c = fA;
        c5348b.f44251d = aVar;
        c5348b.f44252e = iB;
        c5348b.f44253f = fA2;
        c5348b.f44254g = fA3;
        c5348b.f44255h = iA;
        c5348b.i = iA2;
        c5348b.f44256j = fA4;
        c5348b.f44257k = zN;
        c5348b.f44258l = pointF;
        c5348b.f44259m = pointF2;
        return c5348b;
    }
}
