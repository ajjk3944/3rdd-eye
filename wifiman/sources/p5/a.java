package P5;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Y0.h;
import Y0.v;
import Y0.w;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6737x0;
import m0.C6733v0;
import m0.c1;
import m0.i1;
import o6.C7091b;
import o6.C7093d;
import o6.InterfaceC7092c;
import org.conscrypt.PSKKeyManager;
import r6.InterfaceC7576b;
import t6.C8034b;
import w6.b;
import w6.c;
import w6.d;

/* loaded from: classes3.dex */
public abstract class a {
    public static final C7091b a(long j10, float f10, i1 i1Var, InterfaceC7576b interfaceC7576b, b bVar, float f11, long j11, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.e(-2128548061);
        long jA = (i11 & 1) != 0 ? C6733v0.f52951b.a() : j10;
        float fJ = (i11 & 2) != 0 ? h.j(8.0f) : f10;
        i1 i1VarA = (i11 & 4) != 0 ? c1.a() : i1Var;
        InterfaceC7576b interfaceC7576b2 = (i11 & 8) != 0 ? null : interfaceC7576b;
        b bVarA = (i11 & 16) != 0 ? d.a() : bVar;
        float fJ2 = (i11 & 32) != 0 ? h.j(0) : f11;
        long jD = (i11 & 64) != 0 ? C6733v0.f52951b.d() : j11;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2128548061, i10, -1, "com.patrykandpatrick.vico.compose.component.lineComponent (Components.kt:87)");
        }
        C7091b c7091bB = b(jA, fJ, Q5.a.b(i1VarA), interfaceC7576b2, bVarA, fJ2, jD, interfaceC3540l, (i10 & 14) | 37376 | (i10 & 112) | (458752 & i10) | (i10 & 3670016), 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return c7091bB;
    }

    public static final C7091b b(long j10, float f10, InterfaceC7092c shape, InterfaceC7576b interfaceC7576b, b bVar, float f11, long j11, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(shape, "shape");
        interfaceC3540l.e(-2128548061);
        long jA = (i11 & 1) != 0 ? C6733v0.f52951b.a() : j10;
        InterfaceC7576b interfaceC7576b2 = (i11 & 8) != 0 ? null : interfaceC7576b;
        b bVarA = (i11 & 16) != 0 ? d.a() : bVar;
        float fJ = (i11 & 32) != 0 ? h.j(0) : f11;
        long jD = (i11 & 64) != 0 ? C6733v0.f52951b.d() : j11;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2128548061, i10, -1, "com.patrykandpatrick.vico.compose.component.lineComponent (Components.kt:55)");
        }
        Object[] objArr = {C6733v0.g(jA), h.d(f10), shape, interfaceC7576b2, bVarA, h.d(fJ), C6733v0.g(jD)};
        interfaceC3540l.e(-568225417);
        boolean zT = false;
        for (int i12 = 0; i12 < 7; i12++) {
            zT |= interfaceC3540l.T(objArr[i12]);
        }
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new C7091b(AbstractC6737x0.j(jA), f10, shape, interfaceC7576b2, bVarA, fJ, AbstractC6737x0.j(jD));
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.P();
        C7091b c7091b = (C7091b) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return c7091b;
    }

    public static final C8034b c(long j10, long j11, C7093d c7093d, TextUtils.TruncateAt truncateAt, int i10, c cVar, c cVar2, Typeface typeface, Paint.Align align, InterfaceC3540l interfaceC3540l, int i11, int i12) {
        interfaceC3540l.e(-1661734605);
        long jA = (i12 & 1) != 0 ? C6733v0.f52951b.a() : j10;
        long jF = (i12 & 2) != 0 ? w.f(12.0f) : j11;
        C7093d c7093d2 = (i12 & 4) != 0 ? null : c7093d;
        TextUtils.TruncateAt truncateAt2 = (i12 & 8) != 0 ? TextUtils.TruncateAt.END : truncateAt;
        int i13 = (i12 & 16) != 0 ? 1 : i10;
        c cVarA = (i12 & 32) != 0 ? d.a() : cVar;
        c cVarA2 = (i12 & 64) != 0 ? d.a() : cVar2;
        Typeface typeface2 = (i12 & 128) == 0 ? typeface : null;
        Paint.Align align2 = (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? Paint.Align.LEFT : align;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1661734605, i11, -1, "com.patrykandpatrick.vico.compose.component.textComponent (Components.kt:245)");
        }
        Object[] objArr = {C6733v0.g(jA), v.b(jF), c7093d2, truncateAt2, Integer.valueOf(i13), cVarA, cVarA2, typeface2, align2};
        interfaceC3540l.e(-568225417);
        boolean zT = false;
        for (int i14 = 0; i14 < 9; i14++) {
            zT |= interfaceC3540l.T(objArr[i14]);
        }
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            C8034b.a aVar = new C8034b.a();
            aVar.c(AbstractC6737x0.j(jA));
            aVar.i(T5.c.a(jF));
            aVar.d(truncateAt2);
            aVar.e(i13);
            aVar.b(c7093d2);
            aVar.g(cVarA);
            aVar.f(cVarA2);
            aVar.j(typeface2);
            aVar.h(align2);
            objF = aVar.a();
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.P();
        C8034b c8034b = (C8034b) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return c8034b;
    }
}
