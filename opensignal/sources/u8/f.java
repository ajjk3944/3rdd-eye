package u8;

import ee.u;
import r8.h0;

/* loaded from: classes.dex */
public final class f extends bm.e {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ bm.e f23456r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bm.e eVar) {
        super(19);
        this.f23456r = eVar;
    }

    @Override // bm.e
    public final Object A(u uVar) {
        Float f10 = (Float) ((h0) this.f23456r.f2831g);
        if (f10 == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * 2.55f);
    }
}
