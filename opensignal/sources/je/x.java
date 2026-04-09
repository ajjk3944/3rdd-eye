package je;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p.q0;

/* loaded from: classes.dex */
public final class x extends u3.b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f13701d;

    public x(TextInputLayout textInputLayout) {
        this.f13701d = textInputLayout;
    }

    @Override // u3.b
    public final void d(View view, v3.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f23838a;
        this.f23147a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f13701d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z10 = textInputLayout.R0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z11 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        v vVar = textInputLayout.f5744d;
        q0 q0Var = vVar.f13693d;
        if (q0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(q0Var);
            accessibilityNodeInfo.setTraversalAfter(q0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(vVar.f13695r);
        }
        if (!zIsEmpty) {
            cVar.m(text);
        } else if (!TextUtils.isEmpty(string)) {
            cVar.m(string);
            if (!z10 && placeholderText != null) {
                cVar.m(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            cVar.m(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 26) {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                cVar.m(string);
            } else if (i10 >= 26) {
                accessibilityNodeInfo.setHintText(string);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", string);
            }
            if (i10 >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                cVar.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z11) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        q0 q0Var2 = textInputLayout.G.f13680y;
        if (q0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(q0Var2);
        }
        textInputLayout.f5748g.b().m(cVar);
    }

    @Override // u3.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f13701d.f5748g.b().n(accessibilityEvent);
    }
}
