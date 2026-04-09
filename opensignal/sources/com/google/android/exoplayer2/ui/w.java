package com.google.android.exoplayer2.ui;

import android.text.Html;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4706a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f4706a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
