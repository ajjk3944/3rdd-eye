package f8;

import A9.C0575f;
import C.C0635w;
import D0.a;
import D9.C0647i;
import D9.t;
import G2.j;
import J8.C0691f;
import L0.C0792x;
import L0.I;
import L0.S;
import L0.Z;
import L0.a0;
import L0.b0;
import U7.o;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.F;
import b9.C2001h;
import b9.InterfaceC1997d;
import b9.p;
import c.C2012j;
import c9.C2091l;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.gson.Gson;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import com.zipoapps.premiumhelper.e;
import f8.AbstractC4342e;
import i8.C4461a;
import java.util.Iterator;
import java.util.WeakHashMap;
import p9.InterfaceC5480a;
import p9.l;

/* compiled from: PremiumActivity.kt */
/* renamed from: f8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC4340c<VM extends AbstractC4342e> extends AppCompatActivity implements o {
    public static final /* synthetic */ int i = 0;

    /* renamed from: c, reason: collision with root package name */
    public final p f37826c;

    /* renamed from: d, reason: collision with root package name */
    public final p f37827d = C2001h.b(new j(this, 3));

    /* renamed from: e, reason: collision with root package name */
    public final p f37828e = C2001h.b(new G1.e(this, 7));

    /* renamed from: f, reason: collision with root package name */
    public final p f37829f = C2001h.b(new B8.c(this, 4));

    /* renamed from: g, reason: collision with root package name */
    public final p f37830g = C2001h.b(new H8.e(this, 3));

    /* renamed from: h, reason: collision with root package name */
    public final p f37831h;

    /* compiled from: PremiumActivity.kt */
    /* renamed from: f8.c$a */
    public static final class a implements F, kotlin.jvm.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f37832a;

        public a(l lVar) {
            this.f37832a = lVar;
        }

        @Override // androidx.lifecycle.F
        public final /* synthetic */ void a(Object obj) {
            this.f37832a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof F) && (obj instanceof kotlin.jvm.internal.h)) {
                return kotlin.jvm.internal.l.b(getFunctionDelegate(), ((kotlin.jvm.internal.h) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.h
        public final InterfaceC1997d<?> getFunctionDelegate() {
            return this.f37832a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public AbstractActivityC4340c() {
        final int i10 = 1;
        this.f37826c = C2001h.b(new InterfaceC5480a(this) { // from class: f8.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC4340c f37823c;

            {
                this.f37823c = this;
            }

            @Override // p9.InterfaceC5480a
            public final Object invoke() {
                AbstractActivityC4340c abstractActivityC4340c = this.f37823c;
                switch (i10) {
                    case 0:
                        int i11 = AbstractActivityC4340c.i;
                        return abstractActivityC4340c.findViewById(R.id.progress);
                    default:
                        int i12 = AbstractActivityC4340c.i;
                        return (TextView) abstractActivityC4340c.findViewById(R.id.tvSubTitle);
                }
            }
        });
        final int i11 = 0;
        this.f37831h = C2001h.b(new InterfaceC5480a(this) { // from class: f8.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC4340c f37823c;

            {
                this.f37823c = this;
            }

            @Override // p9.InterfaceC5480a
            public final Object invoke() {
                AbstractActivityC4340c abstractActivityC4340c = this.f37823c;
                switch (i11) {
                    case 0:
                        int i112 = AbstractActivityC4340c.i;
                        return abstractActivityC4340c.findViewById(R.id.progress);
                    default:
                        int i12 = AbstractActivityC4340c.i;
                        return (TextView) abstractActivityC4340c.findViewById(R.id.tvSubTitle);
                }
            }
        });
    }

    public abstract VM k();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        Z a0Var;
        int iJ;
        float f10;
        String string;
        View viewFindViewById;
        Integer numValueOf;
        int i10 = 8;
        int i11 = 7;
        C2012j.a(this, null, 3);
        Window window = getWindow();
        C0792x c0792x = new C0792x(getWindow().getDecorView());
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            b0 b0Var = new b0(window.getInsetsController(), c0792x);
            b0Var.f3888c = window;
            a0Var = b0Var;
        } else {
            a0Var = i12 >= 26 ? new a0(window, c0792x) : new Z(window, c0792x);
        }
        a0Var.z();
        a0Var.o(7);
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(R.style.PhPremiumOfferingTheme, new int[]{R.attr.premium_offering_style});
        kotlin.jvm.internal.l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        Integer numValueOf2 = Integer.valueOf(resourceId);
        if (resourceId <= 0) {
            numValueOf2 = null;
        }
        setTheme(numValueOf2 != null ? numValueOf2.intValue() : R.style.PhPremiumOfferingTheme);
        typedArrayObtainStyledAttributes.recycle();
        super.onCreate(bundle);
        AbstractC4342e abstractC4342eK = k();
        if (abstractC4342eK.f37835e) {
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            l8.b bVar = e.a.a().f37020j;
            PremiumHelperConfiguration premiumHelperConfiguration = bVar.f43910b;
            if (premiumHelperConfiguration.getStartLikeProActivityLayout().length == 0) {
                numValueOf = null;
            } else {
                int[] startLikeProActivityLayout = premiumHelperConfiguration.getStartLikeProActivityLayout();
                l8.d<Integer> PH_ONBOARDING_LAYOUT_VARIANT = i8.d.f38527G;
                kotlin.jvm.internal.l.e(PH_ONBOARDING_LAYOUT_VARIANT, "PH_ONBOARDING_LAYOUT_VARIANT");
                numValueOf = Integer.valueOf(bVar.g(startLikeProActivityLayout, PH_ONBOARDING_LAYOUT_VARIANT));
            }
            iJ = numValueOf != null ? numValueOf.intValue() : R.layout.activity_premium;
        } else if (abstractC4342eK.i()) {
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            iJ = e.a.a().f37020j.k();
        } else {
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            iJ = e.a.a().f37020j.j();
        }
        setContentView(iJ);
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        C4461a c4461a = e.a.a().f37021k;
        kotlin.jvm.internal.l.f(c4461a, "<this>");
        c4461a.u("First_start_like_a_pro_shown", new Bundle[0]);
        View childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        if (childAt != null && (viewFindViewById = findViewById(R.id.btnClose)) != null) {
            viewFindViewById.setOnClickListener(new F8.c(this, i10));
            C0635w c0635w = new C0635w(i11, viewFindViewById, this);
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            I.d.u(childAt, c0635w);
        }
        ImageView imageView = (ImageView) findViewById(R.id.imvCrown);
        if (imageView != null) {
            imageView.setVisibility((k().f37835e || !k().i()) ? 0 : 8);
        }
        TextView textView = (TextView) findViewById(R.id.tvTitle);
        if (textView != null) {
            if (!k().i() || k().f37835e) {
                textView.setText(R.string.ph_start_like_pro);
            } else {
                textView.setText(R.string.ph_limited_time_offer);
            }
        }
        TextView textView2 = (TextView) this.f37826c.getValue();
        if (textView2 != null) {
            if (!k().i() || k().f37835e) {
                textView2.setText(R.string.ph_unlock_all_features);
                textView2.setTextSize(2, 16.0f);
                textView2.setTypeface(textView2.getTypeface(), 0);
            } else {
                textView2.setTextColor(B7.d.o(this, R.attr.premium_offer_countdown_text_color, -16777216));
                textView2.setTextSize(2, 38.0f);
                textView2.setTypeface(textView2.getTypeface(), 1);
            }
        }
        TextView textView3 = (TextView) this.f37827d.getValue();
        if (textView3 == null) {
            f10 = 0.0f;
        } else {
            if (k().i()) {
                f10 = 0.0f;
                if (!k().f37835e) {
                    textView3.setTextSize(2, 16.0f);
                }
            } else {
                f10 = 0.0f;
            }
            TypedArray typedArrayObtainStyledAttributes2 = obtainStyledAttributes(R.style.PhPremiumOfferingTheme, new int[]{R.attr.premium_offer_text_price_size});
            kotlin.jvm.internal.l.e(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
            float dimension = typedArrayObtainStyledAttributes2.getDimension(0, -1.0f);
            Float fValueOf = Float.valueOf(dimension);
            if (dimension <= f10) {
                fValueOf = null;
            }
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 12.0f;
            typedArrayObtainStyledAttributes2.recycle();
            textView3.setTextSize(2, fFloatValue);
        }
        TextView textView4 = (TextView) this.f37828e.getValue();
        if (textView4 != null) {
            textView4.setPaintFlags(textView4.getPaintFlags() | 16);
            if (!k().i() || k().f37835e) {
                TypedArray typedArrayObtainStyledAttributes3 = obtainStyledAttributes(R.style.PhPremiumOfferingTheme, new int[]{R.attr.premium_offer_text_price_size});
                kotlin.jvm.internal.l.e(typedArrayObtainStyledAttributes3, "obtainStyledAttributes(...)");
                float dimension2 = typedArrayObtainStyledAttributes3.getDimension(0, -1.0f);
                Float fValueOf2 = Float.valueOf(dimension2);
                if (dimension2 <= f10) {
                    fValueOf2 = null;
                }
                float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 12.0f;
                typedArrayObtainStyledAttributes3.recycle();
                textView4.setTextSize(2, fFloatValue2);
            } else {
                textView4.setTextSize(2, 16.0f);
            }
        }
        TextView textView5 = (TextView) findViewById(R.id.tvOfferInfo);
        if (textView5 != null) {
            if (!k().i() || k().f37835e) {
                textView5.setVisibility(8);
            } else {
                textView5.setText(getString(R.string.ph_one_time_offer_name));
                textView5.setVisibility(0);
            }
        }
        TextView textView6 = (TextView) this.f37829f.getValue();
        if (textView6 != null) {
            textView6.setOnClickListener(new D8.f(this, 7));
        }
        TextView textView7 = (TextView) this.f37830g.getValue();
        if (textView7 != null) {
            textView7.setMovementMethod(LinkMovementMethod.getInstance());
        }
        k().i.e(this, new a(new A2.c(this, 1)));
        k().f37840k.e(this, new a(new C0691f(this, 3)));
        C0575f.e(A2.l.y(this), null, null, new C0647i(new t(k().f37842m, new C4339b(this, null)), null), 3);
        SharedPreferences sharedPreferences = getSharedPreferences("theme_prefs", 0);
        kotlin.jvm.internal.l.e(sharedPreferences, "getSharedPreferences(...)");
        if ((((getResources().getConfiguration().uiMode & 48) != 32 ? (string = sharedPreferences.getString("light_theme", null)) == null : (string = sharedPreferences.getString("dark_theme", null)) == null) ? null : (K8.a) new Gson().b(K8.a.class, string)) != null) {
            TextView textView8 = (TextView) findViewById(R.id.btnCta);
            if (textView8 != null) {
                textView8.setTextColor(Color.parseColor(null));
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.parseColor(null));
                kotlin.jvm.internal.l.e(colorStateListValueOf, "valueOf(...)");
                WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                I.d.q(textView8, colorStateListValueOf);
            }
            View childAt2 = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
            childAt2.setBackgroundColor(Color.parseColor(null));
            kotlin.jvm.internal.l.c(null);
            int color = Color.parseColor(null);
            ImageView imageView2 = (ImageView) findViewById(R.id.imvCrown);
            if (imageView2 != null) {
                imageView2.setColorFilter(color);
            }
            K8.b.a(color, childAt2);
            TextView textView9 = (TextView) findViewById(R.id.tvTitle);
            if (textView9 != null) {
                textView9.setTextColor(Color.parseColor(null));
            }
            TextView textView10 = (TextView) findViewById(R.id.tvTitle);
            if (textView10 != null) {
                textView10.setTextColor(Color.parseColor(null));
            }
            Iterator it = C2091l.l(new TextView[]{(TextView) findViewById(R.id.tvSubTitle), (TextView) findViewById(R.id.tvPriceOld), (TextView) findViewById(R.id.tvPriceCurrent)}).iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setTextColor(Color.parseColor(null));
            }
            Drawable indeterminateDrawable = ((ProgressBar) findViewById(R.id.progress)).getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                a.C0009a.g(indeterminateDrawable, Color.parseColor(null));
            }
        }
    }
}
