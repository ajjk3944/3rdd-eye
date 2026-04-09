package b1;

import V0.m;
import a1.C0262a;
import android.os.Build;
import e1.h;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f5715e = m.h("NetworkNotRoamingCtrlr");

    @Override // b1.c
    public final boolean a(h hVar) {
        return hVar.f19916j.f3808a == 4;
    }

    @Override // b1.c
    public final boolean b(Object obj) {
        C0262a c0262a = (C0262a) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return (c0262a.f4645a && c0262a.f4648d) ? false : true;
        }
        m.f().a(f5715e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !c0262a.f4645a;
    }
}
