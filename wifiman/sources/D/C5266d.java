package d;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.InterfaceC3540l;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.AbstractC4145N;
import c.InterfaceC4141J;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* renamed from: d.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5266d {

    /* renamed from: a, reason: collision with root package name */
    public static final C5266d f45673a = new C5266d();

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f45674b = AbstractC3561w.d(null, a.f45675a, 1, null);

    /* renamed from: d.d$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45675a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4141J invoke() {
            return null;
        }
    }

    private C5266d() {
    }

    public final InterfaceC4141J a(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2068013981, i10, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        InterfaceC4141J interfaceC4141JA = (InterfaceC4141J) interfaceC3540l.t(f45674b);
        if (interfaceC4141JA == null) {
            interfaceC3540l.U(544166745);
            interfaceC4141JA = AbstractC4145N.a((View) interfaceC3540l.t(AndroidCompositionLocals_androidKt.k()));
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(544164296);
            interfaceC3540l.J();
        }
        if (interfaceC4141JA == null) {
            interfaceC3540l.U(544168748);
            Object baseContext = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC4141J) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC4141JA = (InterfaceC4141J) baseContext;
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(544164377);
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC4141JA;
    }
}
