package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f3106a;

    /* renamed from: b, reason: collision with root package name */
    private static Printer f3107b;

    /* renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f3108c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f3109d = false;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        String a();

        String b();

        String c();
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f3106a) {
            return;
        }
        f3106a = true;
        f3107b = new Printer() { // from class: com.apm.insight.b.h.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    h.a(true, str);
                } else if (str.charAt(0) == '<') {
                    h.a(false, str);
                }
            }
        };
        i.a();
        i.a(f3107b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f3108c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z3, String str) {
        e.f3054a = System.nanoTime() / 1000000;
        e.f3055b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f3108c;
        for (int i4 = 0; i4 < copyOnWriteArrayList.size(); i4++) {
            e eVar = copyOnWriteArrayList.get(i4);
            if (eVar == null || !eVar.a()) {
                if (!z3 && eVar.f3056c) {
                    eVar.b("");
                }
            } else if (z3) {
                if (!eVar.f3056c) {
                    eVar.a(str);
                }
            } else if (eVar.f3056c) {
                eVar.b(str);
            }
        }
    }
}
