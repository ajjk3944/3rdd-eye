package e5;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements a5.j, qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7898a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f7899d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7900g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7901r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7902x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7903y;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, IOException iOException, boolean z10, int i10) {
        this.f7898a = i10;
        this.f7901r = obj;
        this.f7902x = obj2;
        this.f7903y = obj3;
        this.f7899d = iOException;
        this.f7900g = z10;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7898a) {
            case 0:
                ((c) obj).onLoadError((a) this.f7901r, (o5.q) this.f7902x, (o5.v) this.f7903y, this.f7899d, this.f7900g);
                break;
            default:
                ((AnalyticsListener) obj).onLoadError((x9.q) this.f7901r, (ya.m) this.f7902x, (ya.r) this.f7903y, this.f7899d, this.f7900g);
                break;
        }
    }
}
