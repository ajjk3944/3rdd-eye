package r0;

import android.content.Context;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32550a;

    public /* synthetic */ i0(int i4) {
        this.f32550a = i4;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f32550a) {
            case 0:
                return new d3.f(0);
            case 1:
                return t0.q.f34122a;
            case 2:
                return new w0(null, 32767);
            case 3:
                return s2.b0.f33349d;
            case 4:
                return yj.u.f37649a;
            case 5:
                return Boolean.TRUE;
            case 6:
                u0.r.b("Unexpected call to default provider");
                throw new ac.m();
            case 7:
                return new b7.h(0);
            case 8:
                return new ui.x();
            case 9:
                Context context = pk.a.f32022a;
                nk.k.b(context);
                return context.getResources().getStringArray(R.array.size_units);
            default:
                Context context2 = pk.a.f32022a;
                nk.k.b(context2);
                return new xi.a(context2, yi.c.f37626a);
        }
    }

    public /* synthetic */ i0(int i4, Object obj) {
        this.f32550a = i4;
    }
}
