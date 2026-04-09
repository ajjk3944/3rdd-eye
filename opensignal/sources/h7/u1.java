package h7;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f10210a;

    /* renamed from: b, reason: collision with root package name */
    public int f10211b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10212c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10213d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10214e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f10215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f10216g;

    public u1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f10216g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f10210a = -1;
        this.f10211b = Integer.MIN_VALUE;
        this.f10212c = false;
        this.f10213d = false;
        this.f10214e = false;
        int[] iArr = this.f10215f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
