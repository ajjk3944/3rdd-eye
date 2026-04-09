package org.kodein.di;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import org.kodein.di.e;
import org.kodein.type.q;
import rj.AbstractC7726l2;
import rj.InterfaceC7733m2;
import rj.InterfaceC7810x2;

/* loaded from: classes4.dex */
public abstract class d {

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f56922a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f56923b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f56924c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, q qVar, Object obj) {
            super(2);
            this.f56922a = cVar;
            this.f56923b = qVar;
            this.f56924c = obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f ctx, String str) {
            AbstractC6492s.i(ctx, "ctx");
            AbstractC6492s.i(str, "<anonymous parameter 1>");
            e eVarY = this.f56922a.d().y();
            q type = ctx.getType();
            AbstractC6492s.g(type, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>");
            return e.b.c(eVarY, new DI.e(type, q.f56966a.b(), this.f56923b, this.f56924c), ctx.getValue(), 0, 4, null).invoke();
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f56925a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f56926b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f56927c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f56928d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f56929e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar, q qVar, q qVar2, Object obj, InterfaceC6824a interfaceC6824a) {
            super(2);
            this.f56925a = cVar;
            this.f56926b = qVar;
            this.f56927c = qVar2;
            this.f56928d = obj;
            this.f56929e = interfaceC6824a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f ctx, String str) {
            AbstractC6492s.i(ctx, "ctx");
            AbstractC6492s.i(str, "<anonymous parameter 1>");
            e eVarY = this.f56925a.d().y();
            q type = ctx.getType();
            AbstractC6492s.g(type, "null cannot be cast to non-null type org.kodein.type.TypeToken<in kotlin.Any>");
            return e.b.a(eVarY, new DI.e(type, this.f56926b, this.f56927c, this.f56928d), ctx.getValue(), 0, 4, null).invoke(this.f56929e.invoke());
        }
    }

    public static final InterfaceC7810x2 a(c cVar, q type, Object obj) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(type, "type");
        cVar.i();
        return new g(null, cVar.I(), new a(cVar, type, obj));
    }

    public static final InterfaceC7810x2 b(c cVar, q argType, q type, Object obj, InterfaceC6824a arg) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(argType, "argType");
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(arg, "arg");
        cVar.i();
        return new g(null, cVar.I(), new b(cVar, argType, type, obj, arg));
    }

    public static final DI c(c cVar, f context, AbstractC7726l2 abstractC7726l2) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(context, "context");
        return new i(cVar, context, abstractC7726l2);
    }

    public static /* synthetic */ DI d(c cVar, f fVar, AbstractC7726l2 abstractC7726l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = cVar.I();
        }
        if ((i10 & 2) != 0) {
            cVar.i();
            abstractC7726l2 = null;
        }
        return c(cVar, fVar, abstractC7726l2);
    }

    public static final f e() {
        return org.kodein.di.b.f56920a.a();
    }

    public static final InterfaceC7733m2 f(c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        return new vj.i(cVar.d().y(), cVar.I());
    }
}
