package V;

import android.util.SparseArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f22936a;

    private a(SparseArray sparseArray) {
        this.f22936a = sparseArray;
    }

    public final Object a(int i10) {
        return this.f22936a.get(i10);
    }

    public final void b(int i10, Object obj) {
        this.f22936a.put(i10, obj);
    }

    public a(int i10) {
        this(new SparseArray(i10));
    }

    public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
