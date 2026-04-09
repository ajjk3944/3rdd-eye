package f0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import b4.C0344i;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;

/* renamed from: f0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2315A implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19978a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f19979b;

    public C2315A(Spannable spannable) {
        this.f19979b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f19979b;
        if (!this.f19978a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0344i(13) : new z(13)).v(spannable)) {
                this.f19979b = new SpannableString(spannable);
            }
        }
        this.f19978a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f19979b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(this.f19979b.chars()));
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(this.f19979b.codePoints()));
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f19979b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f19979b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f19979b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i3, Class cls) {
        return this.f19979b.getSpans(i, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f19979b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i3, Class cls) {
        return this.f19979b.nextSpanTransition(i, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f19979b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i3, int i6) {
        a();
        this.f19979b.setSpan(obj, i, i3, i6);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i3) {
        return this.f19979b.subSequence(i, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f19979b.toString();
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return IntStream.VivifiedWrapper.convert(this.f19979b.chars());
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return IntStream.VivifiedWrapper.convert(this.f19979b.codePoints());
    }
}
