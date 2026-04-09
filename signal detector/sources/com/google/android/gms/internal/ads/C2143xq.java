package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.xq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2143xq implements InterfaceC0956bq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17630a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17631b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17632c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17633d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f17634e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f17635f;

    public C2143xq(Context context, C0795Wh c0795Wh, Mu mu, ID id, N9 n9) {
        this.f17631b = context;
        this.f17632c = c0795Wh;
        this.f17635f = mu;
        this.f17634e = id;
        this.f17633d = n9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final boolean a(Xt xt, Qt qt) throws JSONException {
        String string;
        Ut ut;
        switch (this.f17630a) {
            case 0:
                Context context = this.f17631b;
                if ((context instanceof Activity) && Q9.a(context)) {
                    try {
                        string = qt.f10797v.getString("tab_url");
                    } catch (Exception unused) {
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string)) {
                    }
                }
                break;
            default:
                if (((N9) this.f17633d) == null || (ut = qt.f10791s) == null || ut.f11811a == null) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final InterfaceFutureC2326a b(Xt xt, Qt qt) throws JSONException {
        String string;
        switch (this.f17630a) {
            case 0:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.pe)).booleanValue()) {
                    C0697Ql c0697QlA = ((C0784Vn) this.f17635f).a();
                    c0697QlA.r("action", "cstm_tbs_rndr");
                    c0697QlA.s();
                }
                try {
                    string = qt.f10797v.getString("tab_url");
                } catch (Exception unused) {
                    string = null;
                }
                return AbstractC1984ut.F(ED.f7928b, new C2089wq(this, string != null ? Uri.parse(string) : null, xt, qt, (St) xt.f12510b.f15174c, 0), (Executor) this.f17633d);
            default:
                C1229gr c1229gr = new C1229gr(new View(this.f17631b), null, C1437kl.f15250K, (Rt) qt.f10795u.get(0));
                C1338iu c1338iu = new C1338iu(xt, qt, (String) null);
                C0795Wh c0795Wh = (C0795Wh) this.f17632c;
                C0778Vh c0778Vh = new C0778Vh(c0795Wh.f12278d, c0795Wh.f12280e, c1338iu, c1229gr);
                C1276hk c1276hk = (C1276hk) c0778Vh.f12051N.c();
                C1867sk c1867sk = (C1867sk) c0778Vh.f12054Q.c();
                C2138xl c2138xl = (C2138xl) c0778Vh.f12056S.c();
                C1976ul c1976ul = (C1976ul) c0778Vh.b0.c();
                C0643Ni c0643Ni = (C0643Ni) c0778Vh.f12046H.c();
                C1677p8 c1677p8 = new C1677p8();
                c1677p8.f16142f = new AtomicBoolean(false);
                c1677p8.f16137a = c1276hk;
                c1677p8.f16138b = c1867sk;
                c1677p8.f16139c = c2138xl;
                c1677p8.f16140d = c1976ul;
                c1677p8.f16141e = c0643Ni;
                Ut ut = qt.f10791s;
                M9 m9 = new M9(c1677p8, ut.f11812b, ut.f11811a);
                Mu mu = (Mu) this.f17635f;
                Objects.requireNonNull(mu);
                C0889ae c0889ae = new C0889ae(this, 26, m9);
                C1677p8 c1677p82 = new C1677p8(mu, Ku.CUSTOM_RENDER_SYN, null, Mu.f9922d, Collections.EMPTY_LIST, ((C0623Mf) ((ID) this.f17634e)).b(new Zs(2, c0889ae)));
                C1677p8 c1677p8A = ((Mu) c1677p82.f16142f).a(c1677p82.u(), Ku.CUSTOM_RENDER_ACK);
                return new C1677p8((Mu) c1677p8A.f16142f, c1677p8A.f16139c, (String) c1677p8A.f16137a, (InterfaceFutureC2326a) c1677p8A.f16138b, (List) c1677p8A.f16140d, AbstractC1984ut.F((InterfaceFutureC2326a) c1677p8A.f16141e, new C0518Gc(1, AbstractC1984ut.e(c0778Vh.C())), AbstractC0640Nf.f10011g)).u();
        }
    }

    public C2143xq(Context context, Executor executor, C0893ai c0893ai, Pt pt, C0784Vn c0784Vn) {
        this.f17631b = context;
        this.f17632c = c0893ai;
        this.f17633d = executor;
        this.f17634e = pt;
        this.f17635f = c0784Vn;
    }
}
