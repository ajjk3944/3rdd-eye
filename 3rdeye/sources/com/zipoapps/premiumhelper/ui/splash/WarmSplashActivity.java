package com.zipoapps.premiumhelper.ui.splash;

import B8.b;
import L0.I;
import L0.S;
import U7.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import c.C2012j;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import i8.r;
import java.util.WeakHashMap;
import kotlin.jvm.internal.l;

/* compiled from: WarmSplashActivity.kt */
@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes3.dex */
public class WarmSplashActivity extends AppCompatActivity implements o {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f37181f = 0;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f37182c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f37183d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f37184e;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.ph_activity_warm_splash);
        C2012j.a(this, null, 3);
        View viewFindViewById = findViewById(android.R.id.content);
        b bVar = new b(this, 2);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        I.d.u(viewFindViewById, bVar);
        this.f37184e = (ViewGroup) findViewById(android.R.id.content);
        this.f37182c = (ImageView) findViewById(R.id.ph_splash_logo_image);
        this.f37183d = (TextView) findViewById(R.id.ph_splash_title_text);
        ViewGroup viewGroup = this.f37184e;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(r.f38634d);
        l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(3);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        ImageView imageView = this.f37182c;
        if (imageView != null) {
            e.f37006D.getClass();
            e eVarA = e.a.a();
            Context applicationContext = getApplicationContext();
            l.e(applicationContext, "getApplicationContext(...)");
            eVarA.f37015d.getClass();
            imageView.setImageResource(applicationContext.getApplicationInfo().icon);
        }
        TextView textView2 = this.f37183d;
        if (textView2 != null) {
            e.f37006D.getClass();
            e eVarA2 = e.a.a();
            Context applicationContext2 = getApplicationContext();
            l.e(applicationContext2, "getApplicationContext(...)");
            textView2.setText(eVarA2.f37015d.c(applicationContext2));
        }
        if (colorStateList != null && (textView = this.f37183d) != null) {
            textView.setTextColor(colorStateList);
        }
        if (childAt == null || colorStateList2 == null) {
            return;
        }
        childAt.setBackgroundColor(colorStateList2.getDefaultColor());
    }
}
