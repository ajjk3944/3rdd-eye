package E;

import C.J;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.T;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o0.b;

/* compiled from: ProcessingRequest.java */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f1269a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1270b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1271c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1272d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f1273e;

    /* renamed from: f, reason: collision with root package name */
    public final B f1274f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1275g;
    public final b.d i;

    /* renamed from: j, reason: collision with root package name */
    public int f1277j = -1;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1276h = new ArrayList();

    public A(Q q10, J.f fVar, Rect rect, int i, int i10, Matrix matrix, B b10, b.d dVar, int i11) {
        this.f1269a = i11;
        this.f1272d = i10;
        this.f1271c = i;
        this.f1270b = rect;
        this.f1273e = matrix;
        this.f1274f = b10;
        this.f1275g = String.valueOf(q10.hashCode());
        List<T> listA = q10.a();
        Objects.requireNonNull(listA);
        for (T t10 : listA) {
            ArrayList arrayList = this.f1276h;
            t10.getClass();
            arrayList.add(0);
        }
        this.i = dVar;
    }
}
