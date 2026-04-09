package c0;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.n1;
import T.o1;
import Yg.J;
import d0.InterfaceC5275g;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4174c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f33589a = 36;

    /* renamed from: c0.c$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4182k f33590a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC4182k interfaceC4182k) {
            super(2);
            this.f33590a = interfaceC4182k;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3551q0 invoke(InterfaceC4184m interfaceC4184m, InterfaceC3551q0 interfaceC3551q0) {
            if (!(interfaceC3551q0 instanceof InterfaceC5275g)) {
                throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
            }
            Object objB = this.f33590a.b(interfaceC4184m, interfaceC3551q0.getValue());
            if (objB == null) {
                return null;
            }
            n1 n1VarD = ((InterfaceC5275g) interfaceC3551q0).d();
            AbstractC6492s.g(n1VarD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return o1.h(objB, n1VarD);
        }
    }

    /* renamed from: c0.c$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4182k f33591a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC4182k interfaceC4182k) {
            super(1);
            this.f33591a = interfaceC4182k;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3551q0 invoke(InterfaceC3551q0 interfaceC3551q0) {
            Object objA;
            if (!(interfaceC3551q0 instanceof InterfaceC5275g)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (interfaceC3551q0.getValue() != null) {
                InterfaceC4182k interfaceC4182k = this.f33591a;
                Object value = interfaceC3551q0.getValue();
                AbstractC6492s.f(value);
                objA = interfaceC4182k.a(value);
            } else {
                objA = null;
            }
            n1 n1VarD = ((InterfaceC5275g) interfaceC3551q0).d();
            AbstractC6492s.g(n1VarD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
            InterfaceC3551q0 interfaceC3551q0H = o1.h(objA, n1VarD);
            AbstractC6492s.g(interfaceC3551q0H, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
            return interfaceC3551q0H;
        }
    }

    /* renamed from: c0.c$c, reason: collision with other inner class name */
    static final class C1171c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4175d f33592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4182k f33593b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC4179h f33594c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33595d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f33596e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object[] f33597f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1171c(C4175d c4175d, InterfaceC4182k interfaceC4182k, InterfaceC4179h interfaceC4179h, String str, Object obj, Object[] objArr) {
            super(0);
            this.f33592a = c4175d;
            this.f33593b = interfaceC4182k;
            this.f33594c = interfaceC4179h;
            this.f33595d = str;
            this.f33596e = obj;
            this.f33597f = objArr;
        }

        public final void a() {
            this.f33592a.i(this.f33593b, this.f33594c, this.f33595d, this.f33596e, this.f33597f);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final String b(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    private static final InterfaceC4182k c(InterfaceC4182k interfaceC4182k) {
        AbstractC6492s.g(interfaceC4182k, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return AbstractC4183l.a(new a(interfaceC4182k), new b(interfaceC4182k));
    }

    public static final InterfaceC3551q0 d(Object[] objArr, InterfaceC4182k interfaceC4182k, String str, InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-202053668, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) e(Arrays.copyOf(objArr, objArr.length), c(interfaceC4182k), str2, interfaceC6824a, interfaceC3540l, i10 & 8064, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC3551q0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:T.l), (r14v9 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final java.lang.Object e(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:T.l), (r14v9 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC4179h interfaceC4179h, Object obj) {
        String strB;
        if (obj == null || interfaceC4179h.a(obj)) {
            return;
        }
        if (obj instanceof InterfaceC5275g) {
            InterfaceC5275g interfaceC5275g = (InterfaceC5275g) obj;
            if (interfaceC5275g.d() == o1.j() || interfaceC5275g.d() == o1.p() || interfaceC5275g.d() == o1.m()) {
                strB = "MutableState containing " + interfaceC5275g.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strB = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strB = b(obj);
        }
        throw new IllegalArgumentException(strB);
    }
}
