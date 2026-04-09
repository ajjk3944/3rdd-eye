package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import bf.e;
import bf.g;
import bf.h;
import com.google.android.gms.internal.ads.sh0;
import com.google.firebase.components.ComponentRegistrar;
import de.a;
import de.i;
import de.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import je.y;
import jf.b;
import pf.u;
import wd.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        sh0 sh0VarB = a.b(b.class);
        sh0VarB.a(new i(2, 0, jf.a.class));
        sh0VarB.f16017f = new y(1);
        arrayList.add(sh0VarB.c());
        q qVar = new q(ce.a.class, Executor.class);
        sh0 sh0Var = new sh0(e.class, new Class[]{g.class, h.class});
        sh0Var.a(i.b(Context.class));
        sh0Var.a(i.b(f.class));
        sh0Var.a(new i(2, 0, bf.f.class));
        sh0Var.a(new i(1, 1, b.class));
        sh0Var.a(new i(qVar, 1, 0));
        sh0Var.f16017f = new bf.b(qVar, 0);
        arrayList.add(sh0Var.c());
        arrayList.add(a.a.f("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(a.a.f("fire-core", "22.0.1"));
        arrayList.add(a.a.f("device-name", b(Build.PRODUCT)));
        arrayList.add(a.a.f("device-model", b(Build.DEVICE)));
        arrayList.add(a.a.f("device-brand", b(Build.BRAND)));
        arrayList.add(a.a.l("android-target-sdk", new u(26)));
        arrayList.add(a.a.l("android-min-sdk", new u(27)));
        arrayList.add(a.a.l("android-platform", new u(28)));
        arrayList.add(a.a.l("android-installer", new u(29)));
        try {
            yj.e.f37633b.getClass();
            str = "2.2.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(a.a.f("kotlin", str));
        }
        return arrayList;
    }
}
