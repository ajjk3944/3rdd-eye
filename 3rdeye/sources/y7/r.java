package y7;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import y7.e;

/* compiled from: TabTitleDelimitersController.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f48320a;

    /* renamed from: b, reason: collision with root package name */
    public final e.d f48321b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f48322c;

    /* renamed from: d, reason: collision with root package name */
    public int f48323d;

    /* renamed from: e, reason: collision with root package name */
    public int f48324e;

    public r(Context context, e.d dVar) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f48320a = context;
        this.f48321b = dVar;
    }

    public final ImageView a() {
        ImageView imageView = new ImageView(this.f48320a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f48324e, this.f48323d);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(this.f48322c);
        return imageView;
    }
}
