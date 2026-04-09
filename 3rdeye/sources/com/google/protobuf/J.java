package com.google.protobuf;

import com.google.protobuf.B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* loaded from: classes2.dex */
public abstract class J {
    private static final J FULL_INSTANCE;
    private static final J LITE_INSTANCE;

    /* compiled from: ListFieldSchema.java */
    public static final class b extends J {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        public static <E> List<E> getList(Object obj, long j4) {
            return (List) y0.getObject(obj, j4);
        }

        @Override // com.google.protobuf.J
        public void makeImmutableListAt(Object obj, long j4) {
            Object objUnmodifiableList;
            List list = (List) y0.getObject(obj, j4);
            if (list instanceof I) {
                objUnmodifiableList = ((I) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof f0) && (list instanceof B.i)) {
                    B.i iVar = (B.i) list;
                    if (iVar.isModifiable()) {
                        iVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            y0.putObject(obj, j4, objUnmodifiableList);
        }

        @Override // com.google.protobuf.J
        public <E> void mergeListsAt(Object obj, Object obj2, long j4) {
            List list = getList(obj2, j4);
            List listMutableListAt = mutableListAt(obj, j4, list.size());
            int size = listMutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(list);
            }
            if (size > 0) {
                list = listMutableListAt;
            }
            y0.putObject(obj, j4, list);
        }

        @Override // com.google.protobuf.J
        public <L> List<L> mutableListAt(Object obj, long j4) {
            return mutableListAt(obj, j4, 10);
        }

        private static <L> List<L> mutableListAt(Object obj, long j4, int i) {
            List<L> list = getList(obj, j4);
            if (list.isEmpty()) {
                List<L> h10 = list instanceof I ? new H(i) : ((list instanceof f0) && (list instanceof B.i)) ? ((B.i) list).mutableCopyWithCapacity(i) : new ArrayList<>(i);
                y0.putObject(obj, j4, h10);
                return h10;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                y0.putObject(obj, j4, arrayList);
                return arrayList;
            }
            if (list instanceof x0) {
                H h11 = new H(list.size() + i);
                h11.addAll((x0) list);
                y0.putObject(obj, j4, h11);
                return h11;
            }
            if ((list instanceof f0) && (list instanceof B.i)) {
                B.i iVar = (B.i) list;
                if (!iVar.isModifiable()) {
                    B.i iVarMutableCopyWithCapacity = iVar.mutableCopyWithCapacity(list.size() + i);
                    y0.putObject(obj, j4, iVarMutableCopyWithCapacity);
                    return iVarMutableCopyWithCapacity;
                }
            }
            return list;
        }
    }

    /* compiled from: ListFieldSchema.java */
    public static final class c extends J {
        private c() {
            super();
        }

        public static <E> B.i<E> getProtobufList(Object obj, long j4) {
            return (B.i) y0.getObject(obj, j4);
        }

        @Override // com.google.protobuf.J
        public void makeImmutableListAt(Object obj, long j4) {
            getProtobufList(obj, j4).makeImmutable();
        }

        @Override // com.google.protobuf.J
        public <E> void mergeListsAt(Object obj, Object obj2, long j4) {
            B.i protobufList = getProtobufList(obj, j4);
            B.i protobufList2 = getProtobufList(obj2, j4);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            y0.putObject(obj, j4, protobufList2);
        }

        @Override // com.google.protobuf.J
        public <L> List<L> mutableListAt(Object obj, long j4) {
            B.i protobufList = getProtobufList(obj, j4);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            B.i iVarMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            y0.putObject(obj, j4, iVarMutableCopyWithCapacity);
            return iVarMutableCopyWithCapacity;
        }
    }

    static {
        FULL_INSTANCE = new b();
        LITE_INSTANCE = new c();
    }

    public static J full() {
        return FULL_INSTANCE;
    }

    public static J lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object obj, long j4);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j4);

    public abstract <L> List<L> mutableListAt(Object obj, long j4);

    private J() {
    }
}
