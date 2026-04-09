package defpackage;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qx0 {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public qx0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
