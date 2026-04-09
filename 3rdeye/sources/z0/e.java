package Z0;

import androidx.datastore.preferences.protobuf.AbstractC1730h;
import androidx.datastore.preferences.protobuf.AbstractC1744w;
import androidx.datastore.preferences.protobuf.C1746y;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.d0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class e extends AbstractC1744w<e, a> implements Q {
    private static final e DEFAULT_INSTANCE;
    private static volatile Y<e> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C1746y.c<String> strings_ = c0.f15585e;

    /* compiled from: PreferencesProto.java */
    public static final class a extends AbstractC1744w.a<e, a> implements Q {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC1744w.j(e.class, eVar);
    }

    public static void l(e eVar, Iterable iterable) {
        if (!eVar.strings_.isModifiable()) {
            C1746y.c<String> cVar = eVar.strings_;
            int size = cVar.size();
            eVar.strings_ = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        List list = eVar.strings_;
        Charset charset = C1746y.f15707a;
        iterable.getClass();
        if (iterable instanceof E) {
            List<?> underlyingElements = ((E) iterable).getUnderlyingElements();
            E e4 = (E) list;
            int size2 = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (e4.size() - size2) + " is null.";
                    for (int size3 = e4.size() - 1; size3 >= size2; size3--) {
                        e4.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1730h) {
                    e4.a((AbstractC1730h) obj);
                } else {
                    e4.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof Z) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static e m() {
        return DEFAULT_INSTANCE;
    }

    public static a o() {
        e eVar = DEFAULT_INSTANCE;
        eVar.getClass();
        return (a) ((AbstractC1744w.a) eVar.f(AbstractC1744w.f.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1744w
    public final Object f(AbstractC1744w.f fVar) {
        Y bVar;
        switch (c.f13988a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a();
            case 3:
                return new d0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<e> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (e.class) {
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

    public final C1746y.c n() {
        return this.strings_;
    }
}
