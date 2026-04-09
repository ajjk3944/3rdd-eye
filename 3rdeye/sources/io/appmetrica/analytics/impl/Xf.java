package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class Xf implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final String f40388a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f40389b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f40390c;

    /* renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f40391d;

    public Xf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f40388a = str;
        this.f40389b = iBinaryDataHelper;
        this.f40390c = protobufStateSerializer;
        this.f40391d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f40389b.remove(this.f40388a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.f40389b.get(this.f40388a);
            if (bArr != null && bArr.length != 0) {
                return this.f40391d.toModel((MessageNano) this.f40390c.toState(bArr));
            }
            return this.f40391d.toModel((MessageNano) this.f40390c.defaultValue());
        } catch (Throwable unused) {
            return this.f40391d.toModel((MessageNano) this.f40390c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.f40389b.insert(this.f40388a, this.f40390c.toByteArray((MessageNano) this.f40391d.fromModel(obj)));
    }
}
