package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions;

import A2.l;
import B0.g;
import F8.c;
import G2.b;
import G2.e;
import G2.f;
import G2.g;
import G2.h;
import G2.i;
import G2.k;
import I2.a;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.C1748a;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.x;
import com.anton46.stepsview.StepsView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.BackgroundVideoActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.BackgroundPermissions;
import x2.AbstractActivityC5757a;
import y0.C5788a;
import z0.C5848a;

/* loaded from: classes.dex */
public class BackgroundPermissions extends AbstractActivityC5757a implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f22184k = 0;

    /* renamed from: e, reason: collision with root package name */
    public StepsView f22185e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f22186f = {"Step 1", "Step 2", "Step 3", "Step 4", "Finish"};

    /* renamed from: g, reason: collision with root package name */
    public int f22187g = 0;

    /* renamed from: h, reason: collision with root package name */
    public Button f22188h;
    public Button i;

    /* renamed from: j, reason: collision with root package name */
    public Dialog f22189j;

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_background_permissions;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() throws Resources.NotFoundException {
        getSharedPreferences("PRIVATE", 0);
        Dialog dialog = new Dialog(this, R.style.Theme_Dialog);
        this.f22189j = dialog;
        dialog.setContentView(R.layout.skip_layout);
        this.f22189j.findViewById(R.id.allow).setOnClickListener(new f(this));
        this.f22189j.findViewById(R.id.no).setOnClickListener(new c(this, 1));
        this.f22185e = (StepsView) findViewById(R.id.stepsView);
        this.i = (Button) findViewById(R.id.next);
        this.f22188h = (Button) findViewById(R.id.skip);
        this.i.setOnClickListener(this);
        this.f22188h.setOnClickListener(this);
        n(new g());
        o(0);
    }

    public final void m() throws Resources.NotFoundException {
        this.f22188h.setVisibility(8);
        this.f22187g = 4;
        o(4);
        Button button = this.i;
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

    public final void o(int i) throws Resources.NotFoundException {
        StepsView stepsView = this.f22185e;
        String[] strArr = this.f22186f;
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
    public void onClick(View view) throws Resources.NotFoundException {
        int id = view.getId();
        if (id != R.id.next) {
            if (id != R.id.skip) {
                return;
            }
            this.f22189j.show();
            return;
        }
        int i = this.f22187g;
        if (i == 0) {
            C5788a.a(this, new String[]{"android.permission.CAMERA"}, 343);
            return;
        }
        if (i == 1) {
            if (Build.VERSION.SDK_INT >= 33) {
                C5788a.a(this, new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 345);
                return;
            } else {
                C5788a.a(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 345);
                return;
            }
        }
        if (i == 2) {
            C5788a.a(this, new String[]{"android.permission.RECORD_AUDIO"}, 305);
            return;
        }
        if (i == 3) {
            if (Build.VERSION.SDK_INT >= 33) {
                C5788a.a(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 324);
                return;
            } else {
                m();
                return;
            }
        }
        if (i == 4) {
            l.r();
            startActivity(new Intent(this, (Class<?>) BackgroundVideoActivity.class));
            finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Resources.NotFoundException {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 343) {
            if (C5848a.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
                if (C5788a.b(this, "android.permission.CAMERA")) {
                    q(getString(R.string.camera_permission_needed), getString(R.string.camera_permission_required), "android.permission.CAMERA", 343);
                    return;
                } else {
                    p(getString(R.string.camera), getString(R.string.this_app_needs_the_camera));
                    return;
                }
            }
            this.f22187g = 1;
            o(1);
            Button button = this.i;
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
            button.setBackground(g.a.a(resources, R.drawable.next_step_2, null));
            n(new k());
            return;
        }
        if (i == 345) {
            if (a.b(this)) {
                this.f22187g = 2;
                o(2);
                Button button2 = this.i;
                Resources resources2 = getResources();
                ThreadLocal<TypedValue> threadLocal2 = B0.g.f359a;
                button2.setBackground(g.a.a(resources2, R.drawable.next_step_3, null));
                n(new b());
                return;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (!(i10 >= 33 ? C5788a.b(this, "android.permission.READ_MEDIA_IMAGES") : C5788a.b(this, "android.permission.READ_EXTERNAL_STORAGE"))) {
                p(getString(R.string.storage_access), getString(R.string.this_app_needs_the_storage));
                return;
            } else if (i10 >= 33) {
                C5788a.a(this, new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 345);
                return;
            } else {
                C5788a.a(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 345);
                return;
            }
        }
        if (i != 305) {
            if (i == 324) {
                if (a.a(this)) {
                    m();
                    return;
                } else if (C5788a.b(this, "android.permission.POST_NOTIFICATIONS")) {
                    q(getString(R.string.notification_access), getString(R.string.notification_info), "android.permission.POST_NOTIFICATIONS", 324);
                    return;
                } else {
                    p(getString(R.string.notification_access), getString(R.string.notification_info));
                    return;
                }
            }
            return;
        }
        if (!(C5848a.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0)) {
            if (C5788a.b(this, "android.permission.RECORD_AUDIO")) {
                q(getString(R.string.record_audio), getString(R.string.permission_audio_info), "android.permission.RECORD_AUDIO", 305);
                return;
            } else {
                p(getString(R.string.record_audio), getString(R.string.permission_audio_info));
                return;
            }
        }
        this.f22187g = 3;
        o(3);
        Button button3 = this.i;
        Resources resources3 = getResources();
        ThreadLocal<TypedValue> threadLocal3 = B0.g.f359a;
        button3.setBackground(g.a.a(resources3, R.drawable.next_step_4, null));
        n(new i());
    }

    public final void p(String str, String str2) {
        new AlertDialog.Builder(this).setTitle(str).setMessage(str2).setPositiveButton(getResources().getString(R.string.go_to_settings), new C2.c(this, 1)).setNegativeButton(getResources().getString(R.string.cancel), new G2.c()).create().show();
    }

    public final void q(String str, String str2, final String str3, final int i) {
        new AlertDialog.Builder(this).setTitle(str).setMessage(str2).setPositiveButton(getResources().getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: G2.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = BackgroundPermissions.f22184k;
                BackgroundPermissions backgroundPermissions = this.f1891b;
                backgroundPermissions.getClass();
                C5788a.a(backgroundPermissions, new String[]{str3}, i);
            }
        }).setNegativeButton(getResources().getString(R.string.cancel), new e()).create().show();
    }
}
