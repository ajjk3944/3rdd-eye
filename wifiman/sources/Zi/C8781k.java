package zi;

import Yg.J;
import Yg.u;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* renamed from: zi.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8781k extends AbstractC8782l implements Iterator, InterfaceC5380e, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private int f67360a;

    /* renamed from: b, reason: collision with root package name */
    private Object f67361b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f67362c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC5380e f67363d;

    private final Throwable e() {
        int i10 = this.f67360a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f67360a);
    }

    private final Object f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // zi.AbstractC8782l
    public Object d(Object obj, InterfaceC5380e interfaceC5380e) {
        this.f67361b = obj;
        this.f67360a = 3;
        this.f67363d = interfaceC5380e;
        Object objG = AbstractC5467b.g();
        if (objG == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    public final void g(InterfaceC5380e interfaceC5380e) {
        this.f67363d = interfaceC5380e;
    }

    @Override // dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        return C5385j.f46088a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f67360a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator it = this.f67362c;
                AbstractC6492s.f(it);
                if (it.hasNext()) {
                    this.f67360a = 2;
                    return true;
                }
                this.f67362c = null;
            }
            this.f67360a = 5;
            InterfaceC5380e interfaceC5380e = this.f67363d;
            AbstractC6492s.f(interfaceC5380e);
            this.f67363d = null;
            u.a aVar = Yg.u.f25017b;
            interfaceC5380e.resumeWith(Yg.u.c(J.f24997a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f67360a;
        if (i10 == 0 || i10 == 1) {
            return f();
        }
        if (i10 == 2) {
            this.f67360a = 1;
            Iterator it = this.f67362c;
            AbstractC6492s.f(it);
            return it.next();
        }
        if (i10 != 3) {
            throw e();
        }
        this.f67360a = 0;
        Object obj = this.f67361b;
        this.f67361b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // dh.InterfaceC5380e
    public void resumeWith(Object obj) {
        Yg.v.b(obj);
        this.f67360a = 4;
    }
}
