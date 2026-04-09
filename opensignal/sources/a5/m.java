package a5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final b f132a;

    /* renamed from: b, reason: collision with root package name */
    public final z f133b;

    /* renamed from: c, reason: collision with root package name */
    public final k f134c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f135d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f136e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f137f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f138g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f139h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f140i;

    public m(Looper looper, b bVar, k kVar) {
        this(new CopyOnWriteArraySet(), looper, bVar, kVar);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f138g) {
            try {
                if (this.f139h) {
                    return;
                }
                this.f135d.add(new l(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f137f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        z zVar = this.f133b;
        if (!zVar.f173a.hasMessages(0)) {
            zVar.getClass();
            y yVarC = z.c();
            Message messageObtainMessage = zVar.f173a.obtainMessage(0);
            yVarC.f171a = messageObtainMessage;
            Handler handler = zVar.f173a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            yVarC.a();
        }
        ArrayDeque arrayDeque2 = this.f136e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i10, j jVar) {
        g();
        this.f137f.add(new i(i10, new CopyOnWriteArraySet(this.f135d), jVar, 0));
    }

    public final void d() {
        g();
        synchronized (this.f138g) {
            this.f139h = true;
        }
        Iterator it = this.f135d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            k kVar = this.f134c;
            lVar.f131d = true;
            if (lVar.f130c) {
                lVar.f130c = false;
                kVar.h(lVar.f128a, lVar.f129b.b());
            }
        }
        this.f135d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f135d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar.f128a.equals(obj)) {
                lVar.f131d = true;
                if (lVar.f130c) {
                    lVar.f130c = false;
                    this.f134c.h(lVar.f128a, lVar.f129b.b());
                }
                copyOnWriteArraySet.remove(lVar);
            }
        }
    }

    public final void f(int i10, j jVar) {
        c(i10, jVar);
        b();
    }

    public final void g() {
        if (this.f140i) {
            a.i(Thread.currentThread() == this.f133b.f173a.getLooper().getThread());
        }
    }

    public m(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, b bVar, k kVar) {
        this.f132a = bVar;
        this.f135d = copyOnWriteArraySet;
        this.f134c = kVar;
        this.f138g = new Object();
        this.f136e = new ArrayDeque();
        this.f137f = new ArrayDeque();
        this.f133b = ((x) bVar).a(looper, new h(0, this));
        this.f140i = true;
    }
}
