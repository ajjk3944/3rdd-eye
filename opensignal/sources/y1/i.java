package y1;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class i implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f25704a;

    public i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        br.l.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f25704a = (ClipboardManager) systemService;
    }
}
