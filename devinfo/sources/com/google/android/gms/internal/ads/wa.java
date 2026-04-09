package com.google.android.gms.internal.ads;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wa extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17948a;

    public /* synthetic */ wa(int i4) {
        this.f17948a = i4;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws NoSuchAlgorithmException {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.f17948a) {
            case 0:
                return ByteBuffer.allocate(32);
            case 1:
                try {
                    return (Cipher) ml1.f13938b.f13943a.g("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 2:
                try {
                    Cipher cipher = (Cipher) ml1.f13938b.f13943a.g("AES/GCM-SIV/NoPadding");
                    if (tb1.b(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 3:
                Provider providerC = a80.c();
                if (providerC != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerC);
                    } catch (GeneralSecurityException unused) {
                    }
                } else {
                    try {
                        provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    } catch (Throwable unused2) {
                    }
                    if (provider != null) {
                        try {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                        } catch (GeneralSecurityException unused3) {
                        }
                    } else {
                        secureRandom = new SecureRandom();
                    }
                }
                secureRandom.nextLong();
                return secureRandom;
            case 4:
                try {
                    return (Cipher) ml1.f13938b.f13943a.g("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 5:
                try {
                    return (Cipher) ml1.f13938b.f13943a.g("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 6:
                try {
                    return (Cipher) ml1.f13938b.f13943a.g("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case 7:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                j2.j0 j0Var = new j2.j0(choreographer, com.bumptech.glide.e.r(looperMyLooper));
                return wd.b.O(j0Var, j0Var.f27198l);
            case 8:
                return new Random();
            case 9:
                return new PathMeasure();
            case 10:
                return new Path();
            case 11:
                return new Path();
            case 12:
                return new float[4];
            case 13:
                return 0L;
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(sl.h.f33837a);
                return simpleDateFormat;
        }
    }
}
