package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5515a;

    /* renamed from: b, reason: collision with root package name */
    public int f5516b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5517c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5518d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5519e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f5520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f5521g;

    public l0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f5521g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f5515a = -1;
        this.f5516b = LinearLayoutManager.INVALID_OFFSET;
        this.f5517c = false;
        this.f5518d = false;
        this.f5519e = false;
        int[] iArr = this.f5520f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
