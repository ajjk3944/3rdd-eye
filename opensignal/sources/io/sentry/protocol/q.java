package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class q implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f12620a;

    /* renamed from: d, reason: collision with root package name */
    public Integer f12621d;

    /* renamed from: g, reason: collision with root package name */
    public Integer f12622g;

    /* renamed from: r, reason: collision with root package name */
    public Integer f12623r;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f12624x;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12620a != null) {
            bVar.I("sdk_name");
            bVar.V(this.f12620a);
        }
        if (this.f12621d != null) {
            bVar.I("version_major");
            bVar.U(this.f12621d);
        }
        if (this.f12622g != null) {
            bVar.I("version_minor");
            bVar.U(this.f12622g);
        }
        if (this.f12623r != null) {
            bVar.I("version_patchlevel");
            bVar.U(this.f12623r);
        }
        HashMap map = this.f12624x;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12624x, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
