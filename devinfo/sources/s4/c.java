package s4;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.x0;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends w {
    private static final c DEFAULT_INSTANCE;
    private static volatile s0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private j0 preferences_ = j0.f997b;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        w.j(c.class, cVar);
    }

    public static j0 l(c cVar) {
        j0 j0Var = cVar.preferences_;
        if (!j0Var.f998a) {
            cVar.preferences_ = j0Var.b();
        }
        return cVar.preferences_;
    }

    public static a n() {
        return (a) ((u) DEFAULT_INSTANCE.c(5));
    }

    public static c o(FileInputStream fileInputStream) throws a0 {
        c cVar = DEFAULT_INSTANCE;
        i iVar = new i(fileInputStream);
        o oVarA = o.a();
        w wVarI = cVar.i();
        try {
            u0 u0Var = u0.f1071c;
            u0Var.getClass();
            x0 x0VarA = u0Var.a(wVarI.getClass());
            k kVar = (k) iVar.f996b;
            if (kVar == null) {
                kVar = new k((j) iVar);
            }
            x0VarA.h(wVarI, kVar, oVarA);
            x0VarA.c(wVarI);
            if (w.f(wVarI, true)) {
                return (c) wVarI;
            }
            throw new a0(new d1().getMessage());
        } catch (a0 e2) {
            if (e2.f932a) {
                throw new a0(e2.getMessage(), e2);
            }
            throw e2;
        } catch (d1 e10) {
            throw new a0(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof a0) {
                throw ((a0) e11.getCause());
            }
            throw new a0(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof a0) {
                throw ((a0) e12.getCause());
            }
            throw e12;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final Object c(int i4) {
        s0 vVar;
        switch (i3.e.c(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f33467a});
            case 3:
                return new c();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                s0 s0Var = PARSER;
                if (s0Var != null) {
                    return s0Var;
                }
                synchronized (c.class) {
                    try {
                        vVar = PARSER;
                        if (vVar == null) {
                            vVar = new v();
                            PARSER = vVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return vVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
