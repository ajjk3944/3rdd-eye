package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.gw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234gw {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f14398b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14399a = new ArrayList();

    public final void a(View view, Tv tv) {
        C1180fw c1180fw;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f14398b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f14399a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1180fw = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            c1180fw = (C1180fw) obj;
            if (c1180fw.f14175a.get() == view) {
                break;
            }
        }
        if (c1180fw == null) {
            arrayList.add(new C1180fw(view, tv));
        }
    }
}
