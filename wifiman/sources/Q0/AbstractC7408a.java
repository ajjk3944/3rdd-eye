package q0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import m0.AbstractC6670H;
import m0.InterfaceC6717n0;
import m0.Z0;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7408a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private boolean f58329a;

    public AbstractC7408a(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(Z0.f52872a, Boolean.TRUE);
    }

    public final void a(InterfaceC6717n0 interfaceC6717n0, View view, long j10) {
        super.drawChild(AbstractC6670H.d(interfaceC6717n0), view, j10);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f58329a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
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
