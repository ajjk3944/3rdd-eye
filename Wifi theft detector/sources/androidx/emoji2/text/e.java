package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.EmojiCompat;

/* loaded from: classes.dex */
public class e implements EmojiCompat.e {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3018b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3019a;

    public e() {
        TextPaint textPaint = new TextPaint();
        this.f3019a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal threadLocal = f3018b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.EmojiCompat.e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return j0.c.a(this.f3019a, sbB.toString());
    }
}
