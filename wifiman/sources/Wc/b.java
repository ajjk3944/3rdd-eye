package Wc;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class b {

    public static abstract class a extends b {

        /* renamed from: Wc.b$a$a, reason: collision with other inner class name */
        public static final class C0896a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f23860a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f23861b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0896a(Throwable error) {
                super(null);
                AbstractC6492s.i(error, "error");
                this.f23860a = error;
            }

            @Override // Wc.b
            public Object b() {
                return this.f23861b;
            }

            public final Throwable c() {
                return this.f23860a;
            }
        }

        /* renamed from: Wc.b$a$b, reason: collision with other inner class name */
        public static final class C0897b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f23862a;

            public C0897b(Object obj) {
                super(null);
                this.f23862a = obj;
            }

            @Override // Wc.b
            public Object b() {
                return this.f23862a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    /* renamed from: Wc.b$b, reason: collision with other inner class name */
    public static final class C0898b extends b {

        /* renamed from: a, reason: collision with root package name */
        private final Object f23863a;

        public /* synthetic */ C0898b(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : obj);
        }

        @Override // Wc.b
        public Object b() {
            return this.f23863a;
        }

        public C0898b(Object obj) {
            super(null);
            this.f23863a = obj;
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final Object f23864a;

        public c() {
            super(null);
        }

        @Override // Wc.b
        public Object b() {
            return this.f23864a;
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Object a() {
        if (this instanceof C0898b) {
            return ((C0898b) this).b();
        }
        if ((this instanceof c) || (this instanceof a.C0896a)) {
            return null;
        }
        if (this instanceof a.C0897b) {
            return ((a.C0897b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract Object b();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (kotlin.jvm.internal.AbstractC6492s.d(((Wc.b.C0898b) r4).b(), ((Wc.b.C0898b) r3).b()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (kotlin.jvm.internal.AbstractC6492s.d(((Wc.b.a.C0897b) r4).b(), ((Wc.b.a.C0897b) r3).b()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (kotlin.jvm.internal.AbstractC6492s.d(((Wc.b.a.C0896a) r4).c(), ((Wc.b.a.C0896a) r3).c()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof Wc.b.c
            if (r0 == 0) goto L7
            boolean r4 = r4 instanceof Wc.b.c
            goto L60
        L7:
            boolean r0 = r3 instanceof Wc.b.C0898b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L28
            boolean r0 = r4 instanceof Wc.b.C0898b
            if (r0 == 0) goto L26
            Wc.b$b r4 = (Wc.b.C0898b) r4
            java.lang.Object r4 = r4.b()
            r0 = r3
            Wc.b$b r0 = (Wc.b.C0898b) r0
            java.lang.Object r0 = r0.b()
            boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r4, r0)
            if (r4 == 0) goto L26
        L24:
            r4 = r2
            goto L60
        L26:
            r4 = r1
            goto L60
        L28:
            boolean r0 = r3 instanceof Wc.b.a.C0897b
            if (r0 == 0) goto L44
            boolean r0 = r4 instanceof Wc.b.a.C0897b
            if (r0 == 0) goto L26
            Wc.b$a$b r4 = (Wc.b.a.C0897b) r4
            java.lang.Object r4 = r4.b()
            r0 = r3
            Wc.b$a$b r0 = (Wc.b.a.C0897b) r0
            java.lang.Object r0 = r0.b()
            boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r4, r0)
            if (r4 == 0) goto L26
            goto L24
        L44:
            boolean r0 = r3 instanceof Wc.b.a.C0896a
            if (r0 == 0) goto L61
            boolean r0 = r4 instanceof Wc.b.a.C0896a
            if (r0 == 0) goto L26
            Wc.b$a$a r4 = (Wc.b.a.C0896a) r4
            java.lang.Throwable r4 = r4.c()
            r0 = r3
            Wc.b$a$a r0 = (Wc.b.a.C0896a) r0
            java.lang.Throwable r0 = r0.c()
            boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r4, r0)
            if (r4 == 0) goto L26
            goto L24
        L60:
            return r4
        L61:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Wc.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    private b() {
    }
}
