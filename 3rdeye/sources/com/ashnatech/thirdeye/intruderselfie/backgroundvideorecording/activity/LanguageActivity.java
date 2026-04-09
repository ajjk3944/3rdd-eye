package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import I2.m;
import android.content.Intent;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.LanguageActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.SettingsActivity;
import com.google.android.gms.measurement.internal.a;
import x2.AbstractActivityC5757a;

/* loaded from: classes.dex */
public class LanguageActivity extends AbstractActivityC5757a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f22085f = 0;

    /* renamed from: e, reason: collision with root package name */
    public m f22086e;

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_language;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() {
        this.f22086e = new m(this);
        final int i = 1;
        findViewById(R.id.hindiCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47652c;

            {
                this.f47652c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        LanguageActivity languageActivity = this.f47652c;
                        languageActivity.f22086e.f("pt");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47652c;
                        languageActivity2.f22086e.f("hi");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47652c;
                        languageActivity3.f22086e.f("en");
                        languageActivity3.m();
                        break;
                }
            }
        });
        final int i10 = 2;
        findViewById(R.id.englishCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47652c;

            {
                this.f47652c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        LanguageActivity languageActivity = this.f47652c;
                        languageActivity.f22086e.f("pt");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47652c;
                        languageActivity2.f22086e.f("hi");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47652c;
                        languageActivity3.f22086e.f("en");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.germanCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47654c;

            {
                this.f47654c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        LanguageActivity languageActivity = this.f47654c;
                        languageActivity.f22086e.f("it");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47654c;
                        languageActivity2.f22086e.f("in");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47654c;
                        languageActivity3.f22086e.f("de");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.frenchCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47656c;

            {
                this.f47656c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        LanguageActivity languageActivity = this.f47656c;
                        languageActivity.f22086e.f("ja");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47656c;
                        languageActivity2.f22086e.f("ru");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47656c;
                        languageActivity3.f22086e.f("fr");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.spanishCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47658c;

            {
                this.f47658c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        LanguageActivity languageActivity = this.f47658c;
                        languageActivity.f22086e.f("bn");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47658c;
                        languageActivity2.f22086e.f("sv");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47658c;
                        languageActivity3.f22086e.f("es");
                        languageActivity3.m();
                        break;
                }
            }
        });
        final int i11 = 0;
        findViewById(R.id.purtaguesCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47652c;

            {
                this.f47652c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        LanguageActivity languageActivity = this.f47652c;
                        languageActivity.f22086e.f("pt");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47652c;
                        languageActivity2.f22086e.f("hi");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47652c;
                        languageActivity3.f22086e.f("en");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.italianCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47654c;

            {
                this.f47654c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        LanguageActivity languageActivity = this.f47654c;
                        languageActivity.f22086e.f("it");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47654c;
                        languageActivity2.f22086e.f("in");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47654c;
                        languageActivity3.f22086e.f("de");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.japaneseCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47656c;

            {
                this.f47656c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        LanguageActivity languageActivity = this.f47656c;
                        languageActivity.f22086e.f("ja");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47656c;
                        languageActivity2.f22086e.f("ru");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47656c;
                        languageActivity3.f22086e.f("fr");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.bengaliCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47658c;

            {
                this.f47658c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        LanguageActivity languageActivity = this.f47658c;
                        languageActivity.f22086e.f("bn");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47658c;
                        languageActivity2.f22086e.f("sv");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47658c;
                        languageActivity3.f22086e.f("es");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.turkishCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47660c;

            {
                this.f47660c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageActivity languageActivity = this.f47660c;
                switch (i11) {
                    case 0:
                        languageActivity.f22086e.f("tr");
                        languageActivity.m();
                        break;
                    default:
                        int i12 = LanguageActivity.f22085f;
                        languageActivity.getClass();
                        languageActivity.startActivity(new Intent(languageActivity, (Class<?>) SettingsActivity.class));
                        languageActivity.finish();
                        break;
                }
            }
        });
        final int i12 = 1;
        findViewById(R.id.indonesiaCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47654c;

            {
                this.f47654c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        LanguageActivity languageActivity = this.f47654c;
                        languageActivity.f22086e.f("it");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47654c;
                        languageActivity2.f22086e.f("in");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47654c;
                        languageActivity3.f22086e.f("de");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.russianCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47656c;

            {
                this.f47656c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        LanguageActivity languageActivity = this.f47656c;
                        languageActivity.f22086e.f("ja");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47656c;
                        languageActivity2.f22086e.f("ru");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47656c;
                        languageActivity3.f22086e.f("fr");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.swedenCard).setOnClickListener(new View.OnClickListener(this) { // from class: x2.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47658c;

            {
                this.f47658c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        LanguageActivity languageActivity = this.f47658c;
                        languageActivity.f22086e.f("bn");
                        languageActivity.m();
                        break;
                    case 1:
                        LanguageActivity languageActivity2 = this.f47658c;
                        languageActivity2.f22086e.f("sv");
                        languageActivity2.m();
                        break;
                    default:
                        LanguageActivity languageActivity3 = this.f47658c;
                        languageActivity3.f22086e.f("es");
                        languageActivity3.m();
                        break;
                }
            }
        });
        findViewById(R.id.done).setOnClickListener(new View.OnClickListener(this) { // from class: x2.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LanguageActivity f47660c;

            {
                this.f47660c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageActivity languageActivity = this.f47660c;
                switch (i12) {
                    case 0:
                        languageActivity.f22086e.f("tr");
                        languageActivity.m();
                        break;
                    default:
                        int i122 = LanguageActivity.f22085f;
                        languageActivity.getClass();
                        languageActivity.startActivity(new Intent(languageActivity, (Class<?>) SettingsActivity.class));
                        languageActivity.finish();
                        break;
                }
            }
        });
        m();
    }

    public final void m() {
        if (this.f22086e.b().equalsIgnoreCase("hi")) {
            a.j(this, R.id.hindiCheck, 0, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("es")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 0, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("fr")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 0);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("pt")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 0, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("de")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 0, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("en")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 0);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("it")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 0);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("ja")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 0);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("bn")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 0, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("tr")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 0);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("in")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 0, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("ru")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 0);
            findViewById(R.id.swedenCheck).setVisibility(4);
            return;
        }
        if (this.f22086e.b().equalsIgnoreCase("sv")) {
            a.j(this, R.id.hindiCheck, 4, R.id.englishCheck, 4);
            a.j(this, R.id.spanishCheck, 4, R.id.frenchCheck, 4);
            a.j(this, R.id.germanCheck, 4, R.id.arabicCheck, 4);
            a.j(this, R.id.portaguesCheck, 4, R.id.italianCheck, 4);
            a.j(this, R.id.urduCheck, 4, R.id.japaneseCheck, 4);
            a.j(this, R.id.bengaliCheck, 4, R.id.turkishCheck, 4);
            a.j(this, R.id.indonesiaCheck, 4, R.id.russianCheck, 4);
            findViewById(R.id.swedenCheck).setVisibility(0);
        }
    }
}
