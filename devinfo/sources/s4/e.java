package s4;

import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends w {
    private static final e DEFAULT_INSTANCE;
    private static volatile s0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private x strings_ = v0.f1074d;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        w.j(e.class, eVar);
    }

    public static void l(e eVar, Iterable iterable) {
        x xVar = eVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) xVar).f936a) {
            v0 v0Var = (v0) xVar;
            int i4 = v0Var.f1076c;
            eVar.strings_ = v0Var.d(i4 == 0 ? 10 : i4 * 2);
        }
        RandomAccess randomAccess = eVar.strings_;
        Charset charset = y.f1081a;
        if (iterable instanceof c0) {
            List listH = ((c0) iterable).h();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((v0) randomAccess).getClass();
            Iterator it = listH.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof androidx.datastore.preferences.protobuf.g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                androidx.datastore.preferences.protobuf.g.d(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof t0) {
            ((androidx.datastore.preferences.protobuf.b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((v0) randomAccess).f1076c);
        }
        v0 v0Var2 = (v0) randomAccess;
        int i10 = v0Var2.f1076c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (v0Var2.f1076c - i10) + " is null.";
                for (int i11 = v0Var2.f1076c - 1; i11 >= i10; i11--) {
                    v0Var2.remove(i11);
                }
                throw new NullPointerException(str);
            }
            v0Var2.add(obj);
        }
    }

    public static e m() {
        return DEFAULT_INSTANCE;
    }

    public static d o() {
        return (d) ((u) DEFAULT_INSTANCE.c(5));
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
                return new w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                s0 s0Var = PARSER;
                if (s0Var != null) {
                    return s0Var;
                }
                synchronized (e.class) {
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

    public final x n() {
        return this.strings_;
    }
}
