package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.applovin.shadow.okio.internal.Buffer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w4 implements i5, y81 {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f17857d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f17858e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f17859f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public int f17860a;

    /* renamed from: b, reason: collision with root package name */
    public int f17861b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17862c;

    public w4(int i4) {
        switch (i4) {
            case 5:
                this.f17862c = new ce1();
                this.f17860a = 8000;
                this.f17861b = 8000;
                break;
            default:
                this.f17862c = new byte[8];
                break;
        }
    }

    public static final void f(ByteBuffer byteBuffer, long j, int i4, int i10, boolean z3) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z3 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i4);
        byteBuffer.putInt(0);
        byteBuffer.put(yr1.a(i10));
    }

    public static long g(int i4, boolean z3, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z3) {
            j &= ~f17857d[i4 - 1];
        }
        for (int i10 = 1; i10 < i4; i10++) {
            j = (j << 8) | (bArr[i10] & 255);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.i5
    public int a() {
        return this.f17860a;
    }

    @Override // com.google.android.gms.internal.ads.i5
    public int b() {
        return this.f17861b;
    }

    public String c(ArrayList arrayList, ArrayList arrayList2) throws IOException {
        boolean z3;
        int i4 = this.f17860a;
        Collections.sort(arrayList2, new v(7));
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((ih) arrayList2.get(i10)).f12333e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    String str = strArrSplit[i11];
                    if (str.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str);
                        int i12 = 1;
                        boolean z10 = false;
                        while (true) {
                            int i13 = i12 + 2;
                            if (i13 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i12) == '\'') {
                                char c9 = ' ';
                                if (sb2.charAt(i12 - 1) != ' ') {
                                    int i14 = i12 + 1;
                                    if (sb2.charAt(i14) == 's' || sb2.charAt(i14) == 'S') {
                                        if (i13 != sb2.length()) {
                                            c9 = ' ';
                                            if (sb2.charAt(i13) == ' ') {
                                            }
                                            z10 = true;
                                        } else {
                                            c9 = ' ';
                                        }
                                        sb2.insert(i12, c9);
                                        i12 = i13;
                                        z10 = true;
                                    } else {
                                        c9 = ' ';
                                    }
                                    sb2.setCharAt(i12, c9);
                                    z10 = true;
                                } else {
                                    sb2.setCharAt(i12, c9);
                                    z10 = true;
                                }
                            }
                            i12++;
                        }
                        z3 = true;
                        String string = z10 ? sb2.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    } else {
                        z3 = true;
                    }
                    String[] strArrM = jz.m(str, z3);
                    int length = strArrM.length;
                    int i15 = this.f17861b;
                    if (length >= i15) {
                        for (int i16 = 0; i16 < strArrM.length; i16++) {
                            String strConcat = "";
                            for (int i17 = 0; i17 < i15; i17++) {
                                int i18 = i16 + i17;
                                if (i18 >= strArrM.length) {
                                    break;
                                }
                                if (i17 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrM[i18]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= i4) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= i4) {
                            break loop0;
                        }
                    }
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Buffer.SEGMENTING_THRESHOLD);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((lh) this.f17862c).v1((String) it.next()));
            } catch (IOException e2) {
                za.i.f("Error while writing hash to byteStream", e2);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e10) {
            za.i.f("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e11) {
            za.i.f("HashManager: Unable to convert to Base64.", e11);
            return "";
        }
    }

    public void d(rq1 rq1Var, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i4;
        ByteBuffer byteBuffer2 = rq1Var.f15735e;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - rq1Var.f15735e.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f17860a == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = rq1Var.f15735e;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i10 = iLimit - iPosition;
        int i11 = (i10 + 255) / 255;
        int i12 = i11 + 27 + i10;
        if (this.f17860a == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i12 += length + 44;
        } else {
            length = 0;
        }
        if (((ByteBuffer) this.f17862c).capacity() < i12) {
            this.f17862c = ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f17862c).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f17862c;
        if (this.f17860a == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i4 = 22;
                f(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(yr1.a(length2));
                byteBuffer.put(bArr);
                int i13 = length2 + 28;
                byteBuffer.putInt(22, bq0.f(byteBuffer.arrayOffset(), byteBuffer.array(), i13, 0));
                byteBuffer.position(i13);
            } else {
                byteBuffer = byteBuffer4;
                i4 = 22;
                byteBuffer.put(f17858e);
            }
            byteBuffer.put(f17859f);
        } else {
            byteBuffer = byteBuffer4;
            i4 = 22;
        }
        int iJ = this.f17861b + ((int) ((a80.J(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f17861b = iJ;
        int i14 = i4;
        ByteBuffer byteBuffer5 = byteBuffer;
        f(byteBuffer5, iJ, this.f17860a, i11, false);
        for (int i15 = 0; i15 < i11; i15++) {
            if (i10 >= 255) {
                byteBuffer5.put((byte) -1);
                i10 -= 255;
            } else {
                byteBuffer5.put((byte) i10);
                i10 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f17860a == 2) {
            byteBuffer5.putInt(length + 66, bq0.f(byteBuffer5.arrayOffset() + length + 44, byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i14, bq0.f(byteBuffer5.arrayOffset(), byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.f17860a++;
        this.f17862c = byteBuffer5;
        rq1Var.i();
        rq1Var.j(((ByteBuffer) this.f17862c).remaining());
        rq1Var.f15735e.put((ByteBuffer) this.f17862c);
        rq1Var.l();
    }

    public long e(y1 y1Var, boolean z3, boolean z10, int i4) {
        int i10;
        byte[] bArr = (byte[]) this.f17862c;
        if (this.f17860a == 0) {
            if (!y1Var.N1(bArr, 0, 1, z3)) {
                return -1L;
            }
            int i11 = bArr[0] & 255;
            int i12 = 0;
            while (true) {
                if (i12 >= 8) {
                    i10 = -1;
                    break;
                }
                i10 = i12 + 1;
                if ((f17857d[i12] & i11) != 0) {
                    break;
                }
                i12 = i10;
            }
            this.f17861b = i10;
            if (i10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f17860a = 1;
        }
        int i13 = this.f17861b;
        if (i13 > i4) {
            this.f17860a = 0;
            return -2L;
        }
        if (i13 != 1) {
            y1Var.L1(1, i13 - 1, bArr);
        }
        this.f17860a = 0;
        return g(this.f17861b, z10, bArr);
    }

    @Override // com.google.android.gms.internal.ads.i5
    public int zzc() {
        int i4 = this.f17860a;
        return i4 == -1 ? ((sk0) this.f17862c).h() : i4;
    }

    @Override // com.google.android.gms.internal.ads.y81
    /* renamed from: b */
    public l91 mo168b() {
        return new pe1(null, this.f17860a, this.f17861b, false, (ce1) this.f17862c);
    }
}
