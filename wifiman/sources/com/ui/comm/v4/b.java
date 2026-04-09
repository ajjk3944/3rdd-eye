package com.ui.comm.v4;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f41314a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f41315b;

    public enum a {
        JSON,
        STRING,
        BINARY
    }

    public b(a type, byte[] payload) {
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(payload, "payload");
        this.f41314a = type;
        this.f41315b = payload;
    }

    public final byte[] a() {
        return this.f41315b;
    }

    public final a b() {
        return this.f41314a;
    }
}
