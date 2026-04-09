package qb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final a f20782a;

    /* renamed from: b, reason: collision with root package name */
    public final t f20783b;

    /* renamed from: c, reason: collision with root package name */
    public final i f20784c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f20785d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f20786e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f20787f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20788g;

    public k(Looper looper, a aVar, i iVar) {
        this(new CopyOnWriteArraySet(), looper, aVar, iVar);
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f20787f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        t tVar = this.f20783b;
        if (!tVar.f20823a.hasMessages(0)) {
            tVar.getClass();
            s sVarB = t.b();
            Message messageObtainMessage = tVar.f20823a.obtainMessage(0);
            sVarB.f20821a = messageObtainMessage;
            Handler handler = tVar.f20823a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            sVarB.a();
        }
        ArrayDeque arrayDeque2 = this.f20786e;
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

    public final void b(int i10, h hVar) {
        this.f20787f.add(new a5.i(i10, new CopyOnWriteArraySet(this.f20785d), hVar, 2));
    }

    public final void c(Object obj) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f20785d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.f20778a.equals(obj)) {
                jVar.f20781d = true;
                if (jVar.f20780c) {
                    this.f20784c.d(jVar.f20778a, jVar.f20779b.c());
                }
                copyOnWriteArraySet.remove(jVar);
            }
        }
    }

    public k(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, a aVar, i iVar) {
        this.f20782a = aVar;
        this.f20785d = copyOnWriteArraySet;
        this.f20784c = iVar;
        this.f20786e = new ArrayDeque();
        this.f20787f = new ArrayDeque();
        this.f20783b = ((et.d) aVar).g(looper, new a5.h(1, this));
    }
}
