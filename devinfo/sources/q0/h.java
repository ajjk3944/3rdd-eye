package q0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import p1.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32062a;

    /* renamed from: b, reason: collision with root package name */
    public s f32063b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f32064c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32065d;

    public h(boolean z3) {
        super(ColorStateList.valueOf(-16777216), null, z3 ? new ColorDrawable(-1) : null);
        this.f32062a = z3;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f32062a) {
            this.f32065d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f32065d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f32065d;
    }
}
