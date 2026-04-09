package ha;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class c implements InterfaceC5970a {

    /* renamed from: a, reason: collision with root package name */
    private final ClipboardManager f48523a;

    public c(Context context) {
        AbstractC6492s.i(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("clipboard");
        this.f48523a = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(CharSequence charSequence) {
        return "Read clipboard content: '" + ((Object) charSequence) + "'";
    }

    @Override // ha.InterfaceC5970a
    public String a() {
        ClipData primaryClip;
        ClipData.Item itemAt;
        ClipboardManager clipboardManager = this.f48523a;
        final CharSequence text = (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || (itemAt = primaryClip.getItemAt(0)) == null) ? null : itemAt.getText();
        S9.a.d(new InterfaceC6824a() { // from class: ha.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return c.c(text);
            }
        });
        if (text != null) {
            return text.toString();
        }
        return null;
    }
}
