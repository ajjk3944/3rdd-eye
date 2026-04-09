package tb;

import ac.m;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import me.t1;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f34536a;

    /* renamed from: b, reason: collision with root package name */
    public static int f34537b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f34538c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f34536a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f34536a = Application.getProcessName();
            } else {
                int iMyPid = f34537b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f34537b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(iMyPid);
                        sb2.append("/cmdline");
                        String string = sb2.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            try {
                                String line = bufferedReader.readLine();
                                y.h(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                b.d(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    b.d(bufferedReader);
                }
                f34536a = strTrim;
            }
        }
        return f34536a;
    }

    public static boolean b() {
        Boolean boolValueOf = f34538c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objJ = ii.a.J(Process.class, "isIsolated", new y4.a[0]);
                    Object[] objArr = new Object[0];
                    if (objJ == null) {
                        throw new m(t1.J("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objJ;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f34538c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
