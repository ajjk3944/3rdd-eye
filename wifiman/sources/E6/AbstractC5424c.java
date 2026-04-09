package e6;

import j6.InterfaceC6255b;
import k6.C6396c;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;
import u6.e;

/* renamed from: e6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5424c {
    public static final float a(e eVar, float f10, InterfaceC6255b segmentProperties) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(segmentProperties, "segmentProperties");
        float fJ = eVar.j() * (((segmentProperties.a() * C6396c.b(eVar.c(), null, 1, null).g()) * eVar.l()) - f10);
        return eVar.h() ? AbstractC7978m.c(fJ, 0.0f) : AbstractC7978m.f(fJ, 0.0f);
    }
}
