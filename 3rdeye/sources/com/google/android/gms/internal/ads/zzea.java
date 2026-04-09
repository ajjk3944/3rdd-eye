package com.google.android.gms.internal.ads;

import F3.h;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzea {
    private static final Object zza = new Object();

    public static String zza(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (zza) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        return !TextUtils.isEmpty(strReplace) ? h.i(str, "\n  ", strReplace.replace("\n", "\n  "), "\n") : str;
    }

    public static void zzb(String str, String str2) {
        synchronized (zza) {
            Log.d(str, zza(str2, null));
        }
    }

    public static void zzc(String str, String str2) {
        synchronized (zza) {
            Log.e(str, zza(str2, null));
        }
    }

    public static void zzd(String str, String str2, Throwable th) {
        synchronized (zza) {
            Log.e(str, zza(str2, th));
        }
    }

    public static void zze(String str, String str2) {
        synchronized (zza) {
            Log.i(str, zza(str2, null));
        }
    }

    public static void zzf(String str, String str2) {
        synchronized (zza) {
            Log.w(str, zza(str2, null));
        }
    }

    public static void zzg(String str, String str2, Throwable th) {
        synchronized (zza) {
            Log.w(str, zza(str2, th));
        }
    }
}
