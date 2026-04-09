package G3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f1648d;

    public r(ArrayList arrayList, Matrix matrix) {
        this.f1647c = arrayList;
        this.f1648d = matrix;
    }

    @Override // G3.x
    public final void a(Matrix matrix, F3.a aVar, int i, Canvas canvas) {
        ArrayList arrayList = this.f1647c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((x) obj).a(this.f1648d, aVar, i, canvas);
        }
    }
}
