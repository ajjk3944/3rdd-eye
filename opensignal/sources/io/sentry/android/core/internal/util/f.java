package io.sentry.android.core.internal.util;

import com.google.android.gms.internal.measurement.e5;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f11649c = new f();

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f11650a = new io.sentry.util.a();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11651b = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = this.f11651b;
        io.sentry.q qVarA = this.f11650a.a();
        try {
            if (!arrayList.isEmpty()) {
                qVarA.close();
                return arrayList;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                qVarA.close();
                return arrayList2;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strN = e5.N(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strN != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(strN.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            qVarA.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
