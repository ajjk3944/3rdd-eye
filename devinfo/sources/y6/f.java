package y6;

import android.os.Build;
import b7.r;
import nk.k;
import t6.v;
import t6.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f37352c;

    /* renamed from: b, reason: collision with root package name */
    public final int f37353b;

    static {
        String strG = v.g("NetworkNotRoamingCtrlr");
        k.d(strG, "tagWithPrefix(...)");
        f37352c = strG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z6.f fVar) {
        super(fVar);
        k.e(fVar, "tracker");
        this.f37353b = 7;
    }

    @Override // y6.d
    public final boolean a(r rVar) {
        k.e(rVar, "workSpec");
        return rVar.j.f34334a == w.f34404d;
    }

    @Override // y6.b
    public final int d() {
        return this.f37353b;
    }

    @Override // y6.b
    public final boolean e(Object obj) {
        x6.e eVar = (x6.e) obj;
        k.e(eVar, "value");
        boolean z3 = eVar.f36980a;
        if (Build.VERSION.SDK_INT >= 24) {
            return (z3 && eVar.f36983d) ? false : true;
        }
        v.e().a(f37352c, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
        return !z3;
    }
}
