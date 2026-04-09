package w4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import com.google.android.gms.internal.measurement.j4;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f36468a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f36469b;

    public v(Spannable spannable) {
        this.f36469b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f36469b;
        if (!this.f36468a) {
            if ((Build.VERSION.SDK_INT < 28 ? new ja.c() : new u()).z(spannable)) {
                this.f36469b = new SpannableString(spannable);
            }
        }
        this.f36468a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.f36469b.charAt(i4);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f36469b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f36469b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f36469b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i4, int i10, Class cls) {
        return this.f36469b.getSpans(i4, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f36469b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i4, int i10, Class cls) {
        return this.f36469b.nextSpanTransition(i4, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f36469b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i4, int i10, int i11) {
        a();
        this.f36469b.setSpan(obj, i4, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i10) {
        return this.f36469b.subSequence(i4, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f36469b.toString();
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return j4.a(this.f36469b);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return j4.b(this.f36469b);
    }
}
