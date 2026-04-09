package K8;

import D0.a;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.l;

/* compiled from: PHThemeHelper.kt */
/* loaded from: classes3.dex */
public final class b {
    public static void a(int i, View view) {
        int i10 = 0;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (i10 < childCount) {
                View childAt = viewGroup.getChildAt(i10);
                l.e(childAt, "getChildAt(...)");
                a(i, childAt);
                i10++;
            }
            return;
        }
        if (view instanceof ImageView) {
            ((ImageView) view).setColorFilter(i);
            return;
        }
        if (view instanceof AppCompatTextView) {
            ((AppCompatTextView) view).setTextColor(i);
            Drawable[] compoundDrawables = ((TextView) view).getCompoundDrawables();
            l.e(compoundDrawables, "getCompoundDrawables(...)");
            int length = compoundDrawables.length;
            while (i10 < length) {
                Drawable drawable = compoundDrawables[i10];
                if (drawable != null) {
                    a.C0009a.g(drawable, i);
                    drawable.mutate();
                }
                i10++;
            }
        }
    }
}
