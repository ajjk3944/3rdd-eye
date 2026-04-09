package o6;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f30409a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30410b;

    public d(String str) {
        this.f30409a = str;
        this.f30410b = 0;
    }

    public final String a() {
        int i4 = this.f30410b;
        if (i4 == 0) {
            return this.f30409a;
        }
        throw new IllegalStateException(r5.c.m(new StringBuilder("Wrong data accessor type detected. "), i4 != 0 ? i4 != 1 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got ", "String"));
    }

    public d(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f30409a = null;
        this.f30410b = 1;
    }
}
