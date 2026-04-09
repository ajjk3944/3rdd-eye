package Ue;

import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.K;
import T.L;
import T.L0;
import Yg.J;
import android.content.Context;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4017o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class o {

    /* synthetic */ class a extends C6490p implements InterfaceC6835l {
        a(Object obj) {
            super(1, obj, g.class, "onSessionStateChanged", "onSessionStateChanged(Lcom/ubnt/ar/common/arcore/ArSessionState;)V", 0);
        }

        public final void a(e7.f p02) {
            AbstractC6492s.i(p02, "p0");
            ((g) this.receiver).f(p02);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e7.f) obj);
            return J.f24997a;
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6835l {
        b(Object obj) {
            super(1, obj, g.class, "onTrackingStateChanged", "onTrackingStateChanged(Lcom/ubnt/ar/common/arcore/ArSessionTrackingState;)V", 0);
        }

        public final void a(e7.g p02) {
            AbstractC6492s.i(p02, "p0");
            ((g) this.receiver).b(p02);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e7.g) obj);
            return J.f24997a;
        }
    }

    public static final class c implements K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f22423a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4017o f22424b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC4015m f22425c;

        public c(InterfaceC3551q0 interfaceC3551q0, InterfaceC4017o interfaceC4017o, InterfaceC4015m interfaceC4015m) {
            this.f22423a = interfaceC3551q0;
            this.f22424b = interfaceC4017o;
            this.f22425c = interfaceC4015m;
        }

        @Override // T.K
        public void dispose() {
            h7.j jVar = (h7.j) this.f22423a.getValue();
            if (jVar != null) {
                jVar.f();
            }
            this.f22424b.O().c(this.f22425c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final androidx.compose.ui.e r19, final Ue.g r20, boolean r21, T.InterfaceC3540l r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ue.o.h(androidx.compose.ui.e, Ue.g, boolean, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K i(g gVar, final InterfaceC3551q0 interfaceC3551q0, InterfaceC4017o interfaceC4017o, final boolean z10, L DisposableEffect) {
        final m7.d gestureWrapper;
        AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
        h7.j jVar = (h7.j) interfaceC3551q0.getValue();
        gVar.e((jVar == null || (gestureWrapper = jVar.getGestureWrapper()) == null) ? new InterfaceC6824a() { // from class: Ue.m
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return o.k();
            }
        } : new InterfaceC6824a() { // from class: Ue.l
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return o.j(gestureWrapper);
            }
        });
        InterfaceC4015m interfaceC4015m = new InterfaceC4015m() { // from class: Ue.n
            @Override // androidx.lifecycle.InterfaceC4015m
            public final void j(InterfaceC4017o interfaceC4017o2, AbstractC4013k.a aVar) {
                o.l(interfaceC3551q0, z10, interfaceC4017o2, aVar);
            }
        };
        interfaceC4017o.O().a(interfaceC4015m);
        return new c(interfaceC3551q0, interfaceC4017o, interfaceC4015m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(m7.d dVar) {
        dVar.o();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC3551q0 interfaceC3551q0, boolean z10, InterfaceC4017o interfaceC4017o, AbstractC4013k.a event) {
        h7.j jVar;
        AbstractC6492s.i(interfaceC4017o, "<unused var>");
        AbstractC6492s.i(event, "event");
        if (event == AbstractC4013k.a.ON_RESUME) {
            h7.j jVar2 = (h7.j) interfaceC3551q0.getValue();
            if (jVar2 != null) {
                jVar2.g(z10);
                return;
            }
            return;
        }
        if (event != AbstractC4013k.a.ON_PAUSE || (jVar = (h7.j) interfaceC3551q0.getValue()) == null) {
            return;
        }
        jVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(androidx.compose.ui.e eVar, g gVar, boolean z10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        h(eVar, gVar, z10, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h7.j n(g gVar, Context context) {
        AbstractC6492s.i(context, "context");
        h7.j jVar = new h7.j(context);
        jVar.h(gVar.a(), gVar.d());
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(g gVar, InterfaceC3551q0 interfaceC3551q0, h7.j view) {
        AbstractC6492s.i(view, "view");
        view.getSurfaceView().getController().b(new a(gVar));
        view.getSurfaceView().getController().a(new b(gVar));
        interfaceC3551q0.setValue(view);
        return J.f24997a;
    }
}
