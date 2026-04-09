package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5095w;
import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.V;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class C extends AbstractC5095w implements N {
    private static final C DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile V PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC5097y.d key_ = AbstractC5095w.s();
    private int primaryKeyId_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f283a;

        static {
            int[] iArr = new int[AbstractC5095w.d.values().length];
            f283a = iArr;
            try {
                iArr[AbstractC5095w.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f283a[AbstractC5095w.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f283a[AbstractC5095w.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f283a[AbstractC5095w.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f283a[AbstractC5095w.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f283a[AbstractC5095w.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f283a[AbstractC5095w.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            ((C) this.f38595b).W(cVar);
            return this;
        }

        public c u(int i10) {
            return ((C) this.f38595b).Y(i10);
        }

        public int w() {
            return ((C) this.f38595b).Z();
        }

        public List x() {
            return Collections.unmodifiableList(((C) this.f38595b).a0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.M.a
        public /* bridge */ /* synthetic */ M y() {
            return super.k();
        }

        public b z(int i10) {
            m();
            ((C) this.f38595b).f0(i10);
            return this;
        }

        private b() {
            super(C.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends AbstractC5095w implements N {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile V PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

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

            public a t(y yVar) {
                m();
                ((c) this.f38595b).e0(yVar);
                return this;
            }

            public a u(int i10) {
                m();
                ((c) this.f38595b).f0(i10);
                return this;
            }

            public a w(I i10) {
                m();
                ((c) this.f38595b).g0(i10);
                return this;
            }

            public a x(z zVar) {
                m();
                ((c) this.f38595b).h0(zVar);
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

        public static a d0() {
            return (a) DEFAULT_INSTANCE.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f0(int i10) {
            this.keyId_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(I i10) {
            this.outputPrefixType_ = i10.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(z zVar) {
            this.status_ = zVar.getNumber();
        }

        public y Y() {
            y yVar = this.keyData_;
            return yVar == null ? y.X() : yVar;
        }

        public int Z() {
            return this.keyId_;
        }

        public I a0() {
            I iForNumber = I.forNumber(this.outputPrefixType_);
            return iForNumber == null ? I.UNRECOGNIZED : iForNumber;
        }

        public z b0() {
            z zVarForNumber = z.forNumber(this.status_);
            return zVarForNumber == null ? z.UNRECOGNIZED : zVarForNumber;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public /* bridge */ /* synthetic */ M c() {
            return super.u();
        }

        public boolean c0() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.M
        public /* bridge */ /* synthetic */ M.a h() {
            return super.G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5095w
        protected final Object r(AbstractC5095w.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f283a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC5095w.H(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        C c10 = new C();
        DEFAULT_INSTANCE = c10;
        AbstractC5095w.P(C.class, c10);
    }

    private C() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(c cVar) {
        cVar.getClass();
        X();
        this.key_.add(cVar);
    }

    private void X() {
        AbstractC5097y.d dVar = this.key_;
        if (dVar.E()) {
            return;
        }
        this.key_ = AbstractC5095w.F(dVar);
    }

    public static b c0() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static C d0(InputStream inputStream, C5088o c5088o) {
        return (C) AbstractC5095w.K(DEFAULT_INSTANCE, inputStream, c5088o);
    }

    public static C e0(byte[] bArr, C5088o c5088o) {
        return (C) AbstractC5095w.L(DEFAULT_INSTANCE, bArr, c5088o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i10) {
        this.primaryKeyId_ = i10;
    }

    public c Y(int i10) {
        return (c) this.key_.get(i10);
    }

    public int Z() {
        return this.key_.size();
    }

    public List a0() {
        return this.key_;
    }

    public int b0() {
        return this.primaryKeyId_;
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
        switch (a.f283a[dVar.ordinal()]) {
            case 1:
                return new C();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5095w.H(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V bVar = PARSER;
                if (bVar == null) {
                    synchronized (C.class) {
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
