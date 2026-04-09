package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.internal.common.zzac;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static String f34882a;

    /* renamed from: b, reason: collision with root package name */
    private static int f34883b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f34884c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (f34882a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f34882a = Application.getProcessName();
            } else {
                int iMyPid = f34883b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f34883b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        str = "/proc/" + iMyPid + "/cmdline";
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String line = bufferedReader.readLine();
                            AbstractC7901p.l(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader2 = bufferedReader;
                            j.a(bufferedReader2);
                            throw th;
                        }
                        j.a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                f34882a = strTrim;
            }
        }
        return f34882a;
    }

    public static boolean b() {
        Boolean boolValueOf = f34884c;
        if (boolValueOf == null) {
            if (k.e()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = B3.i.a(Process.class, "isIsolated", new B3.g[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new zzac(B3.b.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f34884c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
