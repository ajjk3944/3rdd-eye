package C1;

import C1.g;
import android.view.View;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes.dex */
public final class h implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f864b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f864b) {
            case 0:
                return com.google.gson.internal.c.g(((g.a) obj).f848a, ((g.a) obj2).f848a);
            default:
                View view = (View) obj2;
                View view2 = (View) obj;
                return com.google.gson.internal.c.g(Float.valueOf(view.getMinimumWidth() / view.getMeasuredWidth()), Float.valueOf(view2.getMinimumWidth() / view2.getMeasuredWidth()));
        }
    }
}
