package F3;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class P implements M {

    /* renamed from: a, reason: collision with root package name */
    final List f5868a;

    public P(Context context, O o10) {
        ArrayList arrayList = new ArrayList();
        this.f5868a = arrayList;
        if (o10.c()) {
            arrayList.add(new Z(context, o10));
        }
    }
}
