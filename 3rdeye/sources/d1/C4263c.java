package d1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.c;
import c1.C2044b;
import java.nio.ByteBuffer;

/* compiled from: EmojiInputConnection.java */
/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4263c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f37327a;

    /* renamed from: b, reason: collision with root package name */
    public final a f37328b;

    /* compiled from: EmojiInputConnection.java */
    /* renamed from: d1.c$a */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean a(d1.C4263c r7, android.text.Editable r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.C4263c.a.a(d1.c, android.text.Editable, int, int, boolean):boolean");
        }
    }

    public C4263c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        a aVar = new a();
        super(inputConnection, false);
        this.f37327a = editText;
        this.f37328b = aVar;
        if (androidx.emoji2.text.c.f15714k != null) {
            androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
            if (cVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            c.a aVar2 = cVarA.f15719e;
            aVar2.getClass();
            Bundle bundle = editorInfo.extras;
            C2044b c2044b = aVar2.f15724c.f17075a;
            int iA = c2044b.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) c2044b.f4178d).getInt(iA + c2044b.f4175a) : 0);
            Bundle bundle2 = editorInfo.extras;
            aVar2.f15725a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i10) {
        Editable editableText = this.f37327a.getEditableText();
        this.f37328b.getClass();
        return a.a(this, editableText, i, i10, false) || super.deleteSurroundingText(i, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i10) {
        Editable editableText = this.f37327a.getEditableText();
        this.f37328b.getClass();
        return a.a(this, editableText, i, i10, true) || super.deleteSurroundingTextInCodePoints(i, i10);
    }
}
