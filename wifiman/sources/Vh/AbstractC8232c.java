package vh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC6492s;
import th.g;
import th.l;
import th.p;
import th.w;
import wh.AbstractC8339A;
import wh.K0;
import wh.U0;
import wh.j1;
import xh.h;

/* renamed from: vh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8232c {
    public static final Constructor a(g gVar) {
        h hVarV;
        AbstractC6492s.i(gVar, "<this>");
        AbstractC8339A abstractC8339AB = j1.b(gVar);
        Member memberB = (abstractC8339AB == null || (hVarV = abstractC8339AB.V()) == null) ? null : hVarV.b();
        if (memberB instanceof Constructor) {
            return (Constructor) memberB;
        }
        return null;
    }

    public static final Field b(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        K0 k0D = j1.d(lVar);
        if (k0D != null) {
            return k0D.m0();
        }
        return null;
    }

    public static final Method c(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        return d(lVar.l0());
    }

    public static final Method d(g gVar) {
        h hVarV;
        AbstractC6492s.i(gVar, "<this>");
        AbstractC8339A abstractC8339AB = j1.b(gVar);
        Member memberB = (abstractC8339AB == null || (hVarV = abstractC8339AB.V()) == null) ? null : hVarV.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Method e(th.h hVar) {
        AbstractC6492s.i(hVar, "<this>");
        return d(hVar.g());
    }

    public static final Type f(p pVar) {
        AbstractC6492s.i(pVar, "<this>");
        Type typeE = ((U0) pVar).E();
        return typeE == null ? w.f(pVar) : typeE;
    }
}
