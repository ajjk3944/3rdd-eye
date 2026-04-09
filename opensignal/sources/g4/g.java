package g4;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class g extends a0 {
    private static final g DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private b0 strings_ = b1.f1248r;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        a0.j(g.class, gVar);
    }

    public static void l(g gVar, Iterable iterable) {
        b0 b0Var = gVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) b0Var).f1247a) {
            b1 b1Var = (b1) b0Var;
            int i10 = b1Var.f1250g;
            gVar.strings_ = b1Var.c(i10 == 0 ? 10 : i10 * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = c0.f1253a;
        if (iterable instanceof g0) {
            List listF = ((g0) iterable).f();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((b1) randomAccess).getClass();
            Iterator it = listF.iterator();
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
                androidx.datastore.preferences.protobuf.g.c(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof y0) {
            ((androidx.datastore.preferences.protobuf.b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((b1) randomAccess).f1250g);
        }
        b1 b1Var2 = (b1) randomAccess;
        int i11 = b1Var2.f1250g;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (b1Var2.f1250g - i11) + " is null.";
                for (int i12 = b1Var2.f1250g - 1; i12 >= i11; i12--) {
                    b1Var2.remove(i12);
                }
                throw new NullPointerException(str);
            }
            b1Var2.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        g gVar = DEFAULT_INSTANCE;
        gVar.getClass();
        return (f) ((x) gVar.c(z.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final Object c(z zVar) {
        x0 yVar;
        switch (b.f9328a[zVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new f(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case j.STRING_FIELD_NUMBER /* 5 */:
                x0 x0Var = PARSER;
                if (x0Var != null) {
                    return x0Var;
                }
                synchronized (g.class) {
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

    public final b0 n() {
        return this.strings_;
    }
}
