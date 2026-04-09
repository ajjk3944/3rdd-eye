package X9;

import U9.C3621h;
import androidx.lifecycle.E;
import gg.AbstractC5912b;
import ha.InterfaceC5970a;
import ka.InterfaceC6411a;
import kotlin.jvm.internal.AbstractC6492s;
import s9.d;

/* loaded from: classes3.dex */
public class l extends c {

    public static final class a extends l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(E savedState, com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator, InterfaceC5970a clipboard) {
            super(savedState, session, activityController, vibrator, clipboard);
            AbstractC6492s.i(savedState, "savedState");
            AbstractC6492s.i(session, "session");
            AbstractC6492s.i(activityController, "activityController");
            AbstractC6492s.i(vibrator, "vibrator");
            AbstractC6492s.i(clipboard, "clipboard");
            b1().setValue(new d.b(P9.b.f18425Y0));
            I0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(E savedState, com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator, InterfaceC5970a clipboard) {
        super(savedState, session, activityController, vibrator, clipboard);
        AbstractC6492s.i(savedState, "savedState");
        AbstractC6492s.i(session, "session");
        AbstractC6492s.i(activityController, "activityController");
        AbstractC6492s.i(vibrator, "vibrator");
        AbstractC6492s.i(clipboard, "clipboard");
        Y0().setValue(new d.b(P9.b.f18392I));
        a1().setValue(new d.b(P9.b.f18382D));
        k0().setValue(Boolean.FALSE);
    }

    @Override // W9.e
    protected AbstractC5912b G0() {
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }
}
