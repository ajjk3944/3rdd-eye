package androidx.recyclerview.widget;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1316a;

    /* renamed from: b, reason: collision with root package name */
    public int f1317b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1318c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1319d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1320e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1321f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public c2(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f1316a = -1;
        this.f1317b = LinearLayoutManager.INVALID_OFFSET;
        this.f1318c = false;
        this.f1319d = false;
        this.f1320e = false;
        int[] iArr = this.f1321f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
