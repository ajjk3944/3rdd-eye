package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f4872a;

    /* renamed from: b, reason: collision with root package name */
    private static Printer f4873b;

    /* renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f4874c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f4875d = false;

    public interface a {
        @Nullable
        String a();

        String b();

        String c();
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f4872a) {
            return;
        }
        f4872a = true;
        f4873b = new Printer() { // from class: com.apm.insight.b.h.1
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
        i.a(f4873b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f4874c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z10, String str) {
        e.f4816a = System.nanoTime() / 1000000;
        e.f4817b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f4874c;
        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
            e eVar = copyOnWriteArrayList.get(i10);
            if (eVar == null || !eVar.a()) {
                if (!z10 && eVar.f4818c) {
                    eVar.b("");
                }
            } else if (z10) {
                if (!eVar.f4818c) {
                    eVar.a(str);
                }
            } else if (eVar.f4818c) {
                eVar.b(str);
            }
        }
    }
}
