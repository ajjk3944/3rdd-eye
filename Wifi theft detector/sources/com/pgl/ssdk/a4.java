package com.pgl.ssdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class a4 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    protected WeakReference<a> f19797a;

    public interface a {
        void a(Message message);
    }

    public a4(Looper looper, a aVar) {
        super(looper);
        if (aVar != null) {
            this.f19797a = new WeakReference<>(aVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        WeakReference<a> weakReference = this.f19797a;
        if (weakReference == null || (aVar = weakReference.get()) == null || message == null) {
            return;
        }
        aVar.a(message);
    }
}
