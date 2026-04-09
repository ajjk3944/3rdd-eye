package g1;

import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.x;
import java.util.LinkedHashMap;

/* compiled from: FragmentStrictMode.kt */
/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4368b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0457b f37937a = C0457b.f37938a;

    /* compiled from: FragmentStrictMode.kt */
    /* renamed from: g1.b$a */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    /* renamed from: g1.b$b, reason: collision with other inner class name */
    public static final class C0457b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0457b f37938a;

        static {
            C0457b c0457b = new C0457b();
            new LinkedHashMap();
            f37938a = c0457b;
        }
    }

    public static C0457b a(ComponentCallbacksC1759l componentCallbacksC1759l) {
        while (componentCallbacksC1759l != null) {
            if (componentCallbacksC1759l.isAdded()) {
                kotlin.jvm.internal.l.e(componentCallbacksC1759l.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            componentCallbacksC1759l = componentCallbacksC1759l.getParentFragment();
        }
        return f37937a;
    }

    public static void b(k kVar) {
        if (x.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(kVar.f37940b.getClass().getName()), kVar);
        }
    }

    public static final void c(ComponentCallbacksC1759l fragment, String previousFragmentId) {
        kotlin.jvm.internal.l.f(fragment, "fragment");
        kotlin.jvm.internal.l.f(previousFragmentId, "previousFragmentId");
        b(new C4367a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
        a aVar = a.DETECT_FRAGMENT_REUSE;
    }
}
