package am;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import bf.n;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.material.button.MaterialButton;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.goldstar.onboarding.ui.ProgressStepsView;
import java.util.Objects;
import kotlin.Metadata;
import o4.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lam/f;", "Lml/b;", "Lzl/a;", "Lzl/e;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends ml.b<zl.a, zl.e> {
    public final q A0;
    public final q B0;

    /* renamed from: w0, reason: collision with root package name */
    public k f865w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Object f866x0 = kc.f.E(lq.j.NONE, new ah.d(this, 1, new e(this, 1)));

    /* renamed from: y0, reason: collision with root package name */
    public cj.a f867y0;

    /* renamed from: z0, reason: collision with root package name */
    public final Object f868z0;

    public f() {
        final int i10 = 0;
        this.f868z0 = kc.f.E(lq.j.SYNCHRONIZED, new e(this, i10));
        this.A0 = V(new g.b(0), new f.a(this) { // from class: am.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f857b;

            {
                this.f857b = this;
            }

            @Override // f.a
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        this.f857b.g0().f();
                        break;
                    default:
                        f fVar = this.f857b;
                        fVar.g0().e(fVar.X());
                        break;
                }
            }
        });
        final int i11 = 1;
        this.B0 = V(new g.b(0), new f.a(this) { // from class: am.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f857b;

            {
                this.f857b = this;
            }

            @Override // f.a
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        this.f857b.g0().f();
                        break;
                    default:
                        f fVar = this.f857b;
                        fVar.g0().e(fVar.X());
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.b
    public final void A(int i10, int i11, Intent intent) {
        super.A(i10, i11, intent);
        Objects.toString(intent);
        if (i10 != 29072020 || intent == null) {
            return;
        }
        g0().f27453i = intent.getBooleanExtra("ACTIVITY_RESULT_GDPR_ACCEPTED", true);
    }

    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        W().j().a(this, new d(0, this));
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        br.l.e(layoutInflater, "inflater");
        LayoutInflater layoutInflaterJ = this.f1419j0;
        if (layoutInflaterJ == null) {
            layoutInflaterJ = J(null);
            this.f1419j0 = layoutInflaterJ;
        }
        View viewInflate = layoutInflaterJ.inflate(qk.i.fragment_onboarding, (ViewGroup) null, false);
        int i10 = qk.h.onboarding_pager;
        ViewPager2 viewPager2 = (ViewPager2) b4.A(viewInflate, i10);
        if (viewPager2 != null) {
            i10 = qk.h.onboarding_progress_steps;
            ProgressStepsView progressStepsView = (ProgressStepsView) b4.A(viewInflate, i10);
            if (progressStepsView != null) {
                i10 = qk.h.os_logo;
                ImageView imageView = (ImageView) b4.A(viewInflate, i10);
                if (imageView != null) {
                    i10 = qk.h.page_button;
                    MaterialButton materialButton = (MaterialButton) b4.A(viewInflate, i10);
                    if (materialButton != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f867y0 = new cj.a(constraintLayout, viewPager2, progressStepsView, imageView, materialButton, 4);
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // ml.b, androidx.fragment.app.b
    public final void S(View view, Bundle bundle) {
        br.l.e(view, "view");
        super.S(view, bundle);
        cj.a aVar = this.f867y0;
        if (aVar == null) {
            br.l.l("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) aVar.f3974d;
        br.l.d(constraintLayout, "getRoot(...)");
        kc.f.j(constraintLayout);
        cj.a aVar2 = this.f867y0;
        if (aVar2 == null) {
            br.l.l("binding");
            throw null;
        }
        ((MaterialButton) aVar2.f3978y).setOnClickListener(new b(0, this));
        k kVar = new k(this);
        this.f865w0 = kVar;
        cj.a aVar3 = this.f867y0;
        if (aVar3 == null) {
            br.l.l("binding");
            throw null;
        }
        ((ViewPager2) aVar3.f3975g).setAdapter(kVar);
        cj.a aVar4 = this.f867y0;
        if (aVar4 == null) {
            br.l.l("binding");
            throw null;
        }
        ((ViewPager2) aVar4.f3975g).setUserInputEnabled(false);
        cj.a aVar5 = this.f867y0;
        if (aVar5 == null) {
            br.l.l("binding");
            throw null;
        }
        ProgressStepsView progressStepsView = (ProgressStepsView) aVar5.f3976r;
        if (this.f865w0 == null) {
            br.l.l("pagerAdapter");
            throw null;
        }
        progressStepsView.setTotalSteps(r0.b() - 2);
        zl.a aVarG0 = g0();
        aVarG0.getClass();
        boolean z10 = aVarG0.f27450f.f18456a.getBoolean("taken_consent_decision", false);
        qm.f fVar = aVarG0.f27447c;
        i.j jVarW = W();
        fVar.getClass();
        boolean z11 = jVarW.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || jVarW.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION");
        boolean zShouldShowRequestPermissionRationale = W().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE");
        aVarG0.f27452h.getClass();
        br.l.e("hasInitialConsentActionTaken: " + z10, "message");
        br.l.e("locationPermissionSelected: " + z11, "message");
        br.l.e("hasReadPhoneStatePermission: " + zShouldShowRequestPermissionRationale, "message");
        if (!z10) {
            aVarG0.c(zl.b.f27459f);
            return;
        }
        if (!z11) {
            aVarG0.c(new zl.c(false));
        } else if (zShouldShowRequestPermissionRationale) {
            aVarG0.g();
        } else {
            aVarG0.c(new zl.d(false));
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, lq.h] */
    @Override // ml.b
    public final void h0(zl.e eVar) {
        br.l.e(eVar, "viewState");
        if (eVar.equals(zl.b.f27459f)) {
            j0(0, false);
            cj.a aVar = this.f867y0;
            if (aVar == null) {
                br.l.l("binding");
                throw null;
            }
            ((ProgressStepsView) aVar.f3976r).setVisibility(8);
            cj.a aVar2 = this.f867y0;
            if (aVar2 == null) {
                br.l.l("binding");
                throw null;
            }
            ((ImageView) aVar2.f3977x).setVisibility(8);
            cj.a aVar3 = this.f867y0;
            if (aVar3 != null) {
                ((MaterialButton) aVar3.f3978y).setVisibility(8);
                return;
            } else {
                br.l.l("binding");
                throw null;
            }
        }
        if (eVar.equals(zl.b.f27457d)) {
            cj.a aVar4 = this.f867y0;
            if (aVar4 == null) {
                br.l.l("binding");
                throw null;
            }
            ((MaterialButton) aVar4.f3978y).setVisibility(8);
            cj.a aVar5 = this.f867y0;
            if (aVar5 == null) {
                br.l.l("binding");
                throw null;
            }
            ((ImageView) aVar5.f3977x).setVisibility(0);
            j0(1, true);
            cj.a aVar6 = this.f867y0;
            if (aVar6 != null) {
                ((ProgressStepsView) aVar6.f3976r).setVisibility(8);
                return;
            } else {
                br.l.l("binding");
                throw null;
            }
        }
        if (eVar.equals(zl.b.f27458e)) {
            j0(2, true);
            cj.a aVar7 = this.f867y0;
            if (aVar7 == null) {
                br.l.l("binding");
                throw null;
            }
            ((ProgressStepsView) aVar7.f3976r).setVisibility(0);
            cj.a aVar8 = this.f867y0;
            if (aVar8 == null) {
                br.l.l("binding");
                throw null;
            }
            ((ProgressStepsView) aVar8.f3976r).setCurrentStep(0);
            cj.a aVar9 = this.f867y0;
            if (aVar9 == null) {
                br.l.l("binding");
                throw null;
            }
            ((MaterialButton) aVar9.f3978y).setVisibility(0);
            cj.a aVar10 = this.f867y0;
            if (aVar10 != null) {
                ((MaterialButton) aVar10.f3978y).setText(r(qk.l.onboarding_continue_button_text));
                return;
            } else {
                br.l.l("binding");
                throw null;
            }
        }
        if (eVar instanceof zl.c) {
            j0(3, ((zl.c) eVar).f27461a);
            cj.a aVar11 = this.f867y0;
            if (aVar11 == null) {
                br.l.l("binding");
                throw null;
            }
            ((ProgressStepsView) aVar11.f3976r).setVisibility(0);
            cj.a aVar12 = this.f867y0;
            if (aVar12 == null) {
                br.l.l("binding");
                throw null;
            }
            ((ProgressStepsView) aVar12.f3976r).setCurrentStep(1);
            cj.a aVar13 = this.f867y0;
            if (aVar13 == null) {
                br.l.l("binding");
                throw null;
            }
            ((MaterialButton) aVar13.f3978y).setVisibility(0);
            cj.a aVar14 = this.f867y0;
            if (aVar14 != null) {
                ((MaterialButton) aVar14.f3978y).setText(r(qk.l.onboarding_continue_button_text));
                return;
            } else {
                br.l.l("binding");
                throw null;
            }
        }
        if (eVar instanceof zl.d) {
            boolean z10 = ((zl.d) eVar).f27462a;
            k kVar = this.f865w0;
            if (kVar == null) {
                br.l.l("pagerAdapter");
                throw null;
            }
            j0(kVar.b() - 1, z10);
            cj.a aVar15 = this.f867y0;
            if (aVar15 == null) {
                br.l.l("binding");
                throw null;
            }
            ((ProgressStepsView) aVar15.f3976r).setVisibility(0);
            cj.a aVar16 = this.f867y0;
            if (aVar16 == null) {
                br.l.l("binding");
                throw null;
            }
            ProgressStepsView progressStepsView = (ProgressStepsView) aVar16.f3976r;
            progressStepsView.setCurrentStep(progressStepsView.getTotalSteps() - 1);
            cj.a aVar17 = this.f867y0;
            if (aVar17 == null) {
                br.l.l("binding");
                throw null;
            }
            ((MaterialButton) aVar17.f3978y).setVisibility(0);
            cj.a aVar18 = this.f867y0;
            if (aVar18 != null) {
                ((MaterialButton) aVar18.f3978y).setText(r(qk.l.onboarding_continue_button_text));
                return;
            } else {
                br.l.l("binding");
                throw null;
            }
        }
        boolean zEquals = eVar.equals(zl.b.f27454a);
        ?? r62 = this.f868z0;
        if (zEquals) {
            qm.f fVar = (qm.f) r62.getValue();
            Context contextX = X();
            fVar.getClass();
            if (qm.f.a(contextX)) {
                g0().e(X());
                return;
            }
            qm.f fVar2 = (qm.f) r62.getValue();
            Context contextX2 = X();
            q qVar = this.B0;
            br.l.c(qVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultLauncher<kotlin.Array<out kotlin.String>>");
            fVar2.getClass();
            qm.f.g(qVar, contextX2, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
            return;
        }
        if (eVar.equals(zl.b.f27455b)) {
            qm.f fVar3 = (qm.f) r62.getValue();
            Context contextX3 = X();
            fVar3.getClass();
            if (qm.f.c(contextX3, "android.permission.READ_PHONE_STATE")) {
                g0().f();
                return;
            }
            qm.f fVar4 = (qm.f) r62.getValue();
            Context contextX4 = X();
            q qVar2 = this.A0;
            br.l.c(qVar2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultLauncher<kotlin.Array<out kotlin.String>>");
            fVar4.getClass();
            qm.f.g(qVar2, contextX4, "android.permission.READ_PHONE_STATE");
            return;
        }
        if (eVar.equals(zl.b.f27460g)) {
            f0(new Intent(X(), (Class<?>) MainActivity.class));
            W().finishAffinity();
            return;
        }
        if (!eVar.equals(zl.b.f27456c)) {
            throw new n();
        }
        j0(0, true);
        cj.a aVar19 = this.f867y0;
        if (aVar19 == null) {
            br.l.l("binding");
            throw null;
        }
        ((ProgressStepsView) aVar19.f3976r).setVisibility(8);
        cj.a aVar20 = this.f867y0;
        if (aVar20 != null) {
            ((MaterialButton) aVar20.f3978y).setVisibility(8);
        } else {
            br.l.l("binding");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ml.b
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final zl.a g0() {
        return (zl.a) this.f866x0.getValue();
    }

    public final void j0(int i10, boolean z10) {
        cj.a aVar = this.f867y0;
        if (aVar == null) {
            br.l.l("binding");
            throw null;
        }
        ViewPager2 viewPager2 = (ViewPager2) aVar.f3975g;
        Object obj = viewPager2.I.f26690a;
        viewPager2.b(i10, z10);
    }
}
