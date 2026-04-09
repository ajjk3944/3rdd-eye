package f2;

import Li.AbstractC3222i;
import Li.N;
import Li.P;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.d0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: f2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5500F {

    /* renamed from: a, reason: collision with root package name */
    private final ReentrantLock f46698a = new ReentrantLock(true);

    /* renamed from: b, reason: collision with root package name */
    private final Li.z f46699b;

    /* renamed from: c, reason: collision with root package name */
    private final Li.z f46700c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f46701d;

    /* renamed from: e, reason: collision with root package name */
    private final N f46702e;

    /* renamed from: f, reason: collision with root package name */
    private final N f46703f;

    public AbstractC5500F() {
        Li.z zVarA = P.a(AbstractC3689v.l());
        this.f46699b = zVarA;
        Li.z zVarA2 = P.a(d0.e());
        this.f46700c = zVarA2;
        this.f46702e = AbstractC3222i.b(zVarA);
        this.f46703f = AbstractC3222i.b(zVarA2);
    }

    public abstract C5512k a(r rVar, Bundle bundle);

    public final N b() {
        return this.f46702e;
    }

    public final N c() {
        return this.f46703f;
    }

    public final boolean d() {
        return this.f46701d;
    }

    public void e(C5512k entry) {
        AbstractC6492s.i(entry, "entry");
        Li.z zVar = this.f46700c;
        zVar.setValue(d0.k((Set) zVar.getValue(), entry));
    }

    public void f(C5512k backStackEntry) {
        int iNextIndex;
        AbstractC6492s.i(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f46698a;
        reentrantLock.lock();
        try {
            List listL1 = AbstractC3689v.l1((Collection) this.f46702e.getValue());
            ListIterator listIterator = listL1.listIterator(listL1.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (AbstractC6492s.d(((C5512k) listIterator.previous()).i(), backStackEntry.i())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listL1.set(iNextIndex, backStackEntry);
            this.f46699b.setValue(listL1);
            J j10 = J.f24997a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void g(C5512k popUpTo, boolean z10) {
        AbstractC6492s.i(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f46698a;
        reentrantLock.lock();
        try {
            Li.z zVar = this.f46699b;
            Iterable iterable = (Iterable) zVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (AbstractC6492s.d((C5512k) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            zVar.setValue(arrayList);
            J j10 = J.f24997a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void h(C5512k popUpTo, boolean z10) {
        Object objPrevious;
        AbstractC6492s.i(popUpTo, "popUpTo");
        Iterable iterable = (Iterable) this.f46700c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C5512k) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) this.f46702e.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C5512k) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        Li.z zVar = this.f46700c;
        zVar.setValue(d0.m((Set) zVar.getValue(), popUpTo));
        List list = (List) this.f46702e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C5512k c5512k = (C5512k) objPrevious;
            if (!AbstractC6492s.d(c5512k, popUpTo) && ((List) this.f46702e.getValue()).lastIndexOf(c5512k) < ((List) this.f46702e.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        C5512k c5512k2 = (C5512k) objPrevious;
        if (c5512k2 != null) {
            Li.z zVar2 = this.f46700c;
            zVar2.setValue(d0.m((Set) zVar2.getValue(), c5512k2));
        }
        g(popUpTo, z10);
    }

    public void i(C5512k entry) {
        AbstractC6492s.i(entry, "entry");
        Li.z zVar = this.f46700c;
        zVar.setValue(d0.m((Set) zVar.getValue(), entry));
    }

    public void j(C5512k backStackEntry) {
        AbstractC6492s.i(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f46698a;
        reentrantLock.lock();
        try {
            Li.z zVar = this.f46699b;
            zVar.setValue(AbstractC3689v.N0((Collection) zVar.getValue(), backStackEntry));
            J j10 = J.f24997a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k(C5512k backStackEntry) {
        AbstractC6492s.i(backStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this.f46700c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C5512k) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) this.f46702e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C5512k) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C5512k c5512k = (C5512k) AbstractC3689v.D0((List) this.f46702e.getValue());
        if (c5512k != null) {
            Li.z zVar = this.f46700c;
            zVar.setValue(d0.m((Set) zVar.getValue(), c5512k));
        }
        Li.z zVar2 = this.f46700c;
        zVar2.setValue(d0.m((Set) zVar2.getValue(), backStackEntry));
        j(backStackEntry);
    }

    public final void l(boolean z10) {
        this.f46701d = z10;
    }
}
