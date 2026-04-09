package a8;

import android.graphics.Bitmap;
import l8.p;

/* loaded from: classes.dex */
public final class i extends rq.c {
    public b B;
    public Bitmap D;
    public /* synthetic */ Object E;
    public final /* synthetic */ l F;
    public int G;

    /* renamed from: r, reason: collision with root package name */
    public l f205r;

    /* renamed from: x, reason: collision with root package name */
    public p f206x;

    /* renamed from: y, reason: collision with root package name */
    public l8.j f207y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, rq.c cVar) {
        super(cVar);
        this.F = lVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return l.a(this.F, null, this);
    }
}
