package o6;

import a5.d0;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19105a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19106b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f19107c;

    /* renamed from: d, reason: collision with root package name */
    public int f19108d;

    /* renamed from: e, reason: collision with root package name */
    public int f19109e;

    /* renamed from: f, reason: collision with root package name */
    public int f19110f;

    /* renamed from: g, reason: collision with root package name */
    public int f19111g;

    /* renamed from: h, reason: collision with root package name */
    public int f19112h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f19105a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f19106b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f19107c = sb2;
        this.f19111g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f19108d = 15;
        this.f19109e = 0;
        this.f19110f = 0;
        this.f19112h = i11;
    }

    public final void a(char c4) {
        StringBuilder sb2 = this.f19107c;
        if (sb2.length() < 32) {
            sb2.append(c4);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f19107c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f19105a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.f19104c;
                if (i10 != length) {
                    return;
                }
                aVar.f19104c = i10 - 1;
            }
        }
    }

    public final z4.b c(int i10) {
        float f10;
        int i11 = this.f19109e + this.f19110f;
        int i12 = 32 - i11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f19106b;
            if (i13 >= arrayList.size()) {
                break;
            }
            CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i13);
            int i14 = d0.f105a;
            if (charSequenceSubSequence.length() > i12) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
            i13++;
        }
        SpannableString spannableStringD = d();
        int i15 = d0.f105a;
        int length = spannableStringD.length();
        CharSequence charSequenceSubSequence2 = spannableStringD;
        if (length > i12) {
            charSequenceSubSequence2 = spannableStringD.subSequence(0, i12);
        }
        spannableStringBuilder.append(charSequenceSubSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i12 - spannableStringBuilder.length();
        int i16 = i11 - length2;
        int i17 = i10 != Integer.MIN_VALUE ? i10 : (this.f19111g != 2 || (Math.abs(i16) >= 3 && length2 >= 0)) ? (this.f19111g != 2 || i16 <= 0) ? 0 : 2 : 1;
        if (i17 != 1) {
            if (i17 == 2) {
                i11 = 32 - length2;
            }
            f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i18 = this.f19108d;
        if (i18 > 7) {
            i18 -= 17;
        } else if (this.f19111g == 1) {
            i18 -= this.f19112h - 1;
        }
        return new z4.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i18, 1, Integer.MIN_VALUE, f11, i17, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f19107c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f19105a;
            if (i14 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i14);
            boolean z11 = aVar.f19103b;
            int i16 = aVar.f19102a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i13 = c.B[i16];
                }
                z10 = z12;
            }
            int i17 = aVar.f19104c;
            i14++;
            if (i17 != (i14 < arrayList.size() ? ((a) arrayList.get(i14)).f19104c : length)) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i12 = i13;
                    i15 = i17;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f19105a.isEmpty() && this.f19106b.isEmpty() && this.f19107c.length() == 0;
    }
}
