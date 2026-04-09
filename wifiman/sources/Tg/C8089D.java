package tg;

import ig.AbstractC6152a;
import java.util.Iterator;
import java.util.Objects;
import lg.EnumC6593c;
import og.AbstractC7133c;

/* renamed from: tg.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8089D extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final Iterable f62120a;

    /* renamed from: tg.D$a */
    static final class a extends AbstractC7133c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62121a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator f62122b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f62123c;

        /* renamed from: d, reason: collision with root package name */
        boolean f62124d;

        /* renamed from: e, reason: collision with root package name */
        boolean f62125e;

        /* renamed from: f, reason: collision with root package name */
        boolean f62126f;

        a(gg.x xVar, Iterator it) {
            this.f62121a = xVar;
            this.f62122b = it;
        }

        void a() {
            while (!isDisposed()) {
                try {
                    Object next = this.f62122b.next();
                    Objects.requireNonNull(next, "The iterator returned a null value");
                    this.f62121a.h(next);
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f62122b.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.f62121a.a();
                            return;
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        this.f62121a.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    AbstractC6152a.b(th3);
                    this.f62121a.onError(th3);
                    return;
                }
            }
        }

        @Override // Dg.g
        public void clear() {
            this.f62125e = true;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62123c = true;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62123c;
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return this.f62125e;
        }

        @Override // Dg.g
        public Object poll() {
            if (this.f62125e) {
                return null;
            }
            if (!this.f62126f) {
                this.f62126f = true;
            } else if (!this.f62122b.hasNext()) {
                this.f62125e = true;
                return null;
            }
            Object next = this.f62122b.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f62124d = true;
            return 1;
        }
    }

    public C8089D(Iterable iterable) {
        this.f62120a = iterable;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        try {
            Iterator it = this.f62120a.iterator();
            try {
                if (!it.hasNext()) {
                    EnumC6593c.complete(xVar);
                    return;
                }
                a aVar = new a(xVar, it);
                xVar.c(aVar);
                if (aVar.f62124d) {
                    return;
                }
                aVar.a();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                EnumC6593c.error(th2, xVar);
            }
        } catch (Throwable th3) {
            AbstractC6152a.b(th3);
            EnumC6593c.error(th3, xVar);
        }
    }
}
