package ee;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f8136d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f8135c = arrayList;
        this.f8136d = matrix;
    }

    @Override // ee.t
    public final void a(Matrix matrix, de.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f8135c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f8136d, aVar, i10, canvas);
        }
    }
}
