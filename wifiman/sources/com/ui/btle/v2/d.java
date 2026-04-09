package com.ui.btle.v2;

import gg.AbstractC5912b;
import gg.s;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final short f41127a;

    /* renamed from: b, reason: collision with root package name */
    private final c f41128b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f41129c;

    public interface a {
        z a(Z8.a aVar);
    }

    public interface b {
        AbstractC5912b a(s sVar, Z8.a aVar);
    }

    public /* synthetic */ d(short s10, c cVar, byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, cVar, bArr);
    }

    public final byte[] a() {
        return this.f41129c;
    }

    public final c b() {
        return this.f41128b;
    }

    public final short c() {
        return this.f41127a;
    }

    private d(short s10, c protocol, byte[] payload) {
        AbstractC6492s.i(protocol, "protocol");
        AbstractC6492s.i(payload, "payload");
        this.f41127a = s10;
        this.f41128b = protocol;
        this.f41129c = payload;
    }
}
