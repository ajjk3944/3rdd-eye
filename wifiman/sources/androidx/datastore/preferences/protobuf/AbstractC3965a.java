package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.M;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3965a implements M {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1095a implements M.a {
        protected static void b(Iterable iterable, List list) {
            AbstractC3987x.a(iterable);
            if (!(iterable instanceof B)) {
                if (iterable instanceof W) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    e(iterable, list);
                    return;
                }
            }
            List listD = ((B) iterable).d();
            B b10 = (B) list;
            int size = list.size();
            for (Object obj : listD) {
                if (obj == null) {
                    String str = "Element at index " + (b10.size() - size) + " is null.";
                    for (int size2 = b10.size() - 1; size2 >= size; size2--) {
                        b10.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC3971g) {
                    b10.d0((AbstractC3971g) obj);
                } else {
                    b10.add((String) obj);
                }
            }
        }

        private static void e(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static UninitializedMessageException k(M m10) {
            return new UninitializedMessageException(m10);
        }

        protected abstract AbstractC1095a f(AbstractC3965a abstractC3965a);

        @Override // androidx.datastore.preferences.protobuf.M.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public AbstractC1095a J(M m10) {
            if (c().getClass().isInstance(m10)) {
                return f((AbstractC3965a) m10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static void a(Iterable iterable, List list) {
        AbstractC1095a.b(iterable, list);
    }

    abstract int b();

    int e(c0 c0Var) {
        int iB = b();
        if (iB != -1) {
            return iB;
        }
        int iF = c0Var.f(this);
        g(iF);
        return iF;
    }

    UninitializedMessageException f() {
        return new UninitializedMessageException(this);
    }

    abstract void g(int i10);

    public void i(OutputStream outputStream) {
        CodedOutputStream codedOutputStreamZ = CodedOutputStream.Z(outputStream, CodedOutputStream.C(d()));
        m(codedOutputStreamZ);
        codedOutputStreamZ.W();
    }
}
