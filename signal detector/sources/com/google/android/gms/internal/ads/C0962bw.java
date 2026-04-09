package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962bw extends C1125ew {

    /* renamed from: d, reason: collision with root package name */
    public static final C0962bw f13501d = new C0962bw();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.C1125ew
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(C1016cw.f13696c.f13698b).iterator();
        while (it.hasNext()) {
            View view = (View) ((Rv) it.next()).f11080c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C1125ew
    public final void b(boolean z6) {
        Iterator it = Collections.unmodifiableCollection(C1016cw.f13696c.f13697a).iterator();
        while (it.hasNext()) {
            AbstractC1502lw abstractC1502lw = ((Rv) it.next()).f11081d;
            if (abstractC1502lw.f15489b.get() != 0) {
                C1994v2.f17210g.D(abstractC1502lw.c(), "setState", true != z6 ? "backgrounded" : "foregrounded", abstractC1502lw.f15488a);
            }
        }
    }
}
