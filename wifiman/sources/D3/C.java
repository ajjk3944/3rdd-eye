package D3;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class C implements y {

    /* renamed from: a, reason: collision with root package name */
    final List f2827a;

    public C(Context context, B b10) {
        ArrayList arrayList = new ArrayList();
        this.f2827a = arrayList;
        if (b10.c()) {
            arrayList.add(new K(context, b10));
        }
    }
}
