package E2;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4018a = new C0172a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f4019b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final a f4020c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final a f4021d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final a f4022e = new e();

    /* renamed from: E2.a$a, reason: collision with other inner class name */
    class C0172a extends a {
        C0172a() {
        }

        @Override // E2.a
        public boolean a() {
            return true;
        }

        @Override // E2.a
        public boolean b() {
            return true;
        }

        @Override // E2.a
        public boolean c(C2.a aVar) {
            return aVar == C2.a.REMOTE;
        }

        @Override // E2.a
        public boolean d(boolean z10, C2.a aVar, C2.c cVar) {
            return (aVar == C2.a.RESOURCE_DISK_CACHE || aVar == C2.a.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends a {
        b() {
        }

        @Override // E2.a
        public boolean a() {
            return false;
        }

        @Override // E2.a
        public boolean b() {
            return false;
        }

        @Override // E2.a
        public boolean c(C2.a aVar) {
            return false;
        }

        @Override // E2.a
        public boolean d(boolean z10, C2.a aVar, C2.c cVar) {
            return false;
        }
    }

    class c extends a {
        c() {
        }

        @Override // E2.a
        public boolean a() {
            return true;
        }

        @Override // E2.a
        public boolean b() {
            return false;
        }

        @Override // E2.a
        public boolean c(C2.a aVar) {
            return (aVar == C2.a.DATA_DISK_CACHE || aVar == C2.a.MEMORY_CACHE) ? false : true;
        }

        @Override // E2.a
        public boolean d(boolean z10, C2.a aVar, C2.c cVar) {
            return false;
        }
    }

    class d extends a {
        d() {
        }

        @Override // E2.a
        public boolean a() {
            return false;
        }

        @Override // E2.a
        public boolean b() {
            return true;
        }

        @Override // E2.a
        public boolean c(C2.a aVar) {
            return false;
        }

        @Override // E2.a
        public boolean d(boolean z10, C2.a aVar, C2.c cVar) {
            return (aVar == C2.a.RESOURCE_DISK_CACHE || aVar == C2.a.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends a {
        e() {
        }

        @Override // E2.a
        public boolean a() {
            return true;
        }

        @Override // E2.a
        public boolean b() {
            return true;
        }

        @Override // E2.a
        public boolean c(C2.a aVar) {
            return aVar == C2.a.REMOTE;
        }

        @Override // E2.a
        public boolean d(boolean z10, C2.a aVar, C2.c cVar) {
            return ((z10 && aVar == C2.a.DATA_DISK_CACHE) || aVar == C2.a.LOCAL) && cVar == C2.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(C2.a aVar);

    public abstract boolean d(boolean z10, C2.a aVar, C2.c cVar);
}
