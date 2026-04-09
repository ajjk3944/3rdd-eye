package u2;

import android.util.Log;
import i2.C4444d;
import i2.EnumC4441a;
import java.util.HashSet;

/* compiled from: Logger.java */
/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5624c {

    /* renamed from: a, reason: collision with root package name */
    public static final C5623b f46540a = new C5623b();

    public static void a() {
        f46540a.getClass();
        EnumC4441a enumC4441a = C4444d.f38338a;
    }

    public static void b(String str) {
        f46540a.getClass();
        HashSet hashSet = C5623b.f46539a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f46540a.getClass();
        HashSet hashSet = C5623b.f46539a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
