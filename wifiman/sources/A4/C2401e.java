package A4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5095w;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.V;

/* renamed from: A4.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2401e extends AbstractC5095w implements N {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C2401e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile V PARSER;
    private C2403g aesCtrKeyFormat_;
    private w hmacKeyFormat_;

    /* renamed from: A4.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f297a;

        static {
            int[] iArr = new int[AbstractC5095w.d.values().length];
            f297a = iArr;
            try {
                iArr[AbstractC5095w.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f297a[AbstractC5095w.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f297a[AbstractC5095w.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f297a[AbstractC5095w.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f297a[AbstractC5095w.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f297a[AbstractC5095w.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f297a[AbstractC5095w.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: A4.e$b */
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

        public b t(C2403g c2403g) {
            m();
            ((C2401e) this.f38595b).a0(c2403g);
            return this;
        }

        public b u(w wVar) {
            m();
            ((C2401e) this.f38595b).b0(wVar);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.M.a
        public /* bridge */ /* synthetic */ M y() {
            return super.k();
        }

        private b() {
            super(C2401e.DEFAULT_INSTANCE);
        }
    }

    static {
        C2401e c2401e = new C2401e();
        DEFAULT_INSTANCE = c2401e;
        AbstractC5095w.P(C2401e.class, c2401e);
    }

    private C2401e() {
    }

    public static b Y() {
        return (b) DEFAULT_INSTANCE.o();
    }

    public static C2401e Z(AbstractC5081h abstractC5081h, C5088o c5088o) {
        return (C2401e) AbstractC5095w.J(DEFAULT_INSTANCE, abstractC5081h, c5088o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(C2403g c2403g) {
        c2403g.getClass();
        this.aesCtrKeyFormat_ = c2403g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(w wVar) {
        wVar.getClass();
        this.hmacKeyFormat_ = wVar;
    }

    public C2403g W() {
        C2403g c2403g = this.aesCtrKeyFormat_;
        return c2403g == null ? C2403g.W() : c2403g;
    }

    public w X() {
        w wVar = this.hmacKeyFormat_;
        return wVar == null ? w.W() : wVar;
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
        switch (a.f297a[dVar.ordinal()]) {
            case 1:
                return new C2401e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC5095w.H(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V bVar = PARSER;
                if (bVar == null) {
                    synchronized (C2401e.class) {
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
