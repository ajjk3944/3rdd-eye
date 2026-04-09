package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gw {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11619a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11620b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f11621c;

    /* renamed from: d, reason: collision with root package name */
    public final ce1 f11622d;

    public gw(Context context, ce1 ce1Var) {
        this.f11621c = context;
        this.f11622d = ce1Var;
    }

    public final synchronized void a(fw fwVar) {
        this.f11620b.add(fwVar);
    }

    public final synchronized void b(String str) {
        try {
            HashMap map = this.f11619a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f11621c) : this.f11621c.getSharedPreferences(str, 0);
            ew ewVar = new ew(this, str);
            map.put(str, ewVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(ewVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
