package d4;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: ToolbarUtils.java */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37519a = new a();

    /* compiled from: ToolbarUtils.java */
    public class a implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static ImageButton a(SearchBar searchBar) {
        Drawable navigationIcon = searchBar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < searchBar.getChildCount(); i++) {
            View childAt = searchBar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList b(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
