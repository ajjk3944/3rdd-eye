package c5;

import android.view.ViewGroup;
import b5.z;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2760b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z zVar, ViewGroup viewGroup, int i4) {
        super(zVar, "Attempting to use <fragment> tag to add fragment " + zVar + " to container " + viewGroup);
        switch (i4) {
            case 1:
                k.e(zVar, "fragment");
                super(zVar, "Attempting to add fragment " + zVar + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f2760b = viewGroup;
                break;
            default:
                this.f2760b = viewGroup;
                break;
        }
    }
}
