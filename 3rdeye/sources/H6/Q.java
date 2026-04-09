package H6;

import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1790x;
import b9.C1992A;
import c9.C2079C;
import java.util.HashMap;
import java.util.Set;
import o6.C5428e;

/* compiled from: ReleaseManager.kt */
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final C5428e f2100a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<InterfaceC1790x, Set<C0675l>> f2101b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final Object f2102c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final P f2103d = new P(this, 0);

    /* compiled from: ReleaseManager.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2104a;

        static {
            int[] iArr = new int[AbstractC1781n.a.values().length];
            try {
                iArr[AbstractC1781n.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2104a = iArr;
        }
    }

    public Q(C5428e c5428e) {
        this.f2100a = c5428e;
    }

    public final Object a(InterfaceC1790x interfaceC1790x, C0675l c0675l) {
        Object objValueOf;
        synchronized (this.f2102c) {
            try {
                if (this.f2101b.containsKey(interfaceC1790x)) {
                    Set<C0675l> set = this.f2101b.get(interfaceC1790x);
                    objValueOf = set != null ? Boolean.valueOf(set.add(c0675l)) : null;
                } else {
                    this.f2101b.put(interfaceC1790x, C2079C.b(c0675l));
                    interfaceC1790x.getLifecycle().addObserver(this.f2103d);
                    objValueOf = C1992A.f18074a;
                }
            } finally {
            }
        }
        return objValueOf;
    }
}
