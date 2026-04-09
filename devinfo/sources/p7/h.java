package p7;

import android.graphics.PointF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f31415a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final km.n f31416b = km.n.q("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // p7.d0
    public final Object b(q7.a aVar, float f10) {
        PointF pointF;
        PointF pointF2;
        aVar.e();
        String strE = null;
        float fY = 0.0f;
        float fY2 = 0.0f;
        float fY3 = 0.0f;
        float fY4 = 0.0f;
        int iA = 0;
        int iA2 = 0;
        int iA3 = 0;
        boolean zW = true;
        int i4 = 3;
        String strE2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        while (aVar.v()) {
            switch (aVar.L(f31416b)) {
                case 0:
                    strE = aVar.E();
                    break;
                case 1:
                    strE2 = aVar.E();
                    break;
                case 2:
                    pointF = pointF3;
                    fY = (float) aVar.y();
                    pointF3 = pointF;
                    break;
                case 3:
                    PointF pointF5 = pointF3;
                    pointF2 = pointF4;
                    int iA4 = aVar.A();
                    i4 = (iA4 > 2 || iA4 < 0) ? 3 : i3.e.d(3)[iA4];
                    pointF3 = pointF5;
                    pointF4 = pointF2;
                    break;
                case 4:
                    iA = aVar.A();
                    break;
                case 5:
                    pointF = pointF3;
                    fY2 = (float) aVar.y();
                    pointF3 = pointF;
                    break;
                case 6:
                    pointF = pointF3;
                    fY3 = (float) aVar.y();
                    pointF3 = pointF;
                    break;
                case 7:
                    iA2 = n.a(aVar);
                    break;
                case 8:
                    iA3 = n.a(aVar);
                    break;
                case 9:
                    pointF = pointF3;
                    fY4 = (float) aVar.y();
                    pointF3 = pointF;
                    break;
                case 10:
                    zW = aVar.w();
                    break;
                case 11:
                    aVar.c();
                    pointF2 = pointF4;
                    PointF pointF6 = new PointF(((float) aVar.y()) * f10, ((float) aVar.y()) * f10);
                    aVar.g();
                    pointF3 = pointF6;
                    pointF4 = pointF2;
                    break;
                case 12:
                    aVar.c();
                    pointF = pointF3;
                    pointF4 = new PointF(((float) aVar.y()) * f10, ((float) aVar.y()) * f10);
                    aVar.g();
                    pointF3 = pointF;
                    break;
                default:
                    aVar.N();
                    aVar.O();
                    break;
            }
        }
        aVar.m();
        k7.b bVar = new k7.b();
        bVar.f28041a = strE;
        bVar.f28042b = strE2;
        bVar.f28043c = fY;
        bVar.f28044d = i4;
        bVar.f28045e = iA;
        bVar.f28046f = fY2;
        bVar.g = fY3;
        bVar.f28047h = iA2;
        bVar.f28048i = iA3;
        bVar.j = fY4;
        bVar.f28049k = zW;
        bVar.f28050l = pointF3;
        bVar.f28051m = pointF4;
        return bVar;
    }
}
