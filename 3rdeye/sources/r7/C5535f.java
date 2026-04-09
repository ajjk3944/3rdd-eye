package r7;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import h7.C4421b;
import i6.C4459b;

/* compiled from: EllipsizedTextView.kt */
/* renamed from: r7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5535f extends n {

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f45771k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f45772l;

    /* renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f45773m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45774n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f45775o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f45776p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f45777q;

    /* renamed from: r, reason: collision with root package name */
    public int f45778r;

    /* renamed from: s, reason: collision with root package name */
    public int f45779s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f45780t;

    /* renamed from: u, reason: collision with root package name */
    public float f45781u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f45782v;

    /* renamed from: w, reason: collision with root package name */
    public final C5532c f45783w;

    public C5535f(Context context, int i) {
        super(context, i);
        CharSequence charSequence = "…";
        this.f45771k = "…";
        this.f45773m = TextUtils.TruncateAt.END;
        this.f45778r = -1;
        this.f45779s = -1;
        this.f45781u = -1.0f;
        this.f45783w = new C5532c(this);
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C4459b.f38457b, i, 0);
            kotlin.jvm.internal.l.e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…extView, defStyleAttr, 0)");
            try {
                CharSequence text = typedArrayObtainStyledAttributes.getText(0);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        o(this.f45771k);
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.f45775o = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence charSequence) {
        this.f45777q = true;
        super.setText(charSequence);
        this.f45777q = false;
    }

    public final boolean getAutoEllipsize() {
        return this.f45772l;
    }

    public final CharSequence getDisplayText() {
        return this.f45776p;
    }

    public final CharSequence getEllipsis() {
        return this.f45771k;
    }

    public final TextUtils.TruncateAt getEllipsisLocation() {
        return this.f45773m;
    }

    public final CharSequence getEllipsizedText() {
        return this.f45775o;
    }

    public final int getLastMeasuredHeight() {
        return this.f45779s;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        CharSequence charSequence = this.f45780t;
        return charSequence == null ? "" : charSequence;
    }

    public final void o(CharSequence charSequence) {
        if (getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE) {
            super.setEllipsize(null);
        } else if (kotlin.jvm.internal.l.b(charSequence, "…")) {
            super.setEllipsize(this.f45773m);
        } else {
            super.setEllipsize(null);
            this.f45782v = true;
            this.f45781u = -1.0f;
            this.f45774n = false;
        }
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [r7.b] */
    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final C5532c c5532c = this.f45783w;
        if (c5532c.f45756b && c5532c.f45757c == null) {
            c5532c.f45757c = new ViewTreeObserver.OnPreDrawListener() { // from class: r7.b
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    C5532c this$0 = c5532c;
                    kotlin.jvm.internal.l.f(this$0, "this$0");
                    if (this$0.f45756b) {
                        C5535f c5535f = this$0.f45755a;
                        int height = (c5535f.getHeight() - c5535f.getCompoundPaddingTop()) - c5535f.getCompoundPaddingBottom();
                        int lineForVertical = c5535f.getLayout() == null ? 0 : c5535f.getLayout().getLineForVertical(height);
                        int i = lineForVertical + 1;
                        if (height >= q.a(c5535f, i)) {
                            lineForVertical = i;
                        }
                        if (lineForVertical > 0 && lineForVertical < c5535f.getLineCount()) {
                            int i10 = C4421b.f38269a;
                            C4421b.a(C7.a.DEBUG);
                            c5535f.setMaxLines(lineForVertical);
                            return false;
                        }
                        if (this$0.f45757c != null) {
                            c5535f.getViewTreeObserver().removeOnPreDrawListener(this$0.f45757c);
                            this$0.f45757c = null;
                        }
                    }
                    return true;
                }
            };
            c5532c.f45755a.getViewTreeObserver().addOnPreDrawListener(c5532c.f45757c);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5532c c5532c = this.f45783w;
        if (c5532c.f45757c != null) {
            c5532c.f45755a.getViewTreeObserver().removeOnPreDrawListener(c5532c.f45757c);
            c5532c.f45757c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    @Override // r7.n, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.C5535f.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        if (i == i11 && i10 == i12) {
            return;
        }
        this.f45782v = true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        if (this.f45777q) {
            return;
        }
        this.f45780t = charSequence;
        requestLayout();
        this.f45782v = true;
    }

    public final void setAutoEllipsize(boolean z10) {
        this.f45772l = z10;
        this.f45783w.f45756b = z10;
    }

    public final void setEllipsis(CharSequence value) {
        kotlin.jvm.internal.l.f(value, "value");
        o(value);
        this.f45771k = value;
    }

    public final void setEllipsisLocation(TextUtils.TruncateAt truncateAt) {
        this.f45773m = truncateAt;
        if (truncateAt == null) {
            setAutoEllipsize(false);
        }
        o(this.f45771k);
    }

    public final void setInternalTextChange(boolean z10) {
        this.f45777q = z10;
    }

    public final void setLastMeasuredHeight(int i) {
        this.f45779s = i;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i == getMaxLines()) {
            return;
        }
        super.setMaxLines(i);
        o(this.f45771k);
        this.f45782v = true;
        this.f45781u = -1.0f;
        this.f45774n = false;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f45776p = charSequence;
        super.setText(charSequence, bufferType);
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    public static /* synthetic */ void getDisplayText$annotations() {
    }

    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }
}
