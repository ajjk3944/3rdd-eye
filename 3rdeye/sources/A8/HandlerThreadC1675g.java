package a8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import c8.C2075b;
import java.util.ArrayList;
import java.util.Iterator;
import va.a;

/* compiled from: SessionThread.java */
/* renamed from: a8.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerThreadC1675g extends HandlerThread {

    /* renamed from: b, reason: collision with root package name */
    public final C1671c f14250b;

    /* renamed from: c, reason: collision with root package name */
    public a f14251c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14252d;

    /* compiled from: SessionThread.java */
    /* renamed from: a8.g$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            HandlerThreadC1675g handlerThreadC1675g = HandlerThreadC1675g.this;
            C1671c c1671c = handlerThreadC1675g.f14250b;
            if (i == 1) {
                c1671c.b((C2075b) message.obj, true);
                return;
            }
            if (i != 2) {
                return;
            }
            if (message.arg2 != 1) {
                c1671c.b((C2075b) message.obj, true);
            }
            Message message2 = new Message();
            message2.what = 2;
            message2.obj = message.obj;
            message2.arg1 = message.arg1;
            handlerThreadC1675g.f14251c.sendMessageDelayed(message2, message.arg1);
        }
    }

    public HandlerThreadC1675g(C1671c c1671c) {
        super("SessionThread");
        this.f14252d = new ArrayList();
        this.f14250b = c1671c;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        a.b bVar = va.a.f47104a;
        bVar.o("SessionThread");
        bVar.a("Session thread ready", new Object[0]);
        C1671c c1671c = this.f14250b;
        Iterator<AbstractC1669a> it = c1671c.f14244f.iterator();
        while (it.hasNext()) {
            it.next().c(c1671c.f14242d);
        }
        synchronized (this) {
            this.f14251c = new a(getLooper());
            Iterator it2 = this.f14252d.iterator();
            while (it2.hasNext()) {
                this.f14251c.sendMessage((Message) it2.next());
            }
            notifyAll();
        }
    }
}
