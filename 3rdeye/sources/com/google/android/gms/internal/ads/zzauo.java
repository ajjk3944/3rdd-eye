package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzauo implements Runnable {
    private zzauo() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzauq.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzauq.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzauq.zzb;
        } catch (Throwable th) {
            zzauq.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzauo(zzaup zzaupVar) {
    }
}
