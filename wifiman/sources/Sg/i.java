package Sg;

/* loaded from: classes4.dex */
class i extends f {

    /* renamed from: A, reason: collision with root package name */
    private int f20691A;

    /* renamed from: B, reason: collision with root package name */
    private byte[] f20692B;

    /* renamed from: C, reason: collision with root package name */
    private byte[] f20693C;

    /* renamed from: D, reason: collision with root package name */
    g[] f20694D;

    /* renamed from: z, reason: collision with root package name */
    private g f20695z;

    i(g gVar) {
        this.f20695z = gVar;
        this.f20659r = new b();
        this.f20692B = new byte[6];
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[Catch: UnsupportedEncodingException -> 0x00d3, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x00d3, blocks: (B:3:0x0014, B:5:0x0018, B:6:0x001a, B:8:0x0020, B:9:0x0023, B:13:0x0040, B:17:0x004d, B:21:0x0056, B:25:0x005e, B:30:0x0068, B:32:0x0070, B:34:0x0074, B:36:0x007c, B:38:0x0082, B:39:0x0089, B:40:0x00a4), top: B:45:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int o(byte[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Sg.i.o(byte[], int):int");
    }

    @Override // Sg.f
    int a(byte[] bArr, int i10) {
        return h(bArr, i10);
    }

    @Override // Sg.f
    int g(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = i11 & 255;
        this.f20691A = i12;
        int i13 = i12 * 18;
        int i14 = (this.f20665x - i13) - 1;
        int i15 = i10 + 1;
        this.f20691A = i11 & 255;
        System.arraycopy(bArr, i13 + i15, this.f20692B, 0, 6);
        int iO = i15 + o(bArr, i15);
        byte[] bArr2 = new byte[i14];
        this.f20693C = bArr2;
        System.arraycopy(bArr, iO, bArr2, 0, i14);
        return (iO + i14) - i10;
    }

    @Override // Sg.f
    int j(byte[] bArr, int i10) {
        return 0;
    }

    @Override // Sg.f
    public String toString() {
        return new String("NodeStatusResponse[" + super.toString() + "]");
    }
}
