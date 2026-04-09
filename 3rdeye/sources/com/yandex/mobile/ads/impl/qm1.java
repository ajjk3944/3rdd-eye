package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dl;

/* loaded from: classes3.dex */
final class qm1 extends dl {

    public static final class a implements dl.f {

        /* renamed from: a, reason: collision with root package name */
        private final c52 f32284a;

        /* renamed from: b, reason: collision with root package name */
        private final uf1 f32285b;

        public /* synthetic */ a(c52 c52Var, int i) {
            this(c52Var);
        }

        @Override // com.yandex.mobile.ads.impl.dl.f
        public final void a() {
            this.f32285b.a(s82.f32904f);
        }

        private a(c52 c52Var) {
            this.f32284a = c52Var;
            this.f32285b = new uf1();
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0120 A[EDGE_INSN: B:68:0x0120->B:52:0x0120 BREAK  A[LOOP:1: B:38:0x00df->B:51:0x010b], SYNTHETIC] */
        @Override // com.yandex.mobile.ads.impl.dl.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.yandex.mobile.ads.impl.dl.e a(com.yandex.mobile.ads.impl.rz r17, long r18) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qm1.a.a(com.yandex.mobile.ads.impl.rz, long):com.yandex.mobile.ads.impl.dl$e");
        }
    }

    public qm1(c52 c52Var, long j4, long j10) {
        super(new dl.b(), new a(c52Var, 0), j4, j4 + 1, 0L, j10, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
