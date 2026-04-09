package com.google.firebase.crashlytics;

import android.util.Log;
import ce.a;
import ce.b;
import ce.c;
import com.google.android.gms.internal.ads.sh0;
import com.google.firebase.components.ComponentRegistrar;
import de.i;
import de.q;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import qf.d;
import wd.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20713d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final q f20714a = new q(a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final q f20715b = new q(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    public final q f20716c = new q(c.class, ExecutorService.class);

    static {
        Map map = qf.c.f32297b;
        d dVar = d.f32298a;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new qf.a(new gl.c(true)));
        Log.d("FirebaseSessions", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        sh0 sh0VarB = de.a.b(fe.c.class);
        sh0VarB.f16012a = "fire-cls";
        sh0VarB.a(i.b(f.class));
        sh0VarB.a(i.b(df.d.class));
        sh0VarB.a(new i(this.f20714a, 1, 0));
        sh0VarB.a(new i(this.f20715b, 1, 0));
        sh0VarB.a(new i(this.f20716c, 1, 0));
        sh0VarB.a(new i(0, 2, ge.b.class));
        sh0VarB.a(new i(0, 2, ae.b.class));
        sh0VarB.a(new i(0, 2, nf.a.class));
        sh0VarB.f16017f = new ca.b(9, this);
        sh0VarB.d();
        return Arrays.asList(sh0VarB.c(), a.a.f("fire-cls", "20.0.3"));
    }
}
