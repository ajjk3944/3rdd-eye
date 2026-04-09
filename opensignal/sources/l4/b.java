package l4;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import kg.r;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f14659a;

    /* renamed from: b, reason: collision with root package name */
    public final ee.f f14660b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        ee.f fVar = new ee.f(14);
        super(inputConnection, false);
        this.f14659a = editText;
        this.f14660b = fVar;
        if (j4.h.c()) {
            j4.h hVarA = j4.h.a();
            if (hVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            df.b bVar = hVarA.f13212e;
            bVar.getClass();
            Bundle bundle = editorInfo.extras;
            k4.b bVar2 = (k4.b) ((r) bVar.f7339c).f14395a;
            int iA = bVar2.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar2.f14040r).getInt(iA + bVar2.f14037a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f14659a.getEditableText();
        this.f14660b.getClass();
        return ee.f.u(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f14659a.getEditableText();
        this.f14660b.getClass();
        return ee.f.u(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
