package com.polidea.rxandroidble3.internal;

import java.util.UUID;

/* loaded from: classes3.dex */
public class BleIllegalOperationException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f39280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39282c;

    public BleIllegalOperationException(String str, UUID uuid, int i10, int i11) {
        super(str);
        this.f39280a = uuid;
        this.f39281b = i10;
        this.f39282c = i11;
    }
}
