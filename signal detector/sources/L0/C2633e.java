package l0;

import android.view.ViewGroup;
import k0.AbstractComponentCallbacksC2617v;
import q5.i;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2633e extends AbstractC2634f {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f21810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2633e(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, ViewGroup viewGroup, int i) {
        super(abstractComponentCallbacksC2617v, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC2617v + " to container " + viewGroup);
        switch (i) {
            case 1:
                i.e(abstractComponentCallbacksC2617v, "fragment");
                super(abstractComponentCallbacksC2617v, "Attempting to add fragment " + abstractComponentCallbacksC2617v + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f21810b = viewGroup;
                break;
            default:
                this.f21810b = viewGroup;
                break;
        }
    }
}
