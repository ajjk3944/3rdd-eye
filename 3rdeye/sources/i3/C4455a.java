package i3;

import android.util.Log;
import i3.d;

/* compiled from: FactoryPools.java */
/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4455a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0465a f38447a = new C0465a();

    /* compiled from: FactoryPools.java */
    /* renamed from: i3.a$b */
    public interface b<T> {
        T a();
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: i3.a$c */
    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f38448a;

        /* renamed from: b, reason: collision with root package name */
        public final e<T> f38449b;

        /* renamed from: c, reason: collision with root package name */
        public final K0.e f38450c;

        public c(K0.e eVar, b bVar, e eVar2) {
            this.f38450c = eVar;
            this.f38448a = bVar;
            this.f38449b = eVar2;
        }

        public final T a() {
            T tA = (T) this.f38450c.a();
            if (tA == null) {
                tA = this.f38448a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tA.getClass());
                }
            }
            if (tA instanceof d) {
                tA.b().f38451a = false;
            }
            return (T) tA;
        }

        public final boolean b(T t10) {
            if (t10 instanceof d) {
                ((d) t10).b().f38451a = true;
            }
            this.f38449b.a(t10);
            return this.f38450c.c(t10);
        }
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: i3.a$d */
    public interface d {
        d.a b();
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: i3.a$e */
    public interface e<T> {
        void a(T t10);
    }

    public static c a(int i, b bVar) {
        return new c(new K0.e(i), bVar, f38447a);
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: i3.a$a, reason: collision with other inner class name */
    public class C0465a implements e<Object> {
        @Override // i3.C4455a.e
        public final void a(Object obj) {
        }
    }
}
