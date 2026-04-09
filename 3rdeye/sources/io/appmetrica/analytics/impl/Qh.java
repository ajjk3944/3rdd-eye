package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Qh extends C4552d4 {

    /* renamed from: c, reason: collision with root package name */
    protected T8 f40018c;

    /* renamed from: d, reason: collision with root package name */
    protected Gf f40019d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40020e;

    /* renamed from: f, reason: collision with root package name */
    public String f40021f;

    public Qh(Nf nf, CounterConfiguration counterConfiguration, T8 t82) {
        this(nf, counterConfiguration, t82, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f40684b.toBundle(bundle);
        Nf nf = this.f40683a;
        synchronized (nf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", nf);
        }
        return bundle;
    }

    public final synchronized String d() {
        T8 t82;
        t82 = this.f40018c;
        return t82.f40159a.isEmpty() ? null : new JSONObject(t82.f40159a).toString();
    }

    public final synchronized String e() {
        return this.f40021f;
    }

    public boolean f() {
        return this.f40020e;
    }

    public Qh(Nf nf, CounterConfiguration counterConfiguration, T8 t82, String str) {
        super(nf, counterConfiguration);
        this.f40020e = true;
        this.f40021f = str;
        this.f40018c = t82;
    }
}
