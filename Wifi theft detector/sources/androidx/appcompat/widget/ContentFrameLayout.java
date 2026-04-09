package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f943a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f944b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f945c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f946d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f947e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f948f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f949g;

    /* renamed from: h, reason: collision with root package name */
    public a f950h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f949g.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f947e == null) {
            this.f947e = new TypedValue();
        }
        return this.f947e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f948f == null) {
            this.f948f = new TypedValue();
        }
        return this.f948f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f945c == null) {
            this.f945c = new TypedValue();
        }
        return this.f945c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f946d == null) {
            this.f946d = new TypedValue();
        }
        return this.f946d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f943a == null) {
            this.f943a = new TypedValue();
        }
        return this.f943a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f944b == null) {
            this.f944b = new TypedValue();
        }
        return this.f944b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f950h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f950h;
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
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f950h = aVar;
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f949g = new Rect();
    }
}
