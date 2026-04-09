package androidx.media3.common;

import android.view.View;
import h7.n1;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1699a;

    /* renamed from: b, reason: collision with root package name */
    public int f1700b;

    public /* synthetic */ i0(int i10, int i11) {
        this.f1699a = i10;
        this.f1700b = i11;
    }

    public int a() {
        int i10 = this.f1700b;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(n1 n1Var) {
        View view = n1Var.f10155a;
        this.f1699a = view.getLeft();
        this.f1700b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
