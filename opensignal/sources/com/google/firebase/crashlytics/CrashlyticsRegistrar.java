package com.google.firebase.crashlytics;

import bf.u;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.components.ComponentRegistrar;
import fg.e;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import se.f;
import ug.d;
import ye.a;
import ye.b;
import ye.c;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5814d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final u f5815a = new u(a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final u f5816b = new u(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    public final u f5817c = new u(c.class, ExecutorService.class);

    static {
        d dVar = d.CRASHLYTICS;
        ug.c cVar = ug.c.f23558a;
        l.e(dVar, "subscriberName");
        Map map = ug.c.f23559b;
        if (map.containsKey(dVar)) {
            dVar.toString();
        } else {
            map.put(dVar, new ug.a(new eu.d(true)));
            dVar.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        bf.b bVarB = bf.c.b(df.c.class);
        bVarB.f2696a = "fire-cls";
        bVarB.a(bf.l.b(f.class));
        bVarB.a(bf.l.b(e.class));
        bVarB.a(new bf.l(this.f5815a, 1, 0));
        bVarB.a(new bf.l(this.f5816b, 1, 0));
        bVarB.a(new bf.l(this.f5817c, 1, 0));
        bVarB.a(new bf.l(0, 2, ef.a.class));
        bVarB.a(new bf.l(0, 2, we.b.class));
        bVarB.a(new bf.l(0, 2, rg.a.class));
        bVarB.f2701f = new bf.a(12, this);
        bVarB.c(2);
        return Arrays.asList(bVarB.b(), b4.q("fire-cls", "20.0.3"));
    }
}
