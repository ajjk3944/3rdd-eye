package mb;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import eb.c;
import fb.f;
import java.util.List;
import ne.g;
import qb.v;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: n, reason: collision with root package name */
    public final f f16662n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f16663o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16664p;

    /* renamed from: q, reason: collision with root package name */
    public final int f16665q;

    /* renamed from: r, reason: collision with root package name */
    public final String f16666r;

    /* renamed from: s, reason: collision with root package name */
    public final float f16667s;

    /* renamed from: t, reason: collision with root package name */
    public final int f16668t;

    public a(List list) {
        super(0);
        this.f16662n = new f();
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f16664p = 0;
            this.f16665q = -1;
            this.f16666r = "sans-serif";
            this.f16663o = false;
            this.f16667s = 0.85f;
            this.f16668t = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f16664p = bArr[24];
        this.f16665q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f16666r = "Serif".equals(new String(bArr, 43, bArr.length - 43, g.f17524c)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f16668t = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f16663o = z10;
        if (z10) {
            this.f16667s = v.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f16667s = 0.85f;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // eb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final eb.e f(byte[] r21, int r22, boolean r23) throws eb.g {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.f(byte[], int, boolean):eb.e");
    }
}
