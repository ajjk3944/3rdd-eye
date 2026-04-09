package l4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import k4.C5216a;
import l4.l;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public final class k extends l.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43834c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f43835d;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f43834c = arrayList;
        this.f43835d = matrix;
    }

    @Override // l4.l.f
    public final void a(Matrix matrix, C5216a c5216a, int i, Canvas canvas) {
        Iterator it = this.f43834c.iterator();
        while (it.hasNext()) {
            ((l.f) it.next()).a(this.f43835d, c5216a, i, canvas);
        }
    }
}
