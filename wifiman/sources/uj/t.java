package uj;

import kotlin.jvm.internal.AbstractC6492s;
import rj.InterfaceC7733m2;

/* loaded from: classes4.dex */
public abstract class t {
    public static final org.kodein.di.f a(d dVar, InterfaceC7733m2 di2, Object ctx) {
        AbstractC6492s.i(dVar, "<this>");
        AbstractC6492s.i(di2, "di");
        AbstractC6492s.i(ctx, "ctx");
        Object objA = dVar.a(di2, ctx);
        if (objA != null) {
            return org.kodein.di.f.f56931a.a(dVar.c(), objA);
        }
        return null;
    }
}
