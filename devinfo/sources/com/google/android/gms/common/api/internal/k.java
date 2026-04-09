package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import androidx.lifecycle.o0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j2.i1;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9095a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9096b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9097c;

    /* renamed from: d, reason: collision with root package name */
    public int f9098d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9099e;

    public void a(int i4) {
        switch (this.f9095a) {
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9096b;
                WeakReference weakReference = sideSheetBehavior.f20558p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f9098d = i4;
                    if (!this.f9097c) {
                        ((View) sideSheetBehavior.f20558p.get()).postOnAnimation((o0) this.f9099e);
                        this.f9097c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f9096b;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f9098d = i4;
                    if (!this.f9097c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((b5.o) this.f9099e);
                        this.f9097c = true;
                        break;
                    }
                }
                break;
        }
    }

    public k(k kVar, nb.d[] dVarArr, boolean z3, int i4) {
        this.f9095a = 1;
        this.f9099e = kVar;
        this.f9096b = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z3) {
            z10 = true;
        }
        this.f9097c = z10;
        this.f9098d = i4;
    }

    public k(SideSheetBehavior sideSheetBehavior) {
        this.f9095a = 2;
        this.f9096b = sideSheetBehavior;
        this.f9099e = new o0(22, this);
    }

    public k(BottomSheetBehavior bottomSheetBehavior) {
        this.f9095a = 4;
        this.f9096b = bottomSheetBehavior;
        this.f9099e = new b5.o(29, this);
    }

    public k(Context context, j2.n nVar) {
        this.f9095a = 3;
        this.f9099e = nVar;
        this.f9098d = 0;
        this.f9096b = new GestureDetector(context, new i1(this));
    }
}
