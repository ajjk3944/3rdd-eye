package T;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f3554a;

    public f(Object obj) {
        this.f3554a = (InputContentInfo) obj;
    }

    @Override // T.g
    public final Uri e() {
        return this.f3554a.getContentUri();
    }

    @Override // T.g
    public final void f() {
        this.f3554a.requestPermission();
    }

    @Override // T.g
    public final Uri g() {
        return this.f3554a.getLinkUri();
    }

    @Override // T.g
    public final ClipDescription getDescription() {
        return this.f3554a.getDescription();
    }

    @Override // T.g
    public final Object j() {
        return this.f3554a;
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3554a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
