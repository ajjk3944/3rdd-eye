package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5095w;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.V;

/* renamed from: A4.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2400d extends AbstractC5095w implements N {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C2400d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile V PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C2402f aesCtrKey_;
    private v hmacKey_;
    private int version_;

    /* renamed from: A4.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f296a;

        static {
            int[] iArr = new int[AbstractC5095w.d.values().length];
            f296a = iArr;
            try {
                iArr[AbstractC5095w.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f296a[AbstractC5095w.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f296a[AbstractC5095w.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f296a[AbstractC5095w.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f296a[AbstractC5095w.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f296a[AbstractC5095w.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f296a[AbstractC5095w.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: A4.d$b */
    public static final class b extends AbstractC5095w.a implements N {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public /* bridge */ /* synthetic */ M c() {
            return super.o();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.l();
        }

        public b t(C2402f c2402f) {
            m();
            ((C2400d) this.f38595b).c0(c2402f);
            return this;
        }

        public b u(v vVar) {
            m();
            ((C2400d) this.f38595b).d0(vVar);
            return this;
        }

        public b w(int i10) {
            m();
            ((C2400d) this.f38595b).e0(i10);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.M.a
        public /* bridge */ /* synthetic */ M y() {
            return super.k();
        }

        private b() {
            super(C2400d.DEFAULT_INSTANCE);
        }
    }

    static {
        C2400d c2400d = new C2400d();
        DEFAULT_INSTANCE = c2400d;
        AbstractC5095w.P(C2400d.class, c2400d);
    }

    private C2400d() {
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static C2400d b0(AbstractC5081h abstractC5081h, C5088o c5088o) {
        return (C2400d) AbstractC5095w.J(DEFAULT_INSTANCE, abstractC5081h, c5088o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(C2402f c2402f) {
        c2402f.getClass();
        this.aesCtrKey_ = c2402f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(v vVar) {
        vVar.getClass();
        this.hmacKey_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i10) {
        this.version_ = i10;
    }

    public C2402f X() {
        C2402f c2402f = this.aesCtrKey_;
        return c2402f == null ? C2402f.X() : c2402f;
    }

    public v Y() {
        v vVar = this.hmacKey_;
        return vVar == null ? v.X() : vVar;
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
        a aVar = null;
        switch (a.f296a[dVar.ordinal()]) {
            case 1:
                return new C2400d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5095w.H(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V bVar = PARSER;
                if (bVar == null) {
                    synchronized (C2400d.class) {
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
