package com.bumptech.glide;

import A1.w;
import H1.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class m implements A1.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f6565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6566b;

    public m(n nVar, w wVar) {
        this.f6566b = nVar;
        this.f6565a = wVar;
    }

    @Override // A1.a
    public final void a(boolean z6) {
        if (z6) {
            synchronized (this.f6566b) {
                w wVar = this.f6565a;
                ArrayList arrayListE = p.e((Set) wVar.f141d);
                int size = arrayListE.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListE.get(i);
                    i++;
                    D1.c cVar = (D1.c) obj;
                    if (!cVar.k() && !cVar.g()) {
                        cVar.clear();
                        if (wVar.f140c) {
                            ((HashSet) wVar.f139b).add(cVar);
                        } else {
                            cVar.j();
                        }
                    }
                }
            }
        }
    }
}
