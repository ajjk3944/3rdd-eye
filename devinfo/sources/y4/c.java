package y4;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f37328a;

    /* renamed from: b, reason: collision with root package name */
    public final ja.c f37329b;

    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        ja.c cVar = new ja.c();
        super(inputConnection, false);
        this.f37328a = editText;
        this.f37329b = cVar;
        if (w4.i.c()) {
            w4.i iVarA = w4.i.a();
            if (iVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            fe.b bVar = iVarA.f36436e;
            bVar.getClass();
            Bundle bundle = editorInfo.extras;
            x4.b bVar2 = (x4.b) ((se.b) bVar.f24017c).f33556a;
            int iA = bVar2.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar2.f446d).getInt(iA + bVar2.f443a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i10) {
        Editable editableText = this.f37328a.getEditableText();
        this.f37329b.getClass();
        return ja.c.y(this, editableText, i4, i10, false) || super.deleteSurroundingText(i4, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i4, int i10) {
        Editable editableText = this.f37328a.getEditableText();
        this.f37329b.getClass();
        return ja.c.y(this, editableText, i4, i10, true) || super.deleteSurroundingTextInCodePoints(i4, i10);
    }
}
