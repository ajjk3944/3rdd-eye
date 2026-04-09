package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qw {
    public boolean a;
    public final CopyOnWriteArrayList b;
    public ry c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw(i5 i5Var, int i) {
        this(true);
        this.d = i;
        this.e = i5Var;
    }

    public qw(boolean z) {
        this.a = z;
        this.b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qw(xw xwVar) {
        this(false);
        this.d = 0;
        this.e = xwVar;
    }
}
