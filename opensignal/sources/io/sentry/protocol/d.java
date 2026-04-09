package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.x5;
import io.sentry.y2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public q f12530a;

    /* renamed from: d, reason: collision with root package name */
    public List f12531d;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f12532g;

    public static d a(d dVar, x5 x5Var) {
        ArrayList arrayList = new ArrayList();
        if (x5Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(x5Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : x5Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (dVar == null) {
            dVar = new d();
        }
        List list = dVar.f12531d;
        if (list == null) {
            dVar.f12531d = new ArrayList(arrayList);
            return dVar;
        }
        list.addAll(arrayList);
        return dVar;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12530a != null) {
            bVar.I("sdk_info");
            bVar.S(u0Var, this.f12530a);
        }
        if (this.f12531d != null) {
            bVar.I("images");
            bVar.S(u0Var, this.f12531d);
        }
        HashMap map = this.f12532g;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12532g, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
