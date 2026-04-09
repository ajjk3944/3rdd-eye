package u6;

import a5.d0;
import a5.v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import eb.c;
import java.nio.charset.Charset;
import java.util.List;
import n6.d;
import ne.g;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: n, reason: collision with root package name */
    public final v f23363n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f23364o;

    /* renamed from: p, reason: collision with root package name */
    public final int f23365p;

    /* renamed from: q, reason: collision with root package name */
    public final int f23366q;

    /* renamed from: r, reason: collision with root package name */
    public final String f23367r;

    /* renamed from: s, reason: collision with root package name */
    public final float f23368s;

    /* renamed from: t, reason: collision with root package name */
    public final int f23369t;

    public a(List list) {
        super(1);
        this.f23363n = new v();
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f23365p = 0;
            this.f23366q = -1;
            this.f23367r = "sans-serif";
            this.f23364o = false;
            this.f23368s = 0.85f;
            this.f23369t = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f23365p = bArr[24];
        this.f23366q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f23367r = "Serif".equals(new String(bArr, 43, bArr.length - 43, g.f17524c)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f23369t = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f23364o = z10;
        if (z10) {
            this.f23368s = d0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f23368s = 0.85f;
        }
    }

    public static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    @Override // eb.c
    public final n6.b h(byte[] bArr, int i10, boolean z10) throws d {
        String strR;
        v vVar = this.f23363n;
        vVar.C(i10, bArr);
        int i11 = 2;
        if (vVar.a() < 2) {
            throw new d("Unexpected subtitle format.");
        }
        int iY = vVar.y();
        if (iY == 0) {
            strR = "";
        } else {
            int i12 = vVar.f166b;
            Charset charsetA = vVar.A();
            int i13 = iY - (vVar.f166b - i12);
            if (charsetA == null) {
                charsetA = g.f17524c;
            }
            strR = vVar.r(i13, charsetA);
        }
        if (strR.isEmpty()) {
            return b.f23370d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strR);
        o(spannableStringBuilder, this.f23365p, 0, 0, spannableStringBuilder.length(), 16711680);
        n(spannableStringBuilder, this.f23366q, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i14 = 0;
        String str = this.f23367r;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fG = this.f23368s;
        while (vVar.a() >= 8) {
            int i15 = vVar.f166b;
            int iG = vVar.g();
            int iG2 = vVar.g();
            if (iG2 == 1937013100) {
                if (vVar.a() < i11) {
                    throw new d("Unexpected subtitle format.");
                }
                int iY2 = vVar.y();
                int i16 = i14;
                while (i16 < iY2) {
                    if (vVar.a() < 12) {
                        throw new d("Unexpected subtitle format.");
                    }
                    int iY3 = vVar.y();
                    int iY4 = vVar.y();
                    vVar.F(i11);
                    int iT = vVar.t();
                    vVar.F(1);
                    int iG3 = vVar.g();
                    if (iY4 > spannableStringBuilder.length()) {
                        StringBuilder sbU = h0.b.u("Truncating styl end (", iY4, ") to cueText.length() (");
                        sbU.append(spannableStringBuilder.length());
                        sbU.append(").");
                        a5.a.B("Tx3gDecoder", sbU.toString());
                        iY4 = spannableStringBuilder.length();
                    }
                    int i17 = iY4;
                    if (iY3 >= i17) {
                        a5.a.B("Tx3gDecoder", "Ignoring styl with start (" + iY3 + ") >= end (" + i17 + ").");
                    } else {
                        o(spannableStringBuilder, iT, this.f23365p, iY3, i17, 0);
                        n(spannableStringBuilder, iG3, this.f23366q, iY3, i17, 0);
                    }
                    i16++;
                    i11 = 2;
                }
            } else if (iG2 == 1952608120 && this.f23364o) {
                i11 = 2;
                if (vVar.a() < 2) {
                    throw new d("Unexpected subtitle format.");
                }
                fG = d0.g(vVar.y() / this.f23369t, 0.0f, 0.95f);
            } else {
                i11 = 2;
            }
            vVar.E(i15 + iG);
            i14 = 0;
        }
        return new b(new z4.b(spannableStringBuilder, null, null, null, fG, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
    }
}
