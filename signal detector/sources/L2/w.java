package L2;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import c3.InterfaceC0402a;
import com.google.android.gms.internal.ads.AbstractC0582Jp;
import com.google.android.gms.internal.ads.AbstractC0933bL;
import com.google.android.gms.internal.ads.AbstractC1114el;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.AbstractC1404k5;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C0633Mp;
import com.google.android.gms.internal.ads.C0750Tn;
import com.google.android.gms.internal.ads.C0889ae;
import com.google.android.gms.internal.ads.C0963bx;
import com.google.android.gms.internal.ads.C1178fu;
import com.google.android.gms.internal.ads.C1431kf;
import com.google.android.gms.internal.ads.C1776r0;
import com.google.android.gms.internal.ads.C1997v5;
import com.google.android.gms.internal.ads.C2036vr;
import com.google.android.gms.internal.ads.C2045w;
import com.google.android.gms.internal.ads.C2051w5;
import com.google.android.gms.internal.ads.C2094wv;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.K5;
import com.google.android.gms.internal.ads.KC;
import com.google.android.gms.internal.ads.N4;
import com.google.android.gms.internal.ads.N5;
import com.google.android.gms.internal.ads.Q0;
import com.google.android.gms.internal.ads.Qt;
import com.google.android.gms.internal.ads.SP;
import com.google.android.gms.internal.ads.Vt;
import com.google.android.gms.internal.ads.Y7;
import com.google.android.gms.internal.ads.Z7;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.C2343a;
import h.C2344b;
import h.C2345c;
import h.C2346d;
import h.DialogInterfaceC2347e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import n.DialogInterfaceOnKeyListenerC2678l;
import n1.z;
import o4.AbstractC2763b;
import u1.C2944B;

/* loaded from: classes.dex */
public final class w implements Q0, BD, InterfaceC0402a, SP, S.n, u2.g, z1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2568a;

    /* renamed from: b, reason: collision with root package name */
    public int f2569b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2570c;

    public /* synthetic */ w(int i, int i3, Object obj) {
        this.f2568a = i3;
        this.f2569b = i;
        this.f2570c = obj;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public int a() {
        if (((MediaCodecInfo[]) this.f2570c) == null) {
            this.f2570c = new MediaCodecList(this.f2569b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2570c).length;
    }

    @Override // z1.a
    public z b(z zVar, l1.h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) zVar.get()).compress((Bitmap.CompressFormat) this.f2570c, this.f2569b, byteArrayOutputStream);
        zVar.b();
        return new C2944B(byteArrayOutputStream.toByteArray());
    }

    @Override // com.google.android.gms.internal.ads.SP
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        switch (this.f2568a) {
            case 7:
                int i = this.f2569b;
                A.f.r(p2.j.f22785C.f22797k, ((C0750Tn) ((C1431kf) this.f2570c).f15176e).f11461e, AbstractC1135f5.d(i));
                break;
            default:
                C1178fu c1178fu = (C1178fu) this.f2570c;
                String str = (String) obj;
                int i3 = this.f2569b;
                Qt qt = c1178fu.f14169a;
                if (!qt.f10772i0) {
                    c1178fu.f14171c.b(str, qt.f10801x0, c1178fu.f14173e, null);
                    break;
                } else {
                    C2094wv c2094wv = c1178fu.f14172d;
                    String str2 = c1178fu.f14170b.f11269b;
                    c2094wv.getClass();
                    p2.j.f22785C.f22797k.getClass();
                    N4 n42 = new N4(System.currentTimeMillis(), str2, str, i3);
                    C0633Mp c0633Mp = c2094wv.f17517a;
                    c0633Mp.getClass();
                    c0633Mp.a(new C0889ae(c0633Mp, 25, n42));
                    break;
                }
        }
    }

    @Override // S.n
    public boolean e(View view) {
        ((BottomSheetBehavior) this.f2570c).I(this.f2569b);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public boolean g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.SP
    public MediaCodecInfo h(int i) {
        if (((MediaCodecInfo[]) this.f2570c) == null) {
            this.f2570c = new MediaCodecList(this.f2569b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2570c)[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC2347e i() {
        C2344b c2344b = (C2344b) this.f2570c;
        DialogInterfaceC2347e dialogInterfaceC2347e = new DialogInterfaceC2347e(c2344b.f20308a, this.f2569b);
        View view = c2344b.f20312e;
        C2346d c2346d = dialogInterfaceC2347e.f20339f;
        if (view != null) {
            c2346d.f20329n = view;
        } else {
            CharSequence charSequence = c2344b.f20311d;
            if (charSequence != null) {
                c2346d.f20320d = charSequence;
                TextView textView = c2346d.f20327l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c2344b.f20310c;
            if (drawable != null) {
                c2346d.f20325j = drawable;
                ImageView imageView = c2346d.f20326k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c2346d.f20326k.setImageDrawable(drawable);
                }
            }
        }
        if (c2344b.f20314g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c2344b.f20309b.inflate(c2346d.f20333r, (ViewGroup) null);
            int i = c2344b.i ? c2346d.f20334s : c2346d.f20335t;
            Object obj = c2344b.f20314g;
            ?? c2345c = obj;
            if (obj == null) {
                c2345c = new C2345c(c2344b.f20308a, i, R.id.text1, null);
            }
            c2346d.f20330o = c2345c;
            c2346d.f20331p = c2344b.f20316j;
            if (c2344b.f20315h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C2343a(c2344b, c2346d));
            }
            if (c2344b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c2346d.f20321e = alertController$RecycleListView;
        }
        dialogInterfaceC2347e.setCancelable(true);
        dialogInterfaceC2347e.setCanceledOnTouchOutside(true);
        dialogInterfaceC2347e.setOnCancelListener(null);
        dialogInterfaceC2347e.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC2678l dialogInterfaceOnKeyListenerC2678l = c2344b.f20313f;
        if (dialogInterfaceOnKeyListenerC2678l != null) {
            dialogInterfaceC2347e.setOnKeyListener(dialogInterfaceOnKeyListenerC2678l);
        }
        return dialogInterfaceC2347e;
    }

    @Override // u2.g
    public /* synthetic */ void j(JsonWriter jsonWriter) throws IOException {
        int i = this.f2569b;
        Map map = (Map) this.f2570c;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        u2.h.d(jsonWriter, map);
        jsonWriter.endObject();
    }

    public int k(long j6) throws C1997v5 {
        long j7;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        int i12 = i11 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        long j16 = (((((~j8) & j9) | j10) + ((j8 & j11) | j12)) - j13) + j14;
        long j17 = j15 % 438792350;
        if (j6 >= 0) {
            j7 = (this.f2569b + (iD ^ i12)) - j6;
        } else {
            j7 = (j16 ^ j17) + (-j6);
        }
        if (j7 < 0 || j7 >= this.f2569b) {
            throw new C1997v5();
        }
        return (int) j7;
    }

    @Override // c3.InterfaceC0402a
    public Object l(c3.j jVar) {
        if (!jVar.e()) {
            return Boolean.FALSE;
        }
        int i = this.f2569b;
        K5 k52 = (K5) this.f2570c;
        C0963bx c0963bx = (C0963bx) jVar.c();
        byte[] bArrB = ((N5) k52.d()).b();
        c0963bx.getClass();
        M3.o oVar = new M3.o(c0963bx, bArrB);
        oVar.f2871b = i;
        oVar.b();
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String m(ArrayList arrayList) throws IOException {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r32 = 0;
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
        int i3 = this.f2569b;
        PriorityQueue priorityQueue = new PriorityQueue(i3, new C2045w(6));
        int i6 = 0;
        while (i6 < strArrSplit.length) {
            String[] strArrN = AbstractC1114el.n(strArrSplit[i6], r32);
            if (strArrN.length != 0) {
                int length = strArrN.length;
                if (length < 6) {
                    AbstractC0933bL.m(i3, AbstractC0933bL.x(length, strArrN), AbstractC0933bL.s(strArrN, r32, length), length, priorityQueue);
                } else {
                    long jX = AbstractC0933bL.x(6, strArrN);
                    AbstractC0933bL.m(i3, jX, AbstractC0933bL.s(strArrN, r32, 6), 6, priorityQueue);
                    int i7 = 1;
                    while (true) {
                        int length2 = strArrN.length;
                        if (i7 < length2 - 5) {
                            int iA = AbstractC1114el.a(strArrN[i7 - 1]);
                            int iA2 = AbstractC1114el.a(strArrN[i7 + 5]);
                            int i8 = i7;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            String strS = AbstractC0933bL.s(strArrN, i8, 6);
                            jX = (((iA2 + 2147483647L) % 1073807359) + (((((jX + 1073807359) - ((((iA + 2147483647L) % 1073807359) * AbstractC0933bL.u(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            AbstractC0933bL.m(i3, jX, strS, length2, priorityQueue);
                            i7 = i8 + 1;
                            strArrSplit = strArrSplit;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                }
            }
            i6++;
            strArrSplit = strArrSplit;
            byteArrayOutputStream = byteArrayOutputStream;
            r32 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((Y7) this.f2570c).H1(((Z7) it.next()).f12793b));
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
            byteArrayOutputStream3.close();
            return byteArrayOutputStream3.toString();
        } catch (IOException e8) {
            u2.k.f("HashManager: Unable to convert to Base64.", e8);
            return "";
        }
    }

    public void n() {
        int i = this.f2569b;
        long[] jArr = (long[]) this.f2570c;
        if (i == jArr.length) {
            this.f2570c = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = (long[]) this.f2570c;
        int i3 = this.f2569b;
        this.f2569b = i3 + 1;
        jArr2[i3] = 0;
    }

    public void o(int i, byte[] bArr) {
        int i3 = 1777080124;
        int i6 = 1777080124;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c6 = 0;
        int i19 = 0;
        char c7 = 0;
        char c8 = 0;
        while (true) {
            if (i6 == 719824015) {
                int i20 = (-235787554) + i6;
                i6 += 799411447;
                if (i7 == i8) {
                    i6 = i20;
                }
            } else if (i6 == 1519235462) {
                int[] iArr = (int[]) this.f2570c;
                i9 += (((i10 << i11) ^ (i10 >>> i12)) + i10) ^ (i7 + iArr[i7 & i13]);
                i7 += i14;
                i10 += (iArr[(i7 >>> i15) & i13] + i7) ^ (((i9 << i11) ^ (i9 >>> i12)) + i9);
                i6 -= 799411447;
            } else {
                if (i6 != i3) {
                    bArr[0] = (byte) (i9 >> i16);
                    bArr[1] = (byte) ((((i9 >> i17) & i18) << i16) >> i16);
                    bArr[c6] = (byte) ((((i9 >> i19) & i18) << i16) >> i16);
                    bArr[i13] = (byte) (((i9 & i18) << i16) >> i16);
                    bArr[i11] = (byte) (i10 >> i16);
                    bArr[i12] = (byte) ((((i10 >> i17) & i18) << i16) >> i16);
                    bArr[c7] = (byte) ((((i10 >> i19) & i18) << i16) >> i16);
                    bArr[c8] = (byte) (((i10 & i18) << i16) >> i16);
                    return;
                }
                i9 = this.f2569b;
                i6 -= 1057256109;
                i13 = 3;
                i18 = 255;
                c8 = 7;
                c7 = 6;
                c6 = 2;
                i16 = 24;
                i15 = 11;
                i14 = 1340169305;
                i12 = 5;
                i11 = 4;
                i8 = -64255200;
                i17 = 16;
                i19 = 8;
                i10 = i;
                i7 = 0;
            }
            i3 = 1777080124;
        }
    }

    public long q(C1776r0 c1776r0) {
        int i;
        C2036vr c2036vr = (C2036vr) this.f2570c;
        int i3 = 0;
        c1776r0.y(c2036vr.f17354a, 0, 1, false);
        int i6 = c2036vr.f17354a[0] & 255;
        if (i6 == 0) {
            return Long.MIN_VALUE;
        }
        int i7 = 128;
        int i8 = 0;
        while (true) {
            i = i8 + 1;
            if ((i6 & i7) != 0) {
                break;
            }
            i7 >>= 1;
            i8 = i;
        }
        int i9 = i6 & (~i7);
        c1776r0.y(c2036vr.f17354a, 1, i8, false);
        while (i3 < i8) {
            i3++;
            i9 = (c2036vr.f17354a[i3] & 255) + (i9 << 8);
        }
        this.f2569b += i;
        return i9;
    }

    public void r(E5 e52) throws C2051w5 {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        int i12 = this.f2569b;
        if (i12 >= ((i11 % 937558955) ^ iD)) {
            throw new C2051w5();
        }
        ArrayList arrayList = (ArrayList) this.f2570c;
        if (i12 == arrayList.size()) {
            arrayList.add(e52);
        } else {
            arrayList.set(this.f2569b, e52);
        }
        this.f2569b++;
    }

    public void s(long[] jArr) {
        int i = this.f2569b;
        int length = jArr.length;
        int i3 = i + length;
        long[] jArr2 = (long[]) this.f2570c;
        int length2 = jArr2.length;
        if (i3 > length2) {
            this.f2570c = Arrays.copyOf(jArr2, Math.max(length2 + length2, i3));
        }
        System.arraycopy(jArr, 0, (long[]) this.f2570c, this.f2569b, length);
        this.f2569b = i3;
    }

    public long t(int i) {
        if (i >= 0 && i < this.f2569b) {
            return ((long[]) this.f2570c)[i];
        }
        int i3 = this.f2569b;
        throw new IndexOutOfBoundsException(A.f.o(new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i3).length()), "Invalid index ", i, ", size is ", i3));
    }

    public String toString() {
        switch (this.f2568a) {
            case 3:
                KC kc = (KC) this.f2570c;
                ArrayList arrayList = new ArrayList(kc.f9473b);
                int i = 0;
                while (true) {
                    int i3 = kc.f9473b;
                    if (i >= i3) {
                        String strX = Vt.x(this.f2569b);
                        String string = arrayList.toString();
                        StringBuilder sb = new StringBuilder(AbstractC2763b.b(strX.length() + 37, 1, string));
                        sb.append("UnsupportedBrands{major=");
                        sb.append(strX);
                        sb.append(", compatible=");
                        sb.append(string);
                        sb.append("}");
                        return sb.toString();
                    }
                    AbstractC0582Jp.k0(i, i3);
                    arrayList.add(Vt.x(kc.f9472a[i]));
                    i++;
                }
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        switch (this.f2568a) {
            case 7:
                break;
            default:
                p2.j.f22785C.f22795h.f("BufferingUrlPinger.attributionReportingManager", th);
                break;
        }
    }

    public E5 v() throws C1997v5 {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        int i12 = i11 % 459541652;
        int i13 = this.f2569b;
        if (i13 <= 0) {
            throw new C1997v5();
        }
        int i14 = i12 ^ iD;
        ArrayList arrayList = (ArrayList) this.f2570c;
        E5 e52 = (E5) arrayList.get(i13 + i14);
        arrayList.set(this.f2569b + i14, null);
        this.f2569b += i14;
        return e52;
    }

    public E5 w(long j6) {
        return (E5) ((ArrayList) this.f2570c).get(k(j6));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int x() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f2570c
            com.google.android.gms.internal.ads.re r0 = (com.google.android.gms.internal.ads.C1807re) r0
            android.os.Bundle r0 = r0.f16576a
            java.lang.String r1 = "extras"
            android.os.Bundle r0 = r0.getBundle(r1)
            r1 = -1
            if (r0 != 0) goto L10
            return r1
        L10:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L18
            goto L91
        L18:
            java.lang.String r2 = "query_info_type"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)
            int r2 = r0.hashCode()
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 3
            r7 = 4
            r8 = 5
            r9 = 6
            r10 = 7
            r11 = 8
            switch(r2) {
                case 1743582862: goto L83;
                case 1743582863: goto L79;
                case 1743582864: goto L6f;
                case 1743582865: goto L65;
                case 1743582866: goto L5b;
                case 1743582867: goto L51;
                case 1743582868: goto L47;
                case 1743582869: goto L3d;
                case 1743582870: goto L33;
                default: goto L31;
            }
        L31:
            goto L8d
        L33:
            java.lang.String r2 = "requester_type_8"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            r0 = r11
            goto L8e
        L3d:
            java.lang.String r2 = "requester_type_7"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            r0 = r10
            goto L8e
        L47:
            java.lang.String r2 = "requester_type_6"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            r0 = r9
            goto L8e
        L51:
            java.lang.String r2 = "requester_type_5"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            r0 = r8
            goto L8e
        L5b:
            java.lang.String r2 = "requester_type_4"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            r0 = r7
            goto L8e
        L65:
            java.lang.String r2 = "requester_type_3"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            r0 = r6
            goto L8e
        L6f:
            java.lang.String r2 = "requester_type_2"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            r0 = r5
            goto L8e
        L79:
            java.lang.String r2 = "requester_type_1"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            r0 = r4
            goto L8e
        L83:
            java.lang.String r2 = "requester_type_0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8d
            r0 = r3
            goto L8e
        L8d:
            r0 = r1
        L8e:
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L99;
                case 2: goto L98;
                case 3: goto L97;
                case 4: goto L96;
                case 5: goto L95;
                case 6: goto L94;
                case 7: goto L93;
                case 8: goto L92;
                default: goto L91;
            }
        L91:
            return r1
        L92:
            return r11
        L93:
            return r10
        L94:
            return r9
        L95:
            return r8
        L96:
            return r7
        L97:
            return r6
        L98:
            return r5
        L99:
            return r4
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.w.x():int");
    }

    public /* synthetic */ w(int i, Map map) {
        this.f2568a = 16;
        this.f2569b = i;
        this.f2570c = map;
    }

    public w(boolean z6, boolean z7, boolean z8) {
        this.f2568a = 12;
        int i = 1;
        if (!z6 && !z7 && !z8) {
            i = 0;
        }
        this.f2569b = i;
    }

    public w(int i, int i3) {
        this.f2568a = i3;
        switch (i3) {
            case 8:
                this.f2570c = new long[i];
                break;
            default:
                this.f2570c = new Y7(2);
                this.f2569b = i;
                break;
        }
    }

    public w(J2.b bVar, int i) {
        this.f2568a = 0;
        M2.u.e(bVar);
        this.f2570c = bVar;
        this.f2569b = i;
    }

    public w(int[] iArr, int i, int i3) {
        KC kc;
        this.f2568a = i3;
        switch (i3) {
            case 4:
                int length = iArr.length;
                if (length == 4) {
                    this.f2569b = i;
                    this.f2570c = iArr;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder(AbstractC2763b.a(length, 44));
                    sb.append(AbstractC1404k5.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
                    sb.append(length);
                    sb.append(AbstractC1404k5.a("a0CvvBEaN339T0zNlXk="));
                    throw new IllegalArgumentException(sb.toString());
                }
            default:
                this.f2569b = i;
                if (iArr != null) {
                    int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                    kc = new KC(iArrCopyOf, iArrCopyOf.length);
                } else {
                    kc = KC.f9471c;
                }
                this.f2570c = kc;
                return;
        }
    }

    public w(Context context) {
        this.f2568a = 13;
        int iG = DialogInterfaceC2347e.g(context, 0);
        this.f2570c = new C2344b(new ContextThemeWrapper(context, DialogInterfaceC2347e.g(context, iG)));
        this.f2569b = iG;
    }

    public w(int i, byte b5) {
        this.f2568a = i;
        switch (i) {
            case 2:
                this.f2570c = new C2036vr(8);
                break;
            case 5:
                this.f2570c = new ArrayList();
                this.f2569b = 0;
                break;
            case 17:
                this.f2570c = Bitmap.CompressFormat.JPEG;
                this.f2569b = 100;
                break;
            default:
                this.f2569b = 1;
                this.f2570c = Collections.singletonList(null);
                break;
        }
    }

    private final void p(Throwable th) {
    }

    public w(ArrayList arrayList) {
        this.f2568a = 1;
        this.f2569b = 0;
        this.f2570c = arrayList;
    }
}
