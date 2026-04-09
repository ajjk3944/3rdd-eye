package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a4;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a1 extends a4 implements a2 {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f21414b;

    public a1(HandlerThread handlerThread, a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f21414b = handlerThread;
    }

    public void a(a4.a aVar) {
        this.f21417a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f21414b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
