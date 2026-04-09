package androidx.compose.ui.platform;

import L0.C3174d;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: androidx.compose.ui.platform.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3931k implements InterfaceC3923h0 {

    /* renamed from: a, reason: collision with root package name */
    private final ClipboardManager f29409a;

    public C3931k(ClipboardManager clipboardManager) {
        this.f29409a = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3923h0
    public C3174d a() {
        ClipData primaryClip = this.f29409a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return AbstractC3934l.a(itemAt != null ? itemAt.getText() : null);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3923h0
    public void b(C3174d c3174d) {
        this.f29409a.setPrimaryClip(ClipData.newPlainText("plain text", AbstractC3934l.b(c3174d)));
    }

    @Override // androidx.compose.ui.platform.InterfaceC3923h0
    public boolean c() {
        ClipDescription primaryClipDescription = this.f29409a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3931k(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }
}
