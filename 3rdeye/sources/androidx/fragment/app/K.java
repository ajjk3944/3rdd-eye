package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class K implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15815c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J f15817e;

    public K(J j4, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f15817e = j4;
        this.f15813a = obj;
        this.f15814b = arrayList;
        this.f15815c = obj2;
        this.f15816d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        J j4 = this.f15817e;
        Object obj = this.f15813a;
        if (obj != null) {
            j4.t(obj, this.f15814b, null);
        }
        Object obj2 = this.f15815c;
        if (obj2 != null) {
            j4.t(obj2, this.f15816d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
