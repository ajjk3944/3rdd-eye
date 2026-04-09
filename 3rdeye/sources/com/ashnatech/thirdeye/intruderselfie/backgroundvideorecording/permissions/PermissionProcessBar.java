package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions;

import B0.g;
import D8.e;
import G2.g;
import G2.h;
import G2.j;
import G2.k;
import I2.i;
import J8.C0688c;
import android.app.Dialog;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.C1748a;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.x;
import b9.C1992A;
import c.AbstractC2021s;
import com.anton46.stepsview.StepsView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.MainActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.receiver.AdminReceiver;
import com.zipoapps.premiumhelper.e;
import e8.c;
import e8.d;
import e8.f;
import kotlin.jvm.internal.l;
import p9.InterfaceC5480a;
import t4.C5606d;
import x2.AbstractActivityC5757a;

/* loaded from: classes.dex */
public class PermissionProcessBar extends AbstractActivityC5757a implements View.OnClickListener {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f22190r = false;

    /* renamed from: f, reason: collision with root package name */
    public StepsView f22192f;

    /* renamed from: g, reason: collision with root package name */
    public ComponentName f22193g;

    /* renamed from: h, reason: collision with root package name */
    public DevicePolicyManager f22194h;

    /* renamed from: k, reason: collision with root package name */
    public Button f22196k;

    /* renamed from: l, reason: collision with root package name */
    public Button f22197l;

    /* renamed from: m, reason: collision with root package name */
    public Dialog f22198m;

    /* renamed from: n, reason: collision with root package name */
    public d f22199n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f22200o;

    /* renamed from: p, reason: collision with root package name */
    public c f22201p;

    /* renamed from: q, reason: collision with root package name */
    public d f22202q;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22191e = false;
    public final String[] i = {"Step 1", "Step 2", "Step 3", "Step 4", "Finish"};

    /* renamed from: j, reason: collision with root package name */
    public int f22195j = 0;

    public class a extends AbstractC2021s {
        public a() {
            super(true);
        }

        @Override // c.AbstractC2021s
        public final void a() {
            PermissionProcessBar.this.f22198m.show();
        }
    }

    public class b implements InterfaceC5480a<C1992A> {
        public b() {
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            boolean z10 = PermissionProcessBar.f22190r;
            PermissionProcessBar.this.m();
            return null;
        }
    }

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_permission_process_bar;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() {
        this.f22200o = Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        this.f22199n = new d(this, "android.permission.CAMERA");
        this.f22201p = new c(this, this.f22200o);
        this.f22202q = new d(this, "android.permission.POST_NOTIFICATIONS");
        getSharedPreferences("PRIVATE", 0);
        this.f22194h = (DevicePolicyManager) getSystemService("device_policy");
        this.f22193g = new ComponentName(this, (Class<?>) AdminReceiver.class);
        Dialog dialog = new Dialog(this, R.style.Theme_Dialog);
        this.f22198m = dialog;
        dialog.setContentView(R.layout.skip_layout);
        this.f22198m.findViewById(R.id.allow).setOnClickListener(new F8.c(this, 2));
        this.f22198m.findViewById(R.id.no).setOnClickListener(new e(this, 1));
        this.f22192f = (StepsView) findViewById(R.id.stepsView);
        this.f22197l = (Button) findViewById(R.id.next);
        this.f22196k = (Button) findViewById(R.id.skip);
        this.f22197l.setOnClickListener(this);
        this.f22196k.setOnClickListener(this);
        n(new g());
        o(0);
        getOnBackPressedDispatcher().a(this, new a());
    }

    public final void m() {
        this.f22196k.setVisibility(8);
        this.f22195j = 4;
        o(4);
        Button button = this.f22197l;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
        button.setBackground(g.a.a(resources, R.drawable.next_step_finish, null));
        n(new h());
    }

    public final void n(ComponentCallbacksC1759l componentCallbacksC1759l) {
        x supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1748a c1748a = new C1748a(supportFragmentManager);
        c1748a.f15785b = R.anim.enter_from_right;
        c1748a.f15786c = R.anim.exit_to_left;
        c1748a.f15787d = R.anim.enter_from_left;
        c1748a.f15788e = R.anim.exit_to_right;
        c1748a.d(componentCallbacksC1759l, R.id.container_fragment);
        c1748a.g(false);
    }

    public final void o(int i) {
        StepsView stepsView = this.f22192f;
        String[] strArr = this.i;
        stepsView.f18727d = strArr;
        stepsView.f18725b.setStepSize(strArr.length);
        int color = getResources().getColor(R.color.colorStepProgress);
        stepsView.f18730g = color;
        stepsView.f18725b.setBarColor(color);
        int color2 = getResources().getColor(R.color.colorOrange);
        stepsView.f18728e = color2;
        stepsView.f18725b.setProgressColor(color2);
        stepsView.f18729f = getResources().getColor(R.color.colorPrimaryDark);
        stepsView.f18731h = i;
        stepsView.f18725b.setCompletedPosition(i);
        stepsView.a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2;
        int i10 = 0;
        int i11 = 1;
        int id = view.getId();
        if (id != R.id.next) {
            if (id != R.id.skip) {
                return;
            }
            this.f22198m.show();
            return;
        }
        int i12 = this.f22195j;
        if (i12 == 0) {
            if (!f.a(this, "android.permission.CAMERA")) {
                C5606d.B(this, this.f22199n, new j(this, i10));
                return;
            }
            this.f22195j = 1;
            o(1);
            Button button = this.f22197l;
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
            button.setBackground(g.a.a(resources, R.drawable.next_step_2, null));
            n(new k());
            return;
        }
        if (i12 == 1) {
            String[] permission = this.f22200o;
            l.f(permission, "permission");
            for (String str : permission) {
                if (!f.a(this, str)) {
                    c permissionRequester = this.f22201p;
                    G1.e eVar = new G1.e(this, i11);
                    l.f(permissionRequester, "permissionRequester");
                    permissionRequester.f37764e = new i(eVar, i10);
                    permissionRequester.f37765f = new I2.j();
                    permissionRequester.f37766g = new I2.k(this, permissionRequester);
                    permissionRequester.f37767h = new I2.l(this);
                    permissionRequester.b();
                    return;
                }
            }
            this.f22195j = 2;
            o(2);
            Button button2 = this.f22197l;
            Resources resources2 = getResources();
            ThreadLocal<TypedValue> threadLocal2 = B0.g.f359a;
            button2.setBackground(g.a.a(resources2, R.drawable.next_step_3, null));
            n(new G2.a());
            return;
        }
        if (i12 == 2) {
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            e.a.a().f();
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", this.f22193g);
            intent.putExtra("android.app.extra.ADD_EXPLANATION", getString(R.string.device_admin_explanation));
            startActivity(intent);
            this.f22191e = true;
            return;
        }
        if (i12 == 3) {
            if (f.a(this, "android.permission.POST_NOTIFICATIONS")) {
                m();
                return;
            } else {
                C5606d.B(this, this.f22202q, new b());
                return;
            }
        }
        if (i12 == 4) {
            f22190r = true;
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            eVarA.f37024n.f12498g = true;
            getApplication().registerActivityLifecycleCallbacks(new C0688c(this, kotlin.jvm.internal.x.a(getClass()).d(), new A2.c(eVarA, i)));
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        }
    }

    @Override // x2.AbstractActivityC5757a, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f22191e) {
            if (!this.f22194h.isAdminActive(this.f22193g)) {
                this.f22191e = true;
                return;
            }
            this.f22195j = 3;
            o(3);
            Button button = this.f22197l;
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
            button.setBackground(g.a.a(resources, R.drawable.next_step_4, null));
            n(new G2.i());
            this.f22191e = false;
        }
    }
}
