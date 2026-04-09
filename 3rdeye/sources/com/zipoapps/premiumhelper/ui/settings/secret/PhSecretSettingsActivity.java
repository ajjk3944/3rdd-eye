package com.zipoapps.premiumhelper.ui.settings.secret;

import A9.C0575f;
import B2.r;
import B2.s;
import D8.f;
import D8.h;
import D8.i;
import D8.o;
import D8.p;
import J8.C0690e;
import T1.B;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import c.AbstractC2021s;
import c.C2012j;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import i9.InterfaceC4463a;
import j1.AbstractC5165a;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import p9.InterfaceC5480a;
import q8.C5498a;

/* compiled from: PhSecretSettingsActivity.kt */
/* loaded from: classes3.dex */
public final class PhSecretSettingsActivity extends AppCompatActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f37161f = 0;

    /* renamed from: d, reason: collision with root package name */
    public C5498a f37163d;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f37162c = new d0(x.a(i.class), new d(), new c(), new e());

    /* renamed from: e, reason: collision with root package name */
    public final p f37164e = new p(new o());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhSecretSettingsActivity.kt */
    public static final class a {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final int id;
        public static final a CONSUME_ALL = new a("CONSUME_ALL", 0, 1);
        public static final a SEND_LOGS = new a("SEND_LOGS", 1, 2);
        public static final a PH_VERSION = new a("PH_VERSION", 2, 3);
        public static final a PH_DEPENDENCIES = new a("PH_DEPENDENCIES", 3, 4);

        private static final /* synthetic */ a[] $values() {
            return new a[]{CONSUME_ALL, SEND_LOGS, PH_VERSION, PH_DEPENDENCIES};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(aVarArr$values);
        }

        private a(String str, int i, int i10) {
            this.id = i10;
        }

        public static InterfaceC4463a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    /* compiled from: PhSecretSettingsActivity.kt */
    public static final class b extends AbstractC2021s {
        public b() {
            super(true);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.k, p9.a] */
        @Override // c.AbstractC2021s
        public final void a() {
            PhSecretSettingsActivity phSecretSettingsActivity = PhSecretSettingsActivity.this;
            C5498a c5498a = phSecretSettingsActivity.f37163d;
            if (c5498a == null) {
                l.l("binding");
                throw null;
            }
            if (c5498a.f45464g.getVisibility() != 0) {
                this.f18304a = false;
                ?? r12 = this.f18306c;
                if (r12 != 0) {
                    r12.invoke();
                }
                phSecretSettingsActivity.getOnBackPressedDispatcher().d();
                return;
            }
            C5498a c5498a2 = phSecretSettingsActivity.f37163d;
            if (c5498a2 == null) {
                l.l("binding");
                throw null;
            }
            c5498a2.f45464g.removeAllViews();
            C5498a c5498a3 = phSecretSettingsActivity.f37163d;
            if (c5498a3 != null) {
                c5498a3.f45464g.setVisibility(8);
            } else {
                l.l("binding");
                throw null;
            }
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends m implements InterfaceC5480a<f0> {
        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final f0 invoke() {
            return PhSecretSettingsActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends m implements InterfaceC5480a<i0> {
        public d() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final i0 invoke() {
            return PhSecretSettingsActivity.this.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends m implements InterfaceC5480a<AbstractC5165a> {
        public e() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final AbstractC5165a invoke() {
            return PhSecretSettingsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C2012j.a(this, null, 3);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_secret_settings, (ViewGroup) null, false);
        int i = R.id.btnFetchRemote;
        Button button = (Button) B.f(R.id.btnFetchRemote, viewInflate);
        if (button != null) {
            i = R.id.btn_onboarding;
            Button button2 = (Button) B.f(R.id.btn_onboarding, viewInflate);
            if (button2 != null) {
                i = R.id.btn_relaunch;
                Button button3 = (Button) B.f(R.id.btn_relaunch, viewInflate);
                if (button3 != null) {
                    i = R.id.btnViewHideConfig;
                    Button button4 = (Button) B.f(R.id.btnViewHideConfig, viewInflate);
                    if (button4 != null) {
                        i = R.id.containerToto;
                        ConstraintLayout constraintLayout = (ConstraintLayout) B.f(R.id.containerToto, viewInflate);
                        if (constraintLayout != null) {
                            i = R.id.dividerToto;
                            View viewF = B.f(R.id.dividerToto, viewInflate);
                            if (viewF != null) {
                                i = R.id.fragmentContainer;
                                FrameLayout frameLayout = (FrameLayout) B.f(R.id.fragmentContainer, viewInflate);
                                if (frameLayout != null) {
                                    i = R.id.itemsRV;
                                    RecyclerView recyclerView = (RecyclerView) B.f(R.id.itemsRV, viewInflate);
                                    if (recyclerView != null) {
                                        i = R.id.offeringLayout;
                                        if (((LinearLayout) B.f(R.id.offeringLayout, viewInflate)) != null) {
                                            i = R.id.paramsList;
                                            RecyclerView recyclerView2 = (RecyclerView) B.f(R.id.paramsList, viewInflate);
                                            if (recyclerView2 != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                i = R.id.tvItemPurchase;
                                                if (((TextView) B.f(R.id.tvItemPurchase, viewInflate)) != null) {
                                                    i = R.id.tvTotoStatus;
                                                    TextView textView = (TextView) B.f(R.id.tvTotoStatus, viewInflate);
                                                    if (textView != null) {
                                                        this.f37163d = new C5498a(constraintLayout2, button, button2, button3, button4, constraintLayout, viewF, frameLayout, recyclerView, recyclerView2, textView);
                                                        setContentView(constraintLayout2);
                                                        C0690e.a(this, null, 3);
                                                        C5498a c5498a = this.f37163d;
                                                        if (c5498a == null) {
                                                            l.l("binding");
                                                            throw null;
                                                        }
                                                        c5498a.f45459b.setOnClickListener(new s(this, 1));
                                                        C5498a c5498a2 = this.f37163d;
                                                        if (c5498a2 == null) {
                                                            l.l("binding");
                                                            throw null;
                                                        }
                                                        c5498a2.f45460c.setOnClickListener(new f(this, 0));
                                                        ArrayList arrayList = new ArrayList();
                                                        arrayList.add(new G8.b(1, "Consume All", "Consume in-app purchases."));
                                                        arrayList.add(new G8.b(3, "Send Logs", "Send logs from runtime as compressed zip"));
                                                        arrayList.add(new G8.b(4, "PremiumHelper Version", "5.0.3"));
                                                        C5498a c5498a3 = this.f37163d;
                                                        if (c5498a3 == null) {
                                                            l.l("binding");
                                                            throw null;
                                                        }
                                                        RecyclerView recyclerView3 = c5498a3.f45465h;
                                                        recyclerView3.addItemDecoration(new q(recyclerView3.getContext()));
                                                        recyclerView3.getContext();
                                                        recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                                        recyclerView3.setAdapter(new D8.m(arrayList, new com.zipoapps.premiumhelper.ui.settings.secret.a(this)));
                                                        C5498a c5498a4 = this.f37163d;
                                                        if (c5498a4 == null) {
                                                            l.l("binding");
                                                            throw null;
                                                        }
                                                        c5498a4.f45461d.setOnClickListener(new D8.e(this, 0));
                                                        C5498a c5498a5 = this.f37163d;
                                                        if (c5498a5 == null) {
                                                            l.l("binding");
                                                            throw null;
                                                        }
                                                        c5498a5.f45458a.setOnClickListener(new r(this, 1));
                                                        C5498a c5498a6 = this.f37163d;
                                                        if (c5498a6 == null) {
                                                            l.l("binding");
                                                            throw null;
                                                        }
                                                        c5498a6.i.setLayoutManager(new LinearLayoutManager(1));
                                                        C5498a c5498a7 = this.f37163d;
                                                        if (c5498a7 == null) {
                                                            l.l("binding");
                                                            throw null;
                                                        }
                                                        c5498a7.i.setAdapter(this.f37164e);
                                                        C0575f.e(A2.l.y(this), null, null, new h(this, null), 3);
                                                        getOnBackPressedDispatcher().a(this, new b());
                                                        return;
                                                    }
                                                }
                                            }
                                        }
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
}
