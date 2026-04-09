package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
final class D1 extends F1 {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f35572c;

    /* renamed from: d, reason: collision with root package name */
    private int f35573d;

    /* renamed from: e, reason: collision with root package name */
    private int f35574e;

    /* renamed from: f, reason: collision with root package name */
    private int f35575f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35576g;

    /* renamed from: h, reason: collision with root package name */
    private int f35577h;

    /* synthetic */ D1(byte[] bArr, int i10, int i11, boolean z10, C1 c12) {
        super(null);
        this.f35577h = MPv3.MAX_MESSAGE_ID;
        this.f35572c = bArr;
        this.f35573d = i11;
        this.f35575f = 0;
        this.f35576g = 0;
    }

    private final void d() {
        int i10 = this.f35573d + this.f35574e;
        this.f35573d = i10;
        int i11 = this.f35577h;
        if (i10 <= i11) {
            this.f35574e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f35574e = i12;
        this.f35573d = i10 - i12;
    }

    public final int e(int i10) {
        if (i10 < 0) {
            throw new zzbew("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.f35575f;
        if (i11 < 0) {
            throw new zzbew("Failed to parse the message.");
        }
        int i12 = this.f35577h;
        if (i11 > i12) {
            throw new zzbew("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f35577h = i11;
        d();
        return i12;
    }
}
