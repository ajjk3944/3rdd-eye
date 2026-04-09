package F;

import T.InterfaceC3540l;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6533i;
import l0.C6537m;
import m0.AbstractC6713l0;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7036c;
import o0.InterfaceC7039f;
import r.AbstractC7535j;
import r.InterfaceC7533i;
import r.T;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC7533i f4937a = AbstractC7535j.e(AbstractC7535j.f(b.f4950a), null, 0, 6, null);

    /* renamed from: b, reason: collision with root package name */
    private static final float f4938b = Y0.h.j(2);

    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f4939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f4940b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ R0.Q f4941c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ R0.H f4942d;

        /* renamed from: F.V$a$a, reason: collision with other inner class name */
        static final class C0205a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f4943a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ I.G f4944b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0205a(I.G g10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f4944b = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0205a(this.f4944b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f4943a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    I.G g10 = this.f4944b;
                    this.f4943a = 1;
                    if (g10.f(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0205a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I.G f4945a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0.H f4946b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0.Q f4947c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ E f4948d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC6713l0 f4949e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(I.G g10, R0.H h10, R0.Q q10, E e10, AbstractC6713l0 abstractC6713l0) {
                super(1);
                this.f4945a = g10;
                this.f4946b = h10;
                this.f4947c = q10;
                this.f4948d = e10;
                this.f4949e = abstractC6713l0;
            }

            public final void a(InterfaceC7036c interfaceC7036c) {
                C6533i c6533i;
                L0.M mF;
                interfaceC7036c.X1();
                float fD = this.f4945a.d();
                if (fD == 0.0f) {
                    return;
                }
                int iB = this.f4946b.b(L0.S.n(this.f4947c.h()));
                j0 j0VarJ = this.f4948d.j();
                if (j0VarJ == null || (mF = j0VarJ.f()) == null || (c6533i = mF.e(iB)) == null) {
                    c6533i = new C6533i(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fD1 = interfaceC7036c.d1(V.b());
                float f10 = fD1 / 2;
                float fC = AbstractC7978m.c(AbstractC7978m.f(c6533i.k() + f10, C6537m.i(interfaceC7036c.c()) - f10), f10);
                InterfaceC7039f.i0(interfaceC7036c, this.f4949e, AbstractC6532h.a(fC, c6533i.n()), AbstractC6532h.a(fC, c6533i.e()), fD1, 0, null, fD, null, 0, 432, null);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC7036c) obj);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC6713l0 abstractC6713l0, E e10, R0.Q q10, R0.H h10) {
            super(3);
            this.f4939a = abstractC6713l0;
            this.f4940b = e10;
            this.f4941c = q10;
            this.f4942d = h10;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v15 ??, still in use, count: 1, list:
              (r11v15 ?? I:java.lang.Object) from 0x00d3: INVOKE (r10v0 ?? I:T.l), (r11v15 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public final androidx.compose.ui.e a(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v15 ??, still in use, count: 1, list:
              (r11v15 ?? I:java.lang.Object) from 0x00d3: INVOKE (r10v0 ?? I:T.l), (r11v15 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
            */

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4950a = new b();

        b() {
            super(1);
        }

        public final void a(T.b bVar) {
            bVar.d(1000);
            Float fValueOf = Float.valueOf(1.0f);
            bVar.f(fValueOf, 0);
            bVar.f(fValueOf, 499);
            Float fValueOf2 = Float.valueOf(0.0f);
            bVar.f(fValueOf2, 500);
            bVar.f(fValueOf2, 999);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((T.b) obj);
            return Yg.J.f24997a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, E e10, R0.Q q10, R0.H h10, AbstractC6713l0 abstractC6713l0, boolean z10) {
        return z10 ? androidx.compose.ui.c.c(eVar, null, new a(abstractC6713l0, e10, q10, h10), 1, null) : eVar;
    }

    public static final float b() {
        return f4938b;
    }
}
