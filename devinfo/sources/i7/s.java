package i7;

import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends e {

    /* renamed from: i, reason: collision with root package name */
    public final Object f25931i;

    public s(Object obj, km.o oVar) {
        super(Collections.EMPTY_LIST);
        j(oVar);
        this.f25931i = obj;
    }

    @Override // i7.e
    public final float b() {
        return 1.0f;
    }

    @Override // i7.e
    public final Object e() {
        km.o oVar = this.f25876e;
        Object obj = this.f25931i;
        float f10 = this.f25875d;
        return oVar.l(0.0f, 0.0f, obj, obj, f10, f10, f10);
    }

    @Override // i7.e
    public final Object f(s7.a aVar, float f10) {
        return e();
    }

    @Override // i7.e
    public final void h() {
        if (this.f25876e != null) {
            super.h();
        }
    }

    @Override // i7.e
    public final void i(float f10) {
        this.f25875d = f10;
    }
}
