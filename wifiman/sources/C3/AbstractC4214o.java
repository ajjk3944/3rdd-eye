package c3;

import a3.AbstractC3755c;
import a3.C3754b;
import a3.InterfaceC3759g;
import c3.C4202c;

/* renamed from: c3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4214o {

    /* renamed from: c3.o$a */
    public static abstract class a {
        public abstract AbstractC4214o a();

        abstract a b(C3754b c3754b);

        abstract a c(AbstractC3755c abstractC3755c);

        abstract a d(InterfaceC3759g interfaceC3759g);

        public abstract a e(AbstractC4215p abstractC4215p);

        public abstract a f(String str);
    }

    AbstractC4214o() {
    }

    public static a a() {
        return new C4202c.b();
    }

    public abstract C3754b b();

    abstract AbstractC3755c c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    abstract InterfaceC3759g e();

    public abstract AbstractC4215p f();

    public abstract String g();
}
