package com.staircase3.opensignal.goldstar.tabcoverage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.material.button.MaterialButton;
import com.staircase3.opensignal.goldstar.tabcoverage.SuperUserActivity;
import com.staircase3.opensignal.utils.a;
import com.staircase3.opensignal.utils.q;
import com.staircase3.opensignal.utils.u;
import i.j;
import im.b;
import java.lang.reflect.InvocationTargetException;
import kc.f;
import kg.r;
import kotlin.Metadata;
import qk.h;
import qk.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/staircase3/opensignal/goldstar/tabcoverage/SuperUserActivity;", "Li/j;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperUserActivity extends j {
    public static final /* synthetic */ int W = 0;
    public r T;
    public final Object U;
    public final Object V;

    public SuperUserActivity() {
        lq.j jVar = lq.j.SYNCHRONIZED;
        this.U = f.E(jVar, new b(this, 0));
        this.V = f.E(jVar, new b(this, 1));
    }

    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        final int i10 = 0;
        View viewInflate = getLayoutInflater().inflate(i.super_user_bg_location_request, (ViewGroup) null, false);
        int i11 = h.superUserContentTextview;
        TextView textView = (TextView) b4.A(viewInflate, i11);
        if (textView != null) {
            i11 = h.superUserTitle;
            if (((TextView) b4.A(viewInflate, i11)) != null) {
                i11 = h.superUserToolbar;
                Toolbar toolbar = (Toolbar) b4.A(viewInflate, i11);
                if (toolbar != null) {
                    i11 = h.takeMeToSettings;
                    MaterialButton materialButton = (MaterialButton) b4.A(viewInflate, i11);
                    if (materialButton != null) {
                        i11 = h.toolbarTitle;
                        if (((TextView) b4.A(viewInflate, i11)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.T = new r(constraintLayout, textView, toolbar, materialButton);
                            l.d(constraintLayout, "getRoot(...)");
                            f.j(constraintLayout);
                            r rVar = this.T;
                            if (rVar == null) {
                                l.l("binding");
                                throw null;
                            }
                            setContentView((ConstraintLayout) rVar.f14395a);
                            r rVar2 = this.T;
                            if (rVar2 == null) {
                                l.l("binding");
                                throw null;
                            }
                            Toolbar toolbar2 = (Toolbar) rVar2.f14397g;
                            toolbar2.setTitle("");
                            toolbar2.setSubtitle("");
                            toolbar2.setNavigationIcon(qk.f.ic_arrow_back_white_36dp);
                            ((TextView) toolbar2.findViewById(h.toolbarTitle)).setText(getString(qk.l.super_user));
                            w(toolbar2);
                            xu.l lVarN = n();
                            final int i12 = 1;
                            if (lVarN != null) {
                                lVarN.S(true);
                            }
                            toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: im.a

                                /* renamed from: d, reason: collision with root package name */
                                public final /* synthetic */ SuperUserActivity f11439d;

                                {
                                    this.f11439d = this;
                                }

                                /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, lq.h] */
                                /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, lq.h] */
                                /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, lq.h] */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i13 = i12;
                                    SuperUserActivity superUserActivity = this.f11439d;
                                    switch (i13) {
                                        case 0:
                                            int i14 = SuperUserActivity.W;
                                            ?? r62 = superUserActivity.V;
                                            ((com.staircase3.opensignal.utils.a) r62.getValue()).f("SuperUserActivity");
                                            com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r62.getValue(), "super_user", "take_me_to_settings_clicked", "take_me_to_settings", 8);
                                            ?? r63 = superUserActivity.U;
                                            ((qm.f) r63.getValue()).getClass();
                                            if (!qm.f.b(superUserActivity) && !q.c(superUserActivity.getApplicationContext()).getBoolean("key_user_seen_bg_location_dialog", false)) {
                                                qm.f fVar = (qm.f) r63.getValue();
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    fVar.getClass();
                                                    qm.f.f(11, superUserActivity, "android.permission.ACCESS_BACKGROUND_LOCATION");
                                                } else {
                                                    fVar.getClass();
                                                }
                                                q.a(superUserActivity.getApplicationContext()).putBoolean("key_user_seen_bg_location_dialog", true).apply();
                                                break;
                                            } else {
                                                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + superUserActivity.getPackageName()));
                                                intent.addCategory("android.intent.category.DEFAULT");
                                                intent.setFlags(268435456);
                                                intent.addFlags(1073741824);
                                                intent.addFlags(8388608);
                                                superUserActivity.startActivity(intent);
                                                break;
                                            }
                                            break;
                                        default:
                                            int i15 = SuperUserActivity.W;
                                            com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) superUserActivity.V.getValue(), "super_user", "back_arrow_clicked", "back_to_learn_how_super_user_dialog", 8);
                                            superUserActivity.finish();
                                            break;
                                    }
                                }
                            });
                            int i13 = qk.l.super_user_content;
                            r rVar3 = this.T;
                            if (rVar3 == null) {
                                l.l("binding");
                                throw null;
                            }
                            TextView textView2 = (TextView) rVar3.f14396d;
                            String string = getString(i13);
                            lq.q qVar = u.f6195a;
                            textView2.setText(Html.fromHtml(string, 0));
                            r rVar4 = this.T;
                            if (rVar4 != null) {
                                ((MaterialButton) rVar4.f14398r).setOnClickListener(new View.OnClickListener(this) { // from class: im.a

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ SuperUserActivity f11439d;

                                    {
                                        this.f11439d = this;
                                    }

                                    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, lq.h] */
                                    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, lq.h] */
                                    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, lq.h] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i132 = i10;
                                        SuperUserActivity superUserActivity = this.f11439d;
                                        switch (i132) {
                                            case 0:
                                                int i14 = SuperUserActivity.W;
                                                ?? r62 = superUserActivity.V;
                                                ((com.staircase3.opensignal.utils.a) r62.getValue()).f("SuperUserActivity");
                                                com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) r62.getValue(), "super_user", "take_me_to_settings_clicked", "take_me_to_settings", 8);
                                                ?? r63 = superUserActivity.U;
                                                ((qm.f) r63.getValue()).getClass();
                                                if (!qm.f.b(superUserActivity) && !q.c(superUserActivity.getApplicationContext()).getBoolean("key_user_seen_bg_location_dialog", false)) {
                                                    qm.f fVar = (qm.f) r63.getValue();
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        fVar.getClass();
                                                        qm.f.f(11, superUserActivity, "android.permission.ACCESS_BACKGROUND_LOCATION");
                                                    } else {
                                                        fVar.getClass();
                                                    }
                                                    q.a(superUserActivity.getApplicationContext()).putBoolean("key_user_seen_bg_location_dialog", true).apply();
                                                    break;
                                                } else {
                                                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + superUserActivity.getPackageName()));
                                                    intent.addCategory("android.intent.category.DEFAULT");
                                                    intent.setFlags(268435456);
                                                    intent.addFlags(1073741824);
                                                    intent.addFlags(8388608);
                                                    superUserActivity.startActivity(intent);
                                                    break;
                                                }
                                                break;
                                            default:
                                                int i15 = SuperUserActivity.W;
                                                com.staircase3.opensignal.utils.a.e((com.staircase3.opensignal.utils.a) superUserActivity.V.getValue(), "super_user", "back_arrow_clicked", "back_to_learn_how_super_user_dialog", 8);
                                                superUserActivity.finish();
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                l.l("binding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lq.h] */
    @Override // i.j, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((qm.f) this.U.getValue()).getClass();
        if (qm.f.b(this)) {
            a.e((a) this.V.getValue(), "super_user", "bg_permission_granted", "change_permission_from_fg_to_bg", 8);
            q.a(getApplicationContext()).putBoolean("key_thank_you_confirmation", true).apply();
            finish();
        }
    }
}
