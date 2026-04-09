package com.applovin.impl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class vc {
    public static /* synthetic */ String a(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i10 = 1; i10 < charSequenceArr.length; i10++) {
                sb.append(charSequence);
                sb.append(charSequenceArr[i10]);
            }
        }
        return sb.toString();
    }
}
