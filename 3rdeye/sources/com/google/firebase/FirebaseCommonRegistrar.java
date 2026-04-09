package com.google.firebase;

import B4.e;
import B4.h;
import I4.a;
import I4.i;
import I4.s;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import e5.C4317c;
import e5.C4318d;
import e5.g;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import q5.d;
import q5.f;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<a<?>> getComponents() {
        String string;
        int i = 0;
        ArrayList arrayList = new ArrayList();
        a.C0043a c0043aB = a.b(f.class);
        c0043aB.a(new i(2, 0, d.class));
        c0043aB.f2445f = new Oo(5);
        arrayList.add(c0043aB.b());
        s sVar = new s(H4.a.class, Executor.class);
        a.C0043a c0043a = new a.C0043a(C4318d.class, new Class[]{e5.f.class, g.class});
        c0043a.a(i.b(Context.class));
        c0043a.a(i.b(e.class));
        c0043a.a(new i(2, 0, e5.e.class));
        c0043a.a(new i(1, 1, f.class));
        c0043a.a(new i((s<?>) sVar, 1, 0));
        c0043a.f2445f = new C4317c(sVar, i);
        arrayList.add(c0043a.b());
        arrayList.add(q5.e.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(q5.e.a("fire-core", "21.0.0"));
        arrayList.add(q5.e.a("device-name", a(Build.PRODUCT)));
        arrayList.add(q5.e.a("device-model", a(Build.DEVICE)));
        arrayList.add(q5.e.a("device-brand", a(Build.BRAND)));
        arrayList.add(q5.e.b("android-target-sdk", new B4.f(0)));
        arrayList.add(q5.e.b("android-min-sdk", new B4.g(i)));
        arrayList.add(q5.e.b("android-platform", new h(i)));
        arrayList.add(q5.e.b("android-installer", new B4.i(0)));
        try {
            string = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(q5.e.a("kotlin", string));
        }
        return arrayList;
    }
}
