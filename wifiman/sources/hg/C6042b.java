package hg;

import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Objects;
import zg.AbstractC8755h;
import zg.C8758k;

/* renamed from: hg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6042b implements InterfaceC6043c, InterfaceC6044d {

    /* renamed from: a, reason: collision with root package name */
    C8758k f48746a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f48747b;

    public C6042b() {
    }

    @Override // hg.InterfaceC6044d
    public boolean a(InterfaceC6043c interfaceC6043c) {
        Objects.requireNonNull(interfaceC6043c, "disposable is null");
        if (!this.f48747b) {
            synchronized (this) {
                try {
                    if (!this.f48747b) {
                        C8758k c8758k = this.f48746a;
                        if (c8758k == null) {
                            c8758k = new C8758k();
                            this.f48746a = c8758k;
                        }
                        c8758k.a(interfaceC6043c);
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
        Objects.requireNonNull(interfaceC6043c, "disposable is null");
        if (this.f48747b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f48747b) {
                    return false;
                }
                C8758k c8758k = this.f48746a;
                if (c8758k != null && c8758k.e(interfaceC6043c)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public void d() {
        if (this.f48747b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f48747b) {
                    return;
                }
                C8758k c8758k = this.f48746a;
                this.f48746a = null;
                e(c8758k);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        if (this.f48747b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f48747b) {
                    return;
                }
                this.f48747b = true;
                C8758k c8758k = this.f48746a;
                this.f48746a = null;
                e(c8758k);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e(C8758k c8758k) {
        if (c8758k == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c8758k.b()) {
            if (obj instanceof InterfaceC6043c) {
                try {
                    ((InterfaceC6043c) obj).dispose();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
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
    public boolean isDisposed() {
        return this.f48747b;
    }

    public C6042b(InterfaceC6043c... interfaceC6043cArr) {
        Objects.requireNonNull(interfaceC6043cArr, "disposables is null");
        this.f48746a = new C8758k(interfaceC6043cArr.length + 1);
        for (InterfaceC6043c interfaceC6043c : interfaceC6043cArr) {
            Objects.requireNonNull(interfaceC6043c, "A Disposable in the disposables array is null");
            this.f48746a.a(interfaceC6043c);
        }
    }
}
