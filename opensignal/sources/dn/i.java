package dn;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import br.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import lq.q;
import mq.o;
import mq.w;
import o4.p;
import qk.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ldn/i;", "Lo4/p;", "<init>", "()V", "dn/g", "dn/f", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i extends p {
    public final Object M0;
    public final Object N0;
    public f O0;
    public g P0;
    public final q Q0;
    public final q R0;
    public final q S0;

    public i() {
        lq.j jVar = lq.j.SYNCHRONIZED;
        this.M0 = kc.f.E(jVar, new h(this, 0));
        this.N0 = kc.f.E(jVar, new h(this, 1));
        final int i10 = 0;
        this.Q0 = kc.f.F(new ar.a(this) { // from class: dn.e

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i f7412d;

            {
                this.f7412d = this;
            }

            @Override // ar.a
            public final Object c() {
                String string;
                String string2;
                ArrayList parcelableArrayList;
                switch (i10) {
                    case 0:
                        Bundle bundle = this.f7412d.B;
                        return (bundle == null || (string = bundle.getString("title")) == null) ? "" : string;
                    case 1:
                        Bundle bundle2 = this.f7412d.B;
                        return (bundle2 == null || (string2 = bundle2.getString("content")) == null) ? "" : string2;
                    default:
                        Bundle bundle3 = this.f7412d.B;
                        return (bundle3 == null || (parcelableArrayList = bundle3.getParcelableArrayList("cards")) == null) ? w.f16945a : o.Q0(parcelableArrayList);
                }
            }
        });
        final int i11 = 1;
        this.R0 = kc.f.F(new ar.a(this) { // from class: dn.e

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i f7412d;

            {
                this.f7412d = this;
            }

            @Override // ar.a
            public final Object c() {
                String string;
                String string2;
                ArrayList parcelableArrayList;
                switch (i11) {
                    case 0:
                        Bundle bundle = this.f7412d.B;
                        return (bundle == null || (string = bundle.getString("title")) == null) ? "" : string;
                    case 1:
                        Bundle bundle2 = this.f7412d.B;
                        return (bundle2 == null || (string2 = bundle2.getString("content")) == null) ? "" : string2;
                    default:
                        Bundle bundle3 = this.f7412d.B;
                        return (bundle3 == null || (parcelableArrayList = bundle3.getParcelableArrayList("cards")) == null) ? w.f16945a : o.Q0(parcelableArrayList);
                }
            }
        });
        final int i12 = 2;
        this.S0 = kc.f.F(new ar.a(this) { // from class: dn.e

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i f7412d;

            {
                this.f7412d = this;
            }

            @Override // ar.a
            public final Object c() {
                String string;
                String string2;
                ArrayList parcelableArrayList;
                switch (i12) {
                    case 0:
                        Bundle bundle = this.f7412d.B;
                        return (bundle == null || (string = bundle.getString("title")) == null) ? "" : string;
                    case 1:
                        Bundle bundle2 = this.f7412d.B;
                        return (bundle2 == null || (string2 = bundle2.getString("content")) == null) ? "" : string2;
                    default:
                        Bundle bundle3 = this.f7412d.B;
                        return (bundle3 == null || (parcelableArrayList = bundle3.getParcelableArrayList("cards")) == null) ? w.f16945a : o.Q0(parcelableArrayList);
                }
            }
        });
    }

    @Override // o4.p, androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        i0(m.DialogTheme_Fullscreen_Osca);
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.e(layoutInflater, "inflater");
        super.F(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(qk.i.osca_dialog, viewGroup);
        se.b.X(this.H0, qk.d.status_bar_background);
        Toolbar toolbar = (Toolbar) viewInflate.findViewById(qk.h.osca_toolbar);
        if (toolbar != null) {
            toolbar.setTitle((String) this.Q0.getValue());
            toolbar.setNavigationIcon(qk.f.ic_arrow_back_white_36dp);
            toolbar.setNavigationOnClickListener(new am.b(5, this));
        }
        ((TextView) viewInflate.findViewById(qk.h.osca_content_textview)).setText((String) this.R0.getValue());
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(qk.h.resolutionListRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new am.k((List) this.S0.getValue(), new bf.a(13, this)));
        layoutInflater.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        return viewInflate;
    }

    @Override // o4.p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        l.e(dialogInterface, "dialog");
        g gVar = this.P0;
        if (gVar != null) {
            gVar.onDismiss();
        }
        super.onDismiss(dialogInterface);
    }
}
