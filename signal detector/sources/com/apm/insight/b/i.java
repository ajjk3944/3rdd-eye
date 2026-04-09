package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static int f6059a = 5;

    /* renamed from: b, reason: collision with root package name */
    private static b f6060b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6061c;

    /* renamed from: d, reason: collision with root package name */
    private static Printer f6062d;

    public interface a {
    }

    public static class b implements Printer {

        /* renamed from: a, reason: collision with root package name */
        List<Printer> f6063a = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private List<Printer> f6066d = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        List<Printer> f6064b = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private boolean f6067e = false;

        /* renamed from: c, reason: collision with root package name */
        boolean f6065c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f6065c) {
                for (Printer printer : this.f6064b) {
                    if (!this.f6063a.contains(printer)) {
                        this.f6063a.add(printer);
                    }
                }
                this.f6064b.clear();
                this.f6065c = false;
            }
            if (this.f6063a.size() > i.f6059a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f6063a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f6061c) {
            return;
        }
        f6061c = true;
        f6060b = new b();
        Printer printerD = d();
        f6062d = printerD;
        if (printerD != null) {
            f6060b.f6063a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f6060b);
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
        if (printer == null || f6060b.f6064b.contains(printer)) {
            return;
        }
        f6060b.f6064b.add(printer);
        f6060b.f6065c = true;
    }
}
