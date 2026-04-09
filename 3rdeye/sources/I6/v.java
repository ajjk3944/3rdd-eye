package I6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import p9.InterfaceC5480a;

/* compiled from: ViewCopies.kt */
/* loaded from: classes.dex */
public final class v {

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f2597b;

        public a(b bVar) {
            this.f2597b = bVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            view.removeOnLayoutChangeListener(this);
            this.f2597b.invoke();
        }
    }

    /* compiled from: ViewCopies.kt */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f2598g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ImageView f2599h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, ImageView imageView) {
            super(0);
            this.f2598g = view;
            this.f2599h = imageView;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            View view = this.f2598g;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.l.e(bitmapCreateBitmap, "createBitmap(view.width,… Bitmap.Config.ARGB_8888)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            this.f2599h.setImageBitmap(bitmapCreateBitmap);
            return C1992A.f18074a;
        }
    }

    public static final View a(View view, ViewGroup sceneRoot, i iVar, int[] iArr) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        Object tag = view.getTag(R.id.save_overlay_view);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c(view, imageView);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        int[] iArr2 = new int[2];
        sceneRoot.getLocationOnScreen(iArr2);
        imageView.offsetLeftAndRight(iArr[0] - iArr2[0]);
        imageView.offsetTopAndBottom(iArr[1] - iArr2[1]);
        view.setTag(R.id.save_overlay_view, imageView);
        ViewGroupOverlay overlay = sceneRoot.getOverlay();
        view.setVisibility(4);
        overlay.add(imageView);
        iVar.a(new u(view, overlay, imageView));
        b(view, new t(0, imageView, view));
        if (imageView.isAttachedToWindow()) {
            imageView.addOnAttachStateChangeListener(new s(view, imageView));
            return imageView;
        }
        b(view, null);
        return imageView;
    }

    public static final void b(View view, t tVar) {
        kotlin.jvm.internal.l.f(view, "<this>");
        if (view instanceof O6.n) {
            ((O6.n) view).setImageChangeCallback(tVar);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i10 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            b(childAt, tVar);
            i = i10;
        }
    }

    public static final void c(View view, ImageView imageView) {
        Bitmap bitmap;
        ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
        Object drawable = imageView2 != null ? imageView2.getDrawable() : null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        b bVar = new b(view, imageView);
        if (C6.r.c(view)) {
            bVar.invoke();
        } else if (!C6.r.c(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a(bVar));
        } else {
            bVar.invoke();
        }
    }
}
