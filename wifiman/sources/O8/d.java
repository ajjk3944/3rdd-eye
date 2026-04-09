package O8;

import Qe.c;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.wmw.g;
import i8.s;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import oh.AbstractC7137b;
import s1.k;
import s1.n;
import s1.u;
import se.g;

/* loaded from: classes3.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17637a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f17638b;

    /* renamed from: c, reason: collision with root package name */
    private g.c.b.AbstractC1535b f17639c;

    public d(Context context, NotificationManager notificationManager) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(notificationManager, "notificationManager");
        this.f17637a = context;
        this.f17638b = notificationManager;
    }

    private final k.d e() {
        k.d dVarE = new k.d(this.f17637a, O7.b.WIFIMAN_WIZARD_FW_UPGRADE.getId()).t(R.drawable.ic_wifiman_24_two_toned).r(2).q(true).w(1).f("status").e(true);
        u uVarI = u.i(this.f17637a);
        uVarI.b(s.f49070a.d(this.f17637a, new s.c(c.a.SCAN)));
        k.d dVarN = dVarE.j(uVarI.j(0, 201326592)).l(this.f17637a.getString(R.string.wm_wizard_fw_upgrade_notification_title)).n(1);
        AbstractC6492s.h(dVarN, "setForegroundServiceBehavior(...)");
        return dVarN;
    }

    private final void f(Notification notification) {
        Z7.b.h("WMW Upgrade Service - Updating Wifiman Wizard Upgrade notification", null, 2, null);
        n.b(this.f17637a).d(O7.c.WIFIMAN_WIZARD_FW_UPGRADE.getId(), notification);
    }

    @Override // se.g
    public void a() {
        Z7.b.h("Creating Wifiman Wizard FW Upgrade notification channel", null, 2, null);
        String string = this.f17637a.getString(R.string.wm_wizard_notification_channel_name);
        AbstractC6492s.h(string, "getString(...)");
        String string2 = this.f17637a.getString(R.string.wm_wizard_notification_channel_description);
        AbstractC6492s.h(string2, "getString(...)");
        NotificationChannel notificationChannel = new NotificationChannel(O7.b.WIFIMAN_WIZARD_FW_UPGRADE.getId(), string, 3);
        notificationChannel.setDescription(string2);
        this.f17638b.createNotificationChannel(notificationChannel);
        Z7.b.h("WiFiman Wizard Upgrade notification channel created", null, 2, null);
    }

    @Override // se.g
    public void b() {
        g.c.b.AbstractC1535b abstractC1535b = this.f17639c;
        if (abstractC1535b != null) {
            c(abstractC1535b);
        }
        this.f17639c = null;
    }

    @Override // se.g
    public void c(g.c state) {
        Notification notificationB;
        AbstractC6492s.i(state, "state");
        boolean z10 = state instanceof g.c.a;
        if (!z10 && !(state instanceof g.c.b.C1537c) && !(state instanceof g.c.b.a) && !(state instanceof g.c.b.d)) {
            if (!(state instanceof g.c.b.AbstractC1535b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f17639c = (g.c.b.AbstractC1535b) state;
        }
        k.d dVarE = e();
        if (z10) {
            notificationB = null;
        } else if (state instanceof g.c.b.a) {
            notificationB = dVarE.k(this.f17637a.getString(R.string.wm_wizard_fw_upgrade_notification_download)).s(1000, AbstractC7137b.e(((g.c.b.a) state).a() * 1000.0f), false).b();
        } else if (state instanceof g.c.b.d) {
            notificationB = dVarE.k(this.f17637a.getString(R.string.wm_wizard_fw_upgrade_notification_upload)).s(1000, AbstractC7137b.e(((g.c.b.d) state).a() * 1000.0f), false).b();
        } else if (state instanceof g.c.b.C1537c) {
            notificationB = dVarE.k(this.f17637a.getString(R.string.wm_wizard_fw_upgrade_notification_upgrade)).s(1000, AbstractC7137b.e(((g.c.b.C1537c) state).a() * 1000.0f), false).b();
        } else if (state instanceof g.c.b.AbstractC1535b.C1536b) {
            String string = this.f17637a.getString(R.string.wm_wizard_fw_upgrade_notification_finish);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{((g.c.b.AbstractC1535b.C1536b) state).b()}, 1));
            AbstractC6492s.h(str, "format(...)");
            notificationB = dVarE.k(str).b();
        } else {
            if (!(state instanceof g.c.b.AbstractC1535b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String string2 = this.f17637a.getString(R.string.wm_wizard_fw_upgrade_notification_failed);
            AbstractC6492s.h(string2, "getString(...)");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{((g.c.b.AbstractC1535b.a) state).b()}, 1));
            AbstractC6492s.h(str2, "format(...)");
            notificationB = dVarE.k(str2).b();
        }
        if (notificationB != null) {
            f(notificationB);
        }
    }

    @Override // se.g
    public Notification d() {
        Notification notificationB = e().k(this.f17637a.getString(R.string.wm_wizard_fw_upgrade_notification_initialization)).b();
        AbstractC6492s.h(notificationB, "build(...)");
        return notificationB;
    }
}
