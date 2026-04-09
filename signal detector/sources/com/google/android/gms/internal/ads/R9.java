package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import r.AbstractC2858a;
import t2.AbstractC2907C;

/* loaded from: classes.dex */
public final class R9 extends AbstractC2858a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f10861a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final List f10862b = Arrays.asList(((String) C2841s.f23267e.f23270c.a(H9.fb)).split(","));

    /* renamed from: c, reason: collision with root package name */
    public final S9 f10863c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2858a f10864d;

    /* renamed from: e, reason: collision with root package name */
    public final C0852Zn f10865e;

    public R9(S9 s9, AbstractC2858a abstractC2858a, C0852Zn c0852Zn) {
        this.f10864d = abstractC2858a;
        this.f10863c = s9;
        this.f10865e = c0852Zn;
    }

    @Override // r.AbstractC2858a
    public final void a(String str, Bundle bundle) {
        AbstractC2858a abstractC2858a = this.f10864d;
        if (abstractC2858a != null) {
            abstractC2858a.a(str, bundle);
        }
    }

    @Override // r.AbstractC2858a
    public final Bundle b(String str, Bundle bundle) {
        AbstractC2858a abstractC2858a = this.f10864d;
        if (abstractC2858a != null) {
            return abstractC2858a.b(str, bundle);
        }
        return null;
    }

    @Override // r.AbstractC2858a
    public final void c(int i, int i3, Bundle bundle) {
        AbstractC2858a abstractC2858a = this.f10864d;
        if (abstractC2858a != null) {
            abstractC2858a.c(i, i3, bundle);
        }
    }

    @Override // r.AbstractC2858a
    public final void d(Bundle bundle) {
        this.f10861a.set(false);
        AbstractC2858a abstractC2858a = this.f10864d;
        if (abstractC2858a != null) {
            abstractC2858a.d(bundle);
        }
    }

    @Override // r.AbstractC2858a
    public final void e(int i, Bundle bundle) {
        this.f10861a.set(false);
        AbstractC2858a abstractC2858a = this.f10864d;
        if (abstractC2858a != null) {
            abstractC2858a.e(i, bundle);
        }
        p2.j jVar = p2.j.f22785C;
        jVar.f22797k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        S9 s9 = this.f10863c;
        s9.f11147j = jCurrentTimeMillis;
        List list = this.f10862b;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        jVar.f22797k.getClass();
        s9.i = SystemClock.elapsedRealtime() + ((Integer) C2841s.f23267e.f23270c.a(H9.cb)).intValue();
        if (s9.f11143e == null) {
            s9.f11143e = new RunnableC1883t(14, s9);
        }
        s9.d();
        I5.b.D(this.f10865e, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // r.AbstractC2858a
    public final void f(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f10861a.set(true);
                I5.b.D(this.f10865e, "pact_action", new Pair("pe", "pact_con"));
                this.f10863c.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e6) {
            AbstractC2907C.n("Message is not in JSON format: ", e6);
        }
        AbstractC2858a abstractC2858a = this.f10864d;
        if (abstractC2858a != null) {
            abstractC2858a.f(str, bundle);
        }
    }

    @Override // r.AbstractC2858a
    public final void g(int i, Uri uri, boolean z6, Bundle bundle) {
        AbstractC2858a abstractC2858a = this.f10864d;
        if (abstractC2858a != null) {
            abstractC2858a.g(i, uri, z6, bundle);
        }
    }
}
