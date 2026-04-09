package c;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: c.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5809a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5810b;

    /* renamed from: c, reason: collision with root package name */
    public q5.h f5811c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5813e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0372L(int i, Object obj) {
        this(false);
        this.f5812d = i;
        this.f5813e = obj;
    }

    public C0372L(boolean z6) {
        this.f5809a = z6;
        this.f5810b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0372L(p5.l lVar) {
        this(true);
        this.f5812d = 0;
        this.f5813e = lVar;
    }
}
