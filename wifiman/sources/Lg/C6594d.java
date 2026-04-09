package lg;

import hg.InterfaceC6043c;
import hg.InterfaceC6044d;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import zg.AbstractC8755h;

/* renamed from: lg.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6594d implements InterfaceC6043c, InterfaceC6044d {

    /* renamed from: a, reason: collision with root package name */
    List f52616a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f52617b;

    @Override // hg.InterfaceC6044d
    public boolean a(InterfaceC6043c interfaceC6043c) {
        Objects.requireNonNull(interfaceC6043c, "d is null");
        if (!this.f52617b) {
            synchronized (this) {
                try {
                    if (!this.f52617b) {
                        List linkedList = this.f52616a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f52616a = linkedList;
                        }
                        linkedList.add(interfaceC6043c);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC6043c.dispose();
        return false;
    }

    @Override // hg.InterfaceC6044d
    public boolean b(InterfaceC6043c interfaceC6043c) {
        if (!c(interfaceC6043c)) {
            return false;
        }
        interfaceC6043c.dispose();
        return true;
    }

    @Override // hg.InterfaceC6044d
    public boolean c(InterfaceC6043c interfaceC6043c) {
        Objects.requireNonNull(interfaceC6043c, "Disposable item is null");
        if (this.f52617b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f52617b) {
                    return false;
                }
                List list = this.f52616a;
                if (list != null && list.remove(interfaceC6043c)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    void d(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((InterfaceC6043c) it.next()).dispose();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw AbstractC8755h.h((Throwable) arrayList.get(0));
        }
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        if (this.f52617b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f52617b) {
                    return;
                }
                this.f52617b = true;
                List list = this.f52616a;
                this.f52616a = null;
                d(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return this.f52617b;
    }
}
