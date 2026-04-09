package s2;

import android.graphics.Canvas;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final z2.c f33327a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33328b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33329c;

    /* renamed from: d, reason: collision with root package name */
    public final t2.p f33330d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f33331e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f33332f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(z2.c r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.<init>(z2.c, int, int, long):void");
    }

    public final t2.p a(int i4, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence) {
        r rVar;
        float fC = c();
        z2.c cVar = this.f33327a;
        z2.d dVar = cVar.g;
        int i16 = cVar.f37850l;
        t2.j jVar = cVar.f37848i;
        h0 h0Var = cVar.f37842b;
        z2.a aVar = z2.b.f37840a;
        s sVar = h0Var.f33393c;
        return new t2.p(charSequence, fC, dVar, i4, truncateAt, i16, (sVar == null || (rVar = sVar.f33423a) == null) ? false : rVar.f33421a, i11, i13, i14, i15, i12, i10, jVar);
    }

    public final float b() {
        return this.f33330d.a();
    }

    public final float c() {
        return d3.a.h(this.f33329c);
    }

    public final void d(p1.q qVar) {
        Canvas canvasA = p1.d.a(qVar);
        t2.p pVar = this.f33330d;
        if (pVar.f34143d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, c(), b());
        }
        int i4 = pVar.g;
        if (canvasA.getClipBounds(pVar.f34152o)) {
            if (i4 != 0) {
                canvasA.translate(0.0f, i4);
            }
            ThreadLocal threadLocal = t2.q.f34154a;
            Object oVar = threadLocal.get();
            if (oVar == null) {
                oVar = new t2.o();
                threadLocal.set(oVar);
            }
            t2.o oVar2 = (t2.o) oVar;
            oVar2.f34139a = canvasA;
            try {
                pVar.f34144e.draw(oVar2);
                if (i4 != 0) {
                    canvasA.translate(0.0f, (-1) * i4);
                }
            } finally {
                oVar2.f34139a = null;
            }
        }
        if (pVar.f34143d) {
            canvasA.restore();
        }
    }
}
