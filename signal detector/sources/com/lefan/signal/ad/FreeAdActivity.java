package com.lefan.signal.ad;

import A3.C0133b;
import B4.r;
import F4.d;
import K4.c;
import a4.p;
import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import c.AbstractC0391p;
import c5.C0410g;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.lefan.base.view.AdFreeCountDownTextClock;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ad.FreeAdActivity;
import h.AbstractActivityC2349g;
import q2.C2834o;
import q5.i;
import q5.m;
import t4.C2931b;

/* loaded from: classes.dex */
public final class FreeAdActivity extends AbstractActivityC2349g {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f18830R = 0;

    /* renamed from: O, reason: collision with root package name */
    public c f18831O;

    /* renamed from: P, reason: collision with root package name */
    public final C0410g f18832P = new C0410g(new D4.c(1, this));

    /* renamed from: Q, reason: collision with root package name */
    public ValueAnimator f18833Q;

    public final void C(TextView textView, int i, int i3) {
        ValueAnimator valueAnimator = this.f18833Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i3 + i);
        this.f18833Q = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.addUpdateListener(new C0133b(3, textView));
        valueAnimatorOfInt.start();
    }

    public final C2931b D() {
        return (C2931b) this.f18832P.getValue();
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_free_ad, (ViewGroup) null, false);
        int i = R.id.ad_free_count_down;
        AdFreeCountDownTextClock adFreeCountDownTextClock = (AdFreeCountDownTextClock) p.e(R.id.ad_free_count_down, viewInflate);
        if (adFreeCountDownTextClock != null) {
            i = R.id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
            if (appBarLayout != null) {
                i = R.id.nest_scroll_view;
                NestedScrollView nestedScrollView = (NestedScrollView) p.e(R.id.nest_scroll_view, viewInflate);
                if (nestedScrollView != null) {
                    i = R.id.rewarded_points;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.rewarded_points, viewInflate);
                    if (appCompatTextView != null) {
                        i = R.id.reword_status;
                        MaterialButton materialButton = (MaterialButton) p.e(R.id.reword_status, viewInflate);
                        if (materialButton != null) {
                            i = R.id.tool_bar;
                            Toolbar toolbar = (Toolbar) p.e(R.id.tool_bar, viewInflate);
                            if (toolbar != null) {
                                i = R.id.vip_card;
                                MaterialCardView materialCardView = (MaterialCardView) p.e(R.id.vip_card, viewInflate);
                                if (materialCardView != null) {
                                    i = R.id.vip_down;
                                    MaterialButton materialButton2 = (MaterialButton) p.e(R.id.vip_down, viewInflate);
                                    if (materialButton2 != null) {
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                        this.f18831O = new c(linearLayoutCompat, adFreeCountDownTextClock, appBarLayout, nestedScrollView, appCompatTextView, materialButton, toolbar, materialCardView, materialButton2);
                                        setContentView(linearLayoutCompat);
                                        c cVar = this.f18831O;
                                        if (cVar == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        B((Toolbar) cVar.f2211d);
                                        c cVar2 = this.f18831O;
                                        if (cVar2 == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        AppBarLayout appBarLayout2 = (AppBarLayout) cVar2.f2210c;
                                        if (cVar2 == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        d.a(appBarLayout2, (NestedScrollView) cVar2.f2213f);
                                        com.bumptech.glide.d dVarR = r();
                                        if (dVarR != null) {
                                            dVarR.S(true);
                                        }
                                        c cVar3 = this.f18831O;
                                        if (cVar3 == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        final int i3 = 0;
                                        ((Toolbar) cVar3.f2211d).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: I4.a

                                            /* renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ FreeAdActivity f1995b;

                                            {
                                                this.f1995b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i6 = i3;
                                                FreeAdActivity freeAdActivity = this.f1995b;
                                                switch (i6) {
                                                    case 0:
                                                        int i7 = FreeAdActivity.f18830R;
                                                        freeAdActivity.o().c();
                                                        break;
                                                    default:
                                                        int i8 = FreeAdActivity.f18830R;
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + freeAdActivity.getPackageName() + ".vip"));
                                                        intent.setFlags(268435456);
                                                        intent.setPackage("com.android.vending");
                                                        try {
                                                            freeAdActivity.startActivity(intent);
                                                            MyApplication.f18812d = true;
                                                            break;
                                                        } catch (ActivityNotFoundException unused) {
                                                            Toast.makeText(d.f1456a, freeAdActivity.getString(R.string.no_market), 1).show();
                                                        }
                                                }
                                            }
                                        });
                                        c cVar4 = this.f18831O;
                                        if (cVar4 == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        ((MaterialCardView) cVar4.f2216j).setVisibility(0);
                                        c cVar5 = this.f18831O;
                                        if (cVar5 == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        TextView textView = (AppCompatTextView) cVar5.f2214g;
                                        if (cVar5 == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        MaterialButton materialButton3 = (MaterialButton) cVar5.f2215h;
                                        m mVar = new m();
                                        int i6 = getSharedPreferences("sp", 0).getInt("my_reword_points", 10);
                                        mVar.f23297a = i6;
                                        C(textView, 0, i6);
                                        D().f23677f = "ca-app-pub-8024055951217142/6288045785";
                                        m mVar2 = new m();
                                        c cVar6 = this.f18831O;
                                        if (cVar6 == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        AdFreeCountDownTextClock adFreeCountDownTextClock2 = (AdFreeCountDownTextClock) cVar6.f2212e;
                                        D().f23676e = new C2834o(materialButton3, this, mVar2, textView, mVar, adFreeCountDownTextClock2, 2);
                                        D().a();
                                        materialButton3.setOnClickListener(new r(mVar2, 2, this));
                                        c cVar7 = this.f18831O;
                                        if (cVar7 == null) {
                                            i.g("binding");
                                            throw null;
                                        }
                                        final int i7 = 1;
                                        ((MaterialButton) cVar7.i).setOnClickListener(new View.OnClickListener(this) { // from class: I4.a

                                            /* renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ FreeAdActivity f1995b;

                                            {
                                                this.f1995b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i62 = i7;
                                                FreeAdActivity freeAdActivity = this.f1995b;
                                                switch (i62) {
                                                    case 0:
                                                        int i72 = FreeAdActivity.f18830R;
                                                        freeAdActivity.o().c();
                                                        break;
                                                    default:
                                                        int i8 = FreeAdActivity.f18830R;
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + freeAdActivity.getPackageName() + ".vip"));
                                                        intent.setFlags(268435456);
                                                        intent.setPackage("com.android.vending");
                                                        try {
                                                            freeAdActivity.startActivity(intent);
                                                            MyApplication.f18812d = true;
                                                            break;
                                                        } catch (ActivityNotFoundException unused) {
                                                            Toast.makeText(d.f1456a, freeAdActivity.getString(R.string.no_market), 1).show();
                                                        }
                                                }
                                            }
                                        });
                                        SharedPreferences sharedPreferences = getSharedPreferences("sp", 0);
                                        i.b(sharedPreferences);
                                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                        editorEdit.putBoolean("isAlwaysShowAdFreeDialog", false);
                                        editorEdit.apply();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.f18833Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f18833Q = null;
        C2931b c2931bD = D();
        c2931bD.f23676e = null;
        c2931bD.f23674c = null;
    }
}
