package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xe0 implements w40 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f35262l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final r82 f35263a;

    /* renamed from: f, reason: collision with root package name */
    private b f35268f;

    /* renamed from: g, reason: collision with root package name */
    private long f35269g;

    /* renamed from: h, reason: collision with root package name */
    private String f35270h;
    private n52 i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35271j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f35265c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final a f35266d = new a();

    /* renamed from: k, reason: collision with root package name */
    private long f35272k = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private final t31 f35267e = new t31(178);

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f35264b = new uf1();

    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f35273f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f35274a;

        /* renamed from: b, reason: collision with root package name */
        private int f35275b;

        /* renamed from: c, reason: collision with root package name */
        public int f35276c;

        /* renamed from: d, reason: collision with root package name */
        public int f35277d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f35278e = new byte[128];

        public final void a(byte[] bArr, int i, int i10) {
            if (this.f35274a) {
                int i11 = i10 - i;
                byte[] bArr2 = this.f35278e;
                int length = bArr2.length;
                int i12 = this.f35276c + i11;
                if (length < i12) {
                    this.f35278e = Arrays.copyOf(bArr2, i12 * 2);
                }
                System.arraycopy(bArr, i, this.f35278e, this.f35276c, i11);
                this.f35276c += i11;
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final n52 f35279a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f35280b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f35281c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f35282d;

        /* renamed from: e, reason: collision with root package name */
        private int f35283e;

        /* renamed from: f, reason: collision with root package name */
        private int f35284f;

        /* renamed from: g, reason: collision with root package name */
        private long f35285g;

        /* renamed from: h, reason: collision with root package name */
        private long f35286h;

        public b(n52 n52Var) {
            this.f35279a = n52Var;
        }
    }

    public xe0(r82 r82Var) {
        this.f35263a = r82Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0171  */
    @Override // com.yandex.mobile.ads.impl.w40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.uf1 r27) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xe0.a(com.yandex.mobile.ads.impl.uf1):void");
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        this.f35270h = dVar.b();
        n52 n52VarA = w70Var.a(dVar.c(), 2);
        this.i = n52VarA;
        this.f35268f = new b(n52VarA);
        r82 r82Var = this.f35263a;
        if (r82Var != null) {
            r82Var.a(w70Var, dVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f35272k = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        u31.a(this.f35265c);
        a aVar = this.f35266d;
        aVar.f35274a = false;
        aVar.f35276c = 0;
        aVar.f35275b = 0;
        b bVar = this.f35268f;
        if (bVar != null) {
            bVar.f35280b = false;
            bVar.f35281c = false;
            bVar.f35282d = false;
            bVar.f35283e = -1;
        }
        t31 t31Var = this.f35267e;
        if (t31Var != null) {
            t31Var.b();
        }
        this.f35269g = 0L;
        this.f35272k = -9223372036854775807L;
    }
}
