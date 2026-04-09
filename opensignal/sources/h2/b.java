package h2;

import android.graphics.Canvas;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final o2.d f9778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9779b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9780c;

    /* renamed from: d, reason: collision with root package name */
    public final i2.h f9781d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f9782e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9783f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(o2.d r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.b.<init>(o2.d, int, int, long):void");
    }

    public final i2.h a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        u uVar;
        float fC = c();
        o2.d dVar = this.f9778a;
        o2.e eVar = dVar.B;
        int i17 = dVar.H;
        i2.d dVar2 = dVar.E;
        j0 j0Var = dVar.f18737d;
        o2.a aVar = o2.b.f18734a;
        v vVar = j0Var.f9842c;
        return new i2.h(charSequence, fC, eVar, i10, truncateAt, i17, (vVar == null || (uVar = vVar.f9881a) == null) ? false : uVar.f9880a, i12, i14, i15, i16, i13, i11, dVar2);
    }

    public final float b() {
        return this.f9781d.a();
    }

    public final float c() {
        return t2.a.h(this.f9780c);
    }

    public final void d(g1.p pVar) {
        Canvas canvasA = g1.c.a(pVar);
        i2.h hVar = this.f9781d;
        if (hVar.f11172d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, c(), b());
        }
        int i10 = hVar.f11175g;
        if (canvasA.getClipBounds(hVar.f11181o)) {
            if (i10 != 0) {
                canvasA.translate(0.0f, i10);
            }
            i2.g gVar = i2.i.f11183a;
            gVar.f11168a = canvasA;
            hVar.f11173e.draw(gVar);
            if (i10 != 0) {
                canvasA.translate(0.0f, (-1) * i10);
            }
        }
        if (hVar.f11172d) {
            canvasA.restore();
        }
    }

    public final void e(g1.p pVar, long j, g1.h0 h0Var, r2.l lVar, i1.c cVar) {
        o2.e eVar = this.f9778a.B;
        int i10 = eVar.f18744c;
        eVar.d(j);
        eVar.f(h0Var);
        eVar.g(lVar);
        eVar.e(cVar);
        eVar.b(3);
        d(pVar);
        eVar.b(i10);
    }

    public final void f(g1.p pVar, g1.f0 f0Var, float f10, g1.h0 h0Var, r2.l lVar, i1.c cVar) {
        o2.e eVar = this.f9778a.B;
        int i10 = eVar.f18744c;
        float fC = c();
        float fB = b();
        eVar.c(f0Var, (Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(fC) << 32), f10);
        eVar.f(h0Var);
        eVar.g(lVar);
        eVar.e(cVar);
        eVar.b(3);
        d(pVar);
        eVar.b(i10);
    }
}
