package ui;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* renamed from: ui.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8175a implements Iterable, InterfaceC6944a {

    /* renamed from: ui.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2236a {

        /* renamed from: a, reason: collision with root package name */
        private final int f63073a;

        public AbstractC2236a(int i10) {
            this.f63073a = i10;
        }

        protected final Object c(AbstractC8175a thisRef) {
            AbstractC6492s.i(thisRef, "thisRef");
            return thisRef.b().get(this.f63073a);
        }
    }

    protected abstract c b();

    protected abstract z e();

    protected abstract void f(String str, Object obj);

    protected final void g(th.d tClass, Object value) {
        AbstractC6492s.i(tClass, "tClass");
        AbstractC6492s.i(value, "value");
        String strL = tClass.l();
        AbstractC6492s.f(strL);
        f(strL, value);
    }

    public final boolean isEmpty() {
        return b().b() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return b().iterator();
    }
}
