package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5095w;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.V;

/* loaded from: classes3.dex */
public final class m extends AbstractC5095w implements N {
    private static final m DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile V PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f305a;

        static {
            int[] iArr = new int[AbstractC5095w.d.values().length];
            f305a = iArr;
            try {
                iArr[AbstractC5095w.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f305a[AbstractC5095w.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f305a[AbstractC5095w.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f305a[AbstractC5095w.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f305a[AbstractC5095w.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f305a[AbstractC5095w.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f305a[AbstractC5095w.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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

        public b t(int i10) {
            m();
            ((m) this.f38595b).Y(i10);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.M.a
        public /* bridge */ /* synthetic */ M y() {
            return super.k();
        }

        private b() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        AbstractC5095w.P(m.class, mVar);
    }

    private m() {
    }

    public static b W() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static m X(AbstractC5081h abstractC5081h, C5088o c5088o) {
        return (m) AbstractC5095w.J(DEFAULT_INSTANCE, abstractC5081h, c5088o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i10) {
        this.keySize_ = i10;
    }

    public int V() {
        return this.keySize_;
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
        switch (a.f305a[dVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5095w.H(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V bVar = PARSER;
                if (bVar == null) {
                    synchronized (m.class) {
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
