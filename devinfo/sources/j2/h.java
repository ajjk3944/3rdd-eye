package j2;

import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f27168a;

    public h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        nk.k.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f27168a = (ClipboardManager) systemService;
    }
}
