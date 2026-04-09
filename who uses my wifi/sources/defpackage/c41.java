package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c41 implements Spannable {
    public boolean f = false;
    public Spannable g;

    public c41(Spannable spannable) {
        this.g = spannable;
    }

    public final void a() {
        Spannable spannable = this.g;
        if (!this.f) {
            if ((Build.VERSION.SDK_INT < 28 ? new ts0() : new b41()).l(spannable)) {
                this.g = new SpannableString(spannable);
            }
        }
        this.f = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.g.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.g.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.g.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.g.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.g.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.g.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.g.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.g.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.g.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.g.toString();
    }
}
