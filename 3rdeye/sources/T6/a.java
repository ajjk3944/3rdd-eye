package T6;

import android.view.View;
import android.view.ViewGroup;
import c9.C2092m;
import c9.C2099t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: ExistingToken.kt */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final View f12297e;

    /* renamed from: f, reason: collision with root package name */
    public final a f12298f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i7.b item, int i, View view, a aVar) {
        super(item, i);
        l.f(item, "item");
        l.f(view, "view");
        this.f12297e = view;
        this.f12298f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0245 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<T6.a> b(T6.a r13) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.a.b(T6.a):java.util.List");
    }

    public final List<a> c(List<i7.b> list, a aVar) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            i7.b bVar = (i7.b) obj;
            View view = this.f12297e;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            View childAt = viewGroup != null ? viewGroup.getChildAt(i) : null;
            if (childAt == null) {
                return C2099t.f18581b;
            }
            arrayList.add(new a(bVar, i, childAt, aVar == null ? this : aVar));
            i = i10;
        }
        return arrayList;
    }
}
