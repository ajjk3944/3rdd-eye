package Ld;

import e8.EnumC5428a;
import kotlin.jvm.internal.AbstractC6492s;
import ua.b;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public abstract class d {
    public static final EnumC5428a a(InterfaceC8439a.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        ua.b bVarH0 = dVar.h0();
        if ((bVarH0 instanceof b.c) || (bVarH0 instanceof b.a) || (bVarH0 instanceof b.e) || (bVarH0 instanceof b.f) || (bVarH0 instanceof b.k) || (bVarH0 instanceof b.w) || (bVarH0 instanceof b.AbstractC2196b.a)) {
            return EnumC5428a.UISP;
        }
        if (bVarH0 instanceof b.r) {
            return EnumC5428a.NETWORK;
        }
        if (bVarH0 instanceof b.t) {
            return EnumC5428a.PROTECT;
        }
        if (bVarH0 instanceof b.d) {
            return EnumC5428a.AMPLIFI;
        }
        if (bVarH0 instanceof b.l) {
            return EnumC5428a.ACCESS;
        }
        if (bVarH0 instanceof b.m) {
            return EnumC5428a.CONNECT;
        }
        if (bVarH0 instanceof b.s) {
            return EnumC5428a.PLAY;
        }
        return null;
    }
}
