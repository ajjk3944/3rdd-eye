package g1;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1759l;

/* compiled from: WrongFragmentContainerViolation.kt */
/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f37941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ComponentCallbacksC1759l fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        kotlin.jvm.internal.l.f(fragment, "fragment");
        this.f37941c = viewGroup;
    }
}
