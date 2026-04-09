package b1;

import V0.m;
import a1.C0262a;
import android.os.Build;
import e1.h;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f5714e = m.h("NetworkMeteredCtrlr");

    @Override // b1.c
    public final boolean a(h hVar) {
        return hVar.f19916j.f3808a == 5;
    }

    @Override // b1.c
    public final boolean b(Object obj) {
        C0262a c0262a = (C0262a) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (c0262a.f4645a && c0262a.f4647c) ? false : true;
        }
        m.f().a(f5714e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !c0262a.f4645a;
    }
}
