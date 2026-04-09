package c9;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class h implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f3408a = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3409d = io.sentry.internal.debugmeta.c.v("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // c9.g0
    public final Object a(d9.b bVar, float f10) {
        x8.b bVar2 = x8.b.CENTER;
        bVar.f();
        String strR = null;
        float fG = 0.0f;
        float fG2 = 0.0f;
        float fG3 = 0.0f;
        float fG4 = 0.0f;
        int iL = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zY = true;
        String strR2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (bVar.w()) {
            switch (bVar.Z(f3409d)) {
                case 0:
                    strR = bVar.R();
                    break;
                case 1:
                    strR2 = bVar.R();
                    break;
                case 2:
                    fG = (float) bVar.G();
                    break;
                case 3:
                    int iL2 = bVar.L();
                    x8.b bVar3 = x8.b.CENTER;
                    if (iL2 <= bVar3.ordinal() && iL2 >= 0) {
                        bVar2 = x8.b.values()[iL2];
                        break;
                    } else {
                        bVar2 = bVar3;
                        break;
                    }
                    break;
                case 4:
                    iL = bVar.L();
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    fG2 = (float) bVar.G();
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    fG3 = (float) bVar.G();
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    iA = p.a(bVar);
                    break;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    iA2 = p.a(bVar);
                    break;
                case 9:
                    fG4 = (float) bVar.G();
                    break;
                case 10:
                    zY = bVar.y();
                    break;
                case 11:
                    bVar.b();
                    pointF = new PointF(((float) bVar.G()) * f10, ((float) bVar.G()) * f10);
                    bVar.h();
                    break;
                case 12:
                    bVar.b();
                    pointF2 = new PointF(((float) bVar.G()) * f10, ((float) bVar.G()) * f10);
                    bVar.h();
                    break;
                default:
                    bVar.f0();
                    bVar.i0();
                    break;
            }
        }
        bVar.i();
        x8.c cVar = new x8.c();
        cVar.f25071a = strR;
        cVar.f25072b = strR2;
        cVar.f25073c = fG;
        cVar.f25074d = bVar2;
        cVar.f25075e = iL;
        cVar.f25076f = fG2;
        cVar.f25077g = fG3;
        cVar.f25078h = iA;
        cVar.f25079i = iA2;
        cVar.j = fG4;
        cVar.k = zY;
        cVar.f25080l = pointF;
        cVar.f25081m = pointF2;
        return cVar;
    }
}
