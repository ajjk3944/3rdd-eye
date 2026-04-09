package o;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: AppCompatTextHelper.java */
/* renamed from: o.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5405x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f44757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f44758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f44759d;

    public RunnableC5405x(TextView textView, Typeface typeface, int i) {
        this.f44757b = textView;
        this.f44758c = typeface;
        this.f44759d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44757b.setTypeface(this.f44758c, this.f44759d);
    }
}
