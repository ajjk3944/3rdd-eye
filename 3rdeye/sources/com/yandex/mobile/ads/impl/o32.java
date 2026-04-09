package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Message;
import com.yandex.mobile.ads.impl.bf0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class o32 implements bf0 {

    /* renamed from: b, reason: collision with root package name */
    private static final ArrayList f31158b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f31159a;

    public static final class a implements bf0.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f31160a;

        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f31160a = null;
            ArrayList arrayList = o32.f31158b;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.bf0.a
        public final void a() {
            Message message = this.f31160a;
            message.getClass();
            message.sendToTarget();
            b();
        }
    }

    public o32(Handler handler) {
        this.f31159a = handler;
    }

    private static a d() {
        a aVar;
        ArrayList arrayList = f31158b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a(0) : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final boolean a(Runnable runnable) {
        return this.f31159a.post(runnable);
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final boolean b() {
        return this.f31159a.hasMessages(0);
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final void c() {
        this.f31159a.removeMessages(2);
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final void a() {
        this.f31159a.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final bf0.a b(int i) {
        a aVarD = d();
        aVarD.f31160a = this.f31159a.obtainMessage(i);
        return aVarD;
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final boolean a(int i) {
        return this.f31159a.sendEmptyMessage(i);
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final boolean a(long j4) {
        return this.f31159a.sendEmptyMessageAtTime(2, j4);
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final boolean a(bf0.a aVar) {
        a aVar2 = (a) aVar;
        Handler handler = this.f31159a;
        Message message = aVar2.f31160a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        aVar2.b();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final bf0.a a(int i, Object obj) {
        a aVarD = d();
        aVarD.f31160a = this.f31159a.obtainMessage(i, obj);
        return aVarD;
    }

    @Override // com.yandex.mobile.ads.impl.bf0
    public final bf0.a a(int i, int i10) {
        a aVarD = d();
        aVarD.f31160a = this.f31159a.obtainMessage(1, i, i10);
        return aVarD;
    }
}
