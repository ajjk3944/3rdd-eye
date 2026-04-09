package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class y4 extends Exception {
    public final Status f;

    /* JADX WARN: Illegal instructions before constructor call */
    public y4(Status status) {
        int i = status.f;
        String str = status.g;
        super(i + ": " + (str == null ? "" : str));
        this.f = status;
    }
}
