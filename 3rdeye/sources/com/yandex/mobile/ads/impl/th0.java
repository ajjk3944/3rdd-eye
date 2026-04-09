package com.yandex.mobile.ads.impl;

import ia.C4468d;
import java.io.IOException;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class th0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f33586a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f33587b = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};

    /* renamed from: c, reason: collision with root package name */
    private static final a f33588c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33589d = 0;

    static {
        for (int i = 0; i < 256; i++) {
            a(i, f33586a[i], f33587b[i]);
        }
    }

    public static void a(ia.g source, long j4, C4468d sink) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        kotlin.jvm.internal.l.f(sink, "sink");
        a aVar = f33588c;
        int i = 0;
        int iC = 0;
        for (long j10 = 0; j10 < j4; j10++) {
            byte b10 = source.readByte();
            byte[] bArr = t82.f33480a;
            i = (i << 8) | (b10 & 255);
            iC += 8;
            while (iC >= 8) {
                int i10 = (i >>> (iC - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                a[] aVarArrA = aVar.a();
                kotlin.jvm.internal.l.c(aVarArrA);
                aVar = aVarArrA[i10];
                kotlin.jvm.internal.l.c(aVar);
                if (aVar.a() == null) {
                    sink.C0(aVar.b());
                    iC -= aVar.c();
                    aVar = f33588c;
                } else {
                    iC -= 8;
                }
            }
        }
        while (iC > 0) {
            int i11 = (i << (8 - iC)) & KotlinVersion.MAX_COMPONENT_VALUE;
            a[] aVarArrA2 = aVar.a();
            kotlin.jvm.internal.l.c(aVarArrA2);
            a aVar2 = aVarArrA2[i11];
            kotlin.jvm.internal.l.c(aVar2);
            if (aVar2.a() != null || aVar2.c() > iC) {
                return;
            }
            sink.C0(aVar2.b());
            iC -= aVar2.c();
            aVar = f33588c;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final a[] f33590a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33591b;

        /* renamed from: c, reason: collision with root package name */
        private final int f33592c;

        public a() {
            this.f33590a = new a[256];
            this.f33591b = 0;
            this.f33592c = 0;
        }

        public final a[] a() {
            return this.f33590a;
        }

        public final int b() {
            return this.f33591b;
        }

        public final int c() {
            return this.f33592c;
        }

        public a(int i, int i10) {
            this.f33590a = null;
            this.f33591b = i;
            int i11 = i10 & 7;
            this.f33592c = i11 == 0 ? 8 : i11;
        }
    }

    public static void a(ia.h source, C4468d sink) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        kotlin.jvm.internal.l.f(sink, "sink");
        int iC = source.c();
        long j4 = 0;
        int i = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            byte bF = source.f(i10);
            byte[] bArr = t82.f33480a;
            int i11 = bF & 255;
            int i12 = f33586a[i11];
            byte b10 = f33587b[i11];
            j4 = (j4 << b10) | i12;
            i += b10;
            while (i >= 8) {
                i -= 8;
                sink.C0((int) (j4 >> i));
            }
        }
        if (i > 0) {
            sink.C0((int) ((j4 << (8 - i)) | (255 >>> i)));
        }
    }

    public static int a(ia.h bytes) {
        kotlin.jvm.internal.l.f(bytes, "bytes");
        int iC = bytes.c();
        long j4 = 0;
        for (int i = 0; i < iC; i++) {
            byte bF = bytes.f(i);
            byte[] bArr = t82.f33480a;
            j4 += f33587b[bF & 255];
        }
        return (int) ((j4 + 7) >> 3);
    }

    private static void a(int i, int i10, int i11) {
        a aVar = new a(i, i11);
        a aVar2 = f33588c;
        while (i11 > 8) {
            i11 -= 8;
            int i12 = (i10 >>> i11) & KotlinVersion.MAX_COMPONENT_VALUE;
            a[] aVarArrA = aVar2.a();
            kotlin.jvm.internal.l.c(aVarArrA);
            a aVar3 = aVarArrA[i12];
            if (aVar3 == null) {
                aVar3 = new a();
                aVarArrA[i12] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i13 = 8 - i11;
        int i14 = (i10 << i13) & KotlinVersion.MAX_COMPONENT_VALUE;
        a[] aVarArrA2 = aVar2.a();
        kotlin.jvm.internal.l.c(aVarArrA2);
        Arrays.fill(aVarArrA2, i14, (1 << i13) + i14, aVar);
    }
}
