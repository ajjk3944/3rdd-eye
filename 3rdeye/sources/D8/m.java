package D8;

import C.f0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C1748a;
import androidx.fragment.app.x;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;
import f9.C4351i;
import java.util.ArrayList;
import q8.C5498a;

/* compiled from: SecretAdapter.kt */
/* loaded from: classes3.dex */
public final class m extends RecyclerView.h<a> {

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1120j;

    /* renamed from: k, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.ui.settings.secret.a f1121k;

    /* compiled from: SecretAdapter.kt */
    public static final class a extends RecyclerView.F {

        /* renamed from: l, reason: collision with root package name */
        public final TextView f1122l;

        /* renamed from: m, reason: collision with root package name */
        public final TextView f1123m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, final com.zipoapps.premiumhelper.ui.settings.secret.a clickListener, final ArrayList mList) {
            super(view);
            kotlin.jvm.internal.l.f(clickListener, "clickListener");
            kotlin.jvm.internal.l.f(mList, "mList");
            View viewFindViewById = this.itemView.findViewById(R.id.tvItemTitle);
            kotlin.jvm.internal.l.e(viewFindViewById, "findViewById(...)");
            this.f1122l = (TextView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(R.id.tvItemDescription);
            kotlin.jvm.internal.l.e(viewFindViewById2, "findViewById(...)");
            this.f1123m = (TextView) viewFindViewById2;
            view.setOnClickListener(new View.OnClickListener() { // from class: D8.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    G8.b model = (G8.b) mList.get(this.getAdapterPosition());
                    com.zipoapps.premiumhelper.ui.settings.secret.a aVar = clickListener;
                    aVar.getClass();
                    kotlin.jvm.internal.l.f(model, "model");
                    int i = model.f1940a;
                    if (i == PhSecretSettingsActivity.a.CONSUME_ALL.getId()) {
                        com.zipoapps.premiumhelper.e.f37006D.getClass();
                        com.zipoapps.premiumhelper.e eVarA = e.a.a();
                        if (Z8.a.f14063a == null) {
                            eVarA.e().g("PremiumHelper set an undelivered exceptions handler", new Object[0]);
                            Z8.a.f14063a = new B.f(new I2.i(eVarA, 2), 15);
                        }
                        int i10 = 3;
                        X8.a aVar2 = new X8.a(new f0(i10, C4351i.f37871b, new i8.g(eVarA, null)));
                        Q8.b bVar = Q8.a.f11380a;
                        if (bVar == null) {
                            throw new NullPointerException("scheduler == null");
                        }
                        new X8.b(aVar2, bVar).b0(new W8.a(new B.d(new g(aVar.f37169a, 0), 3)));
                        return;
                    }
                    if (i != PhSecretSettingsActivity.a.SEND_LOGS.getId()) {
                        if (i != PhSecretSettingsActivity.a.PH_VERSION.getId()) {
                            PhSecretSettingsActivity.a.PH_DEPENDENCIES.getId();
                            return;
                        }
                        Object systemService = aVar.f37169a.getSystemService("clipboard");
                        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Copied Text", "5.0.3"));
                        Toast.makeText(aVar.f37169a, "PH Version copied to clipboard.", 0).show();
                        return;
                    }
                    C5498a c5498a = aVar.f37169a.f37163d;
                    if (c5498a == null) {
                        kotlin.jvm.internal.l.l("binding");
                        throw null;
                    }
                    c5498a.f45464g.setVisibility(0);
                    x supportFragmentManager = aVar.f37169a.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C1748a c1748a = new C1748a(supportFragmentManager);
                    c1748a.d(new F8.e(), R.id.fragmentContainer);
                    c1748a.g(false);
                }
            });
        }
    }

    public m(ArrayList arrayList, com.zipoapps.premiumhelper.ui.settings.secret.a aVar) {
        this.f1120j = arrayList;
        this.f1121k = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f1120j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        a holder = (a) f10;
        kotlin.jvm.internal.l.f(holder, "holder");
        G8.b item = (G8.b) this.f1120j.get(i);
        kotlin.jvm.internal.l.f(item, "item");
        holder.f1122l.setText(item.f1941b);
        holder.f1123m.setText(item.f1942c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.l.f(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_secret_layout, parent, false);
        kotlin.jvm.internal.l.c(viewInflate);
        return new a(viewInflate, this.f1121k, this.f1120j);
    }
}
