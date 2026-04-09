package F4;

import R.F;
import R.O;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.lefan.signal.MyApplication;
import java.util.WeakHashMap;
import q5.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static MyApplication f1456a;

    public static void a(View view, View view2) {
        i.e(view, "<this>");
        i.e(view2, "bottomView");
        int i = 0;
        if (view2 instanceof RecyclerView) {
            ((RecyclerView) view2).setClipToPadding(false);
        }
        if (view2 instanceof NestedScrollView) {
            ((NestedScrollView) view2).setClipToPadding(false);
        }
        c cVar = new c(i, view2);
        WeakHashMap weakHashMap = O.f3270a;
        F.k(view, cVar);
    }

    public static void b(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        Toast.makeText(context, str, 1).show();
    }
}
