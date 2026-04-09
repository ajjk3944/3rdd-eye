package e4;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.liuzh.deviceinfo.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f22400d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f22401a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f22402b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f22403c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f22401a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
