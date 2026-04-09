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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vw1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17750a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f17751b;

    public /* synthetic */ vw1() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        switch (this.f17750a) {
            case 0:
                xw1 xw1Var = (xw1) this.f17751b;
                xw1Var.getClass();
                int i4 = message.what;
                ww1 ww1Var = null;
                if (i4 == 1) {
                    ww1 ww1Var2 = (ww1) message.obj;
                    try {
                        xw1Var.f18531a.queueInputBuffer(ww1Var2.f18222a, 0, ww1Var2.f18223b, ww1Var2.f18225d, ww1Var2.f18226e);
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference = xw1Var.f18534d;
                        while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                        }
                    }
                    ww1Var = ww1Var2;
                } else if (i4 == 2) {
                    ww1 ww1Var3 = (ww1) message.obj;
                    int i10 = ww1Var3.f18222a;
                    MediaCodec.CryptoInfo cryptoInfo = ww1Var3.f18224c;
                    long j = ww1Var3.f18225d;
                    int i11 = ww1Var3.f18226e;
                    try {
                        synchronized (xw1.f18530h) {
                            xw1Var.f18531a.queueSecureInputBuffer(i10, 0, cryptoInfo, j, i11);
                        }
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference2 = xw1Var.f18534d;
                        while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                        }
                    }
                    ww1Var = ww1Var3;
                } else if (i4 == 3) {
                    xw1Var.f18535e.a();
                } else if (i4 != 4) {
                    AtomicReference atomicReference3 = xw1Var.f18534d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        xw1Var.f18531a.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference4 = xw1Var.f18534d;
                        while (!atomicReference4.compareAndSet(null, e11) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (ww1Var != null) {
                    ArrayDeque arrayDeque = xw1.g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(ww1Var);
                    }
                    return;
                }
                return;
            default:
                int i12 = message.what;
                if (i12 == -3 || i12 == -2 || i12 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f17751b).get(), message.what);
                    return;
                } else {
                    if (i12 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw1(xw1 xw1Var, Looper looper) {
        super(looper);
        Objects.requireNonNull(xw1Var);
        this.f17751b = xw1Var;
    }
}
