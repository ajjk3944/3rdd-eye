package g4;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f24540a;

    public e(Object obj) {
        this.f24540a = (InputContentInfo) obj;
    }

    @Override // g4.f
    public final Uri d() {
        return this.f24540a.getContentUri();
    }

    @Override // g4.f
    public final void e() {
        this.f24540a.requestPermission();
    }

    @Override // g4.f
    public final Uri f() {
        return this.f24540a.getLinkUri();
    }

    @Override // g4.f
    public final ClipDescription getDescription() {
        return this.f24540a.getDescription();
    }

    @Override // g4.f
    public final Object h() {
        return this.f24540a;
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f24540a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
