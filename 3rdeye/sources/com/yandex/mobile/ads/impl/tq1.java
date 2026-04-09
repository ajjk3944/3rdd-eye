package com.yandex.mobile.ads.impl;

import ia.C4468d;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class tq1 implements Closeable {

    public static final class a {
        private a() {
        }

        public static sq1 a(byte[] bArr) {
            kotlin.jvm.internal.l.f(bArr, "<this>");
            C4468d c4468d = new C4468d();
            c4468d.B0(bArr, 0, bArr.length);
            return new sq1(bArr.length, null, c4468d);
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public abstract long a();

    public abstract qw0 b();

    public abstract ia.g c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        t82.a((Closeable) c());
    }
}
