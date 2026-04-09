package J0;

import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final String f9721a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6839p f9722b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9723c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9724a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public v(String str, InterfaceC6839p interfaceC6839p) {
        this.f9721a = str;
        this.f9722b = interfaceC6839p;
    }

    public final String a() {
        return this.f9721a;
    }

    public final boolean b() {
        return this.f9723c;
    }

    public final Object c(Object obj, Object obj2) {
        return this.f9722b.invoke(obj, obj2);
    }

    public final void d(w wVar, th.l lVar, Object obj) {
        wVar.b(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f9721a;
    }

    public /* synthetic */ v(String str, InterfaceC6839p interfaceC6839p, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? a.f9724a : interfaceC6839p);
    }

    public v(String str, boolean z10) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.f9723c = z10;
    }

    public v(String str, boolean z10, InterfaceC6839p interfaceC6839p) {
        this(str, interfaceC6839p);
        this.f9723c = z10;
    }
}
