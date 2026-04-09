package com.bumptech.glide;

import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements m8.a {

    /* renamed from: a, reason: collision with root package name */
    public final i4 f6553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f6554b;

    public o(p pVar, i4 i4Var) {
        this.f6554b = pVar;
        this.f6553a = i4Var;
    }

    @Override // m8.a
    public final void a(boolean z3) {
        if (z3) {
            synchronized (this.f6554b) {
                i4 i4Var = this.f6553a;
                ArrayList arrayListE = t8.m.e((Set) i4Var.f19782c);
                int size = arrayListE.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayListE.get(i4);
                    i4++;
                    p8.c cVar = (p8.c) obj;
                    if (!cVar.b() && !cVar.f()) {
                        cVar.clear();
                        if (i4Var.f19781b) {
                            ((HashSet) i4Var.f19783d).add(cVar);
                        } else {
                            cVar.g();
                        }
                    }
                }
            }
        }
    }
}
