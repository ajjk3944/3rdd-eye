package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5095w;
import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.V;

/* loaded from: classes3.dex */
public final class J extends AbstractC5095w implements N {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final J DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile V PARSER;
    private String configName_ = "";
    private AbstractC5097y.d entry_ = AbstractC5095w.s();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f290a;

        static {
            int[] iArr = new int[AbstractC5095w.d.values().length];
            f290a = iArr;
            try {
                iArr[AbstractC5095w.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f290a[AbstractC5095w.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f290a[AbstractC5095w.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f290a[AbstractC5095w.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f290a[AbstractC5095w.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f290a[AbstractC5095w.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f290a[AbstractC5095w.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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

        @Override // com.google.crypto.tink.shaded.protobuf.M.a
        public /* bridge */ /* synthetic */ M y() {
            return super.k();
        }

        private b() {
            super(J.DEFAULT_INSTANCE);
        }
    }

    static {
        J j10 = new J();
        DEFAULT_INSTANCE = j10;
        AbstractC5095w.P(J.class, j10);
    }

    private J() {
    }

    public static J U() {
        return DEFAULT_INSTANCE;
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
        switch (a.f290a[dVar.ordinal()]) {
            case 1:
                return new J();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5095w.H(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", B.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V bVar = PARSER;
                if (bVar == null) {
                    synchronized (J.class) {
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
