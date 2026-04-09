package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5039w3 implements InterfaceC5064x3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f41889a;

    public C5039w3(int i) {
        this.f41889a = i;
    }

    public static InterfaceC5064x3 a(InterfaceC5064x3... interfaceC5064x3Arr) {
        return new C5039w3(b(interfaceC5064x3Arr));
    }

    public static int b(InterfaceC5064x3... interfaceC5064x3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC5064x3 interfaceC5064x3 : interfaceC5064x3Arr) {
            if (interfaceC5064x3 != null) {
                bytesTruncated = interfaceC5064x3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5064x3
    public final int getBytesTruncated() {
        return this.f41889a;
    }

    public String toString() {
        return N7.H7.p(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.f41889a, '}');
    }
}
