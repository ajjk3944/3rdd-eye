package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
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

/* loaded from: classes.dex */
public final class W1 implements InterfaceC1295i2, KD {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f12138d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f12139e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f12140f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public int f12141a;

    /* renamed from: b, reason: collision with root package name */
    public int f12142b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12143c;

    public W1(int i) {
        switch (i) {
            case 5:
                this.f12143c = new C1879sw(6);
                this.f12141a = 8000;
                this.f12142b = 8000;
                break;
            default:
                this.f12143c = new byte[8];
                break;
        }
    }

    public static final void g(ByteBuffer byteBuffer, long j6, int i, int i3, boolean z6) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z6 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j6);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(C1476lN.a(i3));
    }

    public static long h(int i, boolean z6, byte[] bArr) {
        long j6 = bArr[0] & 255;
        if (z6) {
            j6 &= ~f12138d[i - 1];
        }
        for (int i3 = 1; i3 < i; i3++) {
            j6 = (j6 << 8) | (bArr[i3] & 255);
        }
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1295i2
    public int a() {
        return this.f12142b;
    }

    public String b(ArrayList arrayList, ArrayList arrayList2) throws IOException {
        boolean z6;
        int i = this.f12141a;
        Collections.sort(arrayList2, new C2045w(7));
        HashSet hashSet = new HashSet();
        loop0: for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((X7) arrayList2.get(i3)).f12393e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                    String str = strArrSplit[i6];
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i7 = 1;
                        boolean z7 = false;
                        while (true) {
                            int i8 = i7 + 2;
                            if (i8 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i7) == '\'') {
                                char c6 = ' ';
                                if (sb.charAt(i7 - 1) != ' ') {
                                    int i9 = i7 + 1;
                                    if (sb.charAt(i9) == 's' || sb.charAt(i9) == 'S') {
                                        if (i8 != sb.length()) {
                                            c6 = ' ';
                                            if (sb.charAt(i8) == ' ') {
                                            }
                                            z7 = true;
                                        } else {
                                            c6 = ' ';
                                        }
                                        sb.insert(i7, c6);
                                        i7 = i8;
                                        z7 = true;
                                    } else {
                                        c6 = ' ';
                                    }
                                    sb.setCharAt(i7, c6);
                                    z7 = true;
                                } else {
                                    sb.setCharAt(i7, c6);
                                    z7 = true;
                                }
                            }
                            i7++;
                        }
                        z6 = true;
                        String string = z7 ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    } else {
                        z6 = true;
                    }
                    String[] strArrN = AbstractC1114el.n(str, z6);
                    int length = strArrN.length;
                    int i10 = this.f12142b;
                    if (length >= i10) {
                        for (int i11 = 0; i11 < strArrN.length; i11++) {
                            String strConcat = "";
                            for (int i12 = 0; i12 < i10; i12++) {
                                int i13 = i11 + i12;
                                if (i13 >= strArrN.length) {
                                    break;
                                }
                                if (i12 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrN[i13]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= i) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= i) {
                            break loop0;
                        }
                    }
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((C0865a8) this.f12143c).H1((String) it.next()));
            } catch (IOException e6) {
                u2.k.f("Error while writing hash to byteStream", e6);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e7) {
            u2.k.f("HashManager: Unable to convert to Base64.", e7);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e8) {
            u2.k.f("HashManager: Unable to convert to Base64.", e8);
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1295i2
    public int c() {
        return this.f12141a;
    }

    public void d(FM fm, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i;
        ByteBuffer byteBuffer2 = fm.f8093e;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - fm.f8093e.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f12141a == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = fm.f8093e;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i3 = iLimit - iPosition;
        int i6 = (i3 + 255) / 255;
        int i7 = i6 + 27 + i3;
        if (this.f12141a == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i7 += length + 44;
        } else {
            length = 0;
        }
        if (((ByteBuffer) this.f12143c).capacity() < i7) {
            this.f12143c = ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f12143c).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f12143c;
        if (this.f12141a == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i = 22;
                g(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(C1476lN.a(length2));
                byteBuffer.put(bArr);
                int i8 = length2 + 28;
                byteBuffer.putInt(22, Vt.f(byteBuffer.arrayOffset(), byteBuffer.array(), i8, 0));
                byteBuffer.position(i8);
            } else {
                byteBuffer = byteBuffer4;
                i = 22;
                byteBuffer.put(f12139e);
            }
            byteBuffer.put(f12140f);
        } else {
            byteBuffer = byteBuffer4;
            i = 22;
        }
        int iF = this.f12142b + ((int) ((AbstractC0933bL.F(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f12142b = iF;
        int i9 = i;
        ByteBuffer byteBuffer5 = byteBuffer;
        g(byteBuffer5, iF, this.f12141a, i6, false);
        for (int i10 = 0; i10 < i6; i10++) {
            if (i3 >= 255) {
                byteBuffer5.put((byte) -1);
                i3 -= 255;
            } else {
                byteBuffer5.put((byte) i3);
                i3 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f12141a == 2) {
            byteBuffer5.putInt(length + 66, Vt.f(byteBuffer5.arrayOffset() + length + 44, byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i9, Vt.f(byteBuffer5.arrayOffset(), byteBuffer5.array(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.f12141a++;
        this.f12143c = byteBuffer5;
        fm.o();
        fm.p(((ByteBuffer) this.f12143c).remaining());
        fm.f8093e.put((ByteBuffer) this.f12143c);
        fm.r();
    }

    public long e(InterfaceC2046w0 interfaceC2046w0, boolean z6, boolean z7, int i) {
        int i3;
        byte[] bArr = (byte[]) this.f12143c;
        if (this.f12141a == 0) {
            if (!interfaceC2046w0.w(bArr, 0, 1, z6)) {
                return -1L;
            }
            int i6 = bArr[0] & 255;
            int i7 = 0;
            while (true) {
                if (i7 >= 8) {
                    i3 = -1;
                    break;
                }
                i3 = i7 + 1;
                if ((f12138d[i7] & i6) != 0) {
                    break;
                }
                i7 = i3;
            }
            this.f12142b = i3;
            if (i3 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f12141a = 1;
        }
        int i8 = this.f12142b;
        if (i8 > i) {
            this.f12141a = 0;
            return -2L;
        }
        if (i8 != 1) {
            interfaceC2046w0.s(1, i8 - 1, bArr);
        }
        this.f12141a = 0;
        return h(this.f12142b, z7, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1295i2
    public int f() {
        int i = this.f12141a;
        return i == -1 ? ((C2036vr) this.f12143c).h() : i;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: a, reason: collision with other method in class */
    public XD mo10a() {
        return new CG(null, this.f12141a, this.f12142b, false, (C1879sw) this.f12143c);
    }
}
