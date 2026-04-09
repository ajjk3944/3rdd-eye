package O4;

import A1.m;
import B4.r;
import a4.p;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Q;
import c5.C0410g;
import com.apm.insight.R;
import com.bumptech.glide.n;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import com.lefan.signal.network.webSpeed.WebSpeedRoom_Impl;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.K;
import o.m1;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class l extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public m1 f3090A0;

    /* renamed from: B0, reason: collision with root package name */
    public final C0410g f3091B0 = new C0410g(new D4.c(4, this));

    /* renamed from: C0, reason: collision with root package name */
    public AppCompatImageView f3092C0;

    /* renamed from: D0, reason: collision with root package name */
    public AppCompatTextView f3093D0;

    /* renamed from: E0, reason: collision with root package name */
    public MaterialButton f3094E0;

    /* renamed from: F0, reason: collision with root package name */
    public TextInputEditText f3095F0;

    /* renamed from: G0, reason: collision with root package name */
    public LinearProgressIndicator f3096G0;

    /* renamed from: H0, reason: collision with root package name */
    public final Pattern f3097H0;

    /* renamed from: I0, reason: collision with root package name */
    public final Pattern f3098I0;

    /* renamed from: J0, reason: collision with root package name */
    public WebSpeedBean f3099J0;

    /* renamed from: K0, reason: collision with root package name */
    public h f3100K0;

    public l() {
        Pattern patternCompile = Pattern.compile("<title[^>]*>(.*?)</title>", 2);
        q5.i.d(patternCompile, "compile(...)");
        this.f3097H0 = patternCompile;
        Pattern patternCompile2 = Pattern.compile("href=(['\"])([^'\"]*)\\1", 2);
        q5.i.d(patternCompile2, "compile(...)");
        this.f3098I0 = patternCompile2;
        this.f3099J0 = new WebSpeedBean();
    }

    public static final String g0(l lVar, String str, String str2) {
        String strGroup;
        String strGroup2 = null;
        try {
            Matcher matcher = lVar.f3098I0.matcher(str2);
            q5.i.d(matcher, "matcher(...)");
            while (matcher.find()) {
                strGroup = matcher.group(2);
                if (strGroup != null && (y5.l.V(strGroup, ".ico", false) || y5.l.V(strGroup, ".png", false) || y5.l.V(strGroup, ".jpg", false))) {
                    break;
                }
            }
        } catch (Throwable th) {
            R2.a.d(th);
        }
        strGroup = null;
        if (strGroup == null || strGroup.length() == 0) {
            if (str.length() != 0) {
                Pattern patternCompile = Pattern.compile("(?<=http://|\\.)[^.]*?\\.(com|cn|net|org|biz|info|cc|tv)", 2);
                q5.i.d(patternCompile, "compile(...)");
                Matcher matcher2 = patternCompile.matcher(str);
                q5.i.d(matcher2, "matcher(...)");
                matcher2.find();
                try {
                    strGroup2 = matcher2.group();
                } catch (Throwable th2) {
                    R2.a.d(th2);
                }
            }
            return A.f.m("https://", strGroup2, "/favicon.ico");
        }
        if (strGroup.startsWith("http")) {
            return strGroup;
        }
        if (str.length() != 0) {
            Pattern patternCompile2 = Pattern.compile("(?<=http://|\\.)[^.]*?\\.(com|cn|net|org|biz|info|cc|tv)", 2);
            q5.i.d(patternCompile2, "compile(...)");
            Matcher matcher3 = patternCompile2.matcher(str);
            q5.i.d(matcher3, "matcher(...)");
            matcher3.find();
            try {
                strGroup2 = matcher3.group();
            } catch (Throwable th3) {
                R2.a.d(th3);
            }
        }
        return "https://" + strGroup2 + "/" + ((Object) strGroup);
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_web_speed, viewGroup, false);
        int i = R.id.loading;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) p.e(R.id.loading, viewInflate);
        if (linearProgressIndicator != null) {
            i = R.id.negative_btn;
            MaterialButton materialButton = (MaterialButton) p.e(R.id.negative_btn, viewInflate);
            if (materialButton != null) {
                i = R.id.positive_btn;
                MaterialButton materialButton2 = (MaterialButton) p.e(R.id.positive_btn, viewInflate);
                if (materialButton2 != null) {
                    i = R.id.web_logo;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) p.e(R.id.web_logo, viewInflate);
                    if (appCompatImageView != null) {
                        i = R.id.web_name;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.web_name, viewInflate);
                        if (appCompatTextView != null) {
                            i = R.id.web_speed;
                            TextView textView = (TextView) p.e(R.id.web_speed, viewInflate);
                            if (textView != null) {
                                i = R.id.web_url;
                                TextInputEditText textInputEditText = (TextInputEditText) p.e(R.id.web_url, viewInflate);
                                if (textInputEditText != null) {
                                    i = R.id.web_url_input;
                                    TextInputLayout textInputLayout = (TextInputLayout) p.e(R.id.web_url_input, viewInflate);
                                    if (textInputLayout != null) {
                                        this.f3090A0 = new m1((LinearLayout) viewInflate, linearProgressIndicator, materialButton, materialButton2, appCompatImageView, appCompatTextView, textView, textInputEditText, textInputLayout);
                                        this.f3092C0 = appCompatImageView;
                                        this.f3093D0 = appCompatTextView;
                                        m1 m1Var = this.f3090A0;
                                        q5.i.b(m1Var);
                                        this.f3094E0 = (MaterialButton) m1Var.f22586f;
                                        m1 m1Var2 = this.f3090A0;
                                        q5.i.b(m1Var2);
                                        this.f3095F0 = (TextInputEditText) m1Var2.f22587g;
                                        m1 m1Var3 = this.f3090A0;
                                        q5.i.b(m1Var3);
                                        this.f3096G0 = (LinearProgressIndicator) m1Var3.f22584d;
                                        m1 m1Var4 = this.f3090A0;
                                        q5.i.b(m1Var4);
                                        final int i3 = 0;
                                        ((MaterialButton) m1Var4.f22585e).setOnClickListener(new View.OnClickListener(this) { // from class: O4.f

                                            /* renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ l f3081b;

                                            {
                                                this.f3081b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i3) {
                                                    case 0:
                                                        this.f3081b.X();
                                                        return;
                                                    default:
                                                        l lVar = this.f3081b;
                                                        e eVar = (e) lVar.f3091B0.getValue();
                                                        WebSpeedBean webSpeedBean = lVar.f3099J0;
                                                        WebSpeedRoom_Impl webSpeedRoom_Impl = eVar.f3077a;
                                                        webSpeedRoom_Impl.b();
                                                        webSpeedRoom_Impl.c();
                                                        try {
                                                            eVar.f3078b.f(webSpeedBean);
                                                            webSpeedRoom_Impl.m();
                                                            webSpeedRoom_Impl.j();
                                                            h hVar = lVar.f3100K0;
                                                            if (hVar != null) {
                                                                hVar.b(lVar.f3099J0);
                                                            }
                                                            lVar.X();
                                                            return;
                                                        } catch (Throwable th) {
                                                            webSpeedRoom_Impl.j();
                                                            throw th;
                                                        }
                                                }
                                            }
                                        });
                                        MaterialButton materialButton3 = this.f3094E0;
                                        if (materialButton3 != null) {
                                            final int i6 = 1;
                                            materialButton3.setOnClickListener(new View.OnClickListener(this) { // from class: O4.f

                                                /* renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ l f3081b;

                                                {
                                                    this.f3081b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i6) {
                                                        case 0:
                                                            this.f3081b.X();
                                                            return;
                                                        default:
                                                            l lVar = this.f3081b;
                                                            e eVar = (e) lVar.f3091B0.getValue();
                                                            WebSpeedBean webSpeedBean = lVar.f3099J0;
                                                            WebSpeedRoom_Impl webSpeedRoom_Impl = eVar.f3077a;
                                                            webSpeedRoom_Impl.b();
                                                            webSpeedRoom_Impl.c();
                                                            try {
                                                                eVar.f3078b.f(webSpeedBean);
                                                                webSpeedRoom_Impl.m();
                                                                webSpeedRoom_Impl.j();
                                                                h hVar = lVar.f3100K0;
                                                                if (hVar != null) {
                                                                    hVar.b(lVar.f3099J0);
                                                                }
                                                                lVar.X();
                                                                return;
                                                            } catch (Throwable th) {
                                                                webSpeedRoom_Impl.j();
                                                                throw th;
                                                            }
                                                    }
                                                }
                                            });
                                        }
                                        m1 m1Var5 = this.f3090A0;
                                        q5.i.b(m1Var5);
                                        final TextInputLayout textInputLayout2 = (TextInputLayout) m1Var5.f22588h;
                                        TextInputEditText textInputEditText2 = this.f3095F0;
                                        if (textInputEditText2 != null) {
                                            textInputEditText2.addTextChangedListener(new i(textInputLayout2, this));
                                        }
                                        textInputLayout2.setEndIconOnClickListener(new r(textInputLayout2, 6, this));
                                        TextInputEditText textInputEditText3 = this.f3095F0;
                                        if (textInputEditText3 != null) {
                                            textInputEditText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: O4.g
                                                @Override // android.widget.TextView.OnEditorActionListener
                                                public final boolean onEditorAction(TextView textView2, int i7, KeyEvent keyEvent) {
                                                    if (i7 == 6 && !textInputLayout2.f18547k.f2922q) {
                                                        l lVar = this;
                                                        String url = lVar.f3099J0.getUrl();
                                                        if (url != null && !url.startsWith("http")) {
                                                            WebSpeedBean webSpeedBean = lVar.f3099J0;
                                                            webSpeedBean.setUrl("https://" + webSpeedBean.getUrl());
                                                            TextInputEditText textInputEditText4 = lVar.f3095F0;
                                                            if (textInputEditText4 != null) {
                                                                textInputEditText4.setText(lVar.f3099J0.getUrl());
                                                            }
                                                        }
                                                        lVar.i0();
                                                    }
                                                    return false;
                                                }
                                            });
                                        }
                                        h0();
                                        m1 m1Var6 = this.f3090A0;
                                        q5.i.b(m1Var6);
                                        LinearLayout linearLayout = (LinearLayout) m1Var6.f22583c;
                                        q5.i.d(linearLayout, "getRoot(...)");
                                        return linearLayout;
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

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3090A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        Dialog dialog = this.v0;
        k3.e eVar = dialog instanceof k3.e ? (k3.e) dialog : null;
        if (eVar == null || (bottomSheetBehaviorH = eVar.h()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = q().getDisplayMetrics();
        q5.i.d(displayMetrics, "getDisplayMetrics(...)");
        int i = displayMetrics.heightPixels;
        bottomSheetBehaviorH.f18157l = i > displayMetrics.widthPixels ? (i * 2) / 3 : (i * 4) / 5;
        bottomSheetBehaviorH.I(3);
        bottomSheetBehaviorH.f18134X = true;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }

    public final void h0() {
        String str;
        n nVarP;
        View view;
        AppCompatImageView appCompatImageView = this.f3092C0;
        if (appCompatImageView != null) {
            Context contextM = m();
            H1.g.c(contextM, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
            m mVar = com.bumptech.glide.b.a(contextM).f6488e;
            mVar.getClass();
            H1.g.c(m(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
            char[] cArr = H1.p.f1779a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (k() != null) {
                    mVar.f112b.a(k());
                }
                K kL = l();
                Context contextM2 = m();
                nVarP = mVar.f113c.p(contextM2, com.bumptech.glide.b.a(contextM2.getApplicationContext()), this.b0, kL, (!v() || w() || (view = this.f21696T) == null || view.getWindowToken() == null || this.f21696T.getVisibility() != 0) ? false : true);
            } else {
                nVarP = mVar.b(m().getApplicationContext());
            }
            String logo = this.f3099J0.getLogo();
            nVarP.getClass();
            ((com.bumptech.glide.l) new com.bumptech.glide.l(nVarP.f6568a, nVarP, Drawable.class, nVarP.f6569b).x(logo).e()).w(appCompatImageView);
        }
        AppCompatTextView appCompatTextView = this.f3093D0;
        if (appCompatTextView != null) {
            appCompatTextView.setText(this.f3099J0.getName());
        }
        TextInputEditText textInputEditText = this.f3095F0;
        if (textInputEditText != null) {
            textInputEditText.setText(this.f3099J0.getUrl());
        }
        if (!this.f3099J0.isLoad()) {
            String url = this.f3099J0.getUrl();
            if (url == null || url.length() == 0) {
                m1 m1Var = this.f3090A0;
                q5.i.b(m1Var);
                ((TextView) m1Var.f22582b).setText((CharSequence) null);
                return;
            } else {
                m1 m1Var2 = this.f3090A0;
                q5.i.b(m1Var2);
                TextView textView = (TextView) m1Var2.f22582b;
                Context contextM3 = m();
                textView.setText(contextM3 != null ? contextM3.getString(R.string.detection) : null);
                i0();
                return;
            }
        }
        m1 m1Var3 = this.f3090A0;
        q5.i.b(m1Var3);
        TextView textView2 = (TextView) m1Var3.f22582b;
        if (this.f3099J0.getSpeed() < 0.0d) {
            Context contextM4 = m();
            if (contextM4 != null) {
                string = contextM4.getString(R.string.test_web_error);
            }
        } else {
            Double dValueOf = Double.valueOf(this.f3099J0.getSpeed());
            if (R2.a.f3390d) {
                Locale locale = F4.e.f1457a;
                str = String.format(F4.e.b(), "%.2fms", Arrays.copyOf(new Object[]{dValueOf}, 1));
            } else {
                str = String.format(Locale.ENGLISH, "%.2fms", Arrays.copyOf(new Object[]{dValueOf}, 1));
            }
            string = str;
        }
        textView2.setText(string);
    }

    public final void i0() {
        AbstractC3046w.l(Q.f(this), null, new k(this, null), 3);
    }
}
