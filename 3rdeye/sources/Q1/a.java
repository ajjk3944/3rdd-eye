package Q1;

import android.view.View;
import java.util.Comparator;

/* compiled from: AnimateLayoutChangeDetector.java */
/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10863b;

    public /* synthetic */ a(int i) {
        this.f10863b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10863b) {
            case 0:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            default:
                View view = (View) obj2;
                View view2 = (View) obj;
                return com.google.gson.internal.c.g(Float.valueOf(view.getMinimumHeight() / view.getMeasuredHeight()), Float.valueOf(view2.getMinimumHeight() / view2.getMeasuredHeight()));
        }
    }
}
