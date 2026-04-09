package j4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class x implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13253a = false;

    /* renamed from: d, reason: collision with root package name */
    public Spannable f13254d;

    public x(Spannable spannable) {
        this.f13254d = spannable;
    }

    public final void a() {
        Spannable spannable = this.f13254d;
        if (!this.f13253a) {
            if ((Build.VERSION.SDK_INT < 28 ? new io.sentry.hints.i(11) : new w(11)).S(spannable)) {
                this.f13254d = new SpannableString(spannable);
            }
        }
        this.f13253a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f13254d.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f13254d.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f13254d.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f13254d.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f13254d.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f13254d.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f13254d.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13254d.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f13254d.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f13254d.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f13254d.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f13254d.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f13254d.toString();
    }
}
