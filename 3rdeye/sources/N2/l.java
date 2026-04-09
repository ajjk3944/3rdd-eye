package N2;

/* compiled from: DiskCacheStrategy.java */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4550a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f4551b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f4552c;

    /* compiled from: DiskCacheStrategy.java */
    public class a extends l {
        @Override // N2.l
        public final boolean a() {
            return true;
        }

        @Override // N2.l
        public final boolean b() {
            return true;
        }

        @Override // N2.l
        public final boolean c(L2.a aVar) {
            return aVar == L2.a.REMOTE;
        }

        @Override // N2.l
        public final boolean d(boolean z10, L2.a aVar, L2.c cVar) {
            return (aVar == L2.a.RESOURCE_DISK_CACHE || aVar == L2.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class b extends l {
        @Override // N2.l
        public final boolean a() {
            return false;
        }

        @Override // N2.l
        public final boolean b() {
            return false;
        }

        @Override // N2.l
        public final boolean c(L2.a aVar) {
            return false;
        }

        @Override // N2.l
        public final boolean d(boolean z10, L2.a aVar, L2.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class c extends l {
        @Override // N2.l
        public final boolean a() {
            return true;
        }

        @Override // N2.l
        public final boolean b() {
            return false;
        }

        @Override // N2.l
        public final boolean c(L2.a aVar) {
            return (aVar == L2.a.DATA_DISK_CACHE || aVar == L2.a.MEMORY_CACHE) ? false : true;
        }

        @Override // N2.l
        public final boolean d(boolean z10, L2.a aVar, L2.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class d extends l {
        @Override // N2.l
        public final boolean a() {
            return false;
        }

        @Override // N2.l
        public final boolean b() {
            return true;
        }

        @Override // N2.l
        public final boolean c(L2.a aVar) {
            return false;
        }

        @Override // N2.l
        public final boolean d(boolean z10, L2.a aVar, L2.c cVar) {
            return (aVar == L2.a.RESOURCE_DISK_CACHE || aVar == L2.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    public class e extends l {
        @Override // N2.l
        public final boolean a() {
            return true;
        }

        @Override // N2.l
        public final boolean b() {
            return true;
        }

        @Override // N2.l
        public final boolean c(L2.a aVar) {
            return aVar == L2.a.REMOTE;
        }

        @Override // N2.l
        public final boolean d(boolean z10, L2.a aVar, L2.c cVar) {
            return ((z10 && aVar == L2.a.DATA_DISK_CACHE) || aVar == L2.a.LOCAL) && cVar == L2.c.TRANSFORMED;
        }
    }

    static {
        new a();
        f4550a = new b();
        f4551b = new c();
        new d();
        f4552c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(L2.a aVar);

    public abstract boolean d(boolean z10, L2.a aVar, L2.c cVar);
}
