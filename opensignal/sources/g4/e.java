package g4;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.j1;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends a0 {
    private static final e DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private o0 preferences_ = o0.f1330d;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        a0.j(e.class, eVar);
    }

    public static o0 l(e eVar) {
        o0 o0Var = eVar.preferences_;
        if (!o0Var.f1331a) {
            eVar.preferences_ = o0Var.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        e eVar = DEFAULT_INSTANCE;
        eVar.getClass();
        return (c) ((x) eVar.c(z.NEW_BUILDER));
    }

    public static e o(InputStream inputStream) throws e0 {
        androidx.datastore.preferences.protobuf.j iVar;
        e eVar = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = c0.f1254b;
            int length = bArr.length;
            iVar = new androidx.datastore.preferences.protobuf.h(bArr, 0, length, false);
            try {
                iVar.i(length);
            } catch (e0 e4) {
                throw new IllegalArgumentException(e4);
            }
        } else {
            iVar = new androidx.datastore.preferences.protobuf.i(inputStream);
        }
        p pVarA = p.a();
        a0 a0VarI = eVar.i();
        try {
            a1 a1Var = a1.f1244c;
            a1Var.getClass();
            d1 d1VarA = a1Var.a(a0VarI.getClass());
            androidx.datastore.preferences.protobuf.l lVar = (androidx.datastore.preferences.protobuf.l) iVar.f1301d;
            if (lVar == null) {
                lVar = new androidx.datastore.preferences.protobuf.l(iVar);
            }
            d1VarA.h(a0VarI, lVar, pVarA);
            d1VarA.c(a0VarI);
            if (a0.f(a0VarI, true)) {
                return (e) a0VarI;
            }
            throw new e0(new j1().getMessage());
        } catch (e0 e10) {
            if (e10.f1264a) {
                throw new e0(e10.getMessage(), e10);
            }
            throw e10;
        } catch (j1 e11) {
            throw new e0(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof e0) {
                throw ((e0) e12.getCause());
            }
            throw new e0(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof e0) {
                throw ((e0) e13.getCause());
            }
            throw e13;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final Object c(z zVar) {
        x0 yVar;
        switch (b.f9328a[zVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new c(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f9329a});
            case 4:
                return DEFAULT_INSTANCE;
            case j.STRING_FIELD_NUMBER /* 5 */:
                x0 x0Var = PARSER;
                if (x0Var != null) {
                    return x0Var;
                }
                synchronized (e.class) {
                    try {
                        yVar = PARSER;
                        if (yVar == null) {
                            yVar = new y();
                            PARSER = yVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return yVar;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
