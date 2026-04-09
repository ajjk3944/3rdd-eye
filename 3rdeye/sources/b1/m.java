package b1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
public final class m implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f17090b = false;

    /* renamed from: c, reason: collision with root package name */
    public Spannable f17091c;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class a {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof J0.h;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class b extends a {
        @Override // b1.m.a
        public final boolean a(CharSequence charSequence) {
            return J0.e.n(charSequence) || (charSequence instanceof J0.h);
        }
    }

    public m(Spannable spannable) {
        this.f17091c = spannable;
    }

    public final void a() {
        Spannable spannable = this.f17091c;
        if (!this.f17090b) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f17091c = new SpannableString(spannable);
            }
        }
        this.f17090b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f17091c.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f17091c.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f17091c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f17091c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f17091c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f17091c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i10, Class<T> cls) {
        return (T[]) this.f17091c.getSpans(i, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f17091c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i10, Class cls) {
        return this.f17091c.nextSpanTransition(i, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f17091c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i10, int i11) {
        a();
        this.f17091c.setSpan(obj, i, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return this.f17091c.subSequence(i, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f17091c.toString();
    }
}
