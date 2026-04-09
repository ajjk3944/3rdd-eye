package ed;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q extends w {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f23365d;

    public q(ArrayList arrayList, Matrix matrix) {
        this.f23364c = arrayList;
        this.f23365d = matrix;
    }

    @Override // ed.w
    public final void a(Matrix matrix, dd.a aVar, int i4, Canvas canvas) {
        ArrayList arrayList = this.f23364c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((w) obj).a(this.f23365d, aVar, i4, canvas);
        }
    }
}
