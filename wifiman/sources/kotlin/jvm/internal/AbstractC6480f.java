package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import lh.C6597b;

/* renamed from: kotlin.jvm.internal.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6480f implements th.c, Serializable {
    public static final Object NO_RECEIVER = a.f51715a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient th.c reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.f$a */
    private static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private static final a f51715a = new a();

        private a() {
        }
    }

    public AbstractC6480f() {
        this(NO_RECEIVER);
    }

    @Override // th.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // th.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public th.c compute() {
        th.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        th.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    protected abstract th.c computeReflected();

    @Override // th.InterfaceC8116b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // th.c
    public String getName() {
        return this.name;
    }

    public th.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? O.c(cls) : O.b(cls);
    }

    @Override // th.c
    public List<th.k> getParameters() {
        return getReflected().getParameters();
    }

    protected th.c getReflected() {
        th.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new C6597b();
    }

    @Override // th.c
    public th.p getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // th.c
    public List<th.q> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // th.c
    public th.t getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // th.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // th.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // th.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    protected AbstractC6480f(Object obj) {
        this(obj, null, null, null, false);
    }

    protected AbstractC6480f(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
