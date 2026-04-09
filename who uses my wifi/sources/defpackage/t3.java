package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class t3 implements j1, gg1, iq3, pj, bb4 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;

    public /* synthetic */ t3(int i, Object obj, int i2) {
        this.f = i2;
        this.g = i;
        this.h = obj;
    }

    public static void a(int i, long j) {
        long j2 = 1 << i;
        if (j < 0 || j > j2) {
            throw new IllegalArgumentException(j + " out of range for " + i + " bit value");
        }
    }

    public long A(int i) {
        if (i >= 0 && i < this.g) {
            return ((long[]) this.h)[i];
        }
        int i2 = this.g;
        throw new IndexOutOfBoundsException(ga1.l(new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i2).length()), "Invalid index ", i, ", size is ", i2));
    }

    public oq1 B() throws eq1 {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iH = ga1.h((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 459541652;
        int i10 = this.g;
        if (i10 <= 0) {
            throw new eq1();
        }
        int i11 = i9 ^ iH;
        ArrayList arrayList = (ArrayList) this.h;
        oq1 oq1Var = (oq1) arrayList.get(i10 + i11);
        arrayList.set(this.g + i11, null);
        this.g += i11;
        return oq1Var;
    }

    public oq1 C(long j) {
        return (oq1) ((ArrayList) this.h).get(r(j));
    }

    public u3 b() {
        ListAdapter r3Var;
        p3 p3Var = (p3) this.h;
        ContextThemeWrapper contextThemeWrapper = p3Var.a;
        ContextThemeWrapper contextThemeWrapper2 = p3Var.a;
        u3 u3Var = new u3(contextThemeWrapper, this.g);
        View view = p3Var.e;
        s3 s3Var = u3Var.k;
        if (view != null) {
            s3Var.w = view;
        } else {
            CharSequence charSequence = p3Var.d;
            if (charSequence != null) {
                s3Var.d = charSequence;
                TextView textView = s3Var.u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = p3Var.c;
            if (drawable != null) {
                s3Var.s = drawable;
                ImageView imageView = s3Var.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    s3Var.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = p3Var.f;
        if (charSequence2 != null) {
            s3Var.e = charSequence2;
            TextView textView2 = s3Var.v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = p3Var.g;
        if (charSequence3 != null) {
            s3Var.c(-1, charSequence3, p3Var.h);
        }
        CharSequence charSequence4 = p3Var.i;
        if (charSequence4 != null) {
            s3Var.c(-2, charSequence4, p3Var.j);
        }
        if (p3Var.l != null || p3Var.m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) p3Var.b.inflate(s3Var.A, (ViewGroup) null);
            if (p3Var.q) {
                r3Var = new m3(p3Var, contextThemeWrapper2, s3Var.B, p3Var.l, alertController$RecycleListView);
            } else {
                int i = p3Var.r ? s3Var.C : s3Var.D;
                r3Var = p3Var.m;
                if (r3Var == null) {
                    r3Var = new r3(contextThemeWrapper2, i, R.id.text1, p3Var.l);
                }
            }
            s3Var.x = r3Var;
            s3Var.y = p3Var.s;
            if (p3Var.n != null) {
                alertController$RecycleListView.setOnItemClickListener(new n3(p3Var, s3Var));
            } else if (p3Var.t != null) {
                alertController$RecycleListView.setOnItemClickListener(new o3(p3Var, alertController$RecycleListView, s3Var));
            }
            if (p3Var.r) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (p3Var.q) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            s3Var.f = alertController$RecycleListView;
        }
        View view2 = p3Var.o;
        if (view2 != null) {
            s3Var.g = view2;
            s3Var.h = false;
        }
        u3Var.setCancelable(true);
        u3Var.setCanceledOnTouchOutside(true);
        u3Var.setOnCancelListener(null);
        u3Var.setOnDismissListener(null);
        pd0 pd0Var = p3Var.k;
        if (pd0Var != null) {
            u3Var.setOnKeyListener(pd0Var);
        }
        return u3Var;
    }

    public boolean c() {
        return ((mq) this.h) != null;
    }

    @Override // defpackage.bb4
    public /* synthetic */ void d(JsonWriter jsonWriter) throws IOException {
        int i = this.g;
        Map map = (Map) this.h;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        wb4.d(jsonWriter, map);
        jsonWriter.endObject();
    }

    public void e(int i) {
        byte[] bArr = (byte[]) this.h;
        int length = bArr.length;
        int i2 = this.g;
        if (length - i2 >= i) {
            return;
        }
        int length2 = bArr.length * 2;
        if (length2 < i2 + i) {
            length2 = i2 + i;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.h = bArr2;
    }

    @Override // defpackage.pj
    public Object f(gi4 gi4Var) {
        if (!gi4Var.c()) {
            return Boolean.FALSE;
        }
        int i = this.g;
        uq1 uq1Var = (uq1) this.h;
        he3 he3Var = (he3) gi4Var.b();
        byte[] bArrB = ((xq1) uq1Var.d()).b();
        he3Var.getClass();
        try {
            if (he3Var.b) {
                je3 je3Var = he3Var.a;
                je3Var.t0(bArrB);
                je3Var.z(0);
                je3Var.B(i);
                je3Var.G2();
                je3Var.b();
            }
        } catch (RemoteException unused) {
        }
        return Boolean.TRUE;
    }

    public void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        p3 p3Var = (p3) this.h;
        p3Var.g = charSequence;
        p3Var.h = onClickListener;
    }

    @Override // defpackage.j1
    public boolean h(View view) {
        ((BottomSheetBehavior) this.h).I(this.g);
        return true;
    }

    public byte[] i() {
        int i = this.g;
        byte[] bArr = new byte[i];
        System.arraycopy((byte[]) this.h, 0, bArr, 0, i);
        return bArr;
    }

    public void j(byte[] bArr) {
        k(bArr, 0, bArr.length);
    }

    public void k(byte[] bArr, int i, int i2) {
        e(i2);
        System.arraycopy(bArr, i, (byte[]) this.h, this.g, i2);
        this.g += i2;
    }

    public void l(byte[] bArr) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("Invalid counted string");
        }
        e(bArr.length + 1);
        byte[] bArr2 = (byte[]) this.h;
        int i = this.g;
        this.g = i + 1;
        bArr2[i] = (byte) (255 & bArr.length);
        k(bArr, 0, bArr.length);
    }

    public void m(int i) {
        a(16, i);
        e(2);
        byte[] bArr = (byte[]) this.h;
        int i2 = this.g;
        int i3 = i2 + 1;
        this.g = i3;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        this.g = i2 + 2;
        bArr[i3] = (byte) (i & 255);
    }

    public void n(int i, int i2) {
        a(16, i);
        if (i2 > this.g - 2) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = (byte[]) this.h;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    public void o(long j) {
        a(32, j);
        e(4);
        byte[] bArr = (byte[]) this.h;
        int i = this.g;
        int i2 = i + 1;
        this.g = i2;
        bArr[i] = (byte) ((j >>> 24) & 255);
        int i3 = i + 2;
        this.g = i3;
        bArr[i2] = (byte) ((j >>> 16) & 255);
        int i4 = i + 3;
        this.g = i4;
        bArr[i3] = (byte) ((j >>> 8) & 255);
        this.g = i + 4;
        bArr[i4] = (byte) (j & 255);
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        switch (this.f) {
            case 11:
                int i = this.g;
                ga1.n(hg4.C.k, ((jv2) ((p21) this.h).i).e, ga1.b(i));
                break;
            default:
                q83 q83Var = (q83) this.h;
                String str = (String) obj;
                int i2 = this.g;
                a83 a83Var = q83Var.a;
                if (!a83Var.i0) {
                    q83Var.c.b(str, a83Var.x0, q83Var.e, null);
                    break;
                } else {
                    bb3 bb3Var = q83Var.d;
                    String str2 = q83Var.b.b;
                    bb3Var.getClass();
                    hg4.C.k.getClass();
                    wo1 wo1Var = new wo1(System.currentTimeMillis(), str2, str, i2);
                    jz2 jz2Var = bb3Var.a;
                    jz2Var.getClass();
                    jz2Var.a(new mr2(jz2Var, wo1Var, 4, false));
                    break;
                }
        }
    }

    public void q(int i) {
        a(8, i);
        e(1);
        byte[] bArr = (byte[]) this.h;
        int i2 = this.g;
        this.g = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    public int r(long j) throws eq1 {
        long j2;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iH = ga1.h((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
        long j12 = j10 % 438792350;
        if (j >= 0) {
            j2 = (this.g + (iH ^ i9)) - j;
        } else {
            j2 = (j11 ^ j12) + (-j);
        }
        if (j2 < 0 || j2 >= this.g) {
            throw new eq1();
        }
        return (int) j2;
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        switch (this.f) {
            case 11:
                break;
            default:
                hg4.C.h.d("BufferingUrlPinger.attributionReportingManager", th);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String t(ArrayList arrayList) throws IOException {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r3 = 0;
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        int i2 = this.g;
        PriorityQueue priorityQueue = new PriorityQueue(i2, new bk(12));
        int i3 = 0;
        while (i3 < strArrSplit.length) {
            String[] strArrN = zt0.N(strArrSplit[i3], r3);
            if (strArrN.length != 0) {
                int length = strArrN.length;
                if (length < 6) {
                    qb1.B(i2, qb1.K(length, strArrN), qb1.E(strArrN, r3, length), length, priorityQueue);
                } else {
                    long jK = qb1.K(6, strArrN);
                    qb1.B(i2, jK, qb1.E(strArrN, r3, 6), 6, priorityQueue);
                    int i4 = 1;
                    while (true) {
                        int length2 = strArrN.length;
                        if (i4 < length2 - 5) {
                            int iZ = zt0.z(strArrN[i4 - 1]);
                            int iZ2 = zt0.z(strArrN[i4 + 5]);
                            int i5 = i4;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            String strE = qb1.E(strArrN, i5, 6);
                            jK = (((iZ2 + 2147483647L) % 1073807359) + (((((jK + 1073807359) - ((((iZ + 2147483647L) % 1073807359) * qb1.H(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            qb1.B(i2, jK, strE, length2, priorityQueue);
                            i4 = i5 + 1;
                            strArrSplit = strArrSplit;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                }
            }
            i3++;
            strArrSplit = strArrSplit;
            byteArrayOutputStream = byteArrayOutputStream;
            r3 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((cw1) this.h).U1(((dw1) it.next()).b));
            } catch (IOException e) {
                gi2.c0("Error while writing hash to byteStream", e);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e2) {
            gi2.c0("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            byteArrayOutputStream3.close();
            return byteArrayOutputStream3.toString();
        } catch (IOException e3) {
            gi2.c0("HashManager: Unable to convert to Base64.", e3);
            return "";
        }
    }

    public String toString() {
        switch (this.f) {
            case 7:
                to3 to3Var = (to3) this.h;
                ArrayList arrayList = new ArrayList(to3Var.g);
                int i = 0;
                while (true) {
                    int i2 = to3Var.g;
                    if (i >= i2) {
                        String strX = v23.x(this.g);
                        String string = arrayList.toString();
                        StringBuilder sb = new StringBuilder(ga1.i(string, strX.length() + 37, 1));
                        sb.append("UnsupportedBrands{major=");
                        sb.append(strX);
                        sb.append(", compatible=");
                        sb.append(string);
                        sb.append("}");
                        return sb.toString();
                    }
                    zt0.e0(i, i2);
                    arrayList.add(v23.x(to3Var.f[i]));
                    i++;
                }
            default:
                return super.toString();
        }
    }

    public void u() {
        int i = this.g;
        long[] jArr = (long[]) this.h;
        if (i == jArr.length) {
            this.h = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = (long[]) this.h;
        int i2 = this.g;
        this.g = i2 + 1;
        jArr2[i2] = 0;
    }

    public void v(int i, byte[] bArr) {
        int i2 = 1777080124;
        int i3 = 1777080124;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        char c2 = 0;
        char c3 = 0;
        while (true) {
            if (i3 == 719824015) {
                int i17 = (-235787554) + i3;
                i3 += 799411447;
                if (i4 == i5) {
                    i3 = i17;
                }
            } else if (i3 == 1519235462) {
                int[] iArr = (int[]) this.h;
                i6 += (((i7 << i8) ^ (i7 >>> i9)) + i7) ^ (i4 + iArr[i4 & i10]);
                i4 += i11;
                i7 += (iArr[(i4 >>> i12) & i10] + i4) ^ (((i6 << i8) ^ (i6 >>> i9)) + i6);
                i3 -= 799411447;
            } else {
                if (i3 != i2) {
                    bArr[0] = (byte) (i6 >> i13);
                    bArr[1] = (byte) ((((i6 >> i14) & i15) << i13) >> i13);
                    bArr[c] = (byte) ((((i6 >> i16) & i15) << i13) >> i13);
                    bArr[i10] = (byte) (((i6 & i15) << i13) >> i13);
                    bArr[i8] = (byte) (i7 >> i13);
                    bArr[i9] = (byte) ((((i7 >> i14) & i15) << i13) >> i13);
                    bArr[c2] = (byte) ((((i7 >> i16) & i15) << i13) >> i13);
                    bArr[c3] = (byte) (((i7 & i15) << i13) >> i13);
                    return;
                }
                i6 = this.g;
                i3 -= 1057256109;
                i10 = 3;
                i15 = 255;
                c3 = 7;
                c2 = 6;
                c = 2;
                i13 = 24;
                i12 = 11;
                i11 = 1340169305;
                i9 = 5;
                i8 = 4;
                i5 = -64255200;
                i14 = 16;
                i16 = 8;
                i7 = i;
                i4 = 0;
            }
            i2 = 1777080124;
        }
    }

    public long x(df1 df1Var) {
        int i;
        kz2 kz2Var = (kz2) this.h;
        int i2 = 0;
        df1Var.B(kz2Var.a, 0, 1, false);
        int i3 = kz2Var.a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        df1Var.B(kz2Var.a, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (kz2Var.a[i2] & 255) + (i6 << 8);
        }
        this.g += i;
        return i6;
    }

    public void y(oq1 oq1Var) throws fq1 {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iH = ga1.h((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = this.g;
        if (i9 >= ((i8 % 937558955) ^ iH)) {
            throw new fq1();
        }
        ArrayList arrayList = (ArrayList) this.h;
        if (i9 == arrayList.size()) {
            arrayList.add(oq1Var);
        } else {
            arrayList.set(this.g, oq1Var);
        }
        this.g++;
    }

    public void z(long[] jArr) {
        int i = this.g;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = (long[]) this.h;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.h = Arrays.copyOf(jArr2, Math.max(length2 + length2, i2));
        }
        System.arraycopy(jArr, 0, (long[]) this.h, this.g, length);
        this.g = i2;
    }

    public /* synthetic */ t3(Object obj, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }

    public t3(boolean z, boolean z2, boolean z3) {
        this.f = 17;
        int i = 1;
        if (!z && !z2 && !z3) {
            i = 0;
        }
        this.g = i;
    }

    public t3(int i, int i2) {
        this.f = i2;
        switch (i2) {
            case 12:
                this.h = new long[i];
                break;
            default:
                this.h = new cw1(7);
                this.g = i;
                break;
        }
    }

    public t3(int i, int i2, int[] iArr) {
        to3 to3Var;
        this.f = i2;
        switch (i2) {
            case 8:
                int length = iArr.length;
                if (length == 4) {
                    this.g = i;
                    this.h = iArr;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder(ga1.f(length, 44));
                    sb.append(up1.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
                    sb.append(length);
                    sb.append(up1.a("a0CvvBEaN339T0zNlXk="));
                    throw new IllegalArgumentException(sb.toString());
                }
            default:
                this.g = i;
                if (iArr != null) {
                    int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                    to3Var = new to3(iArrCopyOf, iArrCopyOf.length);
                } else {
                    to3Var = to3.h;
                }
                this.h = to3Var;
                return;
        }
    }

    public t3(rh rhVar, int i) {
        this.f = 5;
        ou1.j(rhVar);
        this.h = rhVar;
        this.g = i;
    }

    public t3(int i, byte b) {
        this.f = i;
        switch (i) {
            case 4:
                this.g = 255;
                this.h = null;
                break;
            case 6:
                this.h = new kz2(8);
                break;
            case 9:
                this.h = new ArrayList();
                this.g = 0;
                break;
            default:
                this.h = new byte[32];
                this.g = 0;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t3(Context context) {
        this(context, u3.g(context, 0));
        this.f = 0;
    }

    public t3(Context context, int i) {
        this.f = 0;
        this.h = new p3(new ContextThemeWrapper(context, u3.g(context, i)));
        this.g = i;
    }

    private final void w(Throwable th) {
    }
}
