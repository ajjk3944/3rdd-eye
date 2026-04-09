package sa;

import L0.C3174d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC6492s;
import s9.d;

/* renamed from: sa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7930a {
    public static final C3174d a(d dVar, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(dVar, "<this>");
        interfaceC3540l.U(-965919199);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-965919199, i10, -1, "com.ui.core.ui.util.string (CommonStringUtils.kt:20)");
        }
        CharSequence charSequenceA = dVar.a((Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g()), interfaceC3540l, (i10 << 3) & 112);
        C3174d c3174d = charSequenceA instanceof C3174d ? (C3174d) charSequenceA : new C3174d(charSequenceA.toString(), null, null, 6, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c3174d;
    }

    public static final String b(d dVar, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(dVar, "<this>");
        interfaceC3540l.U(-825202891);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-825202891, i10, -1, "com.ui.core.ui.util.stringPlain (CommonStringUtils.kt:31)");
        }
        String string = dVar.a((Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g()), interfaceC3540l, (i10 << 3) & 112).toString();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return string;
    }
}
