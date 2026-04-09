package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public interface n52 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f30772a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f30773b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30774c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30775d;

        public a(int i, int i10, int i11, byte[] bArr) {
            this.f30772a = i;
            this.f30773b = bArr;
            this.f30774c = i10;
            this.f30775d = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f30772a == aVar.f30772a && this.f30774c == aVar.f30774c && this.f30775d == aVar.f30775d && Arrays.equals(this.f30773b, aVar.f30773b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f30773b) + (this.f30772a * 31)) * 31) + this.f30774c) * 31) + this.f30775d;
        }
    }

    int a(lv lvVar, int i, boolean z10) throws IOException;

    void a(int i, uf1 uf1Var);

    void a(long j4, int i, int i10, int i11, a aVar);

    void a(dc0 dc0Var);

    int b(lv lvVar, int i, boolean z10) throws IOException;

    void b(int i, uf1 uf1Var);
}
