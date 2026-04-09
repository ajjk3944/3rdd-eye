package com.zipoapps.premiumhelper.ui.preferences;

import B0.g;
import D0.a;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.preference.ListPreference;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import i8.C4461a;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import n1.h;
import x8.C5781a;
import x8.C5782b;

/* compiled from: PremiumListPreference.kt */
/* loaded from: classes3.dex */
public final class PremiumListPreference extends ListPreference {

    /* renamed from: Y, reason: collision with root package name */
    public final C5781a f37069Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f37069Y = new C5781a(context, attributeSet);
    }

    @Override // androidx.preference.ListPreference
    public final CharSequence[] B() {
        ArrayList arrayList;
        CharSequence[] charSequenceArr = this.f16224T;
        l.e(charSequenceArr, "getEntries(...)");
        C5781a c5781a = this.f37069Y;
        c5781a.getClass();
        if (C5782b.b() || ((arrayList = c5781a.f47807k) != null && arrayList.isEmpty())) {
            return charSequenceArr;
        }
        int i = c5781a.f47810c;
        if (i == -1) {
            i = R.drawable.ic_preference_lock;
        }
        Context context = c5781a.f47806j;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = g.f359a;
        Drawable drawableA = g.a.a(resources, i, theme);
        if (drawableA == null) {
            throw new IllegalStateException("Cannot load icon");
        }
        drawableA.setBounds(0, 0, 48, 48);
        TextView textView = c5781a.f47808a;
        if (textView != null) {
            ColorStateList colorStateList = c5781a.f47813f;
            a.C0009a.g(drawableA, colorStateList != null ? colorStateList.getDefaultColor() : textView.getCurrentTextColor());
        }
        ArrayList arrayList2 = new ArrayList(charSequenceArr.length);
        int length = charSequenceArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CharSequence charSequence = charSequenceArr[i10];
            int i12 = i11 + 1;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(i11))) {
                SpannableString spannableString = new SpannableString(((Object) charSequence) + "   ");
                spannableString.setSpan(new ImageSpan(drawableA, 1), spannableString.length() + (-2), spannableString.length() - 1, 33);
                charSequence = spannableString;
            }
            arrayList2.add(charSequence);
            i10++;
            i11 = i12;
        }
        return (CharSequence[]) arrayList2.toArray(new CharSequence[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    @Override // androidx.preference.Preference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r6) {
        /*
            r5 = this;
            x8.a r0 = r5.f37069Y
            r0.getClass()
            boolean r1 = x8.C5782b.b()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lf
        Ld:
            r6 = r2
            goto L28
        Lf:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.l.d(r6, r1)
            int r6 = r5.A(r6)
            java.util.ArrayList r0 = r0.f47807k
            if (r0 == 0) goto L27
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r0.contains(r6)
            if (r6 != r2) goto L27
            goto Ld
        L27:
            r6 = r3
        L28:
            if (r6 != 0) goto L54
            android.content.Context r0 = r5.f16248b
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L54
            com.zipoapps.premiumhelper.e$a r0 = com.zipoapps.premiumhelper.e.f37006D
            r0.getClass()
            com.zipoapps.premiumhelper.e r0 = com.zipoapps.premiumhelper.e.a.a()
            i8.a$a r1 = i8.C4461a.EnumC0466a.PREFERENCE
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "_"
            r4.append(r1)
            java.lang.String r1 = r5.f16257l
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.zipoapps.premiumhelper.e.k(r0, r1)
        L54:
            if (r6 == 0) goto L57
            return r2
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.ui.preferences.PremiumListPreference.a(java.lang.String):boolean");
    }

    @Override // androidx.preference.Preference
    public final void l(h holder) {
        l.f(holder, "holder");
        super.l(holder);
        this.f37069Y.a(holder);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void m() {
        ArrayList arrayList;
        C5781a c5781a = this.f37069Y;
        c5781a.getClass();
        if (C5782b.b() || ((arrayList = c5781a.f47807k) != null && (!arrayList.isEmpty()))) {
            super.m();
            return;
        }
        if (this.f16248b instanceof Activity) {
            e.f37006D.getClass();
            e.k(e.a.a(), C4461a.EnumC0466a.PREFERENCE + "_" + this.f16257l);
        }
    }
}
