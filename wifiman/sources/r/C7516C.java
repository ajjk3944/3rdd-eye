package r;

import T.InterfaceC3551q0;
import T.t1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* renamed from: r.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7516C {

    /* renamed from: a, reason: collision with root package name */
    private final s0 f59440a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f59441b = t1.d(null, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    private C7517a f59442c;

    /* renamed from: r.C$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f59443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7517a f59444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7516C f59445c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f59446d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ H f59447e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7517a c7517a, C7516C c7516c, Object obj, H h10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f59444b = c7517a;
            this.f59445c = c7516c;
            this.f59446d = obj;
            this.f59447e = h10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f59444b, this.f59445c, this.f59446d, this.f59447e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f59443a;
            if (i10 == 0) {
                Yg.v.b(obj);
                if (!AbstractC6492s.d(this.f59444b.k(), this.f59445c.c())) {
                    C7517a c7517a = this.f59444b;
                    Object obj2 = this.f59446d;
                    H h10 = this.f59447e;
                    this.f59443a = 1;
                    if (C7517a.f(c7517a, obj2, h10, null, null, this, 12, null) == objG) {
                        return objG;
                    }
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
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public C7516C(s0 s0Var) {
        this.f59440a = s0Var;
    }

    private final Object b() {
        C7517a c7517a = this.f59442c;
        if (c7517a != null) {
            return c7517a.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c() {
        return this.f59441b.getValue();
    }

    private final void e(Object obj) {
        this.f59441b.setValue(obj);
    }

    public static /* synthetic */ Object g(C7516C c7516c, Object obj, Ii.N n10, H h10, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            h10 = AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
        }
        return c7516c.f(obj, n10, h10);
    }

    public final boolean d() {
        C7517a c7517a;
        return AbstractC6492s.d(c(), b()) && ((c7517a = this.f59442c) == null || !c7517a.p());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:r.a) from 0x0016: IPUT (r0v4 ?? I:r.a), (r14v0 'this' ?? I:r.C A[IMMUTABLE_TYPE, THIS]) r.C.c r.a
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final java.lang.Object f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:r.a) from 0x0016: IPUT (r0v4 ?? I:r.a), (r14v0 'this' ?? I:r.C A[IMMUTABLE_TYPE, THIS]) r.C.c r.a
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
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
}
