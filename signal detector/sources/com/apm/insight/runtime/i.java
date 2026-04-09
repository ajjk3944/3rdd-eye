package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static i f6432a;

    /* renamed from: b, reason: collision with root package name */
    private long f6433b = -1;

    /* renamed from: c, reason: collision with root package name */
    private final List<Printer> f6434c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<Printer> f6435d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f6436e = false;

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
        if (f6432a == null) {
            synchronized (i.class) {
                try {
                    if (f6432a == null) {
                        f6432a = new i();
                    }
                } finally {
                }
            }
        }
        return f6432a;
    }

    public static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.f6433b != -1 && SystemClock.uptimeMillis() - this.f6433b > 5000;
    }

    public final void b(String str) {
        this.f6433b = SystemClock.uptimeMillis();
        try {
            a(this.f6435d, str);
        } catch (Exception e6) {
            com.apm.insight.a.b((Throwable) e6);
        }
    }

    public final void a(String str) {
        this.f6433b = -1L;
        try {
            a(this.f6434c, str);
        } catch (Exception e6) {
            com.apm.insight.a.a((Throwable) e6);
        }
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Printer printer = list.get(i);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
        }
    }
}
