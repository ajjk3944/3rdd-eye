package X9;

import U9.C3621h;
import androidx.lifecycle.E;
import gg.AbstractC5912b;
import ha.InterfaceC5970a;
import ka.InterfaceC6411a;
import kotlin.jvm.internal.AbstractC6492s;
import s9.d;

/* loaded from: classes3.dex */
public class i extends c {

    /* renamed from: J, reason: collision with root package name */
    private final int f24107J;

    /* renamed from: N, reason: collision with root package name */
    private final d.b f24108N;

    public static final class a extends i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(E savedState, com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator, InterfaceC5970a clipboard) {
            super(savedState, session, activityController, vibrator, clipboard);
            AbstractC6492s.i(savedState, "savedState");
            AbstractC6492s.i(session, "session");
            AbstractC6492s.i(activityController, "activityController");
            AbstractC6492s.i(vibrator, "vibrator");
            AbstractC6492s.i(clipboard, "clipboard");
            b1().setValue(new d.b(P9.b.f18428a0));
            I0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(E savedState, com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator, InterfaceC5970a clipboard) {
        super(savedState, session, activityController, vibrator, clipboard);
        AbstractC6492s.i(savedState, "savedState");
        AbstractC6492s.i(session, "session");
        AbstractC6492s.i(activityController, "activityController");
        AbstractC6492s.i(vibrator, "vibrator");
        AbstractC6492s.i(clipboard, "clipboard");
        Y0().setValue(new d.b(P9.b.f18388G));
        a1().setValue(new d.b(P9.b.f18378B));
        k0().setValue(Boolean.FALSE);
        this.f24107J = 12;
        this.f24108N = new d.b(P9.b.f18471w);
    }

    @Override // W9.e
    protected AbstractC5912b G0() {
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    @Override // X9.c
    protected int X0() {
        return this.f24107J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X9.c
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public d.b Z0() {
        return this.f24108N;
    }
}
