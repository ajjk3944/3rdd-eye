package g1;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1759l;

/* compiled from: FragmentTagUsageViolation.kt */
/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4369c extends k {

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f37939c;

    public C4369c(ComponentCallbacksC1759l componentCallbacksC1759l, ViewGroup viewGroup) {
        super(componentCallbacksC1759l, "Attempting to use <fragment> tag to add fragment " + componentCallbacksC1759l + " to container " + viewGroup);
        this.f37939c = viewGroup;
    }
}
