package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class zzbt {
    private static final Method zza;
    private static final Method zzb;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                }
            }
        } else {
            declaredMethod = null;
        }
        zza = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        zzb = declaredMethod2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            r7 = 0
            java.lang.String r8 = "jobscheduler"
            java.lang.Object r8 = r5.getSystemService(r8)
            android.app.job.JobScheduler r8 = (android.app.job.JobScheduler) r8
            r8.getClass()
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.zzbt.zza
            if (r0 == 0) goto L77
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r0)
            if (r5 == 0) goto L19
            goto L77
        L19:
            java.lang.reflect.Method r5 = com.google.android.gms.internal.measurement.zzbt.zzb
            if (r5 == 0) goto L32
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            if (r5 == 0) goto L32
            int r5 = r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            goto L43
        L2e:
            r5 = move-exception
            goto L34
        L30:
            r5 = move-exception
            goto L34
        L32:
            r5 = r7
            goto L43
        L34:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L32
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r5)
            goto L32
        L43:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.zzbt.zza
            java.lang.String r1 = "UploadAlarm"
            if (r0 == 0) goto L72
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            r2[r7] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            java.lang.String r3 = "com.google.android.gms"
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            r3 = 2
            r2[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            r5 = 3
            r2[r5] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            java.lang.Object r5 = r0.invoke(r8, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            if (r5 == 0) goto L76
            int r7 = r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            goto L76
        L6a:
            r5 = move-exception
            goto L6d
        L6c:
            r5 = move-exception
        L6d:
            java.lang.String r7 = "error calling scheduleAsPackage"
            android.util.Log.e(r1, r7, r5)
        L72:
            int r7 = r8.schedule(r6)
        L76:
            return r7
        L77:
            int r5 = r8.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
