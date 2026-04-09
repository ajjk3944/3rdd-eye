package t0;

import android.annotation.SuppressLint;
import android.content.Context;
import g0.C4356c;

/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5592a {
    public static String a(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C4356c.h(i, "?");
        }
    }
}
