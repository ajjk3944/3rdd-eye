package com.staircase3.opensignal.goldstar.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bf.n;
import br.l;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.utils.o;
import ht.g;
import kc.f;
import kotlin.Metadata;
import lq.j;
import qk.h;
import qk.i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/staircase3/opensignal/goldstar/widget/NetworkInfoView;", "Landroid/widget/LinearLayout;", "Lkv/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/staircase3/opensignal/models/NetworkUiState;", "networkUiState", "Llq/b0;", "setupText", "(Lcom/staircase3/opensignal/models/NetworkUiState;)V", "setupImage", "setNetworkInformation", "Lcom/staircase3/opensignal/utils/o;", "g", "Llq/h;", "getNetworkTypeUtils", "()Lcom/staircase3/opensignal/utils/o;", "networkTypeUtils", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkInfoView extends LinearLayout implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6113a;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f6114d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6115g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.e(context, "context");
        l.e(attributeSet, "attrs");
        this.f6115g = f.E(j.SYNCHRONIZED, new g(28, this));
        LayoutInflater.from(context).inflate(i.layout_network_info_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(h.networkInfoImageView);
        l.d(viewFindViewById, "findViewById(...)");
        this.f6114d = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(h.networkInfoTextView);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f6113a = (TextView) viewFindViewById2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    private final o getNetworkTypeUtils() {
        return (o) this.f6115g.getValue();
    }

    private final void setupImage(NetworkUiState networkUiState) {
        int i10;
        int i11 = om.a.f19548a[networkUiState.B.ordinal()];
        if (i11 == 1) {
            i10 = qk.f.ic_wifi_a;
        } else if (i11 == 2) {
            i10 = qk.f.ic_cellular_a;
        } else {
            if (i11 != 3) {
                throw new n();
            }
            i10 = qk.f.no_signal;
        }
        this.f6114d.setImageResource(i10);
    }

    private final void setupText(NetworkUiState networkUiState) throws Resources.NotFoundException {
        String str;
        o networkTypeUtils = getNetworkTypeUtils();
        com.staircase3.opensignal.utils.l lVar = networkUiState.D;
        Context context = getContext();
        l.d(context, "getContext(...)");
        networkTypeUtils.getClass();
        String strB = o.b(lVar, context);
        int i10 = om.a.f19548a[networkUiState.B.ordinal()];
        if (i10 == 1) {
            str = getContext().getString(qk.l.wifi) + '\n' + networkUiState.E;
        } else if (i10 == 2) {
            str = strB + '\n' + networkUiState.F;
        } else {
            if (i10 != 3) {
                throw new n();
            }
            str = "";
        }
        this.f6113a.setText(str);
    }

    @Override // kv.a
    public /* bridge */ jv.a getKoin() {
        return a.a.r(this);
    }

    @Override // android.view.View
    public final boolean isInEditMode() {
        return true;
    }

    public final void setNetworkInformation(NetworkUiState networkUiState) {
        l.e(networkUiState, "networkUiState");
        setupText(networkUiState);
        setupImage(networkUiState);
    }
}
