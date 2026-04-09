package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6670H;
import m0.InterfaceC6717n0;

/* renamed from: androidx.compose.ui.platform.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3948r0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29583a;

    public C3948r0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(f0.h.f46609J, Boolean.TRUE);
    }

    public final void a(InterfaceC6717n0 interfaceC6717n0, View view, long j10) {
        super.drawChild(AbstractC6670H.d(interfaceC6717n0), view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC6492s.g(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((x1) childAt).u()) {
                this.f29583a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f29583a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f29583a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
