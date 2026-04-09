package h0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import b4.C0344i;
import f0.C2321f;
import g0.C2329b;
import java.nio.ByteBuffer;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2354d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f20448a;

    /* renamed from: b, reason: collision with root package name */
    public final C0344i f20449b;

    public C2354d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0344i c0344i = new C0344i(15);
        super(inputConnection, false);
        this.f20448a = editText;
        this.f20449b = c0344i;
        if (f0.j.f19988k != null) {
            f0.j jVarA = f0.j.a();
            if (jVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C2321f c2321f = jVarA.f19993e;
            c2321f.getClass();
            Bundle bundle = editorInfo.extras;
            C2329b c2329b = (C2329b) c2321f.f19986c.f5896b;
            int iA = c2329b.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) c2329b.f3262d).getInt(iA + c2329b.f3259a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i3) {
        Editable editableText = this.f20448a.getEditableText();
        this.f20449b.getClass();
        return C0344i.u(this, editableText, i, i3, false) || super.deleteSurroundingText(i, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i3) {
        Editable editableText = this.f20448a.getEditableText();
        this.f20449b.getClass();
        return C0344i.u(this, editableText, i, i3, true) || super.deleteSurroundingTextInCodePoints(i, i3);
    }
}
