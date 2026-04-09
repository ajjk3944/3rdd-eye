package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import B0.g;
import B2.C0612a;
import B2.C0613b;
import B2.c;
import B2.r;
import P7.s;
import U7.f;
import android.app.Dialog;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C1748a;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.x;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import e8.d;
import x2.AbstractActivityC5757a;
import x2.q;

/* loaded from: classes.dex */
public class TricksActivity extends AbstractActivityC5757a implements View.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f22117m = 0;

    /* renamed from: e, reason: collision with root package name */
    public Button f22118e;

    /* renamed from: f, reason: collision with root package name */
    public Button f22119f;

    /* renamed from: g, reason: collision with root package name */
    public Button f22120g;

    /* renamed from: h, reason: collision with root package name */
    public Button f22121h;
    public Toolbar i;

    /* renamed from: j, reason: collision with root package name */
    public String f22122j = "bed";

    /* renamed from: k, reason: collision with root package name */
    public Dialog f22123k;

    /* renamed from: l, reason: collision with root package name */
    public d f22124l;

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_tricks;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() {
        this.f22124l = new d(this, "android.permission.CAMERA");
        this.f22118e = (Button) findViewById(R.id.bedroom);
        this.f22119f = (Button) findViewById(R.id.bathroom);
        this.f22120g = (Button) findViewById(R.id.changing);
        this.f22121h = (Button) findViewById(R.id.outside);
        this.i = (Toolbar) findViewById(R.id.toolbar);
        findViewById(R.id.detect).setOnClickListener(this);
        C0613b c0613b = new C0613b();
        m();
        this.f22118e.setCompoundDrawableTintList(getColorStateList(R.color.white));
        Button button = this.f22118e;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = g.f359a;
        button.setTextColor(g.b.a(resources, R.color.white, null));
        n(c0613b);
        this.i.setTitle(R.string.bedroom_camera);
        this.f22118e.setOnClickListener(this);
        this.f22119f.setOnClickListener(this);
        this.f22120g.setOnClickListener(this);
        this.f22121h.setOnClickListener(this);
    }

    public final void m() {
        this.f22118e.setCompoundDrawableTintList(getColorStateList(R.color.colorTextSecond));
        this.f22119f.setCompoundDrawableTintList(getColorStateList(R.color.colorTextSecond));
        this.f22120g.setCompoundDrawableTintList(getColorStateList(R.color.colorTextSecond));
        this.f22121h.setCompoundDrawableTintList(getColorStateList(R.color.colorTextSecond));
        Button button = this.f22118e;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = g.f359a;
        button.setTextColor(g.b.a(resources, R.color.colorTextSecond, null));
        this.f22119f.setTextColor(g.b.a(getResources(), R.color.colorTextSecond, null));
        this.f22120g.setTextColor(g.b.a(getResources(), R.color.colorTextSecond, null));
        this.f22121h.setTextColor(g.b.a(getResources(), R.color.colorTextSecond, null));
    }

    public final void n(ComponentCallbacksC1759l componentCallbacksC1759l) {
        x supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1748a c1748a = new C1748a(supportFragmentManager);
        c1748a.d(componentCallbacksC1759l, R.id.container_fragment);
        c1748a.g(false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int i = 7;
        switch (view.getId()) {
            case R.id.bathroom /* 2131361991 */:
                if (!this.f22122j.equals("bath")) {
                    m();
                    this.f22122j = "bath";
                    this.i.setTitle(R.string.bathroom_camera);
                    this.f22119f.setCompoundDrawableTintList(getColorStateList(R.color.white));
                    Button button = this.f22119f;
                    Resources resources = getResources();
                    ThreadLocal<TypedValue> threadLocal = g.f359a;
                    button.setTextColor(g.b.a(resources, R.color.white, null));
                    n(new C0612a());
                    s sVar = new s(0L, 7);
                    e.f37006D.getClass();
                    ((f) e.a.a().f37035y.f1156b).f(this, sVar);
                    break;
                }
                break;
            case R.id.bedroom /* 2131361992 */:
                if (!this.f22122j.equals("bed")) {
                    m();
                    this.f22122j = "bed";
                    this.i.setTitle(R.string.bedroom_camera);
                    this.f22118e.setCompoundDrawableTintList(getColorStateList(R.color.white));
                    Button button2 = this.f22118e;
                    Resources resources2 = getResources();
                    ThreadLocal<TypedValue> threadLocal2 = g.f359a;
                    button2.setTextColor(g.b.a(resources2, R.color.white, null));
                    n(new C0613b());
                    s sVar2 = new s(0L, 7);
                    e.f37006D.getClass();
                    ((f) e.a.a().f37035y.f1156b).f(this, sVar2);
                    break;
                }
                break;
            case R.id.changing /* 2131362054 */:
                if (!this.f22122j.equals("changing")) {
                    m();
                    this.f22122j = "changing";
                    this.i.setTitle(R.string.changing_camera);
                    this.f22120g.setCompoundDrawableTintList(getColorStateList(R.color.white));
                    Button button3 = this.f22120g;
                    Resources resources3 = getResources();
                    ThreadLocal<TypedValue> threadLocal3 = g.f359a;
                    button3.setTextColor(g.b.a(resources3, R.color.white, null));
                    n(new c());
                    s sVar3 = new s(0L, 7);
                    e.f37006D.getClass();
                    ((f) e.a.a().f37035y.f1156b).f(this, sVar3);
                    break;
                }
                break;
            case R.id.detect /* 2131362127 */:
                Dialog dialog = new Dialog(this, R.style.Theme_Dialog);
                this.f22123k = dialog;
                dialog.setCancelable(false);
                this.f22123k.setContentView(R.layout.infrared_dialog);
                ImageView imageView = (ImageView) this.f22123k.findViewById(R.id.device);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (int) ((getResources().getDisplayMetrics().density * 158.0f) + 0.5f), 0.0f, 0.0f);
                translateAnimation.setDuration(1200L);
                translateAnimation.setRepeatCount(12);
                translateAnimation.setRepeatMode(2);
                translateAnimation.setAnimationListener(new q());
                imageView.startAnimation(translateAnimation);
                this.f22123k.findViewById(R.id.ok).setOnClickListener(new r(this, i));
                this.f22123k.findViewById(R.id.close).setOnClickListener(new x2.r(this));
                this.f22123k.show();
                break;
            case R.id.outside /* 2131362554 */:
                if (!this.f22122j.equals("outside")) {
                    m();
                    this.f22122j = "outside";
                    this.i.setTitle(R.string.outside_camera);
                    this.f22121h.setCompoundDrawableTintList(getColorStateList(R.color.white));
                    Button button4 = this.f22121h;
                    Resources resources4 = getResources();
                    ThreadLocal<TypedValue> threadLocal4 = g.f359a;
                    button4.setTextColor(g.b.a(resources4, R.color.white, null));
                    n(new B2.g());
                    s sVar4 = new s(0L, 7);
                    e.f37006D.getClass();
                    ((f) e.a.a().f37035y.f1156b).f(this, sVar4);
                    break;
                }
                break;
        }
    }
}
