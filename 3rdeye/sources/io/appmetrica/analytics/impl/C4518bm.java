package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4518bm {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f40592a;

    /* renamed from: b, reason: collision with root package name */
    public final C4908qo f40593b;

    public C4518bm(ProtobufStateStorage protobufStateStorage, C4908qo c4908qo) {
        this.f40592a = protobufStateStorage;
        this.f40593b = c4908qo;
    }

    public C4518bm(Context context) {
        this(Nm.a(C4647gm.class).a(context), Ga.j().B().a());
    }
}
