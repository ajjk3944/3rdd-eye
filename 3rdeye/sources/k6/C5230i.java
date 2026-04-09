package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.K0;
import android.content.ClipData;
import android.content.ClipboardManager;

/* compiled from: DivActionTypedCopyToClipboardHandler.kt */
/* renamed from: k6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5230i implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        ClipData clipData;
        kotlin.jvm.internal.l.f(action, "action");
        if (!(action instanceof AbstractC1192h2.g)) {
            return false;
        }
        K0 k02 = ((AbstractC1192h2.g) action).f8325b.f5559a;
        Object systemService = c0675l.getContext$div_release().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return true;
        }
        if (k02 instanceof K0.a) {
            clipData = new ClipData("Copied text", new String[]{"text/plain"}, new ClipData.Item(((K0.a) k02).f5610b.f5124a.a(dVar)));
        } else {
            if (!(k02 instanceof K0.b)) {
                throw new b9.j();
            }
            clipData = new ClipData("Copied url", new String[]{"text/uri-list"}, new ClipData.Item(((K0.b) k02).f5611b.f5557a.a(dVar)));
        }
        clipboardManager.setPrimaryClip(clipData);
        return true;
    }
}
