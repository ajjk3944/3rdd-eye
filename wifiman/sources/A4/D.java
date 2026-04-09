package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5095w;
import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.V;

/* loaded from: classes3.dex */
public final class D extends AbstractC5095w implements N {
    private static final D DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile V PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC5097y.d keyInfo_ = AbstractC5095w.s();
    private int primaryKeyId_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f284a;

        static {
            int[] iArr = new int[AbstractC5095w.d.values().length];
            f284a = iArr;
            try {
                iArr[AbstractC5095w.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f284a[AbstractC5095w.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f284a[AbstractC5095w.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f284a[AbstractC5095w.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f284a[AbstractC5095w.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f284a[AbstractC5095w.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f284a[AbstractC5095w.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

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

        public b t(c cVar) {
            m();
            ((D) this.f38595b).W(cVar);
            return this;
        }

        public b u(int i10) {
            m();
            ((D) this.f38595b).a0(i10);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.M.a
        public /* bridge */ /* synthetic */ M y() {
            return super.k();
        }

        private b() {
            super(D.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends AbstractC5095w implements N {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile V PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static final class a extends AbstractC5095w.a implements N {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.N
            public /* bridge */ /* synthetic */ M c() {
                return super.o();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.l();
            }

            public a t(int i10) {
                m();
                ((c) this.f38595b).a0(i10);
                return this;
            }

            public a u(I i10) {
                m();
                ((c) this.f38595b).b0(i10);
                return this;
            }

            public a w(z zVar) {
                m();
                ((c) this.f38595b).c0(zVar);
                return this;
            }

            public a x(String str) {
                m();
                ((c) this.f38595b).d0(str);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.M.a
            public /* bridge */ /* synthetic */ M y() {
                return super.k();
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC5095w.P(c.class, cVar);
        }

        private c() {
        }

        public static a Z() {
            return (a) DEFAULT_INSTANCE.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(int i10) {
            this.keyId_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(I i10) {
            this.outputPrefixType_ = i10.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(z zVar) {
            this.status_ = zVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d0(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int Y() {
            return this.keyId_;
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
            switch (a.f284a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5095w.H(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    V bVar = PARSER;
                    if (bVar == null) {
                        synchronized (c.class) {
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

    static {
        D d10 = new D();
        DEFAULT_INSTANCE = d10;
        AbstractC5095w.P(D.class, d10);
    }

    private D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(c cVar) {
        cVar.getClass();
        X();
        this.keyInfo_.add(cVar);
    }

    private void X() {
        AbstractC5097y.d dVar = this.keyInfo_;
        if (dVar.E()) {
            return;
        }
        this.keyInfo_ = AbstractC5095w.F(dVar);
    }

    public static b Z() {
        return (b) DEFAULT_INSTANCE.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int i10) {
        this.primaryKeyId_ = i10;
    }

    public c Y(int i10) {
        return (c) this.keyInfo_.get(i10);
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
        switch (a.f284a[dVar.ordinal()]) {
            case 1:
                return new D();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5095w.H(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V bVar = PARSER;
                if (bVar == null) {
                    synchronized (D.class) {
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
