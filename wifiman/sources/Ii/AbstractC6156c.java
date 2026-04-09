package ii;

import ii.C6157d;

/* renamed from: ii.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6156c {

    /* renamed from: ii.c$a */
    public static final class a extends AbstractC6156c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49179a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f49180b;

        static {
            C6157d.a aVar = C6157d.f49182c;
            f49180b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // ii.AbstractC6156c
        public int a() {
            return f49180b;
        }
    }

    /* renamed from: ii.c$b */
    public static final class b extends AbstractC6156c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f49181a = new b();

        private b() {
        }

        @Override // ii.AbstractC6156c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
