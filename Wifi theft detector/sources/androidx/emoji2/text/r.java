package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public class r implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3071a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f3072b;

    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof q0.n;
        }
    }

    public static class c extends b {
        @Override // androidx.emoji2.text.r.b
        public boolean a(CharSequence charSequence) {
            return s.a(charSequence) || (charSequence instanceof q0.n);
        }
    }

    public r(Spannable spannable) {
        this.f3072b = spannable;
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.f3072b;
        if (!this.f3071a && c().a(spannable)) {
            this.f3072b = new SpannableString(spannable);
        }
        this.f3071a = true;
    }

    public Spannable b() {
        return this.f3072b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f3072b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f3072b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f3072b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3072b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3072b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3072b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f3072b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3072b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3072b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f3072b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f3072b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f3072b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3072b.toString();
    }

    public r(CharSequence charSequence) {
        this.f3072b = new SpannableString(charSequence);
    }
}
