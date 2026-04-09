package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import o9.C5435a;
import w9.InterfaceC5747b;
import w9.InterfaceC5749d;

/* compiled from: CallableReference.java */
/* loaded from: classes3.dex */
public abstract class c implements InterfaceC5747b, Serializable {
    public static final Object NO_RECEIVER = a.f43649b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC5747b reflected;
    private final String signature;

    /* compiled from: CallableReference.java */
    public static class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final a f43649b = new a();
    }

    public c() {
        this(NO_RECEIVER);
    }

    @Override // w9.InterfaceC5747b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // w9.InterfaceC5747b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC5747b compute() {
        InterfaceC5747b interfaceC5747b = this.reflected;
        if (interfaceC5747b != null) {
            return interfaceC5747b;
        }
        InterfaceC5747b interfaceC5747bComputeReflected = computeReflected();
        this.reflected = interfaceC5747bComputeReflected;
        return interfaceC5747bComputeReflected;
    }

    public abstract InterfaceC5747b computeReflected();

    @Override // w9.InterfaceC5746a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC5749d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return x.a(cls);
        }
        x.f43661a.getClass();
        return new o(cls);
    }

    @Override // w9.InterfaceC5747b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC5747b getReflected() {
        InterfaceC5747b interfaceC5747bCompute = compute();
        if (interfaceC5747bCompute != this) {
            return interfaceC5747bCompute;
        }
        throw new C5435a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // w9.InterfaceC5747b
    public w9.j getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // w9.InterfaceC5747b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // w9.InterfaceC5747b
    public w9.m getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // w9.InterfaceC5747b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // w9.InterfaceC5747b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // w9.InterfaceC5747b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // w9.InterfaceC5747b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public c(Object obj) {
        this(obj, null, null, null, false);
    }

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
