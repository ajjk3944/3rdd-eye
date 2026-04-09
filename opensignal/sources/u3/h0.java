package u3;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f23171d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f23172a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f23173b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f23174c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f23172a;
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
        ArrayList arrayList = (ArrayList) view.getTag(f3.c.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        throw h0.b.e(size, arrayList);
    }
}
