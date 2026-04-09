package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.U;

/* compiled from: ExtensionLite.java */
/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4032o<ContainingType extends U, Type> {
    public abstract Type getDefaultValue();

    public abstract A0.b getLiteType();

    public abstract U getMessageDefaultInstance();

    public abstract int getNumber();

    public boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}
