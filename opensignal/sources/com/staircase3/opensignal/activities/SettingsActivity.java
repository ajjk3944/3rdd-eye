package com.staircase3.opensignal.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.measurement.y3;
import com.staircase3.opensignal.utils.p;
import com.staircase3.opensignal.utils.q;
import i.j;
import java.lang.reflect.InvocationTargetException;
import jn.b;
import qk.c;
import qk.f;
import qk.h;
import qk.l;
import rk.d;
import rk.e;
import rk.i;

/* loaded from: classes.dex */
public class SettingsActivity extends j implements ql.a {

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f6023n0 = 0;
    public TextView T;
    public TextView U;
    public String[] V;
    public TextView W;
    public RelativeLayout X;
    public TextView Y;
    public TextView Z;

    /* renamed from: a0, reason: collision with root package name */
    public AppCompatSeekBar f6024a0;

    /* renamed from: b0, reason: collision with root package name */
    public p f6025b0;

    /* renamed from: c0, reason: collision with root package name */
    public SettingsActivity f6026c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f6027d0 = false;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6028e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public final Object f6029f0 = y3.A(cm.a.class);

    /* renamed from: g0, reason: collision with root package name */
    public final Object f6030g0 = y3.A(nl.a.class);

    /* renamed from: h0, reason: collision with root package name */
    public final Object f6031h0 = y3.A(gl.a.class);

    /* renamed from: i0, reason: collision with root package name */
    public final Object f6032i0 = y3.A(b.class);

    /* renamed from: j0, reason: collision with root package name */
    public final Object f6033j0 = y3.A(com.staircase3.opensignal.utils.a.class);

    /* renamed from: k0, reason: collision with root package name */
    public final Object f6034k0 = y3.A(el.b.class);

    /* renamed from: l0, reason: collision with root package name */
    public View f6035l0;

    /* renamed from: m0, reason: collision with root package name */
    public LinearLayout f6036m0;

    public static Intent y(Context context, boolean z10, boolean z11) {
        Intent intent = new Intent(context, (Class<?>) SettingsActivity.class);
        intent.putExtra("INTENT_EXTRA_INITIAL_GDPR_VALUE", z10);
        intent.putExtra("INTENT_EXTRA_FROM_ONBOARDING", z11);
        return intent;
    }

    public final void A(boolean z10) throws Resources.NotFoundException {
        String upperCase;
        String string;
        if (z10) {
            upperCase = getString(l.settings_signal_readings_and_speedtests);
            string = getResources().getString(l.data_collection_on_readings);
        } else {
            upperCase = getString(l.none).toUpperCase();
            string = getResources().getString(l.data_collection_off_readings);
        }
        this.T.setText(upperCase);
        this.U.setText(string);
    }

    public final void B() {
        int i10 = i.f21633a[this.f6025b0.ordinal()];
        if (i10 == 1) {
            this.W.setText(this.V[0]);
            return;
        }
        if (i10 == 2) {
            this.W.setText(this.V[1]);
        } else if (i10 == 3) {
            this.W.setText(this.V[2]);
        } else {
            if (i10 != 4) {
                return;
            }
            this.W.setText(this.V[3]);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, lq.h] */
    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        this.f6027d0 = getIntent().getBooleanExtra("INTENT_EXTRA_INITIAL_GDPR_VALUE", false);
        this.f6028e0 = getIntent().getBooleanExtra("INTENT_EXTRA_FROM_ONBOARDING", false);
        setContentView(qk.i.activity_settings);
        TextView textView = (TextView) findViewById(h.clientIdentifierValueText);
        TextView textView2 = (TextView) findViewById(h.client_identifier_Label);
        TextView textView3 = (TextView) findViewById(h.appVersionTextView);
        textView.setText((String) ((b) this.f6032i0.getValue()).f13781b.getValue());
        boolean z10 = true;
        textView3.setClickable(true);
        textView3.setOnClickListener(new rk.h(textView, textView2));
        ?? r82 = this.f6034k0;
        int i10 = ((el.b) r82.getValue()).H ? false : q.c(this).getBoolean("prefs_connectivity_assistant_settings_visible", false) ? 0 : 8;
        View viewFindViewById = findViewById(h.separatorConnectivityAssistant);
        this.f6035l0 = viewFindViewById;
        viewFindViewById.setVisibility(i10);
        LinearLayout linearLayout = (LinearLayout) findViewById(h.cardConnectivityAssistant);
        this.f6036m0 = linearLayout;
        linearLayout.setVisibility(i10);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(h.swToggleConnectivityAssistant);
        if (((el.b) r82.getValue()).H ? false : q.c(this).getBoolean("prefs_connectivity_assistant_settings_visible", false)) {
            this.f6035l0.setVisibility(0);
            this.f6036m0.setVisibility(0);
        }
        TextView textView4 = (TextView) findViewById(h.moreInfoTextView);
        textView4.setClickable(true);
        textView4.setOnClickListener(new d(this, 1));
        if (!((el.b) r82.getValue()).H && !q.c(this).getBoolean("prefs_connectivity_assistant_enabled", false)) {
            z10 = false;
        }
        switchCompat.setChecked(z10);
        switchCompat.setOnCheckedChangeListener(new e(this, 5));
        this.f6026c0 = this;
        Toolbar toolbar = (Toolbar) findViewById(h.toolbar);
        toolbar.setTitle("");
        toolbar.setSubtitle("");
        w(toolbar);
        ((TextView) toolbar.findViewById(h.toolbarTitle)).setText(l.settings);
        toolbar.setNavigationIcon(f.ic_arrow_back_white_36dp);
        se.b.W(this, qk.d.status_bar_background);
        w(toolbar);
        n().T();
        toolbar.setNavigationOnClickListener(new rk.f(this, 2));
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(h.swToggleColourBlindMode);
        switchCompat2.setChecked(q.c(this.f6026c0).getBoolean("settings.color_blind_mode", false));
        switchCompat2.setOnCheckedChangeListener(new e(this, 6));
        this.V = getResources().getStringArray(c.notification_scale);
        this.T = (TextView) findViewById(h.tvDataCollectedType);
        this.U = (TextView) findViewById(h.tvSignalReadingsPerDay);
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(h.swToggleDataCollection);
        switchCompat3.setChecked(this.f6027d0);
        A(this.f6027d0);
        switchCompat3.setOnCheckedChangeListener(new e(this, 7));
        LinearLayout linearLayout2 = (LinearLayout) findViewById(h.llNotificationType);
        this.W = (TextView) findViewById(h.tvNotificationTypeSubtitle);
        SharedPreferences sharedPreferencesC = q.c(this.f6026c0);
        p pVarValueOf = p.STATUSBAR_ONLY;
        try {
            pVarValueOf = p.valueOf(sharedPreferencesC.getString("settings.notification_type", pVarValueOf.name()));
        } catch (IllegalArgumentException unused) {
        }
        this.f6025b0 = pVarValueOf;
        B();
        linearLayout2.setOnClickListener(new rk.f(this, 3));
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(h.cbNoData);
        appCompatCheckBox.setChecked(MainActivity.f5998y0);
        appCompatCheckBox.setOnCheckedChangeListener(new e(this, 8));
        TextView textView5 = (TextView) findViewById(h.tvSeekbarValue);
        this.Z = textView5;
        textView5.setText(xu.d.f25539e + "%");
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) findViewById(h.seekBarNotifications);
        this.f6024a0 = appCompatSeekBar;
        appCompatSeekBar.setProgress(xu.d.f25539e);
        this.f6024a0.setOnSeekBarChangeListener(new ln.a(this, 1));
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) findViewById(h.cbSignal);
        this.X = (RelativeLayout) findViewById(h.rlNotificationBarLegend);
        this.Y = (TextView) findViewById(h.tvNotificationsHeader);
        appCompatCheckBox2.setChecked(MainActivity.f5997x0);
        x(appCompatCheckBox2.isChecked());
        int i11 = 0;
        appCompatCheckBox2.setOnCheckedChangeListener(new e(this, i11));
        ((Button) findViewById(h.btAbout)).setOnClickListener(new rk.f(this, i11));
        ((Button) findViewById(h.termsOfService)).setOnClickListener(new rk.f(this, 1));
        TextView textView6 = (TextView) findViewById(h.textGdprSettingsHeader);
        textView6.setText(Html.fromHtml(getString(l.settings_explanation_header)));
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setText("8.3.2-1 (8003020)");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lq.h] */
    @Override // i.j, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            ((com.staircase3.opensignal.utils.a) this.f6033j0.getValue()).f("settings");
        } catch (Exception unused) {
            ((gl.a) this.f6031h0.getValue()).getClass();
        }
    }

    public final void x(boolean z10) {
        View[] viewArr = {this.f6024a0, this.X, this.Y, this.Z};
        for (int i10 = 0; i10 < 4; i10++) {
            View view = viewArr[i10];
            if (view != null) {
                SettingsActivity settingsActivity = this.f6026c0;
                if (z10) {
                    view.setVisibility(0);
                    view.startAnimation(AnimationUtils.loadAnimation(settingsActivity, qk.b.fadein));
                } else {
                    view.setVisibility(8);
                    view.startAnimation(AnimationUtils.loadAnimation(settingsActivity, qk.b.mainfadeout));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    public final void z(boolean z10) {
        ((gl.a) this.f6031h0.getValue()).getClass();
        br.l.e("consentGiven: " + z10, "message");
        Intent intent = new Intent();
        intent.putExtra("ACTIVITY_RESULT_GDPR_ACCEPTED", z10);
        setResult(-1, intent);
    }
}
