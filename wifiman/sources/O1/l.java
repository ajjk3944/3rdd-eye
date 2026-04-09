package O1;

import Ii.AbstractC3092z;
import Ii.InterfaceC3088x;
import Ii.N;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.P;
import Li.z;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class l implements O1.e {

    /* renamed from: k, reason: collision with root package name */
    public static final a f16795k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Set f16796l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    private static final Object f16797m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f16798a;

    /* renamed from: b, reason: collision with root package name */
    private final O1.j f16799b;

    /* renamed from: c, reason: collision with root package name */
    private final O1.a f16800c;

    /* renamed from: d, reason: collision with root package name */
    private final N f16801d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3220g f16802e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16803f;

    /* renamed from: g, reason: collision with root package name */
    private final Yg.m f16804g;

    /* renamed from: h, reason: collision with root package name */
    private final z f16805h;

    /* renamed from: i, reason: collision with root package name */
    private List f16806i;

    /* renamed from: j, reason: collision with root package name */
    private final O1.k f16807j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return l.f16796l;
        }

        public final Object b() {
            return l.f16797m;
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final O1.m f16808a;

            public a(O1.m mVar) {
                super(null);
                this.f16808a = mVar;
            }

            public O1.m a() {
                return this.f16808a;
            }
        }

        /* renamed from: O1.l$b$b, reason: collision with other inner class name */
        public static final class C0601b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC6839p f16809a;

            /* renamed from: b, reason: collision with root package name */
            private final InterfaceC3088x f16810b;

            /* renamed from: c, reason: collision with root package name */
            private final O1.m f16811c;

            /* renamed from: d, reason: collision with root package name */
            private final InterfaceC5384i f16812d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0601b(InterfaceC6839p transform, InterfaceC3088x ack, O1.m mVar, InterfaceC5384i callerContext) {
                super(null);
                AbstractC6492s.i(transform, "transform");
                AbstractC6492s.i(ack, "ack");
                AbstractC6492s.i(callerContext, "callerContext");
                this.f16809a = transform;
                this.f16810b = ack;
                this.f16811c = mVar;
                this.f16812d = callerContext;
            }

            public final InterfaceC3088x a() {
                return this.f16810b;
            }

            public final InterfaceC5384i b() {
                return this.f16812d;
            }

            public O1.m c() {
                return this.f16811c;
            }

            public final InterfaceC6839p d() {
                return this.f16809a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final FileOutputStream f16813a;

        public c(FileOutputStream fileOutputStream) {
            AbstractC6492s.i(fileOutputStream, "fileOutputStream");
            this.f16813a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f16813a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f16813a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10) throws IOException {
            AbstractC6492s.i(b10, "b");
            this.f16813a.write(b10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i10, int i11) throws IOException {
            AbstractC6492s.i(bytes, "bytes");
            this.f16813a.write(bytes, i10, i11);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {
        d() {
            super(1);
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                l.this.f16805h.setValue(new O1.g(th2));
            }
            a aVar = l.f16795k;
            Object objB = aVar.b();
            l lVar = l.this;
            synchronized (objB) {
                aVar.a().remove(lVar.r().getAbsolutePath());
                J j10 = J.f24997a;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f16815a = new e();

        e() {
            super(2);
        }

        public final void a(b msg, Throwable th2) {
            AbstractC6492s.i(msg, "msg");
            if (msg instanceof b.C0601b) {
                InterfaceC3088x interfaceC3088xA = ((b.C0601b) msg).a();
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                interfaceC3088xA.a(th2);
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((b) obj, (Throwable) obj2);
            return J.f24997a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f16816a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16817b;

        f(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            f fVar = l.this.new f(interfaceC5380e);
            fVar.f16817b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f16816a;
            if (i10 == 0) {
                v.b(obj);
                b bVar = (b) this.f16817b;
                if (bVar instanceof b.a) {
                    this.f16816a = 1;
                    if (l.this.s((b.a) bVar, this) == objG) {
                        return objG;
                    }
                } else if (bVar instanceof b.C0601b) {
                    this.f16816a = 2;
                    if (l.this.t((b.C0601b) bVar, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, InterfaceC5380e interfaceC5380e) {
            return ((f) create(bVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f16819a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f16820b;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f16822a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f16823b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ O1.m f16824c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O1.m mVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f16824c = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f16824c, interfaceC5380e);
                aVar.f16823b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f16822a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                O1.m mVar = (O1.m) this.f16823b;
                O1.m mVar2 = this.f16824c;
                boolean z10 = false;
                if (!(mVar2 instanceof O1.b) && !(mVar2 instanceof O1.g) && mVar == mVar2) {
                    z10 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(O1.m mVar, InterfaceC5380e interfaceC5380e) {
                return ((a) create(mVar, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        public static final class b implements InterfaceC3220g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3220g f16825a;

            public static final class a implements InterfaceC3221h {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3221h f16826a;

                /* renamed from: O1.l$g$b$a$a, reason: collision with other inner class name */
                public static final class C0602a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f16827a;

                    /* renamed from: b, reason: collision with root package name */
                    int f16828b;

                    public C0602a(InterfaceC5380e interfaceC5380e) {
                        super(interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f16827a = obj;
                        this.f16828b |= PduHandle.NONE;
                        return a.this.a(null, this);
                    }
                }

                public a(InterfaceC3221h interfaceC3221h) {
                    this.f16826a = interfaceC3221h;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Li.InterfaceC3221h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof O1.l.g.b.a.C0602a
                        if (r0 == 0) goto L13
                        r0 = r6
                        O1.l$g$b$a$a r0 = (O1.l.g.b.a.C0602a) r0
                        int r1 = r0.f16828b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f16828b = r1
                        goto L18
                    L13:
                        O1.l$g$b$a$a r0 = new O1.l$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f16827a
                        java.lang.Object r1 = eh.AbstractC5467b.g()
                        int r2 = r0.f16828b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Yg.v.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        Yg.v.b(r6)
                        Li.h r6 = r4.f16826a
                        O1.m r5 = (O1.m) r5
                        boolean r2 = r5 instanceof O1.i
                        if (r2 != 0) goto L6f
                        boolean r2 = r5 instanceof O1.g
                        if (r2 != 0) goto L68
                        boolean r2 = r5 instanceof O1.b
                        if (r2 == 0) goto L56
                        O1.b r5 = (O1.b) r5
                        java.lang.Object r5 = r5.b()
                        r0.f16828b = r3
                        java.lang.Object r5 = r6.a(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        Yg.J r5 = Yg.J.f24997a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof O1.n
                        if (r5 == 0) goto L62
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L62:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L68:
                        O1.g r5 = (O1.g) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L6f:
                        O1.i r5 = (O1.i) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: O1.l.g.b.a.a(java.lang.Object, dh.e):java.lang.Object");
                }
            }

            public b(InterfaceC3220g interfaceC3220g) {
                this.f16825a = interfaceC3220g;
            }

            @Override // Li.InterfaceC3220g
            public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
                Object objB = this.f16825a.b(new a(interfaceC3221h), interfaceC5380e);
                return objB == AbstractC5467b.g() ? objB : J.f24997a;
            }
        }

        g(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            g gVar = l.this.new g(interfaceC5380e);
            gVar.f16820b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objG = AbstractC5467b.g();
            int i10 = this.f16819a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f16820b;
                O1.m mVar = (O1.m) l.this.f16805h.getValue();
                if (!(mVar instanceof O1.b)) {
                    l.this.f16807j.e(new b.a(mVar));
                }
                b bVar = new b(AbstractC3222i.r(l.this.f16805h, new a(mVar, null)));
                this.f16819a = 1;
                if (AbstractC3222i.t(interfaceC3221h, bVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((g) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {
        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) l.this.f16798a.invoke();
            String it = file.getAbsolutePath();
            a aVar = l.f16795k;
            synchronized (aVar.b()) {
                if (aVar.a().contains(it)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set setA = aVar.a();
                AbstractC6492s.h(it, "it");
                setA.add(it);
            }
            return file;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f16831a;

        /* renamed from: b, reason: collision with root package name */
        Object f16832b;

        /* renamed from: c, reason: collision with root package name */
        Object f16833c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f16834d;

        /* renamed from: f, reason: collision with root package name */
        int f16836f;

        i(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16834d = obj;
            this.f16836f |= PduHandle.NONE;
            return l.this.t(null, this);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f16837a;

        /* renamed from: b, reason: collision with root package name */
        Object f16838b;

        /* renamed from: c, reason: collision with root package name */
        Object f16839c;

        /* renamed from: d, reason: collision with root package name */
        Object f16840d;

        /* renamed from: e, reason: collision with root package name */
        Object f16841e;

        /* renamed from: f, reason: collision with root package name */
        Object f16842f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f16843g;

        /* renamed from: i, reason: collision with root package name */
        int f16845i;

        j(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16843g = obj;
            this.f16845i |= PduHandle.NONE;
            return l.this.u(this);
        }
    }

    public static final class k implements O1.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ti.a f16846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f16847b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f16848c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f16849d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f16850a;

            /* renamed from: b, reason: collision with root package name */
            Object f16851b;

            /* renamed from: c, reason: collision with root package name */
            Object f16852c;

            /* renamed from: d, reason: collision with root package name */
            Object f16853d;

            /* renamed from: e, reason: collision with root package name */
            Object f16854e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f16855f;

            /* renamed from: h, reason: collision with root package name */
            int f16857h;

            a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f16855f = obj;
                this.f16857h |= PduHandle.NONE;
                return k.this.a(null, this);
            }
        }

        k(Ti.a aVar, kotlin.jvm.internal.J j10, kotlin.jvm.internal.N n10, l lVar) {
            this.f16846a = aVar;
            this.f16847b = j10;
            this.f16848c = n10;
            this.f16849d = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // O1.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(mh.InterfaceC6839p r11, dh.InterfaceC5380e r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.l.k.a(mh.p, dh.e):java.lang.Object");
        }
    }

    /* renamed from: O1.l$l, reason: collision with other inner class name */
    static final class C0603l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f16858a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16859b;

        /* renamed from: d, reason: collision with root package name */
        int f16861d;

        C0603l(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16859b = obj;
            this.f16861d |= PduHandle.NONE;
            return l.this.v(this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f16862a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16863b;

        /* renamed from: d, reason: collision with root package name */
        int f16865d;

        m(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16863b = obj;
            this.f16865d |= PduHandle.NONE;
            return l.this.w(this);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f16866a;

        /* renamed from: b, reason: collision with root package name */
        Object f16867b;

        /* renamed from: c, reason: collision with root package name */
        Object f16868c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f16869d;

        /* renamed from: f, reason: collision with root package name */
        int f16871f;

        n(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16869d = obj;
            this.f16871f |= PduHandle.NONE;
            return l.this.x(this);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f16872a;

        /* renamed from: b, reason: collision with root package name */
        Object f16873b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16874c;

        /* renamed from: e, reason: collision with root package name */
        int f16876e;

        o(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16874c = obj;
            this.f16876e |= PduHandle.NONE;
            return l.this.y(this);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f16877a;

        /* renamed from: b, reason: collision with root package name */
        Object f16878b;

        /* renamed from: c, reason: collision with root package name */
        Object f16879c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f16880d;

        /* renamed from: f, reason: collision with root package name */
        int f16882f;

        p(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16880d = obj;
            this.f16882f |= PduHandle.NONE;
            return l.this.z(null, null, this);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f16883a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f16884b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f16885c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(InterfaceC6839p interfaceC6839p, Object obj, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f16884b = interfaceC6839p;
            this.f16885c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new q(this.f16884b, this.f16885c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f16883a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC6839p interfaceC6839p = this.f16884b;
                Object obj2 = this.f16885c;
                this.f16883a = 1;
                obj = interfaceC6839p.invoke(obj2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((q) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f16886a;

        /* renamed from: b, reason: collision with root package name */
        Object f16887b;

        /* renamed from: c, reason: collision with root package name */
        Object f16888c;

        /* renamed from: d, reason: collision with root package name */
        Object f16889d;

        /* renamed from: e, reason: collision with root package name */
        Object f16890e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16891f;

        /* renamed from: h, reason: collision with root package name */
        int f16893h;

        r(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16891f = obj;
            this.f16893h |= PduHandle.NONE;
            return l.this.A(null, this);
        }
    }

    public l(InterfaceC6824a produceFile, O1.j serializer, List initTasksList, O1.a corruptionHandler, N scope) {
        AbstractC6492s.i(produceFile, "produceFile");
        AbstractC6492s.i(serializer, "serializer");
        AbstractC6492s.i(initTasksList, "initTasksList");
        AbstractC6492s.i(corruptionHandler, "corruptionHandler");
        AbstractC6492s.i(scope, "scope");
        this.f16798a = produceFile;
        this.f16799b = serializer;
        this.f16800c = corruptionHandler;
        this.f16801d = scope;
        this.f16802e = AbstractC3222i.A(new g(null));
        this.f16803f = ".tmp";
        this.f16804g = Yg.n.b(new h());
        this.f16805h = P.a(O1.n.f16894a);
        this.f16806i = AbstractC3689v.i1(initTasksList);
        this.f16807j = new O1.k(scope, new d(), e.f16815a, new f(null));
    }

    private final void q(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(AbstractC6492s.p("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File r() {
        return (File) this.f16804g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(b.a aVar, InterfaceC5380e interfaceC5380e) {
        O1.m mVar = (O1.m) this.f16805h.getValue();
        if (!(mVar instanceof O1.b)) {
            if (mVar instanceof O1.i) {
                if (mVar == aVar.a()) {
                    Object objW = w(interfaceC5380e);
                    return objW == AbstractC5467b.g() ? objW : J.f24997a;
                }
            } else {
                if (AbstractC6492s.d(mVar, O1.n.f16894a)) {
                    Object objW2 = w(interfaceC5380e);
                    return objW2 == AbstractC5467b.g() ? objW2 : J.f24997a;
                }
                if (mVar instanceof O1.g) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v20, types: [Ii.x] */
    /* JADX WARN: Type inference failed for: r9v27, types: [Ii.x] */
    /* JADX WARN: Type inference failed for: r9v3, types: [Ii.x] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(O1.l.b.C0601b r9, dh.InterfaceC5380e r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.l.t(O1.l$b$b, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(dh.InterfaceC5380e r14) throws androidx.datastore.core.CorruptionException, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.l.u(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(dh.InterfaceC5380e r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof O1.l.C0603l
            if (r0 == 0) goto L13
            r0 = r5
            O1.l$l r0 = (O1.l.C0603l) r0
            int r1 = r0.f16861d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16861d = r1
            goto L18
        L13:
            O1.l$l r0 = new O1.l$l
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16859b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f16861d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f16858a
            O1.l r0 = (O1.l) r0
            Yg.v.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            Yg.v.b(r5)
            r0.f16858a = r4     // Catch: java.lang.Throwable -> L48
            r0.f16861d = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            Yg.J r5 = Yg.J.f24997a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            Li.z r0 = r0.f16805h
            O1.i r1 = new O1.i
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.l.v(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(dh.InterfaceC5380e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof O1.l.m
            if (r0 == 0) goto L13
            r0 = r5
            O1.l$m r0 = (O1.l.m) r0
            int r1 = r0.f16865d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16865d = r1
            goto L18
        L13:
            O1.l$m r0 = new O1.l$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f16863b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f16865d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f16862a
            O1.l r0 = (O1.l) r0
            Yg.v.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            Yg.v.b(r5)
            r0.f16862a = r4     // Catch: java.lang.Throwable -> L45
            r0.f16865d = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            Li.z r0 = r0.f16805h
            O1.i r1 = new O1.i
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            Yg.J r5 = Yg.J.f24997a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.l.w(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [O1.l] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [O1.l$n, dh.e] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [O1.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [O1.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(dh.InterfaceC5380e r6) throws java.io.FileNotFoundException {
        /*
            r5 = this;
            boolean r0 = r6 instanceof O1.l.n
            if (r0 == 0) goto L13
            r0 = r6
            O1.l$n r0 = (O1.l.n) r0
            int r1 = r0.f16871f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16871f = r1
            goto L18
        L13:
            O1.l$n r0 = new O1.l$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16869d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f16871f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f16868c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f16867b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f16866a
            O1.l r0 = (O1.l) r0
            Yg.v.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            Yg.v.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.r()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            O1.j r6 = r5.f16799b     // Catch: java.lang.Throwable -> L65
            r0.f16866a = r5     // Catch: java.lang.Throwable -> L65
            r0.f16867b = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.f16868c = r4     // Catch: java.lang.Throwable -> L65
            r0.f16871f = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            jh.AbstractC6329b.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            jh.AbstractC6329b.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            O1.j r6 = r0.f16799b
            java.lang.Object r6 = r6.b()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.l.x(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(dh.InterfaceC5380e r8) throws androidx.datastore.core.CorruptionException, java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof O1.l.o
            if (r0 == 0) goto L13
            r0 = r8
            O1.l$o r0 = (O1.l.o) r0
            int r1 = r0.f16876e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16876e = r1
            goto L18
        L13:
            O1.l$o r0 = new O1.l$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16874c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f16876e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f16873b
            java.lang.Object r0 = r0.f16872a
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            Yg.v.b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f16873b
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f16872a
            O1.l r4 = (O1.l) r4
            Yg.v.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f16872a
            O1.l r2 = (O1.l) r2
            Yg.v.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            Yg.v.b(r8)
            r0.f16872a = r7     // Catch: androidx.datastore.core.CorruptionException -> L64
            r0.f16876e = r5     // Catch: androidx.datastore.core.CorruptionException -> L64
            java.lang.Object r8 = r7.x(r0)     // Catch: androidx.datastore.core.CorruptionException -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            O1.a r5 = r2.f16800c
            r0.f16872a = r2
            r0.f16873b = r8
            r0.f16876e = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f16872a = r2     // Catch: java.io.IOException -> L88
            r0.f16873b = r8     // Catch: java.io.IOException -> L88
            r0.f16876e = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.A(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            Yg.AbstractC3663g.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.l.y(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(mh.InterfaceC6839p r8, dh.InterfaceC5384i r9, dh.InterfaceC5380e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof O1.l.p
            if (r0 == 0) goto L13
            r0 = r10
            O1.l$p r0 = (O1.l.p) r0
            int r1 = r0.f16882f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16882f = r1
            goto L18
        L13:
            O1.l$p r0 = new O1.l$p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16880d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f16882f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f16878b
            java.lang.Object r9 = r0.f16877a
            O1.l r9 = (O1.l) r9
            Yg.v.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f16879c
            java.lang.Object r9 = r0.f16878b
            O1.b r9 = (O1.b) r9
            java.lang.Object r2 = r0.f16877a
            O1.l r2 = (O1.l) r2
            Yg.v.b(r10)
            goto L73
        L49:
            Yg.v.b(r10)
            Li.z r10 = r7.f16805h
            java.lang.Object r10 = r10.getValue()
            O1.b r10 = (O1.b) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            O1.l$q r6 = new O1.l$q
            r6.<init>(r8, r2, r3)
            r0.f16877a = r7
            r0.f16878b = r10
            r0.f16879c = r2
            r0.f16882f = r5
            java.lang.Object r8 = Ii.AbstractC3059i.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = kotlin.jvm.internal.AbstractC6492s.d(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f16877a = r2
            r0.f16878b = r10
            r0.f16879c = r3
            r0.f16882f = r4
            java.lang.Object r8 = r2.A(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            Li.z r9 = r9.f16805h
            O1.b r10 = new O1.b
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.l.z(mh.p, dh.i, dh.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(java.lang.Object r8, dh.InterfaceC5380e r9) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof O1.l.r
            if (r0 == 0) goto L13
            r0 = r9
            O1.l$r r0 = (O1.l.r) r0
            int r1 = r0.f16893h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16893h = r1
            goto L18
        L13:
            O1.l$r r0 = new O1.l$r
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f16891f
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f16893h
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f16890e
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f16889d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f16888c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f16887b
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f16886a
            O1.l r0 = (O1.l) r0
            Yg.v.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lc3
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            Yg.v.b(r9)
            java.io.File r9 = r7.r()
            r7.q(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.r()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f16803f
            java.lang.String r2 = kotlin.jvm.internal.AbstractC6492s.p(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            O1.j r4 = r7.f16799b     // Catch: java.lang.Throwable -> Lc1
            O1.l$c r5 = new O1.l$c     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.f16886a = r7     // Catch: java.lang.Throwable -> Lc1
            r0.f16887b = r9     // Catch: java.lang.Throwable -> Lc1
            r0.f16888c = r2     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            r0.f16889d = r6     // Catch: java.lang.Throwable -> Lc1
            r0.f16890e = r2     // Catch: java.lang.Throwable -> Lc1
            r0.f16893h = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r8 = r4.a(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            Yg.J r8 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L3d
            jh.AbstractC6329b.a(r2, r1)     // Catch: java.io.IOException -> Lbe
            java.io.File r8 = r0.r()     // Catch: java.io.IOException -> Lbe
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto La2
            Yg.J r8 = Yg.J.f24997a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r9.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            r9.append(r3)     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbe
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbe
            throw r8     // Catch: java.io.IOException -> Lbe
        Lbe:
            r8 = move-exception
            r9 = r3
            goto Lca
        Lc1:
            r8 = move-exception
            r3 = r9
        Lc3:
            throw r8     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r9 = move-exception
            jh.AbstractC6329b.a(r2, r8)     // Catch: java.io.IOException -> Lbe
            throw r9     // Catch: java.io.IOException -> Lbe
        Lc9:
            r8 = move-exception
        Lca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld3
            r9.delete()
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.l.A(java.lang.Object, dh.e):java.lang.Object");
    }

    @Override // O1.e
    public Object a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) throws Throwable {
        InterfaceC3088x interfaceC3088xB = AbstractC3092z.b(null, 1, null);
        this.f16807j.e(new b.C0601b(interfaceC6839p, interfaceC3088xB, (O1.m) this.f16805h.getValue(), interfaceC5380e.getContext()));
        return interfaceC3088xB.await(interfaceC5380e);
    }

    @Override // O1.e
    public InterfaceC3220g b() {
        return this.f16802e;
    }
}
