package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static i f3470a;

    /* renamed from: b, reason: collision with root package name */
    private long f3471b = -1;

    /* renamed from: c, reason: collision with root package name */
    private final List<Printer> f3472c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<Printer> f3473d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f3474e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.i.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    i.a().a(str);
                } else if (str.charAt(0) == '<') {
                    i.a().b(str);
                }
                i.c();
            }
        };
    }

    private i() {
    }

    public static i a() {
        if (f3470a == null) {
            synchronized (i.class) {
                try {
                    if (f3470a == null) {
                        f3470a = new i();
                    }
                } finally {
                }
            }
        }
        return f3470a;
    }

    public static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.f3471b != -1 && SystemClock.uptimeMillis() - this.f3471b > 5000;
    }

    public final void b(String str) {
        this.f3471b = SystemClock.uptimeMillis();
        try {
            a(this.f3473d, str);
        } catch (Exception e2) {
            com.apm.insight.a.b((Throwable) e2);
        }
    }

    public final void a(String str) {
        this.f3471b = -1L;
        try {
            a(this.f3472c, str);
        } catch (Exception e2) {
            com.apm.insight.a.a((Throwable) e2);
        }
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Printer printer = list.get(i4);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th2) {
            com.apm.insight.a.a(th2);
        }
    }
}
