package w3;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f24193a;

    public e(Object obj) {
        this.f24193a = (InputContentInfo) obj;
    }

    @Override // w3.f
    public final Uri a() {
        return this.f24193a.getContentUri();
    }

    @Override // w3.f
    public final void c() {
        this.f24193a.requestPermission();
    }

    @Override // w3.f
    public final ClipDescription getDescription() {
        return this.f24193a.getDescription();
    }

    @Override // w3.f
    public final Uri j() {
        return this.f24193a.getLinkUri();
    }

    @Override // w3.f
    public final Object n() {
        return this.f24193a;
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f24193a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
