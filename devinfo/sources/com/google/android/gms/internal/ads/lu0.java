package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lu0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f13631b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13632a = new ArrayList();

    public final void a(View view, xt0 xt0Var) {
        ku0 ku0Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f13631b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f13632a;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                ku0Var = null;
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            ku0Var = (ku0) obj;
            if (ku0Var.f13253a.get() == view) {
                break;
            }
        }
        if (ku0Var == null) {
            arrayList.add(new ku0(view, xt0Var));
        }
    }
}
