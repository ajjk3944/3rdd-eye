package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static int f3110a = 5;

    /* renamed from: b, reason: collision with root package name */
    private static b f3111b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3112c;

    /* renamed from: d, reason: collision with root package name */
    private static Printer f3113d;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b implements Printer {

        /* renamed from: a, reason: collision with root package name */
        List<Printer> f3114a = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private List<Printer> f3117d = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        List<Printer> f3115b = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private boolean f3118e = false;

        /* renamed from: c, reason: collision with root package name */
        boolean f3116c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f3116c) {
                for (Printer printer : this.f3115b) {
                    if (!this.f3114a.contains(printer)) {
                        this.f3114a.add(printer);
                    }
                }
                this.f3115b.clear();
                this.f3116c = false;
            }
            if (this.f3114a.size() > i.f3110a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f3114a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f3112c) {
            return;
        }
        f3112c = true;
        f3111b = new b();
        Printer printerD = d();
        f3113d = printerD;
        if (printerD != null) {
            f3111b.f3114a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f3111b);
        }
    }

    public static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f3111b.f3115b.contains(printer)) {
            return;
        }
        f3111b.f3115b.add(printer);
        f3111b.f3116c = true;
    }
}
