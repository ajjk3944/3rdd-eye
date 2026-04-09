package T1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f21361a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21362b;

    /* renamed from: c, reason: collision with root package name */
    private f.AbstractC1100f f21363c;

    /* renamed from: d, reason: collision with root package name */
    private int f21364d = MPv3.MAX_MESSAGE_ID;

    /* renamed from: e, reason: collision with root package name */
    private int f21365e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21366f = true;

    private static class a extends f.AbstractC1100f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f21367a;

        a(EditText editText) {
            this.f21367a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC1100f
        public void b() {
            super.b();
            g.b((EditText) this.f21367a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f21361a = editText;
        this.f21362b = z10;
    }

    private f.AbstractC1100f a() {
        if (this.f21363c == null) {
            this.f21363c = new a(this.f21361a);
        }
        return this.f21363c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().r(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f21366f && (this.f21362b || androidx.emoji2.text.f.k())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f21366f != z10) {
            if (this.f21363c != null) {
                androidx.emoji2.text.f.c().w(this.f21363c);
            }
            this.f21366f = z10;
            if (z10) {
                b(this.f21361a, androidx.emoji2.text.f.c().g());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f21361a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iG = androidx.emoji2.text.f.c().g();
        if (iG != 0) {
            if (iG == 1) {
                androidx.emoji2.text.f.c().u((Spannable) charSequence, i10, i10 + i12, this.f21364d, this.f21365e);
                return;
            } else if (iG != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().v(a());
    }
}
