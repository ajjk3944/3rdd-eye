package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.g;
import com.google.gson.m;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements o {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.b f23409b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.b f23410c;

    /* renamed from: d, reason: collision with root package name */
    public final Excluder f23411d;

    /* renamed from: e, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f23412e;

    /* renamed from: f, reason: collision with root package name */
    public final C5.b f23413f = C5.b.f922a;

    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public final g<T> f23414a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f23415b;

        public Adapter(g gVar, LinkedHashMap linkedHashMap) {
            this.f23414a = gVar;
            this.f23415b = linkedHashMap;
        }

        @Override // com.google.gson.TypeAdapter
        public final T b(E5.a aVar) throws IOException {
            if (aVar.C0() == E5.b.NULL) {
                aVar.v0();
                return null;
            }
            T tN = this.f23414a.n();
            try {
                aVar.c();
                while (aVar.B()) {
                    a aVar2 = (a) this.f23415b.get(aVar.q0());
                    if (aVar2 == null || !aVar2.f23418c) {
                        aVar.Q0();
                    } else {
                        aVar2.a(aVar, tN);
                    }
                }
                aVar.l();
                return tN;
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (IllegalStateException e10) {
                throw new m(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.B();
                return;
            }
            cVar.d();
            try {
                for (a aVar : this.f23415b.values()) {
                    if (aVar.c(t10)) {
                        cVar.n(aVar.f23416a);
                        aVar.b(cVar, t10);
                    }
                }
                cVar.l();
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f23416a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f23417b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f23418c;

        public a(String str, boolean z10, boolean z11) {
            this.f23416a = str;
            this.f23417b = z10;
            this.f23418c = z11;
        }

        public abstract void a(E5.a aVar, Object obj) throws IllegalAccessException, IOException;

        public abstract void b(c cVar, Object obj) throws IllegalAccessException, IOException;

        public abstract boolean c(Object obj) throws IllegalAccessException, IOException;
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.b bVar, com.google.gson.b bVar2, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f23409b = bVar;
        this.f23410c = bVar2;
        this.f23411d = excluder;
        this.f23412e = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // com.google.gson.o
    public final <T> com.google.gson.TypeAdapter<T> a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
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
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public final boolean b(Field field, boolean z10) {
        Class<?> type = field.getType();
        Excluder excluder = this.f23411d;
        if (excluder.b(type) || excluder.d(type, z10) || (field.getModifiers() & 136) != 0 || field.isSynthetic()) {
            return false;
        }
        Class<?> type2 = field.getType();
        if (!Enum.class.isAssignableFrom(type2) && (type2.isAnonymousClass() || type2.isLocalClass())) {
            return false;
        }
        List<com.google.gson.a> list = z10 ? excluder.f23373b : excluder.f23374c;
        if (list.isEmpty()) {
            return true;
        }
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return false;
            }
        }
        return true;
    }
}
