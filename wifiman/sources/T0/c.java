package T0;

import L0.B;
import L0.C3178h;
import L0.U;
import L0.z;
import Y0.w;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final a f21299a = new a();

    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.emoji2.text.f] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final CharSequence a(String str, float f10, U u10, List list, List list2, Y0.d dVar, mh.r rVar, boolean z10) {
        CharSequence charSequenceU;
        z zVarA;
        if (z10 && androidx.emoji2.text.f.k()) {
            B bW = u10.w();
            C3178h c3178hD = (bW == null || (zVarA = bW.a()) == null) ? null : C3178h.d(zVarA.b());
            charSequenceU = androidx.emoji2.text.f.c().u(str, 0, str.length(), MPv3.MAX_MESSAGE_ID, c3178hD == null ? 0 : C3178h.g(c3178hD.j(), C3178h.f11144b.a()));
            AbstractC6492s.f(charSequenceU);
        } else {
            charSequenceU = str;
        }
        if (list.isEmpty() && list2.isEmpty() && AbstractC6492s.d(u10.D(), W0.q.f23554c.a()) && w.h(u10.s())) {
            return charSequenceU;
        }
        Spannable spannableString = charSequenceU instanceof Spannable ? (Spannable) charSequenceU : new SpannableString(charSequenceU);
        if (AbstractC6492s.d(u10.A(), W0.k.f23532b.d())) {
            U0.c.u(spannableString, f21299a, 0, str.length());
        }
        if (b(u10) && u10.t() == null) {
            U0.c.r(spannableString, u10.s(), f10, dVar);
        } else {
            W0.h hVarT = u10.t();
            if (hVarT == null) {
                hVarT = W0.h.f23509c.a();
            }
            U0.c.q(spannableString, u10.s(), f10, dVar, hVarT);
        }
        U0.c.y(spannableString, u10.D(), f10, dVar);
        U0.c.w(spannableString, u10, list, dVar, rVar);
        U0.b.d(spannableString, list2, dVar);
        return spannableString;
    }

    public static final boolean b(U u10) {
        z zVarA;
        B bW = u10.w();
        if (bW == null || (zVarA = bW.a()) == null) {
            return false;
        }
        return zVarA.c();
    }
}
