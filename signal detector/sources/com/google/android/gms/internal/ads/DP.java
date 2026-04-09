package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class DP extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7767a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f7768b;

    public /* synthetic */ DP() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        switch (this.f7767a) {
            case 0:
                FP fp = (FP) this.f7768b;
                fp.getClass();
                int i = message.what;
                EP ep = null;
                if (i == 1) {
                    EP ep2 = (EP) message.obj;
                    try {
                        fp.f8119a.queueInputBuffer(ep2.f7958a, 0, ep2.f7959b, ep2.f7961d, ep2.f7962e);
                    } catch (RuntimeException e6) {
                        AtomicReference atomicReference = fp.f8122d;
                        while (!atomicReference.compareAndSet(null, e6) && atomicReference.get() == null) {
                        }
                    }
                    ep = ep2;
                } else if (i == 2) {
                    EP ep3 = (EP) message.obj;
                    int i3 = ep3.f7958a;
                    MediaCodec.CryptoInfo cryptoInfo = ep3.f7960c;
                    long j6 = ep3.f7961d;
                    int i6 = ep3.f7962e;
                    try {
                        synchronized (FP.f8118h) {
                            fp.f8119a.queueSecureInputBuffer(i3, 0, cryptoInfo, j6, i6);
                        }
                    } catch (RuntimeException e7) {
                        AtomicReference atomicReference2 = fp.f8122d;
                        while (!atomicReference2.compareAndSet(null, e7) && atomicReference2.get() == null) {
                        }
                    }
                    ep = ep3;
                } else if (i == 3) {
                    fp.f8123e.a();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = fp.f8122d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        fp.f8119a.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e8) {
                        AtomicReference atomicReference4 = fp.f8122d;
                        while (!atomicReference4.compareAndSet(null, e8) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (ep != null) {
                    ArrayDeque arrayDeque = FP.f8117g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(ep);
                    }
                    return;
                }
                return;
            default:
                int i7 = message.what;
                if (i7 == -3 || i7 == -2 || i7 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f7768b).get(), message.what);
                    return;
                } else {
                    if (i7 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DP(FP fp, Looper looper) {
        super(looper);
        Objects.requireNonNull(fp);
        this.f7768b = fp;
    }
}
