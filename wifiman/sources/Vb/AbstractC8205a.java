package vb;

import gg.i;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: vb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8205a {

    /* renamed from: vb.a$a, reason: collision with other inner class name */
    static final class C2253a implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63536a;

        C2253a(InterfaceC6835l interfaceC6835l) {
            this.f63536a = interfaceC6835l;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Object value) {
            AbstractC6492s.i(value, "value");
            Object objInvoke = this.f63536a.invoke(value);
            return objInvoke == null ? i.j0() : i.K0(objInvoke);
        }
    }

    public static final i a(i iVar, InterfaceC6835l f10) {
        AbstractC6492s.i(iVar, "<this>");
        AbstractC6492s.i(f10, "f");
        i iVarP0 = iVar.p0(new C2253a(f10));
        AbstractC6492s.h(iVarP0, "flatMap(...)");
        return iVarP0;
    }
}
