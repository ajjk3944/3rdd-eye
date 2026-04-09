package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f759b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f760c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f761d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f762e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f763f;

    /* renamed from: g, reason: collision with root package name */
    private TypedValue f764g;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f765h;

    /* renamed from: i, reason: collision with root package name */
    private a f766i;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f765h = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i2, int i3, int i4, int i5) {
        this.f765h.set(i2, i3, i4, i5);
        if (a0.s.D(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f763f == null) {
            this.f763f = new TypedValue();
        }
        return this.f763f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f764g == null) {
            this.f764g = new TypedValue();
        }
        return this.f764g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f761d == null) {
            this.f761d = new TypedValue();
        }
        return this.f761d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f762e == null) {
            this.f762e = new TypedValue();
        }
        return this.f762e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f759b == null) {
            this.f759b = new TypedValue();
        }
        return this.f759b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f760c == null) {
            this.f760c = new TypedValue();
        }
        return this.f760c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f766i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f766i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f766i = aVar;
    }
}
