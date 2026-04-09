package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hx extends p71 {
    public final ViewGroup g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(iw iwVar, ViewGroup viewGroup, int i) {
        super(iwVar, "Attempting to use <fragment> tag to add fragment " + iwVar + " to container " + viewGroup);
        switch (i) {
            case 1:
                i30.m(iwVar, "fragment");
                super(iwVar, "Attempting to add fragment " + iwVar + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.g = viewGroup;
                break;
            default:
                this.g = viewGroup;
                break;
        }
    }
}
