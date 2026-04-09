package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TypedValue f27080a;

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f27081b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f27082c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f27083d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f27084e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f27085f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f27086g;

    /* renamed from: h, reason: collision with root package name */
    private a f27087h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f27086g.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f27084e == null) {
            this.f27084e = new TypedValue();
        }
        return this.f27084e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f27085f == null) {
            this.f27085f = new TypedValue();
        }
        return this.f27085f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f27082c == null) {
            this.f27082c = new TypedValue();
        }
        return this.f27082c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f27083d == null) {
            this.f27083d = new TypedValue();
        }
        return this.f27083d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f27080a == null) {
            this.f27080a = new TypedValue();
        }
        return this.f27080a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f27081b == null) {
            this.f27081b = new TypedValue();
        }
        return this.f27081b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f27087h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f27087h;
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
        this.f27087h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27086g = new Rect();
    }
}
