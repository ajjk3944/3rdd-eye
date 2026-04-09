package B2;

import B2.a;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: u, reason: collision with root package name */
    private static final String f1120u = "e";

    /* renamed from: a, reason: collision with root package name */
    private int[] f1121a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f1122b;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0044a f1123c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f1124d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f1125e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f1126f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f1127g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f1128h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f1129i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f1130j;

    /* renamed from: k, reason: collision with root package name */
    private int f1131k;

    /* renamed from: l, reason: collision with root package name */
    private c f1132l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f1133m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1134n;

    /* renamed from: o, reason: collision with root package name */
    private int f1135o;

    /* renamed from: p, reason: collision with root package name */
    private int f1136p;

    /* renamed from: q, reason: collision with root package name */
    private int f1137q;

    /* renamed from: r, reason: collision with root package name */
    private int f1138r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f1139s;

    /* renamed from: t, reason: collision with root package name */
    private Bitmap.Config f1140t;

    public e(a.InterfaceC0044a interfaceC0044a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0044a);
        q(cVar, byteBuffer, i10);
    }

    private int a(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f1136p + i10; i18++) {
            byte[] bArr = this.f1129i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f1121a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f1136p + i20; i21++) {
            byte[] bArr2 = this.f1129i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f1121a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void j(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f1130j;
        int i15 = bVar.f1095d;
        int i16 = this.f1136p;
        int i17 = i15 / i16;
        int i18 = bVar.f1093b / i16;
        int i19 = bVar.f1094c / i16;
        int i20 = bVar.f1092a / i16;
        boolean z10 = this.f1131k == 0;
        int i21 = this.f1138r;
        int i22 = this.f1137q;
        byte[] bArr = this.f1129i;
        int[] iArr2 = this.f1121a;
        Boolean bool = this.f1139s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (i25 < i17) {
            Boolean bool2 = bool;
            if (bVar.f1096e) {
                if (i24 >= i17) {
                    int i27 = i26 + 1;
                    i10 = i17;
                    if (i27 == 2) {
                        i24 = 4;
                    } else if (i27 == 3) {
                        i23 = 4;
                        i26 = i27;
                        i24 = 2;
                    } else if (i27 == 4) {
                        i26 = i27;
                        i24 = 1;
                        i23 = 2;
                    }
                    i26 = i27;
                } else {
                    i10 = i17;
                }
                i11 = i24 + i23;
            } else {
                i10 = i17;
                i11 = i24;
                i24 = i25;
            }
            int i28 = i24 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i25 * i16 * bVar.f1094c;
                if (z11) {
                    int i34 = i30;
                    while (i34 < i31) {
                        int i35 = i18;
                        int i36 = iArr2[bArr[i33] & 255];
                        if (i36 != 0) {
                            iArr[i34] = i36;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i35;
                    }
                } else {
                    i14 = i18;
                    int i37 = ((i31 - i30) * i16) + i33;
                    int i38 = i30;
                    while (true) {
                        i13 = i19;
                        if (i38 >= i31) {
                            break;
                        }
                        int iA = a(i33, i37, bVar.f1094c);
                        if (iA != 0) {
                            iArr[i38] = iA;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i38++;
                        i19 = i13;
                    }
                    bool = bool2;
                    i25++;
                    i18 = i14;
                    i17 = i10;
                    i19 = i13;
                    i24 = i12;
                }
            } else {
                i12 = i11;
            }
            i14 = i18;
            i13 = i19;
            bool = bool2;
            i25++;
            i18 = i14;
            i17 = i10;
            i19 = i13;
            i24 = i12;
        }
        Boolean bool3 = bool;
        if (this.f1139s == null) {
            this.f1139s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f1130j;
        int i10 = bVar2.f1095d;
        int i11 = bVar2.f1093b;
        int i12 = bVar2.f1094c;
        int i13 = bVar2.f1092a;
        boolean z10 = this.f1131k == 0;
        int i14 = this.f1138r;
        byte[] bArr = this.f1129i;
        int[] iArr2 = this.f1121a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f1094c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                int i23 = b11 & 255;
                if (i23 != b10) {
                    int i24 = iArr2[i23];
                    if (i24 != 0) {
                        iArr[i21] = i24;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                i10 = i22;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f1139s;
        this.f1139s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f1139s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void l(b bVar) {
        int i10;
        int i11;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f1124d.position(bVar.f1101j);
        }
        if (bVar == null) {
            c cVar = eVar.f1132l;
            i10 = cVar.f1108f;
            i11 = cVar.f1109g;
        } else {
            i10 = bVar.f1094c;
            i11 = bVar.f1095d;
        }
        int i12 = i10 * i11;
        byte[] bArr = eVar.f1129i;
        if (bArr == null || bArr.length < i12) {
            eVar.f1129i = eVar.f1123c.e(i12);
        }
        byte[] bArr2 = eVar.f1129i;
        if (eVar.f1126f == null) {
            eVar.f1126f = new short[4096];
        }
        short[] sArr = eVar.f1126f;
        if (eVar.f1127g == null) {
            eVar.f1127g = new byte[4096];
        }
        byte[] bArr3 = eVar.f1127g;
        if (eVar.f1128h == null) {
            eVar.f1128h = new byte[4097];
        }
        byte[] bArr4 = eVar.f1128h;
        int iP = p();
        int i13 = 1 << iP;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iP + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = eVar.f1125e;
        int i20 = i16;
        int i21 = i15;
        int i22 = i17;
        int iO = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (true) {
            if (i18 >= i12) {
                break;
            }
            if (iO == 0) {
                iO = o();
                if (iO <= 0) {
                    eVar.f1135o = 3;
                    break;
                }
                i23 = 0;
            }
            i25 += (bArr5[i23] & 255) << i24;
            i23++;
            iO--;
            int i30 = i24 + 8;
            int i31 = i21;
            int i32 = i20;
            int i33 = i29;
            int i34 = i16;
            int i35 = i27;
            while (true) {
                if (i30 < i32) {
                    i29 = i33;
                    i21 = i31;
                    i24 = i30;
                    eVar = this;
                    i27 = i35;
                    i16 = i34;
                    i20 = i32;
                    break;
                }
                int i36 = i15;
                int i37 = i25 & i22;
                i25 >>= i32;
                i30 -= i32;
                if (i37 == i13) {
                    i22 = i17;
                    i32 = i34;
                    i31 = i36;
                    i15 = i31;
                    i33 = -1;
                } else {
                    if (i37 == i14) {
                        i24 = i30;
                        i27 = i35;
                        i21 = i31;
                        i16 = i34;
                        i15 = i36;
                        i29 = i33;
                        i20 = i32;
                        eVar = this;
                        break;
                    }
                    if (i33 == -1) {
                        bArr2[i26] = bArr3[i37];
                        i26++;
                        i18++;
                        i33 = i37;
                        i35 = i33;
                        i15 = i36;
                        i30 = i30;
                    } else {
                        if (i37 >= i31) {
                            bArr4[i28] = (byte) i35;
                            i28++;
                            s10 = i33;
                        } else {
                            s10 = i37;
                        }
                        while (s10 >= i13) {
                            bArr4[i28] = bArr3[s10];
                            i28++;
                            s10 = sArr[s10];
                        }
                        i35 = bArr3[s10] & 255;
                        byte b10 = (byte) i35;
                        bArr2[i26] = b10;
                        while (true) {
                            i26++;
                            i18++;
                            if (i28 <= 0) {
                                break;
                            }
                            i28--;
                            bArr2[i26] = bArr4[i28];
                        }
                        byte[] bArr6 = bArr4;
                        if (i31 < 4096) {
                            sArr[i31] = (short) i33;
                            bArr3[i31] = b10;
                            i31++;
                            if ((i31 & i22) == 0 && i31 < 4096) {
                                i32++;
                                i22 += i31;
                            }
                        }
                        i33 = i37;
                        i15 = i36;
                        i30 = i30;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i26, i12, (byte) 0);
    }

    private Bitmap n() {
        Boolean bool = this.f1139s;
        Bitmap bitmapA = this.f1123c.a(this.f1138r, this.f1137q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f1140t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    private int o() {
        int iP = p();
        if (iP <= 0) {
            return iP;
        }
        ByteBuffer byteBuffer = this.f1124d;
        byteBuffer.get(this.f1125e, 0, Math.min(iP, byteBuffer.remaining()));
        return iP;
    }

    private int p() {
        return this.f1124d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f1130j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f1133m;
            if (bitmap2 != null) {
                this.f1123c.c(bitmap2);
            }
            this.f1133m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f1098g == 3 && this.f1133m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f1098g) > 0) {
            if (i11 == 2) {
                if (!bVar.f1097f) {
                    c cVar = this.f1132l;
                    int i13 = cVar.f1114l;
                    if (bVar.f1102k == null || cVar.f1112j != bVar.f1099h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f1095d;
                int i15 = this.f1136p;
                int i16 = i14 / i15;
                int i17 = bVar2.f1093b / i15;
                int i18 = bVar2.f1094c / i15;
                int i19 = bVar2.f1092a / i15;
                int i20 = this.f1138r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f1138r;
                }
            } else if (i11 == 3 && (bitmap = this.f1133m) != null) {
                int i25 = this.f1138r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f1137q);
            }
        }
        l(bVar);
        if (bVar.f1096e || this.f1136p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f1134n && ((i10 = bVar.f1098g) == 0 || i10 == 1)) {
            if (this.f1133m == null) {
                this.f1133m = n();
            }
            Bitmap bitmap3 = this.f1133m;
            int i26 = this.f1138r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f1137q);
        }
        Bitmap bitmapN = n();
        int i27 = this.f1138r;
        bitmapN.setPixels(iArr, 0, i27, 0, 0, i27, this.f1137q);
        return bitmapN;
    }

    @Override // B2.a
    public ByteBuffer b() {
        return this.f1124d;
    }

    @Override // B2.a
    public void c() {
        this.f1131k = (this.f1131k + 1) % this.f1132l.f1105c;
    }

    @Override // B2.a
    public void clear() {
        this.f1132l = null;
        byte[] bArr = this.f1129i;
        if (bArr != null) {
            this.f1123c.d(bArr);
        }
        int[] iArr = this.f1130j;
        if (iArr != null) {
            this.f1123c.f(iArr);
        }
        Bitmap bitmap = this.f1133m;
        if (bitmap != null) {
            this.f1123c.c(bitmap);
        }
        this.f1133m = null;
        this.f1124d = null;
        this.f1139s = null;
        byte[] bArr2 = this.f1125e;
        if (bArr2 != null) {
            this.f1123c.d(bArr2);
        }
    }

    @Override // B2.a
    public int d() {
        return this.f1132l.f1105c;
    }

    @Override // B2.a
    public int e() {
        int i10;
        if (this.f1132l.f1105c <= 0 || (i10 = this.f1131k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // B2.a
    public void f(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f1140t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // B2.a
    public void g() {
        this.f1131k = -1;
    }

    @Override // B2.a
    public synchronized Bitmap getNextFrame() {
        try {
            if (this.f1132l.f1105c <= 0 || this.f1131k < 0) {
                String str = f1120u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f1132l.f1105c + ", framePointer=" + this.f1131k);
                }
                this.f1135o = 1;
            }
            int i10 = this.f1135o;
            if (i10 != 1 && i10 != 2) {
                this.f1135o = 0;
                if (this.f1125e == null) {
                    this.f1125e = this.f1123c.e(255);
                }
                b bVar = (b) this.f1132l.f1107e.get(this.f1131k);
                int i11 = this.f1131k - 1;
                b bVar2 = i11 >= 0 ? (b) this.f1132l.f1107e.get(i11) : null;
                int[] iArr = bVar.f1102k;
                if (iArr == null) {
                    iArr = this.f1132l.f1103a;
                }
                this.f1121a = iArr;
                if (iArr == null) {
                    String str2 = f1120u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f1131k);
                    }
                    this.f1135o = 1;
                    return null;
                }
                if (bVar.f1097f) {
                    System.arraycopy(iArr, 0, this.f1122b, 0, iArr.length);
                    int[] iArr2 = this.f1122b;
                    this.f1121a = iArr2;
                    iArr2[bVar.f1099h] = 0;
                    if (bVar.f1098g == 2 && this.f1131k == 0) {
                        this.f1139s = Boolean.TRUE;
                    }
                }
                return r(bVar, bVar2);
            }
            String str3 = f1120u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f1135o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // B2.a
    public int h() {
        return this.f1131k;
    }

    @Override // B2.a
    public int i() {
        return this.f1124d.limit() + this.f1129i.length + (this.f1130j.length * 4);
    }

    public int m(int i10) {
        if (i10 >= 0) {
            c cVar = this.f1132l;
            if (i10 < cVar.f1105c) {
                return ((b) cVar.f1107e.get(i10)).f1100i;
            }
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f1135o = 0;
            this.f1132l = cVar;
            this.f1131k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f1124d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f1124d.order(ByteOrder.LITTLE_ENDIAN);
            this.f1134n = false;
            Iterator it = cVar.f1107e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).f1098g == 3) {
                    this.f1134n = true;
                    break;
                }
            }
            this.f1136p = iHighestOneBit;
            int i11 = cVar.f1108f;
            this.f1138r = i11 / iHighestOneBit;
            int i12 = cVar.f1109g;
            this.f1137q = i12 / iHighestOneBit;
            this.f1129i = this.f1123c.e(i11 * i12);
            this.f1130j = this.f1123c.b(this.f1138r * this.f1137q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public e(a.InterfaceC0044a interfaceC0044a) {
        this.f1122b = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f1140t = Bitmap.Config.ARGB_8888;
        this.f1123c = interfaceC0044a;
        this.f1132l = new c();
    }
}
