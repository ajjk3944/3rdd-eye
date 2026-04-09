package defpackage;

import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tg0 {
    public int a;
    public int b;

    public /* synthetic */ tg0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(wo0 wo0Var) {
        View view = wo0Var.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public int b() {
        int i = this.b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public tg0(yv1 yv1Var, int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
