package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f6055a;

    /* renamed from: b, reason: collision with root package name */
    private static Printer f6056b;

    /* renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f6057c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f6058d = false;

    public interface a {
        String a();

        String b();

        String c();
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f6055a) {
            return;
        }
        f6055a = true;
        f6056b = new Printer() { // from class: com.apm.insight.b.h.1
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
        i.a(f6056b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f6057c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z6, String str) {
        e.f6001a = System.nanoTime() / 1000000;
        e.f6002b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f6057c;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            e eVar = copyOnWriteArrayList.get(i);
            if (eVar == null || !eVar.a()) {
                if (!z6 && eVar.f6003c) {
                    eVar.b("");
                }
            } else if (z6) {
                if (!eVar.f6003c) {
                    eVar.a(str);
                }
            } else if (eVar.f6003c) {
                eVar.b(str);
            }
        }
    }
}
