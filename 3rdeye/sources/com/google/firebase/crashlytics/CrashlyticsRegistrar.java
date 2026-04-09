package com.google.firebase.crashlytics;

import I4.a;
import I4.i;
import K4.e;
import K9.d;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import u5.InterfaceC5635a;
import x5.C5768a;
import x5.c;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23249a = 0;

    static {
        c.a subscriberName = c.a.CRASHLYTICS;
        C5768a c5768a = C5768a.f47773a;
        l.f(subscriberName, "subscriberName");
        if (subscriberName == c.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<c.a, C5768a.C0550a> map = C5768a.f47774b;
        if (map.containsKey(subscriberName)) {
            Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
            return;
        }
        map.put(subscriberName, new C5768a.C0550a(new d(true)));
        Log.d("SessionsDependencies", "Dependency to " + subscriberName + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<a<?>> getComponents() {
        a.C0043a c0043aB = a.b(e.class);
        c0043aB.f2440a = "fire-cls";
        c0043aB.a(i.b(B4.e.class));
        c0043aB.a(i.b(h5.c.class));
        c0043aB.a(new i(0, 2, L4.a.class));
        c0043aB.a(new i(0, 2, F4.a.class));
        c0043aB.a(new i(0, 2, InterfaceC5635a.class));
        c0043aB.f2445f = new B.d(this, 8);
        c0043aB.c(2);
        return Arrays.asList(c0043aB.b(), q5.e.a("fire-cls", "19.0.3"));
    }
}
