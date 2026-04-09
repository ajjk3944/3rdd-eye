package L0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: ViewGroup.kt */
/* loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.m implements p9.l<View, Iterator<? extends View>> {

    /* renamed from: g, reason: collision with root package name */
    public static final M f3813g = new M(1);

    @Override // p9.l
    public final Iterator<? extends View> invoke(View view) {
        View view2 = view;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            return new C6.o(viewGroup, 1);
        }
        return null;
    }
}
