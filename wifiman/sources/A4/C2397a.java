package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5095w;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.V;

/* renamed from: A4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2397a extends AbstractC5095w implements N {
    private static final C2397a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile V PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC5081h keyValue_ = AbstractC5081h.f38499b;
    private C2399c params_;
    private int version_;

    /* renamed from: A4.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0004a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f293a;

        static {
            int[] iArr = new int[AbstractC5095w.d.values().length];
            f293a = iArr;
            try {
                iArr[AbstractC5095w.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f293a[AbstractC5095w.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f293a[AbstractC5095w.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f293a[AbstractC5095w.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f293a[AbstractC5095w.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f293a[AbstractC5095w.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f293a[AbstractC5095w.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: A4.a$b */
    public static final class b extends AbstractC5095w.a implements N {
        /* synthetic */ b(C0004a c0004a) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public /* bridge */ /* synthetic */ M c() {
            return super.o();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.l();
        }

        public b t(AbstractC5081h abstractC5081h) {
            m();
            ((C2397a) this.f38595b).c0(abstractC5081h);
            return this;
        }

        public b u(C2399c c2399c) {
            m();
            ((C2397a) this.f38595b).d0(c2399c);
            return this;
        }

        public b w(int i10) {
            m();
            ((C2397a) this.f38595b).e0(i10);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.M.a
        public /* bridge */ /* synthetic */ M y() {
            return super.k();
        }

        private b() {
            super(C2397a.DEFAULT_INSTANCE);
        }
    }

    static {
        C2397a c2397a = new C2397a();
        DEFAULT_INSTANCE = c2397a;
        AbstractC5095w.P(C2397a.class, c2397a);
    }

    private C2397a() {
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static C2397a b0(AbstractC5081h abstractC5081h, C5088o c5088o) {
        return (C2397a) AbstractC5095w.J(DEFAULT_INSTANCE, abstractC5081h, c5088o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(AbstractC5081h abstractC5081h) {
        abstractC5081h.getClass();
        this.keyValue_ = abstractC5081h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(C2399c c2399c) {
        c2399c.getClass();
        this.params_ = c2399c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i10) {
        this.version_ = i10;
    }

    public AbstractC5081h X() {
        return this.keyValue_;
    }

    public C2399c Y() {
        C2399c c2399c = this.params_;
        return c2399c == null ? C2399c.V() : c2399c;
    }

    public int Z() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public /* bridge */ /* synthetic */ M c() {
        return super.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public /* bridge */ /* synthetic */ M.a h() {
        return super.G();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5095w
    protected final Object r(AbstractC5095w.d dVar, Object obj, Object obj2) {
        C0004a c0004a = null;
        switch (C0004a.f293a[dVar.ordinal()]) {
            case 1:
                return new C2397a();
            case 2:
                return new b(c0004a);
            case 3:
                return AbstractC5095w.H(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V bVar = PARSER;
                if (bVar == null) {
                    synchronized (C2397a.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC5095w.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
                        }
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
