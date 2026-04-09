package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class sp1 {

    public static final class a {
        private a() {
        }

        public static rp1 a(byte[] bArr) {
            int length = bArr.length;
            long length2 = bArr.length;
            long j4 = 0;
            long j10 = length;
            byte[] bArr2 = t82.f33480a;
            if ((j4 | j10) < 0 || j4 > length2 || length2 - j4 < j10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new rp1(null, bArr, length, 0);
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public static final rp1 a(byte[] content) {
        kotlin.jvm.internal.l.f(content, "content");
        int length = content.length;
        long length2 = content.length;
        long j4 = 0;
        long j10 = length;
        byte[] bArr = t82.f33480a;
        if ((j4 | j10) < 0 || j4 > length2 || length2 - j4 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new rp1(null, content, length, 0);
    }

    public abstract long a() throws IOException;

    public abstract void a(ia.f fVar) throws IOException;

    public abstract qw0 b();
}
