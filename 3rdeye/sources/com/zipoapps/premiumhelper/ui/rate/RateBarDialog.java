package com.zipoapps.premiumhelper.ui.rate;

import B2.s;
import a8.C1674f;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.RecyclerView;
import b9.C2001h;
import b9.p;
import c9.C2092m;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.rate.RateBarDialog;
import com.zipoapps.premiumhelper.ui.rate.f;
import h.m;
import i8.C4461a;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.l;
import l8.b;
import va.a;
import w9.i;
import y9.q;
import z0.C5848a;

/* compiled from: RateBarDialog.kt */
/* loaded from: classes3.dex */
public final class RateBarDialog extends m {

    /* renamed from: b, reason: collision with root package name */
    public f.a f37084b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37085c;

    /* renamed from: d, reason: collision with root package name */
    public String f37086d;

    /* renamed from: e, reason: collision with root package name */
    public String f37087e;

    /* renamed from: f, reason: collision with root package name */
    public z8.e f37088f;

    /* renamed from: g, reason: collision with root package name */
    public String f37089g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37090h;
    public TextView i;

    /* renamed from: j, reason: collision with root package name */
    public View f37091j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f37092k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f37093l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f37094m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f37095n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f37096o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f37097p;

    /* renamed from: q, reason: collision with root package name */
    public final p f37098q = C2001h.b(new C1674f(3));

    /* compiled from: RateBarDialog.kt */
    public interface a {
        int a(int i);

        Drawable b();
    }

    /* compiled from: RateBarDialog.kt */
    public interface b {
        boolean a(int i, int i10);
    }

    /* compiled from: RateBarDialog.kt */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f37099a;

        /* renamed from: b, reason: collision with root package name */
        public final int f37100b;

        /* renamed from: c, reason: collision with root package name */
        public final Drawable f37101c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f37102d = false;

        public c(Drawable drawable, int i, int i10) {
            this.f37099a = i;
            this.f37100b = i10;
            this.f37101c = drawable;
        }
    }

    /* compiled from: RateBarDialog.kt */
    public static final class d extends RecyclerView.h<a> {

        /* renamed from: j, reason: collision with root package name */
        public final f f37103j;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList f37104k;

        /* renamed from: l, reason: collision with root package name */
        public int f37105l;

        /* compiled from: RateBarDialog.kt */
        public final class a extends RecyclerView.F {

            /* renamed from: l, reason: collision with root package name */
            public final ImageView f37106l;

            public a(View view) {
                super(view);
                this.f37106l = (ImageView) view.findViewById(R.id.ivReaction);
            }
        }

        public d(f fVar, a aVar) {
            this.f37103j = fVar;
            this.f37104k = new ArrayList(C2092m.W(new c(aVar.b(), 1, aVar.a(0)), new c(aVar.b(), 2, aVar.a(1)), new c(aVar.b(), 3, aVar.a(2)), new c(aVar.b(), 4, aVar.a(3)), new c(aVar.b(), 5, aVar.a(4))));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f37104k.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.F f10, final int i) {
            a holder = (a) f10;
            l.f(holder, "holder");
            c item = (c) this.f37104k.get(i);
            l.f(item, "item");
            int i10 = item.f37100b;
            ImageView imageView = holder.f37106l;
            imageView.setImageResource(i10);
            Drawable drawable = item.f37101c;
            if (drawable != null) {
                imageView.setBackground(drawable);
            }
            imageView.setSelected(item.f37102d);
            final d dVar = d.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: z8.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Enum enumValueOf;
                    int i11;
                    Integer num;
                    RateBarDialog.d dVar2 = this.f48486b;
                    com.zipoapps.premiumhelper.e.f37006D.getClass();
                    com.zipoapps.premiumhelper.e eVarA = e.a.a();
                    l8.d<String> PH_RATE_US_TYPE = i8.d.f38538R;
                    l.e(PH_RATE_US_TYPE, "PH_RATE_US_TYPE");
                    String str = PH_RATE_US_TYPE.f43924a;
                    String str2 = PH_RATE_US_TYPE.f43925b;
                    l8.a aVar = eVarA.f37020j;
                    String str3 = (String) aVar.a(aVar, str, str2);
                    try {
                        String upperCase = str3.toUpperCase(Locale.ROOT);
                        l.e(upperCase, "toUpperCase(...)");
                        enumValueOf = Enum.valueOf(b.e.class, upperCase);
                        l.c(enumValueOf);
                    } catch (IllegalArgumentException unused) {
                        va.a.f47104a.c(Oo.h("Invalid remote value for for '", str.getClass().getSimpleName(), "': ", str3, ". Returning key's default value."), new Object[0]);
                        String upperCase2 = str2.toUpperCase(Locale.ROOT);
                        l.e(upperCase2, "toUpperCase(...)");
                        enumValueOf = Enum.valueOf(b.e.class, upperCase2);
                    }
                    RateBarDialog.b aVar2 = b.f48485a[((b.e) enumValueOf).ordinal()] == 1 ? new com.zipoapps.premiumhelper.ui.rate.a() : new com.zipoapps.premiumhelper.ui.rate.b();
                    ArrayList arrayList = dVar2.f37104k;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        i11 = i;
                        if (i12 >= size) {
                            break;
                        }
                        ((RateBarDialog.c) arrayList.get(i12)).f37102d = aVar2.a(i12, i11);
                        i12++;
                    }
                    dVar2.f37105l = i11;
                    dVar2.notifyDataSetChanged();
                    int i13 = ((RateBarDialog.c) arrayList.get(i11)).f37099a;
                    RateBarDialog rateBarDialog = RateBarDialog.this;
                    TextView textView = rateBarDialog.i;
                    if (textView != null) {
                        textView.setVisibility(i13 == 5 ? 0 : 8);
                    }
                    TextView textView2 = rateBarDialog.f37097p;
                    if (textView2 != null) {
                        textView2.setVisibility(i13 != 5 ? 0 : 8);
                    }
                    TextView textView3 = rateBarDialog.i;
                    if (textView3 != null) {
                        textView3.setEnabled(i13 == 5);
                    }
                    if (i13 == 5) {
                        TextView textView4 = rateBarDialog.i;
                        if (textView4 != null) {
                            Context contextRequireContext = rateBarDialog.requireContext();
                            l.e(contextRequireContext, "requireContext(...)");
                            e eVar = rateBarDialog.f37088f;
                            p pVar = rateBarDialog.f37098q;
                            if (eVar == null) {
                                eVar = (e) pVar.getValue();
                            }
                            textView4.setBackground(d.b(contextRequireContext, eVar, (e) pVar.getValue()));
                        }
                        e eVar2 = rateBarDialog.f37088f;
                        if (eVar2 == null || (num = eVar2.f48493f) == null) {
                            return;
                        }
                        int iIntValue = num.intValue();
                        TextView textView5 = rateBarDialog.i;
                        if (textView5 != null) {
                            Context contextRequireContext2 = rateBarDialog.requireContext();
                            l.e(contextRequireContext2, "requireContext(...)");
                            int color = C5848a.getColor(contextRequireContext2, iIntValue);
                            textView5.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_enabled}}, new int[]{Color.argb(176, Color.red(color), Color.green(color), Color.blue(color)), color}));
                        }
                    }
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.F onCreateViewHolder(ViewGroup parent, int i) {
            l.f(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_rate_us_rating, parent, false);
            l.e(viewInflate, "inflate(...)");
            return new a(viewInflate);
        }
    }

    /* compiled from: RateBarDialog.kt */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37108a;

        static {
            int[] iArr = new int[b.e.values().length];
            try {
                iArr[b.e.SMILES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f37108a = iArr;
        }
    }

    /* compiled from: RateBarDialog.kt */
    public static final class f {
        public f() {
        }
    }

    public final void c(int i, String str) {
        if (this.f37090h) {
            return;
        }
        this.f37090h = true;
        String str2 = this.f37089g;
        String str3 = (str2 == null || q.i0(str2)) ? "unknown" : this.f37089g;
        b9.l lVar = new b9.l("RateGrade", Integer.valueOf(i));
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        b9.l lVar2 = new b9.l("RateDebug", Boolean.valueOf(e.a.a().f37020j.f43910b.isDebugMode()));
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        l8.d<String> PH_RATE_US_TYPE = i8.d.f38538R;
        l.e(PH_RATE_US_TYPE, "PH_RATE_US_TYPE");
        Bundle bundleA = G0.d.a(lVar, lVar2, new b9.l("RateType", eVarA.f37020j.h(PH_RATE_US_TYPE)), new b9.l("RateAction", str), new b9.l("RateSource", str3));
        a.b bVar = va.a.f47104a;
        bVar.o("RateUs");
        bVar.a("Sending event: " + bundleA, new Object[0]);
        C4461a c4461a = e.a.a().f37021k;
        c4461a.getClass();
        c4461a.r(c4461a.c("Rate_us_complete", false, bundleA));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        this.f37088f = e.a.a().f37020j.f43910b.getRateBarDialogStyle();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        l8.d<String> PH_SUPPORT_EMAIL = i8.d.f38558f0;
        l.e(PH_SUPPORT_EMAIL, "PH_SUPPORT_EMAIL");
        this.f37086d = (String) eVarA.f37020j.h(PH_SUPPORT_EMAIL);
        com.zipoapps.premiumhelper.e eVarA2 = e.a.a();
        l8.d<String> PH_SUPPORT_VIP_EMAIL = i8.d.f38560g0;
        l.e(PH_SUPPORT_VIP_EMAIL, "PH_SUPPORT_VIP_EMAIL");
        this.f37087e = (String) eVarA2.f37020j.h(PH_SUPPORT_VIP_EMAIL);
        Bundle arguments = getArguments();
        this.f37089g = arguments != null ? arguments.getString("rate_source", null) : null;
        Bundle arguments2 = getArguments();
        if ((arguments2 != null ? arguments2.getInt("theme", -1) : -1) != -1) {
            setStyle(1, getTheme());
        }
    }

    @Override // h.m, androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k
    public final Dialog onCreateDialog(Bundle bundle) {
        Enum enumValueOf;
        Integer num;
        Integer num2;
        Integer num3;
        TextView textView;
        String str;
        int i = 8;
        final View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.ph_rate_us_stars, (ViewGroup) null);
        l.e(viewInflate, "inflate(...)");
        final RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rvReactions);
        this.f37092k = (TextView) viewInflate.findViewById(R.id.tvTitle);
        this.f37093l = (TextView) viewInflate.findViewById(R.id.tvDescription);
        this.i = (TextView) viewInflate.findViewById(R.id.rate_dialog_positive_button);
        this.f37094m = (TextView) viewInflate.findViewById(R.id.tvHint);
        this.f37097p = (TextView) viewInflate.findViewById(R.id.btnSendFeedback);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.rate_dialog_dismiss_button);
        if (imageView != null) {
            imageView.setOnClickListener(new D8.e(this, i));
            this.f37095n = imageView;
        }
        String str2 = this.f37086d;
        final boolean z10 = str2 == null || q.i0(str2) || (str = this.f37087e) == null || q.i0(str);
        if (z10 && (textView = this.f37097p) != null) {
            textView.setText(getString(R.string.rate_dialog_thanks));
        }
        this.f37091j = viewInflate.findViewById(R.id.main_container);
        this.f37096o = (ImageView) viewInflate.findViewById(R.id.ivArrowHint);
        TextView textView2 = this.i;
        p pVar = this.f37098q;
        if (textView2 != null) {
            Context contextRequireContext = requireContext();
            l.e(contextRequireContext, "requireContext(...)");
            z8.e style = this.f37088f;
            if (style == null) {
                style = (z8.e) pVar.getValue();
            }
            l.f(style, "style");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) (8 * Resources.getSystem().getDisplayMetrics().density));
            gradientDrawable.setColor(C5848a.getColor(contextRequireContext, style.f48488a));
            Integer num4 = style.f48489b;
            gradientDrawable.setColor(C5848a.getColor(contextRequireContext, num4 != null ? num4.intValue() : R.color.rate_us_cta_btn_disabled));
            textView2.setBackground(gradientDrawable);
        }
        TextView textView3 = this.f37097p;
        if (textView3 != null) {
            Context contextRequireContext2 = requireContext();
            l.e(contextRequireContext2, "requireContext(...)");
            z8.e eVar = this.f37088f;
            if (eVar == null) {
                eVar = (z8.e) pVar.getValue();
            }
            textView3.setBackground(z8.d.b(contextRequireContext2, eVar, (z8.e) pVar.getValue()));
        }
        z8.e eVar2 = this.f37088f;
        if (eVar2 != null && (num3 = eVar2.f48491d) != null) {
            int iIntValue = num3.intValue();
            View view = this.f37091j;
            if (view != null) {
                view.setBackgroundColor(C5848a.getColor(requireContext(), iIntValue));
            }
        }
        z8.e eVar3 = this.f37088f;
        if (eVar3 != null && (num2 = eVar3.f48493f) != null) {
            int iIntValue2 = num2.intValue();
            TextView textView4 = this.f37097p;
            if (textView4 != null) {
                Context contextRequireContext3 = requireContext();
                l.e(contextRequireContext3, "requireContext(...)");
                int color = C5848a.getColor(contextRequireContext3, iIntValue2);
                textView4.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_enabled}}, new int[]{Color.argb(176, Color.red(color), Color.green(color), Color.blue(color)), color}));
            }
        }
        z8.e eVar4 = this.f37088f;
        if (eVar4 != null && (num = eVar4.f48492e) != null) {
            int color2 = C5848a.getColor(requireContext(), num.intValue());
            int iArgb = Color.argb(176, Color.red(color2), Color.green(color2), Color.blue(color2));
            TextView textView5 = this.f37092k;
            if (textView5 != null) {
                textView5.setTextColor(color2);
            }
            TextView textView6 = this.f37093l;
            if (textView6 != null) {
                textView6.setTextColor(iArgb);
            }
            TextView textView7 = this.f37094m;
            if (textView7 != null) {
                textView7.setTextColor(iArgb);
            }
            ImageView imageView2 = this.f37095n;
            if (imageView2 != null) {
                imageView2.setColorFilter(iArgb);
            }
            ImageView imageView3 = this.f37096o;
            if (imageView3 != null) {
                imageView3.setColorFilter(color2);
            }
        }
        TextView textView8 = this.f37097p;
        if (textView8 != null) {
            textView8.setOnClickListener(new View.OnClickListener() { // from class: z8.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RateBarDialog rateBarDialog = this;
                    if (z10) {
                        rateBarDialog.dismissAllowingStateLoss();
                        return;
                    }
                    AppCompatActivity appCompatActivity = (AppCompatActivity) rateBarDialog.getContext();
                    View view3 = viewInflate;
                    if (appCompatActivity == null) {
                        view3.findViewById(R.id.rate_dialog_negative_button).performClick();
                        return;
                    }
                    view3.findViewById(R.id.rate_dialog_negative_button).performClick();
                    com.zipoapps.premiumhelper.e.f37006D.getClass();
                    com.zipoapps.premiumhelper.e eVarA = e.a.a();
                    String str3 = rateBarDialog.f37086d;
                    l.c(str3);
                    String str4 = rateBarDialog.f37087e;
                    l.c(str4);
                    eVarA.f37036z.e(appCompatActivity, str3, str4);
                    RecyclerView.h adapter = recyclerView.getAdapter();
                    l.d(adapter, "null cannot be cast to non-null type com.zipoapps.premiumhelper.ui.rate.RateBarDialog.ReactionsAdapter");
                    int i10 = ((RateBarDialog.d) adapter).f37105l + 1;
                    rateBarDialog.c(i10, "rate");
                    if (i10 > 4) {
                        e.a.a().i.m("positive");
                        e.a.a().f37021k.s("Rate_us_positive", new Bundle[0]);
                    } else {
                        e.a.a().i.m("negative");
                    }
                    C4461a c4461a = e.a.a().f37021k;
                    l.f(c4461a, "<this>");
                    c4461a.u("First_rate_review_done", new Bundle[0]);
                    rateBarDialog.dismissAllowingStateLoss();
                }
            });
        }
        TextView textView9 = this.i;
        if (textView9 != null) {
            textView9.setOnClickListener(new s(this, 4));
        }
        TextView textView10 = this.f37092k;
        if (textView10 != null) {
            textView10.setText(getString(R.string.rate_us_title, getString(R.string.app_name)));
        }
        f fVar = new f();
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        l8.d<String> PH_RATE_US_TYPE = i8.d.f38538R;
        l.e(PH_RATE_US_TYPE, "PH_RATE_US_TYPE");
        String str3 = PH_RATE_US_TYPE.f43924a;
        String str4 = PH_RATE_US_TYPE.f43925b;
        l8.a aVar = eVarA.f37020j;
        String str5 = (String) aVar.a(aVar, str3, str4);
        try {
            String upperCase = str5.toUpperCase(Locale.ROOT);
            l.e(upperCase, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.e.class, upperCase);
            l.c(enumValueOf);
        } catch (IllegalArgumentException unused) {
            va.a.f47104a.c(Oo.h("Invalid remote value for for '", str3.getClass().getSimpleName(), "': ", str5, ". Returning key's default value."), new Object[0]);
            String upperCase2 = str4.toUpperCase(Locale.ROOT);
            l.e(upperCase2, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.e.class, upperCase2);
        }
        d dVar = new d(fVar, e.f37108a[((b.e) enumValueOf).ordinal()] == 1 ? new com.zipoapps.premiumhelper.ui.rate.c(this) : new com.zipoapps.premiumhelper.ui.rate.d());
        getContext();
        recyclerView.setLayoutManager(new RateBarDialog$onCreateDialog$linearLayoutManager$1(0));
        recyclerView.setAdapter(dVar);
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA2 = e.a.a();
        i<Object>[] iVarArr = C4461a.f38482n;
        C4461a.b type = C4461a.b.DIALOG;
        C4461a c4461a = eVarA2.f37021k;
        c4461a.getClass();
        l.f(type, "type");
        c4461a.s("Rate_us_shown", G0.d.a(new b9.l("type", type.getValue())));
        d.a aVar2 = new d.a(requireContext());
        aVar2.f14344a.f14327o = viewInflate;
        androidx.appcompat.app.d dVarA = aVar2.a();
        Window window = dVarA.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dVarA;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        l.f(dialog, "dialog");
        super.onDismiss(dialog);
        f.c cVar = this.f37085c ? f.c.DIALOG : f.c.NONE;
        f.a aVar = this.f37084b;
        if (aVar != null) {
            aVar.a(cVar);
        }
        c(0, "cancel");
    }
}
