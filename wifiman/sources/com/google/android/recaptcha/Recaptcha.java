package com.google.android.recaptcha;

import Yg.InterfaceC3661e;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import dh.InterfaceC5380e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\f\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0087@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "siteKey", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "fetchTaskClient", "(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "getTasksClient", "", "timeout", "(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaClient;", "fetchClient", "(Landroid/app/Application;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;", "LYg/u;", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLdh/e;)Ljava/lang/Object;", "getClient", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String siteKey) {
        return zzcq.zze(application, siteKey);
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m6getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j10, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 10000;
        }
        return recaptcha.m7getClientBWLJW6A(application, str, j10, interfaceC5380e);
    }

    @InterfaceC3661e
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey) {
        return zzcq.zzc(application, siteKey, 10000L);
    }

    public final Object fetchClient(Application application, String str, InterfaceC5380e<? super RecaptchaClient> interfaceC5380e) {
        return zzcq.zzd(application, str, interfaceC5380e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Yg.InterfaceC3661e
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7getClientBWLJW6A(android.app.Application r5, java.lang.String r6, long r7, dh.InterfaceC5380e<? super Yg.u> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2b
            Yg.v.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L42
        L29:
            r5 = move-exception
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            Yg.v.b(r9)
            Yg.u$a r9 = Yg.u.f25017b     // Catch: java.lang.Throwable -> L29
            r0.zzc = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzcq.zzb(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r9 != r1) goto L42
            return r1
        L42:
            com.google.android.recaptcha.internal.zzdc r9 = (com.google.android.recaptcha.internal.zzdc) r9     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = Yg.u.c(r9)     // Catch: java.lang.Throwable -> L29
            goto L53
        L49:
            Yg.u$a r6 = Yg.u.f25017b
            java.lang.Object r5 = Yg.v.a(r5)
            java.lang.Object r5 = Yg.u.c(r5)
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m7getClientBWLJW6A(android.app.Application, java.lang.String, long, dh.e):java.lang.Object");
    }

    @InterfaceC3661e
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String siteKey, long timeout) {
        return zzcq.zzc(application, siteKey, timeout);
    }
}
