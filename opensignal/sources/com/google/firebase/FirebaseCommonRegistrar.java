package com.google.firebase;

import android.content.Context;
import android.os.Build;
import bf.b;
import bf.c;
import bf.l;
import bf.u;
import cg.d;
import cg.e;
import cg.f;
import cg.h;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import lq.g;
import ng.a;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        b bVarB = c.b(ng.b.class);
        bVarB.a(new l(2, 0, a.class));
        bVarB.f2701f = new u0(24);
        arrayList.add(bVarB.b());
        u uVar = new u(ye.a.class, Executor.class);
        b bVar = new b(d.class, new Class[]{f.class, h.class});
        bVar.a(l.b(Context.class));
        bVar.a(l.b(se.f.class));
        bVar.a(new l(2, 0, e.class));
        bVar.a(new l(1, 1, ng.b.class));
        bVar.a(new l(uVar, 1, 0));
        bVar.f2701f = new cg.b(uVar, 0);
        arrayList.add(bVar.b());
        arrayList.add(b4.q("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(b4.q("fire-core", "22.0.1"));
        arrayList.add(b4.q("device-name", a(Build.PRODUCT)));
        arrayList.add(b4.q("device-model", a(Build.DEVICE)));
        arrayList.add(b4.q("device-brand", a(Build.BRAND)));
        arrayList.add(b4.B("android-target-sdk", new p5.b(2)));
        arrayList.add(b4.B("android-min-sdk", new p5.b(3)));
        arrayList.add(b4.B("android-platform", new p5.b(4)));
        arrayList.add(b4.B("android-installer", new p5.b(5)));
        try {
            string = g.f15565x.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(b4.q("kotlin", string));
        }
        return arrayList;
    }
}
