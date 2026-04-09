package c2;

import T1.C1598j;
import T1.K;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import androidx.work.t;
import b2.InterfaceC1821b;
import b2.InterfaceC1843x;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: CancelWorkRunnable.java */
/* renamed from: c2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2056f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final C1598j f18416b = new C1598j();

    public static void a(T1.z zVar, String str) {
        K kB;
        WorkDatabase workDatabase = zVar.f12232c;
        InterfaceC1843x interfaceC1843xY = workDatabase.y();
        InterfaceC1821b interfaceC1821bS = workDatabase.s();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            t.b bVarT = interfaceC1843xY.t(str2);
            if (bVarT != t.b.SUCCEEDED && bVarT != t.b.FAILED) {
                interfaceC1843xY.w(str2);
            }
            linkedList.addAll(interfaceC1821bS.b(str2));
        }
        T1.l lVar = zVar.f12235f;
        synchronized (lVar.f12198k) {
            androidx.work.m.e().a(T1.l.f12188l, "Processor cancelling " + str);
            lVar.i.add(str);
            kB = lVar.b(str);
        }
        T1.l.e(str, kB, 1);
        Iterator<T1.n> it = zVar.f12234e.iterator();
        while (it.hasNext()) {
            it.next().e(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        C1598j c1598j = this.f18416b;
        try {
            b();
            c1598j.a(androidx.work.q.f17018a);
        } catch (Throwable th) {
            c1598j.a(new q.a.C0272a(th));
        }
    }
}
