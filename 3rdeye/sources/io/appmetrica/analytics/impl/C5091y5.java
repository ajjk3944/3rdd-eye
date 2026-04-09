package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.y5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5091y5 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f42107a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f42108b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f42109c;

    public C5091y5(Context context) {
        this.f42109c = context.getApplicationContext();
    }

    public final Za a(C4759l5 c4759l5, K4 k42, InterfaceC4581e8 interfaceC4581e8, HashMap map) {
        Za za = (Za) map.get(c4759l5.toString());
        if (za != null) {
            za.a(k42);
            return za;
        }
        Za zaA = interfaceC4581e8.a(this.f42109c, c4759l5, k42);
        map.put(c4759l5.toString(), zaA);
        return zaA;
    }
}
