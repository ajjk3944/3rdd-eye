package z3;

import android.view.View;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import st.k;
import y1.i2;
import y1.u1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f26622a = c.pooling_container_listener_holder_tag;

    /* renamed from: b, reason: collision with root package name */
    public static final int f26623b = c.is_pooling_container_tag;

    public static final void a(View view) {
        l.e(view, "<this>");
        k kVarU = i4.u(new tj.a(view, null, 1));
        while (kVarU.hasNext()) {
            ArrayList arrayList = b((View) kVarU.next()).f26624a;
            for (int iZ = e5.z(arrayList); -1 < iZ; iZ--) {
                y1.a aVar = ((u1) arrayList.get(iZ)).f25782a;
                i2 i2Var = aVar.f25622g;
                if (i2Var != null) {
                    i2Var.a();
                }
                aVar.f25622g = null;
                aVar.requestLayout();
            }
        }
    }

    public static final b b(View view) {
        int i10 = f26622a;
        b bVar = (b) view.getTag(i10);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i10, bVar2);
        return bVar2;
    }
}
