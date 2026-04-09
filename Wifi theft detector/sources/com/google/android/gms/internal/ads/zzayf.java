package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
final class zzayf implements Runnable {
    private zzayf() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzayg.zzd = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = zzayg.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzayg.zzb;
        } catch (Throwable th) {
            zzayg.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzayf(byte[] bArr) {
    }
}
