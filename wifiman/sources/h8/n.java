package H8;

import Id.f;
import Qe.c;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import ec.AbstractC5452a;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import i8.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh.AbstractC7137b;
import s1.k;
import s1.u;

/* loaded from: classes3.dex */
public final class n implements com.ui.wifiman.model.teleport.g, K8.d, Id.f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7798c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f7799d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f7800a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f7801b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements InterfaceC5915e {
        public b() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("Creating Teleport notification channel", null, 2, null);
                String string = n.this.f7800a.getString(R.string.teleport_notification_channel_name);
                AbstractC6492s.h(string, "getString(...)");
                String string2 = n.this.f7800a.getString(R.string.teleport_notification_channel_description);
                AbstractC6492s.h(string2, "getString(...)");
                NotificationChannel notificationChannel = new NotificationChannel(O7.b.TELEPORT.getId(), string, 3);
                notificationChannel.setDescription(string2);
                n.this.f7801b.createNotificationChannel(notificationChannel);
                Z7.b.h("Teleport notification channel created", null, 2, null);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public n(Context applicationContext, NotificationManager notificationManager) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(notificationManager, "notificationManager");
        this.f7800a = applicationContext;
        this.f7801b = notificationManager;
    }

    private final k.d e() {
        k.d dVarF = new k.d(this.f7800a, O7.b.TELEPORT.getId()).t(R.drawable.ic_teleport_24).i(true).h(this.f7800a.getColor(R.color.ui_blue_6)).r(2).q(true).w(1).f("status");
        u uVarI = u.i(this.f7800a);
        uVarI.b(s.f49070a.d(this.f7800a, new s.c(c.a.TELEPORT)));
        k.d dVarJ = dVarF.j(uVarI.j(0, 201326592));
        AbstractC6492s.h(dVarJ, "setContentIntent(...)");
        return dVarJ;
    }

    private final k.d g(k.d dVar, Float f10) {
        if (f10 == null) {
            k.d dVarS = dVar.s(0, 0, false);
            AbstractC6492s.f(dVarS);
            return dVarS;
        }
        k.d dVarS2 = dVar.s(1000, AbstractC7137b.e(f10.floatValue() * 1000), false);
        AbstractC6492s.f(dVarS2);
        return dVarS2;
    }

    @Override // Id.f
    public Id.c B(UnifiTeleportTunnel.Error error) {
        return f.a.a(this, error);
    }

    @Override // Id.f
    public Id.c S(UnifiConsoleConnectionError unifiConsoleConnectionError) {
        return f.a.d(this, unifiConsoleConnectionError);
    }

    @Override // com.ui.wifiman.model.teleport.g
    public AbstractC5912b a() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // com.ui.wifiman.model.teleport.g
    public Notification b(TeleportConnection.a state) {
        Id.c cVarF;
        AbstractC5452a abstractC5452aB;
        Id.c cVarF2;
        AbstractC5452a abstractC5452aC;
        AbstractC6492s.i(state, "state");
        if (state instanceof TeleportConnection.a.b.C1440a) {
            k.d dVarK = e().l(this.f7800a.getString(R.string.teleport)).k(this.f7800a.getString(R.string.teleport_tunnel_state_connected));
            AbstractC6492s.h(dVarK, "setContentText(...)");
            Notification notificationB = g(dVarK, Float.valueOf(((TeleportConnection.a.b.C1440a) state).a())).e(true).p(false).b();
            AbstractC6492s.h(notificationB, "build(...)");
            return notificationB;
        }
        if (state instanceof TeleportConnection.a.b.AbstractC1441b) {
            k.d dVarK2 = e().l(this.f7800a.getString(R.string.teleport)).k(this.f7800a.getString(R.string.teleport_tunnel_state_connecting));
            AbstractC6492s.h(dVarK2, "setContentText(...)");
            Notification notificationB2 = g(dVarK2, Float.valueOf(state.a())).p(true).b();
            AbstractC6492s.h(notificationB2, "build(...)");
            return notificationB2;
        }
        if (!(state instanceof TeleportConnection.a.C1439a)) {
            throw new NoWhenBranchMatchedException();
        }
        k.d dVarE = e();
        TeleportConnection.a.C1439a c1439a = (TeleportConnection.a.C1439a) state;
        TeleportConnection.Error errorB = c1439a.b();
        k.d dVarL = dVarE.l((errorB == null || (cVarF2 = f(errorB)) == null || (abstractC5452aC = K8.b.c(cVarF2)) == null) ? null : abstractC5452aC.a(this.f7800a));
        TeleportConnection.Error errorB2 = c1439a.b();
        k.d dVarE2 = dVarL.k((errorB2 == null || (cVarF = f(errorB2)) == null || (abstractC5452aB = K8.b.b(cVarF)) == null) ? null : abstractC5452aB.a(this.f7800a)).e(true);
        AbstractC6492s.h(dVarE2, "setAutoCancel(...)");
        Notification notificationB3 = g(dVarE2, null).p(false).b();
        AbstractC6492s.h(notificationB3, "build(...)");
        return notificationB3;
    }

    public Id.c f(TeleportConnection.Error error) {
        return f.a.c(this, error);
    }

    @Override // Id.f
    public Id.c t(TeleportCloud.Error error) {
        return f.a.b(this, error);
    }
}
