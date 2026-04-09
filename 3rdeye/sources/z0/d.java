package Z0;

import androidx.datastore.preferences.protobuf.AbstractC1731i;
import androidx.datastore.preferences.protobuf.AbstractC1744w;
import androidx.datastore.preferences.protobuf.C1732j;
import androidx.datastore.preferences.protobuf.C1737o;
import androidx.datastore.preferences.protobuf.C1747z;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.f0;
import androidx.datastore.preferences.protobuf.r0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class d extends AbstractC1744w<d, a> implements Q {
    private static final d DEFAULT_INSTANCE;
    private static volatile Y<d> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private J<String, f> preferences_ = J.f15554c;

    /* compiled from: PreferencesProto.java */
    public static final class a extends AbstractC1744w.a<d, a> implements Q {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final I<String, f> f13989a = new I<>(r0.STRING, r0.MESSAGE, f.t());
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        AbstractC1744w.j(d.class, dVar);
    }

    public static J l(d dVar) {
        J<String, f> j4 = dVar.preferences_;
        if (!j4.f15555b) {
            dVar.preferences_ = j4.e();
        }
        return dVar.preferences_;
    }

    public static a n() {
        d dVar = DEFAULT_INSTANCE;
        dVar.getClass();
        return (a) ((AbstractC1744w.a) dVar.f(AbstractC1744w.f.NEW_BUILDER));
    }

    public static d o(FileInputStream fileInputStream) throws IOException {
        d dVar = DEFAULT_INSTANCE;
        AbstractC1731i.b bVar = new AbstractC1731i.b(fileInputStream);
        C1737o c1737oA = C1737o.a();
        AbstractC1744w abstractC1744w = (AbstractC1744w) dVar.f(AbstractC1744w.f.NEW_MUTABLE_INSTANCE);
        try {
            b0 b0Var = b0.f15581c;
            b0Var.getClass();
            f0 f0VarA = b0Var.a(abstractC1744w.getClass());
            C1732j c1732j = bVar.f15610d;
            if (c1732j == null) {
                c1732j = new C1732j(bVar);
            }
            f0VarA.a(abstractC1744w, c1732j, c1737oA);
            f0VarA.makeImmutable(abstractC1744w);
            if (abstractC1744w.i()) {
                return (d) abstractC1744w;
            }
            throw new C1747z(new I1.c().getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof C1747z) {
                throw ((C1747z) e4.getCause());
            }
            throw new C1747z(e4.getMessage());
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C1747z) {
                throw ((C1747z) e10.getCause());
            }
            throw e10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1744w
    public final Object f(AbstractC1744w.f fVar) {
        Y bVar;
        switch (c.f13988a[fVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new a();
            case 3:
                return new d0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f13989a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<d> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (d.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC1744w.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
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

    public final Map<String, f> m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
