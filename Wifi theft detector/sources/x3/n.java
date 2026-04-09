package x3;

import x3.c;

/* loaded from: classes2.dex */
public abstract class n {

    public static abstract class a {
        public abstract n a();

        public abstract a b(u3.b bVar);

        public abstract a c(u3.c cVar);

        public abstract a d(u3.d dVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract u3.b b();

    public abstract u3.c c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    public abstract u3.d e();

    public abstract o f();

    public abstract String g();
}
