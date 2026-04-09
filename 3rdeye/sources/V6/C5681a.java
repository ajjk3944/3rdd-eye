package v6;

import kotlin.jvm.internal.l;
import y9.n;
import y9.q;

/* compiled from: DivImageAssetUrlModifier.kt */
/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5681a implements InterfaceC5682b {
    @Override // v6.InterfaceC5682b
    public final String a(String imageUrl) {
        l.f(imageUrl, "imageUrl");
        return n.a0(imageUrl, "divkit-asset", false) ? "file:///android_asset/divkit/".concat(q.n0(imageUrl, "divkit-asset://")) : imageUrl;
    }
}
