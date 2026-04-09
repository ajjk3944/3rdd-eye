package e3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import d3.InterfaceC4272d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import t4.C5606d;

/* compiled from: ViewTarget.java */
@Deprecated
/* renamed from: e3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4314h<T extends View, Z> extends AbstractC4307a<Z> {

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f37709b;

    /* renamed from: c, reason: collision with root package name */
    public final a f37710c;

    /* compiled from: ViewTarget.java */
    /* renamed from: e3.h$a */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static Integer f37711d;

        /* renamed from: a, reason: collision with root package name */
        public final ImageView f37712a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f37713b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0447a f37714c;

        /* compiled from: ViewTarget.java */
        /* renamed from: e3.h$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0447a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            public final WeakReference<a> f37715b;

            public ViewTreeObserverOnPreDrawListenerC0447a(a aVar) {
                this.f37715b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f37715b.get();
                if (aVar == null) {
                    return true;
                }
                ArrayList arrayList = aVar.f37713b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                ImageView imageView = aVar.f37712a;
                int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                int iA = aVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                int iA2 = aVar.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (iA <= 0 && iA != Integer.MIN_VALUE) {
                    return true;
                }
                if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((InterfaceC4312f) it.next()).b(iA, iA2);
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(aVar.f37714c);
                }
                aVar.f37714c = null;
                arrayList.clear();
                return true;
            }
        }

        public a(ImageView imageView) {
            this.f37712a = imageView;
        }

        public final int a(int i, int i10, int i11) {
            int i12 = i10 - i11;
            if (i12 > 0) {
                return i12;
            }
            int i13 = i - i11;
            if (i13 > 0) {
                return i13;
            }
            ImageView imageView = this.f37712a;
            if (imageView.isLayoutRequested() || i10 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = imageView.getContext();
            if (f37711d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C5606d.l(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f37711d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f37711d.intValue();
        }
    }

    public AbstractC4314h(ImageView imageView) {
        C5606d.l(imageView, "Argument must not be null");
        this.f37709b = imageView;
        this.f37710c = new a(imageView);
    }

    @Override // e3.InterfaceC4313g
    public final void a(d3.h hVar) {
        this.f37710c.f37713b.remove(hVar);
    }

    @Override // e3.InterfaceC4313g
    public final void b(InterfaceC4272d interfaceC4272d) {
        this.f37709b.setTag(R.id.glide_custom_view_target_tag, interfaceC4272d);
    }

    @Override // e3.InterfaceC4313g
    public final void d(d3.h hVar) throws Throwable {
        a aVar = this.f37710c;
        ImageView imageView = aVar.f37712a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA = aVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = aVar.f37712a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iA2 = aVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            hVar.b(iA, iA2);
            return;
        }
        ArrayList arrayList = aVar.f37713b;
        if (!arrayList.contains(hVar)) {
            arrayList.add(hVar);
        }
        if (aVar.f37714c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC0447a viewTreeObserverOnPreDrawListenerC0447a = new a.ViewTreeObserverOnPreDrawListenerC0447a(aVar);
            aVar.f37714c = viewTreeObserverOnPreDrawListenerC0447a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0447a);
        }
    }

    @Override // e3.InterfaceC4313g
    public final InterfaceC4272d g() {
        Object tag = this.f37709b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC4272d) {
            return (InterfaceC4272d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // e3.InterfaceC4313g
    public void h(Drawable drawable) {
        a aVar = this.f37710c;
        ViewTreeObserver viewTreeObserver = aVar.f37712a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f37714c);
        }
        aVar.f37714c = null;
        aVar.f37713b.clear();
    }

    public final String toString() {
        return "Target for: " + this.f37709b;
    }
}
