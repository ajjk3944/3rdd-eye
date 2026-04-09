package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* compiled from: LazyStringList.java */
/* loaded from: classes2.dex */
public interface I extends j0 {
    void add(AbstractC4026i abstractC4026i);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends AbstractC4026i> collection);

    List<byte[]> asByteArrayList();

    @Override // com.google.protobuf.j0
    /* synthetic */ List asByteStringList();

    byte[] getByteArray(int i);

    AbstractC4026i getByteString(int i);

    Object getRaw(int i);

    List<?> getUnderlyingElements();

    I getUnmodifiableView();

    void mergeFrom(I i);

    void set(int i, AbstractC4026i abstractC4026i);

    void set(int i, byte[] bArr);
}
