package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ui0 implements zh0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17207a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17208b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17209c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17210d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f17211e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f17212f;

    public ui0(Context context, p10 p10Var, sr0 sr0Var, w81 w81Var, xk xkVar) {
        this.f17208b = context;
        this.f17209c = p10Var;
        this.f17212f = sr0Var;
        this.f17211e = w81Var;
        this.f17210d = xkVar;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(dq0 dq0Var, wp0 wp0Var) throws JSONException {
        String string;
        aq0 aq0Var;
        switch (this.f17207a) {
            case 0:
                Context context = this.f17208b;
                if ((context instanceof Activity) && al.a(context)) {
                    try {
                        string = wp0Var.f18112v.getString("tab_url");
                    } catch (Exception unused) {
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string)) {
                    }
                }
                break;
            default:
                if (((xk) this.f17210d) == null || (aq0Var = wp0Var.f18106s) == null || aq0Var.f9386a == null) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final vd.b b(dq0 dq0Var, wp0 wp0Var) throws JSONException {
        String string;
        switch (this.f17207a) {
            case 0:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16311re)).booleanValue()) {
                    rt rtVarA = ((qd0) this.f17212f).a();
                    rtVarA.u("action", "cstm_tbs_rndr");
                    rtVarA.v();
                }
                try {
                    string = wp0Var.f18112v.getString("tab_url");
                } catch (Exception unused) {
                    string = null;
                }
                return yo0.F(s81.f15906b, new ti0(this, string != null ? Uri.parse(string) : null, dq0Var, wp0Var, (yp0) dq0Var.f10544b.f9452c, 0), (Executor) this.f17210d);
            default:
                ek0 ek0Var = new ek0(new View(this.f17208b), null, h80.f11764v, (xp0) wp0Var.f18110u.get(0));
                pq0 pq0Var = new pq0(dq0Var, wp0Var, (String) null);
                p10 p10Var = (p10) this.f17209c;
                o10 o10Var = new o10(p10Var.f14832d, p10Var.f14834e, pq0Var, ek0Var);
                e60 e60Var = (e60) o10Var.R.a();
                o60 o60Var = (o60) o10Var.U.a();
                u80 u80Var = (u80) o10Var.W.a();
                r80 r80Var = (r80) o10Var.f14509f0.a();
                j30 j30Var = (j30) o10Var.L.a();
                ai aiVar = new ai();
                aiVar.f9335f = new AtomicBoolean(false);
                aiVar.f9330a = e60Var;
                aiVar.f9331b = o60Var;
                aiVar.f9332c = u80Var;
                aiVar.f9333d = r80Var;
                aiVar.f9334e = j30Var;
                aq0 aq0Var = wp0Var.f18106s;
                wk wkVar = new wk(aiVar, aq0Var.f9387b, aq0Var.f9386a);
                sr0 sr0Var = (sr0) this.f17212f;
                Objects.requireNonNull(sr0Var);
                ce1 ce1Var = new ce1(this, false, wkVar, 17);
                ai aiVar2 = new ai(sr0Var, qr0.CUSTOM_RENDER_SYN, null, sr0.f16524d, Collections.EMPTY_LIST, ((ex) ((w81) this.f17211e)).e(new go0(2, ce1Var)));
                ai aiVarA = ((sr0) aiVar2.f9335f).a(qr0.CUSTOM_RENDER_ACK, aiVar2.t());
                return new ai((sr0) aiVarA.f9335f, aiVarA.f9332c, (String) aiVarA.f9330a, (vd.b) aiVarA.f9331b, (List) aiVarA.f9333d, yo0.F((vd.b) aiVarA.f9334e, new vq(1, yo0.e(o10Var.a0())), fx.g)).t();
        }
    }

    public ui0(Context context, Executor executor, t10 t10Var, vp0 vp0Var, qd0 qd0Var) {
        this.f17208b = context;
        this.f17209c = t10Var;
        this.f17210d = executor;
        this.f17211e = vp0Var;
        this.f17212f = qd0Var;
    }
}
