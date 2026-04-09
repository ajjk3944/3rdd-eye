package g3;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.xz;
import i2.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends i1.m implements n1.o, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public View f24529o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f24530p;

    /* renamed from: q, reason: collision with root package name */
    public final r f24531q = new r(this, 0);

    /* renamed from: r, reason: collision with root package name */
    public final r f24532r = new r(this, 1);

    @Override // i1.m
    public final void f0() {
        ViewTreeObserver viewTreeObserver = i2.k.u(this).getViewTreeObserver();
        this.f24530p = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // i1.m
    public final void h0() {
        ViewTreeObserver viewTreeObserver = this.f24530p;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f24530p = null;
        i2.k.u(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f24529o = null;
    }

    @Override // n1.o
    public final void m(n1.l lVar) {
        lVar.d(false);
        lVar.b(this.f24531q);
        lVar.c(this.f24532r);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z3;
        boolean z10;
        if (i2.k.s(this).f25639o == null) {
            return;
        }
        View viewB = k.b(this);
        n1.h focusOwner = ((j2.r) i2.k.t(this)).getFocusOwner();
        m1 m1VarT = i2.k.t(this);
        if (view == null || view.equals(m1VarT)) {
            z3 = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewB.getParent()) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        }
        if (view2 == null || view2.equals(m1VarT)) {
            z10 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewB.getParent()) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        if (z3 && z10) {
            this.f24529o = view2;
            return;
        }
        if (!z10) {
            if (!z3) {
                this.f24529o = null;
                return;
            }
            this.f24529o = null;
            if (p0().u0().a()) {
                ((xz) focusOwner).d(8, false, false);
                return;
            }
            return;
        }
        this.f24529o = view2;
        n1.s sVarP0 = p0();
        int iOrdinal = sVarP0.u0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            throw new ac.m();
        }
        com.bumptech.glide.f.v(sVarP0);
    }

    public final n1.s p0() {
        if (!this.f25554a.f25565n) {
            f2.a.b("visitLocalDescendants called on an unattached node");
        }
        i1.m mVar = this.f25554a;
        if ((mVar.f25557d & Segment.SHARE_MINIMUM) != 0) {
            boolean z3 = false;
            for (i1.m mVar2 = mVar.f25559f; mVar2 != null; mVar2 = mVar2.f25559f) {
                if ((mVar2.f25556c & Segment.SHARE_MINIMUM) != 0) {
                    i1.m mVarE = mVar2;
                    w0.e eVar = null;
                    while (mVarE != null) {
                        if (mVarE instanceof n1.s) {
                            n1.s sVar = (n1.s) mVarE;
                            if (z3) {
                                return sVar;
                            }
                            z3 = true;
                        } else if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                            int i4 = 0;
                            for (i1.m mVar3 = ((i2.j) mVarE).f25691p; mVar3 != null; mVar3 = mVar3.f25559f) {
                                if ((mVar3.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        mVarE = mVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new w0.e(new i1.m[16]);
                                        }
                                        if (mVarE != null) {
                                            eVar.b(mVarE);
                                            mVarE = null;
                                        }
                                        eVar.b(mVar3);
                                    }
                                }
                            }
                            if (i4 == 1) {
                            }
                        }
                        mVarE = i2.k.e(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }
}
