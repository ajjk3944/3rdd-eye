package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

/* loaded from: classes.dex */
class e implements f.e {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f30978b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f30979a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f30979a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f30978b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return w1.g.a(this.f30979a, sbB.toString());
    }
}
