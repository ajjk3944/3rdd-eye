package f1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f21043a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21044b;

    /* renamed from: c, reason: collision with root package name */
    public EmojiCompat.f f21045c;

    /* renamed from: d, reason: collision with root package name */
    public int f21046d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f21047e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21048f = true;

    public static class a extends EmojiCompat.f {

        /* renamed from: a, reason: collision with root package name */
        public final Reference f21049a;

        public a(EditText editText) {
            this.f21049a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.f
        public void b() {
            super.b();
            g.b((EditText) this.f21049a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f21043a = editText;
        this.f21044b = z10;
    }

    public static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final EmojiCompat.f a() {
        if (this.f21045c == null) {
            this.f21045c = new a(this.f21043a);
        }
        return this.f21045c;
    }

    public void c(boolean z10) {
        if (this.f21048f != z10) {
            if (this.f21045c != null) {
                EmojiCompat.c().u(this.f21045c);
            }
            this.f21048f = z10;
            if (z10) {
                b(this.f21043a, EmojiCompat.c().e());
            }
        }
    }

    public final boolean d() {
        if (this.f21048f) {
            return (this.f21044b || EmojiCompat.i()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f21043a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = EmojiCompat.c().e();
        if (iE != 0) {
            if (iE == 1) {
                EmojiCompat.c().s((Spannable) charSequence, i10, i10 + i12, this.f21046d, this.f21047e);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        EmojiCompat.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
