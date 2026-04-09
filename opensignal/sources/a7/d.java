package a7;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public final class d extends RelativeLayout.LayoutParams implements b {

    /* renamed from: a, reason: collision with root package name */
    public a f185a;

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i10, int i11) {
        ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i10, 0);
        ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i11, 0);
    }
}
