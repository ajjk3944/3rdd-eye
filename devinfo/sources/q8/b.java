package q8;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p8.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32215a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f32216b;

    public b(c cVar) {
        this.f32216b = new WeakReference(cVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        switch (this.f32215a) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                c cVar = (c) ((WeakReference) this.f32216b).get();
                if (cVar != null) {
                    ArrayList arrayList = cVar.f32219b;
                    ImageView imageView = cVar.f32218a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        int i4 = 0;
                        int iA = cVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        int iA2 = cVar.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iA > 0 || iA == Integer.MIN_VALUE) {
                            if (iA2 > 0 || iA2 == Integer.MIN_VALUE) {
                                ArrayList arrayList2 = new ArrayList(arrayList);
                                int size = arrayList2.size();
                                while (i4 < size) {
                                    Object obj = arrayList2.get(i4);
                                    i4++;
                                    ((g) ((d) obj)).l(iA, iA2);
                                }
                                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(cVar.f32220c);
                                }
                                cVar.f32220c = null;
                                arrayList.clear();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                f fVar = (f) ((WeakReference) this.f32216b).get();
                if (fVar != null) {
                    ArrayList arrayList3 = fVar.f32223b;
                    View view = fVar.f32222a;
                    if (!arrayList3.isEmpty()) {
                        int paddingRight2 = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        int i10 = 0;
                        int iA3 = fVar.a(view.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                        int iA4 = fVar.a(view.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iA3 > 0 || iA3 == Integer.MIN_VALUE) {
                            if (iA4 > 0 || iA4 == Integer.MIN_VALUE) {
                                ArrayList arrayList4 = new ArrayList(arrayList3);
                                int size2 = arrayList4.size();
                                while (i10 < size2) {
                                    Object obj2 = arrayList4.get(i10);
                                    i10++;
                                    ((g) ((d) obj2)).l(iA3, iA4);
                                }
                                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(fVar.f32224c);
                                }
                                fVar.f32224c = null;
                                arrayList3.clear();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) this.f32216b).q(0);
                break;
        }
        return true;
    }

    public b(f fVar) {
        this.f32216b = new WeakReference(fVar);
    }

    public b(CoordinatorLayout coordinatorLayout) {
        this.f32216b = coordinatorLayout;
    }
}
