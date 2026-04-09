package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes2.dex */
public class H extends AbstractC4020c<String> implements I, RandomAccess {
    public static final I EMPTY;
    private static final H EMPTY_LIST;
    private final List<Object> list;

    /* compiled from: LazyStringArrayList.java */
    public static class a extends AbstractList<byte[]> implements RandomAccess {
        private final H list;

        public a(H h10) {
            this.list = h10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, byte[] bArr) {
            this.list.add(i, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int i) {
            return this.list.getByteArray(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int i) {
            String strRemove = this.list.remove(i);
            ((AbstractList) this).modCount++;
            return H.asByteArray(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int i, byte[] bArr) {
            Object andReturn = this.list.setAndReturn(i, bArr);
            ((AbstractList) this).modCount++;
            return H.asByteArray(andReturn);
        }
    }

    /* compiled from: LazyStringArrayList.java */
    public static class b extends AbstractList<AbstractC4026i> implements RandomAccess {
        private final H list;

        public b(H h10) {
            this.list = h10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, AbstractC4026i abstractC4026i) {
            this.list.add(i, abstractC4026i);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractC4026i get(int i) {
            return this.list.getByteString(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractC4026i remove(int i) {
            String strRemove = this.list.remove(i);
            ((AbstractList) this).modCount++;
            return H.asByteString(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractC4026i set(int i, AbstractC4026i abstractC4026i) {
            Object andReturn = this.list.setAndReturn(i, abstractC4026i);
            ((AbstractList) this).modCount++;
            return H.asByteString(andReturn);
        }
    }

    static {
        H h10 = new H();
        EMPTY_LIST = h10;
        h10.makeImmutable();
        EMPTY = h10;
    }

    public H() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? B.toByteArray((String) obj) : ((AbstractC4026i) obj).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC4026i asByteString(Object obj) {
        return obj instanceof AbstractC4026i ? (AbstractC4026i) obj : obj instanceof String ? AbstractC4026i.copyFromUtf8((String) obj) : AbstractC4026i.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC4026i ? ((AbstractC4026i) obj).toStringUtf8() : B.toStringUtf8((byte[]) obj);
    }

    public static H emptyList() {
        return EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i, AbstractC4026i abstractC4026i) {
        ensureIsMutable();
        return this.list.set(i, abstractC4026i);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.I
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.I
    public boolean addAllByteString(Collection<? extends AbstractC4026i> collection) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.I
    public List<byte[]> asByteArrayList() {
        return new a(this);
    }

    @Override // com.google.protobuf.I, com.google.protobuf.j0
    public List<AbstractC4026i> asByteStringList() {
        return new b(this);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.I
    public byte[] getByteArray(int i) {
        Object obj = this.list.get(i);
        byte[] bArrAsByteArray = asByteArray(obj);
        if (bArrAsByteArray != obj) {
            this.list.set(i, bArrAsByteArray);
        }
        return bArrAsByteArray;
    }

    @Override // com.google.protobuf.I
    public AbstractC4026i getByteString(int i) {
        Object obj = this.list.get(i);
        AbstractC4026i abstractC4026iAsByteString = asByteString(obj);
        if (abstractC4026iAsByteString != obj) {
            this.list.set(i, abstractC4026iAsByteString);
        }
        return abstractC4026iAsByteString;
    }

    @Override // com.google.protobuf.I
    public Object getRaw(int i) {
        return this.list.get(i);
    }

    @Override // com.google.protobuf.I
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override // com.google.protobuf.I
    public I getUnmodifiableView() {
        return isModifiable() ? new x0(this) : this;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC4020c, com.google.protobuf.B.i
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.protobuf.I
    public void mergeFrom(I i) {
        ensureIsMutable();
        for (Object obj : i.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    public H(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add((H) obj);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof I) {
            collection = ((I) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.list.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC4026i) {
            AbstractC4026i abstractC4026i = (AbstractC4026i) obj;
            String stringUtf8 = abstractC4026i.toStringUtf8();
            if (abstractC4026i.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = B.toStringUtf8(bArr);
        if (B.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // com.google.protobuf.AbstractC4020c, com.google.protobuf.B.i, com.google.protobuf.B.g
    public H mutableCopyWithCapacity(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.list);
        return new H((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        ensureIsMutable();
        return asString(this.list.set(i, str));
    }

    public H(I i) {
        this.list = new ArrayList(i.size());
        addAll(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i, bArr);
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        ensureIsMutable();
        this.list.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4020c, java.util.AbstractList, java.util.List
    public String remove(int i) {
        ensureIsMutable();
        Object objRemove = this.list.remove(i);
        ((AbstractList) this).modCount++;
        return asString(objRemove);
    }

    @Override // com.google.protobuf.I
    public void set(int i, AbstractC4026i abstractC4026i) {
        setAndReturn(i, abstractC4026i);
    }

    public H(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i, AbstractC4026i abstractC4026i) {
        ensureIsMutable();
        this.list.add(i, abstractC4026i);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.I
    public void set(int i, byte[] bArr) {
        setAndReturn(i, bArr);
    }

    private H(ArrayList<Object> arrayList) {
        this.list = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.I
    public void add(AbstractC4026i abstractC4026i) {
        ensureIsMutable();
        this.list.add(abstractC4026i);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.I
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
