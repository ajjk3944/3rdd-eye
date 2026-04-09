package q0;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f22940b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f22941a = new LinkedHashMap();

    public final void a(L l2) {
        String strW = com.bumptech.glide.d.w(l2.getClass());
        if (strW.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f22941a;
        L l6 = (L) linkedHashMap.get(strW);
        if (q5.i.a(l6, l2)) {
            return;
        }
        if (l6 != null && l6.f22939b) {
            throw new IllegalStateException(("Navigator " + l2 + " is replacing an already attached " + l6).toString());
        }
        if (!l2.f22939b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + l2 + " is already attached to another NavController").toString());
    }

    public final L b(String str) {
        q5.i.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        L l2 = (L) this.f22941a.get(str);
        if (l2 != null) {
            return l2;
        }
        throw new IllegalStateException(A.f.m("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
