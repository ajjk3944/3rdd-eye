package zl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import br.l;
import i.j;
import mq.x;
import qm.f;

/* loaded from: classes.dex */
public final class a extends ml.c {

    /* renamed from: c, reason: collision with root package name */
    public final f f27447c;

    /* renamed from: d, reason: collision with root package name */
    public final hl.a f27448d;

    /* renamed from: e, reason: collision with root package name */
    public final ul.a f27449e;

    /* renamed from: f, reason: collision with root package name */
    public final nl.a f27450f;

    /* renamed from: g, reason: collision with root package name */
    public final cm.a f27451g;

    /* renamed from: h, reason: collision with root package name */
    public final gl.a f27452h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27453i;

    public a(f fVar, hl.a aVar, ul.a aVar2, nl.a aVar3, cm.a aVar4, gl.a aVar5) {
        l.e(fVar, "permissionsManager");
        l.e(aVar, "permissionResultChecker");
        l.e(aVar2, "onboardingAnalytics");
        l.e(aVar3, "gdprRepository");
        l.e(aVar4, "sdkConfigRepository");
        l.e(aVar5, "logger");
        this.f27447c = fVar;
        this.f27448d = aVar;
        this.f27449e = aVar2;
        this.f27450f = aVar3;
        this.f27451g = aVar4;
        this.f27452h = aVar5;
        this.f27453i = aVar3.f18456a.getBoolean("gdpr_pre_accept_toggle_state", true);
    }

    public final void d(androidx.fragment.app.b bVar) {
        b bVar2 = b.f27457d;
        b bVar3 = b.f27455b;
        b bVar4 = b.f27454a;
        b bVar5 = b.f27458e;
        f fVar = this.f27447c;
        ul.a aVar = this.f27449e;
        d0 d0Var = this.f16872b;
        Object obj = d0Var.f1488e;
        Object obj2 = c0.j;
        if (obj == obj2) {
            obj = null;
        }
        e eVar = (e) obj;
        gl.a aVar2 = this.f27452h;
        StringBuilder sb2 = new StringBuilder("onButtonClicked: ");
        Object obj3 = d0Var.f1488e;
        if (obj3 == obj2) {
            obj3 = null;
        }
        e eVar2 = (e) obj3;
        sb2.append(eVar2 != null ? eVar2.getClass().getSimpleName() : null);
        String string = sb2.toString();
        aVar2.getClass();
        l.e(string, "message");
        if (l.a(eVar, b.f27456c)) {
            c(bVar2);
            return;
        }
        if (l.a(eVar, b.f27459f)) {
            aVar.a("launchscreen");
            c(bVar2);
            return;
        }
        if (l.a(eVar, bVar2)) {
            String str = "GDPR button clicked. consentGiven: " + this.f27453i;
            aVar2.getClass();
            l.e(str, "message");
            nl.a aVar3 = this.f27450f;
            if (!aVar3.f18456a.getBoolean("taken_consent_decision", false) && this.f27453i) {
                this.f27451g.b(true);
            }
            SharedPreferences.Editor editorEdit = aVar3.f18456a.edit();
            editorEdit.putBoolean("taken_consent_decision", true);
            editorEdit.apply();
            aVar.a("gdprscreen");
            Context contextX = bVar.X();
            fVar.getClass();
            if (f.c(contextX, "android.permission.READ_PHONE_STATE")) {
                j jVarW = bVar.W();
                if (jVarW.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || jVarW.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                    g();
                    return;
                }
            }
            c(bVar5);
            return;
        }
        if (l.a(eVar, bVar5)) {
            Context contextX2 = bVar.X();
            aVar.a("introscreen");
            fVar.getClass();
            if (!f.c(contextX2, "android.permission.ACCESS_FINE_LOCATION")) {
                c(new c(true));
                return;
            } else if (f.c(contextX2, "android.permission.READ_PHONE_STATE")) {
                g();
                return;
            } else {
                c(new d(true));
                return;
            }
        }
        if (eVar instanceof c) {
            c(bVar4);
            return;
        }
        if (l.a(eVar, bVar4)) {
            h(bVar.X());
        } else if (eVar instanceof d) {
            c(bVar3);
        } else if (l.a(eVar, bVar3)) {
            g();
        }
    }

    public final void e(Context context) {
        hl.a aVar = this.f27448d;
        f fVar = aVar.f10842a;
        Context context2 = aVar.f10843b;
        fVar.getClass();
        boolean zC = f.c(context2, "android.permission.ACCESS_FINE_LOCATION");
        boolean zB = f.b(context2);
        kl.a aVar2 = (zC && zB) ? kl.a.ALLOW : (!zC || zB) ? (zC || !zB) ? kl.a.DENY : kl.a.DENY : kl.a.ONLY_IN_APP;
        ul.a aVar3 = this.f27449e;
        aVar3.getClass();
        l.e(aVar2, "result");
        ch.f fVar2 = aVar3.f23592b;
        String str = fVar2.f() ? "bglocation" : fVar2.e() ? "locationscreen" : "locationsimplescreen";
        aVar3.f23591a.d("CATEGORY_ONBOARDING", aVar2.getState() + '_' + str, x.f16946a);
        h(context);
    }

    public final void f() {
        hl.a aVar = this.f27448d;
        f fVar = aVar.f10842a;
        Context context = aVar.f10843b;
        fVar.getClass();
        kl.b bVar = f.c(context, "android.permission.READ_PHONE_STATE") ? kl.b.ALLOW : kl.b.DENY;
        ul.a aVar2 = this.f27449e;
        aVar2.getClass();
        l.e(bVar, "result");
        aVar2.f23591a.d("CATEGORY_ONBOARDING", bVar.getState() + "_phonescreen", x.f16946a);
        aVar2.a("phonescreen");
        g();
    }

    public final void g() {
        this.f27452h.getClass();
        c(b.f27460g);
    }

    public final void h(Context context) {
        ul.a aVar = this.f27449e;
        ch.f fVar = aVar.f23592b;
        aVar.a(fVar.f() ? "bglocation" : fVar.e() ? "locationscreen" : "locationsimplescreen");
        this.f27447c.getClass();
        if (f.c(context, "android.permission.READ_PHONE_STATE")) {
            g();
        } else {
            c(new d(true));
        }
    }
}
