package T0;

import L0.AbstractC3179i;
import L0.C3174d;
import L0.D;
import L0.W;
import L0.X;
import Q0.A;
import Q0.AbstractC3428e;
import Q0.AbstractC3434k;
import Q0.E;
import Q0.v;
import Q0.w;
import W0.k;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public abstract class a {
    private static final void a(SpannableString spannableString, D d10, int i10, int i11, Y0.d dVar, AbstractC3434k.b bVar) {
        U0.c.k(spannableString, d10.g(), i10, i11);
        U0.c.o(spannableString, d10.k(), dVar, i10, i11);
        if (d10.n() != null || d10.l() != null) {
            A aN = d10.n();
            if (aN == null) {
                aN = A.f18971b.e();
            }
            v vVarL = d10.l();
            spannableString.setSpan(new StyleSpan(AbstractC3428e.c(aN, vVarL != null ? vVarL.i() : v.f19100b.b())), i10, i11, 33);
        }
        if (d10.i() != null) {
            if (d10.i() instanceof E) {
                spannableString.setSpan(new TypefaceSpan(((E) d10.i()).e()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                AbstractC3434k abstractC3434kI = d10.i();
                w wVarM = d10.m();
                Object value = AbstractC3434k.b.b(bVar, abstractC3434kI, null, 0, wVarM != null ? wVarM.m() : w.f19104b.a(), 6, null).getValue();
                AbstractC6492s.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(i.f21323a.a((Typeface) value), i10, i11, 33);
            }
        }
        if (d10.s() != null) {
            W0.k kVarS = d10.s();
            k.a aVar = W0.k.f23532b;
            if (kVarS.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (d10.s().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (d10.u() != null) {
            spannableString.setSpan(new ScaleXSpan(d10.u().b()), i10, i11, 33);
        }
        U0.c.s(spannableString, d10.p(), i10, i11);
        U0.c.h(spannableString, d10.d(), i10, i11);
    }

    public static final SpannableString b(C3174d c3174d, Y0.d dVar, AbstractC3434k.b bVar, t tVar) {
        SpannableString spannableString = new SpannableString(c3174d.k());
        List listH = c3174d.h();
        if (listH != null) {
            int size = listH.size();
            for (int i10 = 0; i10 < size; i10++) {
                C3174d.c cVar = (C3174d.c) listH.get(i10);
                D d10 = (D) cVar.a();
                a(spannableString, d10.a((65503 & 1) != 0 ? d10.g() : 0L, (65503 & 2) != 0 ? d10.f11043b : 0L, (65503 & 4) != 0 ? d10.f11044c : null, (65503 & 8) != 0 ? d10.f11045d : null, (65503 & 16) != 0 ? d10.f11046e : null, (65503 & 32) != 0 ? d10.f11047f : null, (65503 & 64) != 0 ? d10.f11048g : null, (65503 & 128) != 0 ? d10.f11049h : 0L, (65503 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? d10.f11050i : null, (65503 & 512) != 0 ? d10.f11051j : null, (65503 & 1024) != 0 ? d10.f11052k : null, (65503 & 2048) != 0 ? d10.f11053l : 0L, (65503 & 4096) != 0 ? d10.f11054m : null, (65503 & 8192) != 0 ? d10.f11055n : null, (65503 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? d10.f11056o : null, (65503 & 32768) != 0 ? d10.f11057p : null), cVar.b(), cVar.c(), dVar, bVar);
            }
        }
        List listL = c3174d.l(0, c3174d.length());
        int size2 = listL.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C3174d.c cVar2 = (C3174d.c) listL.get(i11);
            spannableString.setSpan(U0.e.a((W) cVar2.a()), cVar2.b(), cVar2.c(), 33);
        }
        List listM = c3174d.m(0, c3174d.length());
        int size3 = listM.size();
        for (int i12 = 0; i12 < size3; i12++) {
            C3174d.c cVar3 = (C3174d.c) listM.get(i12);
            spannableString.setSpan(tVar.c((X) cVar3.a()), cVar3.b(), cVar3.c(), 33);
        }
        List listD = c3174d.d(0, c3174d.length());
        int size4 = listD.size();
        for (int i13 = 0; i13 < size4; i13++) {
            C3174d.c cVar4 = (C3174d.c) listD.get(i13);
            if (cVar4.h() != cVar4.f()) {
                AbstractC3179i abstractC3179i = (AbstractC3179i) cVar4.g();
                if (abstractC3179i instanceof AbstractC3179i.b) {
                    abstractC3179i.a();
                    spannableString.setSpan(tVar.b(c(cVar4)), cVar4.h(), cVar4.f(), 33);
                } else {
                    spannableString.setSpan(tVar.a(cVar4), cVar4.h(), cVar4.f(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final C3174d.c c(C3174d.c cVar) {
        Object objG = cVar.g();
        AbstractC6492s.g(objG, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new C3174d.c((AbstractC3179i.b) objG, cVar.h(), cVar.f());
    }
}
