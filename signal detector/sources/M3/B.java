package M3;

import R.C0175b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class B extends C0175b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f2828d;

    public B(TextInputLayout textInputLayout) {
        this.f2828d = textInputLayout;
    }

    @Override // R.C0175b
    public final void d(View view, S.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f3446a;
        this.f3302a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f2828d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z6 = textInputLayout.f18509J0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z7 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        y yVar = textInputLayout.f18531b;
        AppCompatTextView appCompatTextView = yVar.f2948b;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(yVar.f2950d);
        }
        if (!zIsEmpty) {
            dVar.l(text);
        } else if (!TextUtils.isEmpty(string)) {
            dVar.l(string);
            if (!z6 && placeholderText != null) {
                dVar.l(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            dVar.l(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                dVar.l(string);
            } else if (i >= 26) {
                accessibilityNodeInfo.setHintText(string);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                dVar.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z7) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.f18547k.f2930y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f18532c.b().n(dVar);
    }

    @Override // R.C0175b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f2828d.f18532c.b().o(accessibilityEvent);
    }
}
