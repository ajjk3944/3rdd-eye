package com.vungle.ads.internal.protos;

import com.google.protobuf.U;
import com.google.protobuf.V;
import java.util.List;

/* compiled from: Sdk.java */
/* loaded from: classes2.dex */
public interface c extends V {
    @Override // com.google.protobuf.V
    /* synthetic */ U getDefaultInstanceForType();

    Sdk$SDKError getErrors(int i);

    int getErrorsCount();

    List<Sdk$SDKError> getErrorsList();

    @Override // com.google.protobuf.V
    /* synthetic */ boolean isInitialized();
}
