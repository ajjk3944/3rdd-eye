package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import I2.m;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import c.AbstractC2021s;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.FirstTimeLanguageActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.OnBoardingActivity;
import io.appmetrica.analytics.impl.Oo;

/* loaded from: classes.dex */
public class FirstTimeLanguageActivity extends AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f22076d = 0;

    /* renamed from: c, reason: collision with root package name */
    public m f22077c;

    public class a extends AbstractC2021s {
        public a() {
            super(true);
        }

        @Override // c.AbstractC2021s
        public final void a() {
            int i = FirstTimeLanguageActivity.f22076d;
            FirstTimeLanguageActivity firstTimeLanguageActivity = FirstTimeLanguageActivity.this;
            firstTimeLanguageActivity.startActivity(new Intent(firstTimeLanguageActivity, (Class<?>) OnBoardingActivity.class));
            firstTimeLanguageActivity.finish();
        }
    }

    public final void k() {
        if (this.f22077c.b().equalsIgnoreCase("hi")) {
            Oo.k(this, R.id.hindiCheck, 0, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("es")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 0, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("fr")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 0);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("pt")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 0, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("de")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 0, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("en")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 0);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("it")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 0);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("ja")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 0);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("bn")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 0, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("tr")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 0);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("in")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 0, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("ru")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 0);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22077c.b().equalsIgnoreCase("sv")) {
            Oo.k(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            Oo.k(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            Oo.k(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            Oo.k(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            Oo.k(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            Oo.k(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            Oo.k(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        setContentView(R.layout.activity_first_time_language);
        getOnBackPressedDispatcher().a(this, new a());
        m mVar = new m(this);
        this.f22077c = mVar;
        mVar.f2429a.edit().putBoolean("LOCALE_SET", true).apply();
        final int i = 1;
        findViewById(R.id.hindiCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47642c;

            {
                this.f47642c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47642c;
                        firstTimeLanguageActivity.f22077c.f("pt");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47642c;
                        firstTimeLanguageActivity2.f22077c.f("hi");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47642c;
                        firstTimeLanguageActivity3.f22077c.f("en");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        final int i10 = 2;
        findViewById(R.id.englishCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47642c;

            {
                this.f47642c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47642c;
                        firstTimeLanguageActivity.f22077c.f("pt");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47642c;
                        firstTimeLanguageActivity2.f22077c.f("hi");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47642c;
                        firstTimeLanguageActivity3.f22077c.f("en");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.germanCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47644c;

            {
                this.f47644c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47644c;
                        firstTimeLanguageActivity.f22077c.f("it");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47644c;
                        firstTimeLanguageActivity2.f22077c.f("in");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47644c;
                        firstTimeLanguageActivity3.f22077c.f("de");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.frenchCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47646c;

            {
                this.f47646c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47646c;
                        firstTimeLanguageActivity.f22077c.f("ja");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47646c;
                        firstTimeLanguageActivity2.f22077c.f("ru");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47646c;
                        firstTimeLanguageActivity3.f22077c.f("fr");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.spanishCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47648c;

            {
                this.f47648c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47648c;
                        firstTimeLanguageActivity.f22077c.f("bn");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47648c;
                        firstTimeLanguageActivity2.f22077c.f("sv");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47648c;
                        firstTimeLanguageActivity3.f22077c.f("es");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        final int i11 = 0;
        findViewById(R.id.purtaguesCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47642c;

            {
                this.f47642c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47642c;
                        firstTimeLanguageActivity.f22077c.f("pt");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47642c;
                        firstTimeLanguageActivity2.f22077c.f("hi");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47642c;
                        firstTimeLanguageActivity3.f22077c.f("en");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.italianCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47644c;

            {
                this.f47644c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47644c;
                        firstTimeLanguageActivity.f22077c.f("it");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47644c;
                        firstTimeLanguageActivity2.f22077c.f("in");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47644c;
                        firstTimeLanguageActivity3.f22077c.f("de");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.japaneseCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47646c;

            {
                this.f47646c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47646c;
                        firstTimeLanguageActivity.f22077c.f("ja");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47646c;
                        firstTimeLanguageActivity2.f22077c.f("ru");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47646c;
                        firstTimeLanguageActivity3.f22077c.f("fr");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.bengaliCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47648c;

            {
                this.f47648c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47648c;
                        firstTimeLanguageActivity.f22077c.f("bn");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47648c;
                        firstTimeLanguageActivity2.f22077c.f("sv");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47648c;
                        firstTimeLanguageActivity3.f22077c.f("es");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.turkishCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47650c;

            {
                this.f47650c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47650c;
                switch (i11) {
                    case 0:
                        firstTimeLanguageActivity.f22077c.f("tr");
                        firstTimeLanguageActivity.k();
                        break;
                    default:
                        int i12 = FirstTimeLanguageActivity.f22076d;
                        firstTimeLanguageActivity.startActivity(new Intent(firstTimeLanguageActivity, (Class<?>) OnBoardingActivity.class));
                        firstTimeLanguageActivity.finish();
                        break;
                }
            }
        });
        final int i12 = 1;
        findViewById(R.id.indonesiaCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47644c;

            {
                this.f47644c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47644c;
                        firstTimeLanguageActivity.f22077c.f("it");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47644c;
                        firstTimeLanguageActivity2.f22077c.f("in");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47644c;
                        firstTimeLanguageActivity3.f22077c.f("de");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.russianCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47646c;

            {
                this.f47646c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47646c;
                        firstTimeLanguageActivity.f22077c.f("ja");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47646c;
                        firstTimeLanguageActivity2.f22077c.f("ru");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47646c;
                        firstTimeLanguageActivity3.f22077c.f("fr");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.swedenCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47648c;

            {
                this.f47648c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47648c;
                        firstTimeLanguageActivity.f22077c.f("bn");
                        firstTimeLanguageActivity.k();
                        break;
                    case 1:
                        FirstTimeLanguageActivity firstTimeLanguageActivity2 = this.f47648c;
                        firstTimeLanguageActivity2.f22077c.f("sv");
                        firstTimeLanguageActivity2.k();
                        break;
                    default:
                        FirstTimeLanguageActivity firstTimeLanguageActivity3 = this.f47648c;
                        firstTimeLanguageActivity3.f22077c.f("es");
                        firstTimeLanguageActivity3.k();
                        break;
                }
            }
        });
        findViewById(R.id.done).setOnClickListener(new View.OnClickListener(this) { // from class: x2.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirstTimeLanguageActivity f47650c;

            {
                this.f47650c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirstTimeLanguageActivity firstTimeLanguageActivity = this.f47650c;
                switch (i12) {
                    case 0:
                        firstTimeLanguageActivity.f22077c.f("tr");
                        firstTimeLanguageActivity.k();
                        break;
                    default:
                        int i122 = FirstTimeLanguageActivity.f22076d;
                        firstTimeLanguageActivity.startActivity(new Intent(firstTimeLanguageActivity, (Class<?>) OnBoardingActivity.class));
                        firstTimeLanguageActivity.finish();
                        break;
                }
            }
        });
        k();
    }
}
