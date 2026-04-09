package com.lefan.base.activity;

import B4.C0141c;
import B4.F;
import B4.r;
import F4.d;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c.AbstractC0391p;
import c1.g;
import c5.C0408e;
import c5.C0409f;
import c5.C0412i;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.activity.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.lefan.base.activity.SuggestActivity;
import e.C2291h;
import f.C2314a;
import h.AbstractActivityC2349g;
import h0.C2352b;
import java.util.HashMap;
import k0.K;
import q5.i;
import q5.m;
import q5.o;
import u2.C2954d;
import w4.C2978d;

/* loaded from: classes.dex */
public final class SuggestActivity extends AbstractActivityC2349g {

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ int f18766W = 0;

    /* renamed from: O, reason: collision with root package name */
    public LinearProgressIndicator f18767O;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f18769Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f18770R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f18771S;

    /* renamed from: T, reason: collision with root package name */
    public int f18772T;

    /* renamed from: U, reason: collision with root package name */
    public Button f18773U;

    /* renamed from: P, reason: collision with root package name */
    public final HashMap f18768P = new HashMap();

    /* renamed from: V, reason: collision with root package name */
    public final C2291h f18774V = (C2291h) p(new C2314a(0), new C2978d(this));

    public static void C(SuggestActivity suggestActivity, o oVar, o oVar2, String str, TextInputEditText textInputEditText) {
        if (suggestActivity.isFinishing() || suggestActivity.isDestroyed()) {
            return;
        }
        LinearProgressIndicator linearProgressIndicator = suggestActivity.f18767O;
        if (linearProgressIndicator != null) {
            linearProgressIndicator.b();
        }
        if (i.a(oVar.f23299a, "success")) {
            oVar2.f23299a = str;
            d.b(suggestActivity, suggestActivity.getString(R.string.suggest_success_tip));
            suggestActivity.finish();
            return;
        }
        K kS = suggestActivity.s();
        g gVar = new g(27, false);
        gVar.f5897c = suggestActivity.getString(R.string.suggest_failed);
        gVar.f5896b = suggestActivity.getString(R.string.suggest_failed_tip);
        gVar.f5898d = suggestActivity.getString(R.string.send_email);
        C2954d c2954d = new C2954d(suggestActivity, textInputEditText);
        if (kS == null) {
            return;
        }
        C0141c c0141c = new C0141c();
        c0141c.f704C0 = gVar;
        c0141c.f703B0 = c2954d;
        c0141c.e0(kS, "custom_dialog");
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_suggest);
        View viewFindViewById = findViewById(R.id.appbar);
        i.d(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(R.id.suggest_scrollview);
        i.d(viewFindViewById2, "findViewById(...)");
        d.a(viewFindViewById, viewFindViewById2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.suggest_toolbar);
        B(toolbar);
        com.bumptech.glide.d dVarR = r();
        if (dVarR != null) {
            dVarR.S(true);
        }
        final int i = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: w4.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuggestActivity f23977b;

            {
                this.f23977b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SuggestActivity suggestActivity = this.f23977b;
                switch (i3) {
                    case 0:
                        int i6 = SuggestActivity.f18766W;
                        suggestActivity.finish();
                        break;
                    case 1:
                        HashMap map = suggestActivity.f18768P;
                        if (map.get(0) != null) {
                            F f2 = new F();
                            f2.f697A0 = (Uri) map.get(0);
                            f2.f699C0 = new C2352b(15, suggestActivity);
                            f2.e0(suggestActivity.s(), "suggest_image_dialog");
                            break;
                        } else {
                            suggestActivity.f18772T = 0;
                            suggestActivity.f18774V.a("image/*");
                            break;
                        }
                    case 2:
                        HashMap map2 = suggestActivity.f18768P;
                        if (map2.get(1) != null) {
                            F f5 = new F();
                            f5.f697A0 = (Uri) map2.get(1);
                            f5.f699C0 = new d4.h(22, suggestActivity);
                            f5.e0(suggestActivity.s(), "suggest_image_dialog");
                            break;
                        } else {
                            suggestActivity.f18772T = 1;
                            suggestActivity.f18774V.a("image/*");
                            break;
                        }
                    default:
                        HashMap map3 = suggestActivity.f18768P;
                        if (map3.get(2) != null) {
                            F f6 = new F();
                            f6.f697A0 = (Uri) map3.get(2);
                            f6.f699C0 = new h2.d(suggestActivity);
                            f6.e0(suggestActivity.s(), "suggest_image_dialog");
                            break;
                        } else {
                            suggestActivity.f18772T = 2;
                            suggestActivity.f18774V.a("image/*");
                            break;
                        }
                }
            }
        });
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) findViewById(R.id.suggest_indicator);
        this.f18767O = linearProgressIndicator;
        if (linearProgressIndicator != null) {
            linearProgressIndicator.b();
        }
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131072);
        }
        this.f18773U = (Button) findViewById(R.id.suggest_btn);
        this.f18769Q = (ImageView) findViewById(R.id.suggest_img1);
        this.f18770R = (ImageView) findViewById(R.id.suggest_img2);
        this.f18771S = (ImageView) findViewById(R.id.suggest_img3);
        final TextView textView = (TextView) findViewById(R.id.type_tip);
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(R.id.suggest_edit);
        ((MaterialButton) findViewById(R.id.email_btn)).setOnLongClickListener(new View.OnLongClickListener() { // from class: w4.f
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object objD;
                SuggestActivity suggestActivity = this.f23978a;
                int i3 = SuggestActivity.f18766W;
                try {
                    Object systemService = suggestActivity.getSystemService("clipboard");
                    i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("copy", "lefan2023@126.com"));
                    objD = C0412i.f5929a;
                } catch (Throwable th) {
                    objD = R2.a.d(th);
                }
                if (C0409f.a(objD) != null) {
                    F4.d.b(suggestActivity, suggestActivity.getString(R.string.copy_failed));
                }
                if (objD instanceof C0408e) {
                    return true;
                }
                F4.d.b(suggestActivity, suggestActivity.getResources().getString(R.string.copy_success));
                return true;
            }
        });
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.type_select);
        final m mVar = new m();
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: w4.g
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j6) {
                int i6 = SuggestActivity.f18766W;
                mVar.f23297a = i3;
                TextView textView2 = textView;
                SuggestActivity suggestActivity = this;
                if (i3 == 0) {
                    textView2.setText(suggestActivity.getString(R.string.suggest_corruption_tip));
                    return;
                }
                if (i3 == 1) {
                    textView2.setText(suggestActivity.getString(R.string.suggest_dysfunction_tip));
                    return;
                }
                if (i3 == 2) {
                    textView2.setText(suggestActivity.getString(R.string.suggest_advertising_tip));
                    return;
                }
                if (i3 == 3) {
                    textView2.setText(suggestActivity.getString(R.string.suggest_content_tip));
                } else if (i3 == 4) {
                    textView2.setText(suggestActivity.getString(R.string.suggest_translate_tip));
                } else {
                    if (i3 != 5) {
                        return;
                    }
                    textView2.setText(suggestActivity.getString(R.string.suggest_other_tip));
                }
            }
        });
        ImageView imageView = this.f18769Q;
        if (imageView != null) {
            final int i3 = 1;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: w4.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SuggestActivity f23977b;

                {
                    this.f23977b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i3;
                    SuggestActivity suggestActivity = this.f23977b;
                    switch (i32) {
                        case 0:
                            int i6 = SuggestActivity.f18766W;
                            suggestActivity.finish();
                            break;
                        case 1:
                            HashMap map = suggestActivity.f18768P;
                            if (map.get(0) != null) {
                                F f2 = new F();
                                f2.f697A0 = (Uri) map.get(0);
                                f2.f699C0 = new C2352b(15, suggestActivity);
                                f2.e0(suggestActivity.s(), "suggest_image_dialog");
                                break;
                            } else {
                                suggestActivity.f18772T = 0;
                                suggestActivity.f18774V.a("image/*");
                                break;
                            }
                        case 2:
                            HashMap map2 = suggestActivity.f18768P;
                            if (map2.get(1) != null) {
                                F f5 = new F();
                                f5.f697A0 = (Uri) map2.get(1);
                                f5.f699C0 = new d4.h(22, suggestActivity);
                                f5.e0(suggestActivity.s(), "suggest_image_dialog");
                                break;
                            } else {
                                suggestActivity.f18772T = 1;
                                suggestActivity.f18774V.a("image/*");
                                break;
                            }
                        default:
                            HashMap map3 = suggestActivity.f18768P;
                            if (map3.get(2) != null) {
                                F f6 = new F();
                                f6.f697A0 = (Uri) map3.get(2);
                                f6.f699C0 = new h2.d(suggestActivity);
                                f6.e0(suggestActivity.s(), "suggest_image_dialog");
                                break;
                            } else {
                                suggestActivity.f18772T = 2;
                                suggestActivity.f18774V.a("image/*");
                                break;
                            }
                    }
                }
            });
        }
        ImageView imageView2 = this.f18770R;
        if (imageView2 != null) {
            final int i6 = 2;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: w4.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SuggestActivity f23977b;

                {
                    this.f23977b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i6;
                    SuggestActivity suggestActivity = this.f23977b;
                    switch (i32) {
                        case 0:
                            int i62 = SuggestActivity.f18766W;
                            suggestActivity.finish();
                            break;
                        case 1:
                            HashMap map = suggestActivity.f18768P;
                            if (map.get(0) != null) {
                                F f2 = new F();
                                f2.f697A0 = (Uri) map.get(0);
                                f2.f699C0 = new C2352b(15, suggestActivity);
                                f2.e0(suggestActivity.s(), "suggest_image_dialog");
                                break;
                            } else {
                                suggestActivity.f18772T = 0;
                                suggestActivity.f18774V.a("image/*");
                                break;
                            }
                        case 2:
                            HashMap map2 = suggestActivity.f18768P;
                            if (map2.get(1) != null) {
                                F f5 = new F();
                                f5.f697A0 = (Uri) map2.get(1);
                                f5.f699C0 = new d4.h(22, suggestActivity);
                                f5.e0(suggestActivity.s(), "suggest_image_dialog");
                                break;
                            } else {
                                suggestActivity.f18772T = 1;
                                suggestActivity.f18774V.a("image/*");
                                break;
                            }
                        default:
                            HashMap map3 = suggestActivity.f18768P;
                            if (map3.get(2) != null) {
                                F f6 = new F();
                                f6.f697A0 = (Uri) map3.get(2);
                                f6.f699C0 = new h2.d(suggestActivity);
                                f6.e0(suggestActivity.s(), "suggest_image_dialog");
                                break;
                            } else {
                                suggestActivity.f18772T = 2;
                                suggestActivity.f18774V.a("image/*");
                                break;
                            }
                    }
                }
            });
        }
        ImageView imageView3 = this.f18771S;
        if (imageView3 != null) {
            final int i7 = 3;
            imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: w4.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SuggestActivity f23977b;

                {
                    this.f23977b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i7;
                    SuggestActivity suggestActivity = this.f23977b;
                    switch (i32) {
                        case 0:
                            int i62 = SuggestActivity.f18766W;
                            suggestActivity.finish();
                            break;
                        case 1:
                            HashMap map = suggestActivity.f18768P;
                            if (map.get(0) != null) {
                                F f2 = new F();
                                f2.f697A0 = (Uri) map.get(0);
                                f2.f699C0 = new C2352b(15, suggestActivity);
                                f2.e0(suggestActivity.s(), "suggest_image_dialog");
                                break;
                            } else {
                                suggestActivity.f18772T = 0;
                                suggestActivity.f18774V.a("image/*");
                                break;
                            }
                        case 2:
                            HashMap map2 = suggestActivity.f18768P;
                            if (map2.get(1) != null) {
                                F f5 = new F();
                                f5.f697A0 = (Uri) map2.get(1);
                                f5.f699C0 = new d4.h(22, suggestActivity);
                                f5.e0(suggestActivity.s(), "suggest_image_dialog");
                                break;
                            } else {
                                suggestActivity.f18772T = 1;
                                suggestActivity.f18774V.a("image/*");
                                break;
                            }
                        default:
                            HashMap map3 = suggestActivity.f18768P;
                            if (map3.get(2) != null) {
                                F f6 = new F();
                                f6.f697A0 = (Uri) map3.get(2);
                                f6.f699C0 = new h2.d(suggestActivity);
                                f6.e0(suggestActivity.s(), "suggest_image_dialog");
                                break;
                            } else {
                                suggestActivity.f18772T = 2;
                                suggestActivity.f18774V.a("image/*");
                                break;
                            }
                    }
                }
            });
        }
        ((MaterialButton) findViewById(R.id.email_btn)).setOnClickListener(new r(this, 18, textInputEditText));
        o oVar = new o();
        oVar.f23299a = "";
        ((MaterialButton) findViewById(R.id.suggest_btn)).setOnClickListener(new a(this, mVar, textInputEditText, oVar, 1));
    }
}
