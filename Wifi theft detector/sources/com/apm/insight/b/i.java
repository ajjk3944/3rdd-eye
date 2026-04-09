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
    private static int f4876a = 5;

    /* renamed from: b, reason: collision with root package name */
    private static b f4877b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4878c;

    /* renamed from: d, reason: collision with root package name */
    private static Printer f4879d;

    public interface a {
    }

    public static class b implements Printer {

        /* renamed from: a, reason: collision with root package name */
        List<Printer> f4880a = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private List<Printer> f4883d = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        List<Printer> f4881b = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private boolean f4884e = false;

        /* renamed from: c, reason: collision with root package name */
        boolean f4882c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f4882c) {
                for (Printer printer : this.f4881b) {
                    if (!this.f4880a.contains(printer)) {
                        this.f4880a.add(printer);
                    }
                }
                this.f4881b.clear();
                this.f4882c = false;
            }
            if (this.f4880a.size() > i.f4876a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f4880a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f4878c) {
            return;
        }
        f4878c = true;
        f4877b = new b();
        Printer printerD = d();
        f4879d = printerD;
        if (printerD != null) {
            f4877b.f4880a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f4877b);
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
        if (printer == null || f4877b.f4881b.contains(printer)) {
            return;
        }
        f4877b.f4881b.add(printer);
        f4877b.f4882c = true;
    }
}
