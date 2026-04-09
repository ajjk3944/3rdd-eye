package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import m4.AbstractC6768g;

/* renamed from: com.google.android.gms.internal.measurement.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4430p3 {

    /* renamed from: com.google.android.gms.internal.measurement.p3$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static volatile AbstractC6768g f35427a;

        public static AbstractC6768g a(Context context) {
            AbstractC6768g abstractC6768gC;
            AbstractC6768g abstractC6768g = f35427a;
            if (abstractC6768g == null) {
                synchronized (a.class) {
                    try {
                        abstractC6768g = f35427a;
                        if (abstractC6768g == null) {
                            new C4430p3();
                            if (AbstractC4461t3.c(Build.TYPE, Build.TAGS)) {
                                if (AbstractC4328d3.a() && !context.isDeviceProtectedStorage()) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                                abstractC6768gC = C4430p3.c(context);
                            } else {
                                abstractC6768gC = AbstractC6768g.a();
                            }
                            f35427a = abstractC6768gC;
                            abstractC6768g = abstractC6768gC;
                        }
                    } finally {
                    }
                }
            }
            return abstractC6768g;
        }
    }

    private static InterfaceC4438q3 a(Context context, File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                o.V v10 = new o.V();
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        C4373i3 c4373i3 = new C4373i3(v10);
                        bufferedReader.close();
                        return c4373i3;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + line);
                    } else {
                        String strB = b(strArrSplit[0]);
                        String strDecode = Uri.decode(b(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String strB2 = b(strArrSplit[2]);
                            strDecode2 = Uri.decode(strB2);
                            if (strDecode2.length() < 1024 || strDecode2 == strB2) {
                                map.put(strB2, strDecode2);
                            }
                        }
                        o.V v11 = (o.V) v10.get(strB);
                        if (v11 == null) {
                            v11 = new o.V();
                            v10.put(strB, v11);
                        }
                        v11.put(strDecode, strDecode2);
                    }
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static final String b(String str) {
        return new String(str);
    }

    static AbstractC6768g c(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            AbstractC6768g abstractC6768gD = d(context);
            AbstractC6768g abstractC6768gG = abstractC6768gD.d() ? AbstractC6768g.g(a(context, (File) abstractC6768gD.c())) : AbstractC6768g.a();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return abstractC6768gG;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    private static AbstractC6768g d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? AbstractC6768g.g(file) : AbstractC6768g.a();
        } catch (RuntimeException e10) {
            Log.e("HermeticFileOverrides", "no data dir", e10);
            return AbstractC6768g.a();
        }
    }
}
