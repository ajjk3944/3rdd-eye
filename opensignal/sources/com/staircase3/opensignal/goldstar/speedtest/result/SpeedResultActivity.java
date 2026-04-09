package com.staircase3.opensignal.goldstar.speedtest.result;

import a5.o;
import al.a;
import al.c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import as.x;
import b9.e;
import bm.d;
import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.models.PlaceType;
import com.staircase3.opensignal.utils.m;
import i.j;
import i4.b;
import java.lang.reflect.InvocationTargetException;
import java.util.MissingResourceException;
import kotlin.Metadata;
import o2.g;
import qk.h;
import qk.i;
import sm.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/staircase3/opensignal/goldstar/speedtest/result/SpeedResultActivity;", "Li/j;", "", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpeedResultActivity extends j {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f6092c0 = 0;
    public a T;
    public g U;
    public d V;
    public f W;
    public b X;
    public om.f Y;
    public final Object Z = kc.f.E(lq.j.SYNCHRONIZED, new x(26, this));

    /* renamed from: a0, reason: collision with root package name */
    public SpeedTestResult f6093a0;

    /* renamed from: b0, reason: collision with root package name */
    public NetworkUiState f6094b0;

    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, lq.h] */
    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, MissingResourceException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View viewA;
        SpeedTestResult speedTestResult;
        NetworkUiState networkUiState;
        NetworkUiState networkUiState2;
        Object parcelableExtra;
        Object parcelableExtra2;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(i.activity_speedtest_result, (ViewGroup) null, false);
        int i10 = h.speedTestWidgetsLayout;
        LinearLayout linearLayout = (LinearLayout) b4.A(viewInflate, i10);
        if (linearLayout == null || (viewA = b4.A(viewInflate, (i10 = h.toolbar_include))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        this.T = new a(constraintLayout, linearLayout, al.f.a(viewA));
        setContentView(constraintLayout);
        se.b.W(this, qk.d.status_bar_background);
        a aVar = this.T;
        if (aVar == null) {
            l.l("binding");
            throw null;
        }
        Toolbar toolbar = aVar.f807b.f844a;
        toolbar.setTitle("");
        toolbar.setSubtitle("");
        toolbar.setNavigationIcon(qk.f.ic_arrow_back_white_36dp);
        ((TextView) toolbar.findViewById(h.toolbarTitle)).setText(getString(qk.l.Speed_test_result_tool_bar));
        w(toolbar);
        xu.l lVarN = n();
        if (lVarN != null) {
            lVarN.T();
        }
        toolbar.setNavigationOnClickListener(new am.b(7, this));
        a aVar2 = this.T;
        if (aVar2 == null) {
            l.l("binding");
            throw null;
        }
        ConstraintLayout constraintLayout2 = aVar2.f806a;
        l.d(constraintLayout2, "getRoot(...)");
        kc.f.j(constraintLayout2);
        LayoutInflater layoutInflater = getLayoutInflater();
        l.d(layoutInflater, "getLayoutInflater(...)");
        this.U = new g(layoutInflater);
        LayoutInflater layoutInflater2 = getLayoutInflater();
        l.d(layoutInflater2, "getLayoutInflater(...)");
        final b bVar = new b();
        View viewInflate2 = layoutInflater2.inflate(i.indoor_outdoor_fragment_dialog, (ViewGroup) null, false);
        int i11 = h.guidelineCenter;
        if (((Guideline) b4.A(viewInflate2, i11)) != null) {
            i11 = h.indoorButton;
            Button button = (Button) b4.A(viewInflate2, i11);
            if (button != null) {
                i11 = h.outdoorButton;
                Button button2 = (Button) b4.A(viewInflate2, i11);
                if (button2 != null) {
                    i11 = h.titleTextView;
                    if (((TextView) b4.A(viewInflate2, i11)) != null) {
                        a2.g gVar = new a2.g();
                        gVar.f31a = (ConstraintLayout) viewInflate2;
                        bVar.f11196a = gVar;
                        final int i12 = 0;
                        button.setOnClickListener(new View.OnClickListener() { // from class: om.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i12) {
                                    case 0:
                                        b9.e eVar = (b9.e) bVar.f11197d;
                                        if (eVar != null) {
                                            eVar.A(PlaceType.INDOOR);
                                            break;
                                        }
                                        break;
                                    default:
                                        b9.e eVar2 = (b9.e) bVar.f11197d;
                                        if (eVar2 != null) {
                                            eVar2.A(PlaceType.OUTDOOR);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        final int i13 = 1;
                        button2.setOnClickListener(new View.OnClickListener() { // from class: om.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i13) {
                                    case 0:
                                        b9.e eVar = (b9.e) bVar.f11197d;
                                        if (eVar != null) {
                                            eVar.A(PlaceType.INDOOR);
                                            break;
                                        }
                                        break;
                                    default:
                                        b9.e eVar2 = (b9.e) bVar.f11197d;
                                        if (eVar2 != null) {
                                            eVar2.A(PlaceType.OUTDOOR);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        bVar.f11197d = new e(28, this);
                        this.X = bVar;
                        LayoutInflater layoutInflater3 = getLayoutInflater();
                        l.d(layoutInflater3, "getLayoutInflater(...)");
                        om.f fVar = new om.f(layoutInflater3);
                        fVar.f19555g = new a2.g(this);
                        int color = getColor(qk.d.complementary_1);
                        bm.e eVar = (bm.e) fVar.f19554d;
                        if (eVar == null) {
                            l.l("binding");
                            throw null;
                        }
                        Button button3 = (Button) eVar.f2831g;
                        button3.setBackgroundColor(color);
                        button3.setVisibility(0);
                        int i14 = qk.l.video_test_button_text;
                        bm.e eVar2 = (bm.e) fVar.f19554d;
                        if (eVar2 == null) {
                            l.l("binding");
                            throw null;
                        }
                        Button button4 = (Button) eVar2.f2831g;
                        button4.setText(i14);
                        button4.setVisibility(0);
                        this.Y = fVar;
                        a aVar3 = this.T;
                        if (aVar3 == null) {
                            l.l("binding");
                            throw null;
                        }
                        LinearLayout linearLayout2 = aVar3.f808c;
                        b bVar2 = this.X;
                        if (bVar2 == null) {
                            l.l("placeTypeSurveyWidget");
                            throw null;
                        }
                        a2.g gVar2 = (a2.g) bVar2.f11196a;
                        if (gVar2 == null) {
                            l.l("binding");
                            throw null;
                        }
                        linearLayout2.addView((ConstraintLayout) gVar2.f31a);
                        a aVar4 = this.T;
                        if (aVar4 == null) {
                            l.l("binding");
                            throw null;
                        }
                        LinearLayout linearLayout3 = aVar4.f808c;
                        g gVar3 = this.U;
                        if (gVar3 == null) {
                            l.l("speedResultWidget");
                            throw null;
                        }
                        c cVar = (c) gVar3.f18754d;
                        if (cVar == null) {
                            l.l("binding");
                            throw null;
                        }
                        linearLayout3.addView((ConstraintLayout) cVar.f820b);
                        a aVar5 = this.T;
                        if (aVar5 == null) {
                            l.l("binding");
                            throw null;
                        }
                        LinearLayout linearLayout4 = aVar5.f808c;
                        om.f fVar2 = this.Y;
                        if (fVar2 == null) {
                            l.l("tryDifferentTestWidget");
                            throw null;
                        }
                        bm.e eVar3 = (bm.e) fVar2.f19554d;
                        if (eVar3 == null) {
                            l.l("binding");
                            throw null;
                        }
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) eVar3.f2830d;
                        l.d(constraintLayout3, "getRoot(...)");
                        linearLayout4.addView(constraintLayout3);
                        this.V = new d(this);
                        this.W = new f(8);
                        Intent intent = getIntent();
                        if (intent != null) {
                            if (Build.VERSION.SDK_INT >= 34) {
                                parcelableExtra2 = h3.e.a(intent, "INTENT_EXTRA_SPEED_TEST_RESULT", SpeedTestResult.class);
                            } else {
                                parcelableExtra2 = intent.getParcelableExtra("INTENT_EXTRA_SPEED_TEST_RESULT");
                                if (!SpeedTestResult.class.isInstance(parcelableExtra2)) {
                                    parcelableExtra2 = null;
                                }
                            }
                            speedTestResult = (SpeedTestResult) ((Parcelable) parcelableExtra2);
                        } else {
                            speedTestResult = null;
                        }
                        this.f6093a0 = speedTestResult;
                        Intent intent2 = getIntent();
                        if (intent2 != null) {
                            if (Build.VERSION.SDK_INT >= 34) {
                                parcelableExtra = h3.e.a(intent2, "INTENT_EXTRA_NETWORK_STATE_RESULT", NetworkUiState.class);
                            } else {
                                parcelableExtra = intent2.getParcelableExtra("INTENT_EXTRA_NETWORK_STATE_RESULT");
                                if (!NetworkUiState.class.isInstance(parcelableExtra)) {
                                    parcelableExtra = null;
                                }
                            }
                            networkUiState = (NetworkUiState) ((Parcelable) parcelableExtra);
                        } else {
                            networkUiState = null;
                        }
                        this.f6094b0 = networkUiState;
                        Intent intent3 = getIntent();
                        long longExtra = intent3 != null ? intent3.getLongExtra("INTENT_EXTRA_TASK_ID", -1L) : -1L;
                        SpeedTestResult speedTestResult2 = this.f6093a0;
                        if (speedTestResult2 == null || (networkUiState2 = this.f6094b0) == null) {
                            finish();
                            return;
                        }
                        d dVar = this.V;
                        if (dVar == null) {
                            l.l("presenter");
                            throw null;
                        }
                        if (this.W == null) {
                            l.l("model");
                            throw null;
                        }
                        dVar.f2827g = speedTestResult2;
                        com.staircase3.opensignal.utils.g gVarA = com.staircase3.opensignal.utils.i.a(speedTestResult2.f6097g);
                        com.staircase3.opensignal.utils.g gVarA2 = com.staircase3.opensignal.utils.i.a(speedTestResult2.f6098r);
                        String str = gVarA.f6180a;
                        l.d(str, "getValue(...)");
                        String strI = kc.f.I(gVarA.f6181b.name());
                        String str2 = gVarA2.f6180a;
                        l.d(str2, "getValue(...)");
                        String strI2 = kc.f.I(gVarA2.f6181b.name());
                        String strValueOf = String.valueOf(speedTestResult2.f6099x);
                        l.e(strI, "downloadUnit");
                        l.e(strI2, "uploadUnit");
                        l.e(strValueOf, "latencyValue");
                        SpeedResultActivity speedResultActivity = (SpeedResultActivity) dVar.f2826d;
                        g gVar4 = speedResultActivity.U;
                        if (gVar4 == null) {
                            l.l("speedResultWidget");
                            throw null;
                        }
                        c cVar2 = (c) gVar4.f18754d;
                        if (cVar2 == null) {
                            l.l("binding");
                            throw null;
                        }
                        ((TextView) cVar2.f827i).setText(str);
                        ((TextView) cVar2.f826h).setText(strI);
                        ((TextView) cVar2.k).setText(str2);
                        ((TextView) cVar2.j).setText(strI2);
                        ((TextView) cVar2.f823e).setText(strValueOf);
                        if (networkUiState2 != null) {
                            speedResultActivity.runOnUiThread(new o(speedResultActivity, 15, networkUiState2));
                        }
                        SpeedTestResult speedTestResult3 = this.f6093a0;
                        ?? r22 = this.Z;
                        if (speedTestResult3 != null) {
                            kn.d dVar2 = (kn.d) r22.getValue();
                            dVar2.getClass();
                            NetworkUiState networkUiState3 = dVar2.f14457f;
                            String str3 = speedTestResult3.E;
                            String str4 = str3 == null ? "" : str3;
                            String str5 = speedTestResult3.D;
                            String str6 = str5 == null ? "" : str5;
                            m mVar = networkUiState3.f6127a;
                            int i15 = networkUiState3.f6128d;
                            int i16 = networkUiState3.f6129g;
                            String str7 = networkUiState3.f6130r;
                            String str8 = networkUiState3.f6131x;
                            int i17 = networkUiState3.f6132y;
                            um.a aVar6 = networkUiState3.B;
                            com.staircase3.opensignal.utils.l lVar = networkUiState3.D;
                            int i18 = networkUiState3.G;
                            int i19 = networkUiState3.H;
                            int i20 = networkUiState3.I;
                            l.e(mVar, "strengthType");
                            l.e(str7, "networkTypeDetailed");
                            l.e(str8, "networkId");
                            l.e(aVar6, "networkType");
                            l.e(lVar, "networkGeneration");
                            dVar2.e(new NetworkUiState(mVar, i15, i16, str7, str8, i17, aVar6, lVar, str4, str6, i18, i19, i20), Integer.valueOf(speedTestResult3.B), "post_speed_test", longExtra);
                        }
                        ((kn.d) r22.getValue()).getClass();
                        kn.d.a("speed_test_result_screen");
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i11)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // i.j, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((kn.d) this.Z.getValue()).getClass();
        kn.d.c("speed_test_result_screen");
    }
}
