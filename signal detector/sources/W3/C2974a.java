package w3;

import G3.j;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2974a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f23968a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f23969b;

    public C2974a(ShapeableImageView shapeableImageView) {
        this.f23969b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f23969b;
        if (shapeableImageView.f18378l == null) {
            return;
        }
        if (shapeableImageView.f18377k == null) {
            shapeableImageView.f18377k = new j(shapeableImageView.f18378l);
        }
        RectF rectF = shapeableImageView.f18372e;
        Rect rect = this.f23968a;
        rectF.round(rect);
        shapeableImageView.f18377k.setBounds(rect);
        shapeableImageView.f18377k.getOutline(outline);
    }
}
