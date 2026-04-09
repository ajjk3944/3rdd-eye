package com.ui.wifiman.model.teleport;

import Fd.v;
import android.content.Context;
import android.content.Intent;
import com.ui.wifiman.model.teleport.TeleportConnection;
import gg.AbstractC5912b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class a implements v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f43233a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5912b f43234b;

    /* renamed from: com.ui.wifiman.model.teleport.a$a, reason: collision with other inner class name */
    static final class C1444a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1444a f43235a = new C1444a();

        C1444a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(TeleportConnection.a state) {
            boolean z10;
            AbstractC6492s.i(state, "state");
            if (state instanceof TeleportConnection.a.b.AbstractC1441b) {
                z10 = true;
            } else {
                if (!(state instanceof TeleportConnection.a.b.C1440a) && !(state instanceof TeleportConnection.a.C1439a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class b implements InterfaceC6469f {
        b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean shouldStart) {
            AbstractC6492s.i(shouldStart, "shouldStart");
            if (shouldStart.booleanValue()) {
                a.this.c();
            }
        }
    }

    public a(Context context, TeleportConnection teleportConnector) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(teleportConnector, "teleportConnector");
        this.f43233a = context;
        AbstractC5912b abstractC5912bE0 = teleportConnector.getState().N0(C1444a.f43235a).W().f0(new b()).o1(1).i2().E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f43234b = abstractC5912bE0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f43233a.startForegroundService(new Intent(this.f43233a.getApplicationContext(), (Class<?>) TeleportConnectionForegroundService.class));
    }

    @Override // Fd.v
    public AbstractC5912b a() {
        return this.f43234b;
    }
}
