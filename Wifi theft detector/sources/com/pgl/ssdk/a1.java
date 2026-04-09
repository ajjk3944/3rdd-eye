package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a4;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class a1 extends a4 implements a2 {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f19794b;

    public a1(HandlerThread handlerThread, a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f19794b = handlerThread;
    }

    public void a(a4.a aVar) {
        this.f19797a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f19794b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
