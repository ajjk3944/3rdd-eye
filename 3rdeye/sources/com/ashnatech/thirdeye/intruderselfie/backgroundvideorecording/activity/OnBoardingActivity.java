package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import B0.g;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import c.AbstractC2021s;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zipoapps.premiumhelper.e;
import y2.C5801c;

/* loaded from: classes.dex */
public class OnBoardingActivity extends AppCompatActivity implements View.OnClickListener {
    public static final /* synthetic */ int i = 0;

    /* renamed from: c, reason: collision with root package name */
    public ViewPager f22099c;

    /* renamed from: d, reason: collision with root package name */
    public C5801c f22100d;

    /* renamed from: f, reason: collision with root package name */
    public Button f22102f;

    /* renamed from: g, reason: collision with root package name */
    public FloatingActionButton f22103g;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f22101e = {R.layout.onboarding_screen_one, R.layout.onboarding_screen_two, R.layout.onboarding_screen_three, R.layout.onboarding_screen_four};

    /* renamed from: h, reason: collision with root package name */
    public boolean f22104h = false;

    public class a extends AbstractC2021s {
        public a() {
            super(true);
        }

        @Override // c.AbstractC2021s
        public final void a() {
            int i = OnBoardingActivity.i;
            OnBoardingActivity.this.l();
        }
    }

    public final void k(int i10) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.dotsLayout);
        linearLayout.removeAllViews();
        for (int i11 = 0; i11 < this.f22100d.f48019b.length; i11++) {
            ImageView imageView = new ImageView(this);
            imageView.setPadding(12, 12, 12, 12);
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = g.f359a;
            imageView.setImageDrawable(g.a.a(resources, R.drawable.dot_inactive, null));
            if (i11 == i10) {
                imageView.setImageDrawable(g.a.a(getResources(), R.drawable.dot_active, null));
            }
            if (i10 == 3) {
                this.f22104h = true;
            } else {
                this.f22104h = false;
            }
            linearLayout.addView(imageView);
        }
    }

    public final void l() {
        e.f37006D.getClass();
        e eVarA = e.a.a();
        eVarA.i.n(Boolean.TRUE, "intro_complete");
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        int id = view.getId();
        if (id == R.id.skip) {
            l();
            return;
        }
        if (id == R.id.next) {
            if (this.f22104h) {
                l();
                return;
            }
            int currentItem = this.f22099c.getCurrentItem();
            if (currentItem < this.f22100d.f48019b.length - 1) {
                this.f22099c.setCurrentItem(currentItem + 1);
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        I2.a.c(this);
        setContentView(R.layout.activity_on_boarding);
        getOnBackPressedDispatcher().a(this, new a());
        this.f22102f = (Button) findViewById(R.id.skip);
        this.f22103g = (FloatingActionButton) findViewById(R.id.next);
        this.f22102f.setOnClickListener(this);
        this.f22103g.setOnClickListener(this);
        this.f22099c = (ViewPager) findViewById(R.id.view_pager);
        C5801c c5801c = new C5801c(this, this.f22101e);
        this.f22100d = c5801c;
        this.f22099c.setAdapter(c5801c);
        k(0);
        this.f22099c.addOnPageChangeListener(new b());
    }

    public class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            int i10 = OnBoardingActivity.i;
            OnBoardingActivity.this.k(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f10, int i10) {
        }
    }
}
