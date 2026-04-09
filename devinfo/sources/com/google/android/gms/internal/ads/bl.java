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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bl extends u.a {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f9709c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final List f9710d = Arrays.asList(((String) va.s.f36163e.f36166c.a(sk.f16156hb)).split(","));

    /* renamed from: e, reason: collision with root package name */
    public final dl f9711e;

    /* renamed from: f, reason: collision with root package name */
    public final u.a f9712f;
    public final ud0 g;

    public bl(dl dlVar, u.a aVar, ud0 ud0Var) {
        this.f9712f = aVar;
        this.f9711e = dlVar;
        this.g = ud0Var;
    }

    @Override // u.a
    public final void extraCallback(String str, Bundle bundle) {
        u.a aVar = this.f9712f;
        if (aVar != null) {
            aVar.extraCallback(str, bundle);
        }
    }

    @Override // u.a
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        u.a aVar = this.f9712f;
        if (aVar != null) {
            return aVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // u.a
    public final void onActivityResized(int i4, int i10, Bundle bundle) {
        u.a aVar = this.f9712f;
        if (aVar != null) {
            aVar.onActivityResized(i4, i10, bundle);
        }
    }

    @Override // u.a
    public final void onMessageChannelReady(Bundle bundle) {
        this.f9709c.set(false);
        u.a aVar = this.f9712f;
        if (aVar != null) {
            aVar.onMessageChannelReady(bundle);
        }
    }

    @Override // u.a
    public final void onNavigationEvent(int i4, Bundle bundle) {
        this.f9709c.set(false);
        u.a aVar = this.f9712f;
        if (aVar != null) {
            aVar.onNavigationEvent(i4, bundle);
        }
        ua.j jVar = ua.j.C;
        jVar.f35267k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        dl dlVar = this.f9711e;
        dlVar.f10498b = jCurrentTimeMillis;
        List list = this.f9710d;
        if (list == null || !list.contains(String.valueOf(i4))) {
            return;
        }
        jVar.f35267k.getClass();
        dlVar.f10497a = SystemClock.elapsedRealtime() + ((Integer) va.s.f36163e.f36166c.a(sk.f16110eb)).intValue();
        if (((s) dlVar.g) == null) {
            dlVar.g = new s(13, dlVar);
        }
        dlVar.j();
        u6.t.B(this.g, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // u.a
    public final void onPostMessage(String str, Bundle bundle) throws Throwable {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f9709c.set(true);
                u6.t.B(this.g, "pact_action", new Pair("pe", "pact_con"));
                this.f9711e.g(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e2) {
            ya.a0.n("Message is not in JSON format: ", e2);
        }
        u.a aVar = this.f9712f;
        if (aVar != null) {
            aVar.onPostMessage(str, bundle);
        }
    }

    @Override // u.a
    public final void onRelationshipValidationResult(int i4, Uri uri, boolean z3, Bundle bundle) {
        u.a aVar = this.f9712f;
        if (aVar != null) {
            aVar.onRelationshipValidationResult(i4, uri, z3, bundle);
        }
    }
}
