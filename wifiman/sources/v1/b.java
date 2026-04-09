package V1;

import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22967a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static c f22968b = c.f22970d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: V1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0839b {
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f22969c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final c f22970d = new c(d0.e(), null, U.h());

        /* renamed from: a, reason: collision with root package name */
        private final Set f22971a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f22972b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c(Set flags, InterfaceC0839b interfaceC0839b, Map allowedViolations) {
            AbstractC6492s.i(flags, "flags");
            AbstractC6492s.i(allowedViolations, "allowedViolations");
            this.f22971a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f22972b = linkedHashMap;
        }

        public final Set a() {
            return this.f22971a;
        }

        public final InterfaceC0839b b() {
            return null;
        }

        public final Map c() {
            return this.f22972b;
        }
    }

    private b() {
    }

    private final c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.a0()) {
                w wVarG = fragment.G();
                AbstractC6492s.h(wVarG, "declaringFragment.parentFragmentManager");
                if (wVarG.x0() != null) {
                    c cVarX0 = wVarG.x0();
                    AbstractC6492s.f(cVarX0);
                    return cVarX0;
                }
            }
            fragment = fragment.F();
        }
        return f22968b;
    }

    private final void c(c cVar, final Violation violation) {
        Fragment fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            j(fragment, new Runnable() { // from class: V1.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, Violation violation) {
        AbstractC6492s.i(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(Violation violation) {
        if (w.E0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    public static final void f(Fragment fragment, String previousFragmentId) {
        AbstractC6492s.i(fragment, "fragment");
        AbstractC6492s.i(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        b bVar = f22967a;
        bVar.e(fragmentReuseViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_REUSE) && bVar.k(cVarB, fragment.getClass(), fragmentReuseViolation.getClass())) {
            bVar.c(cVarB, fragmentReuseViolation);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        AbstractC6492s.i(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        b bVar = f22967a;
        bVar.e(fragmentTagUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && bVar.k(cVarB, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            bVar.c(cVarB, fragmentTagUsageViolation);
        }
    }

    public static final void h(Fragment fragment) {
        AbstractC6492s.i(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        b bVar = f22967a;
        bVar.e(getTargetFragmentUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.k(cVarB, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            bVar.c(cVarB, getTargetFragmentUsageViolation);
        }
    }

    public static final void i(Fragment fragment, ViewGroup container) {
        AbstractC6492s.i(fragment, "fragment");
        AbstractC6492s.i(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        b bVar = f22967a;
        bVar.e(wrongFragmentContainerViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && bVar.k(cVarB, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            bVar.c(cVarB, wrongFragmentContainerViolation);
        }
    }

    private final void j(Fragment fragment, Runnable runnable) {
        if (!fragment.a0()) {
            runnable.run();
            return;
        }
        Handler handlerH = fragment.G().r0().h();
        AbstractC6492s.h(handlerH, "fragment.parentFragmentManager.host.handler");
        if (AbstractC6492s.d(handlerH.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerH.post(runnable);
        }
    }

    private final boolean k(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC6492s.d(cls2.getSuperclass(), Violation.class) || !AbstractC3689v.f0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
