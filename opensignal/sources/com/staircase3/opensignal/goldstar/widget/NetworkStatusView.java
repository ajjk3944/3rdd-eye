package com.staircase3.opensignal.goldstar.widget;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bf.n;
import br.l;
import kotlin.Metadata;
import qk.d;
import qk.e;
import qk.h;
import qk.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/staircase3/opensignal/goldstar/widget/NetworkStatusView;", "Landroid/widget/LinearLayout;", "Lcom/staircase3/opensignal/goldstar/widget/NetworkStatusView$a;", "value", "a", "Lcom/staircase3/opensignal/goldstar/widget/NetworkStatusView$a;", "getCurrentConnectionType", "()Lcom/staircase3/opensignal/goldstar/widget/NetworkStatusView$a;", "setCurrentConnectionType", "(Lcom/staircase3/opensignal/goldstar/widget/NetworkStatusView$a;)V", "currentConnectionType", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkStatusView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a currentConnectionType;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f6117d;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f6118g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ sq.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a UNKNOWN = new a("UNKNOWN", 0);
        public static final a CONNECTED = new a("CONNECTED", 1);
        public static final a NOT_CONNECTED = new a("NOT_CONNECTED", 2);
        public static final a POSSIBLE_ISSUES = new a("POSSIBLE_ISSUES", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{UNKNOWN, CONNECTED, NOT_CONNECTED, POSSIBLE_ISSUES};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = a.a.j(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static sq.a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.currentConnectionType = a.UNKNOWN;
        setOrientation(0);
        setGravity(17);
        int dimension = (int) getResources().getDimension(e.standard_margin);
        setPadding(dimension, dimension, dimension, dimension);
        LayoutInflater.from(context).inflate(i.view_network_status, (ViewGroup) this, true);
        View viewFindViewById = findViewById(h.network_status_label);
        l.d(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f6117d = textView;
        textView.setVisibility(8);
        View viewFindViewById2 = findViewById(h.network_status_icon);
        l.d(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f6118g = imageView;
        imageView.setVisibility(8);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
    }

    public final a getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    public final void setCurrentConnectionType(a aVar) {
        int i10;
        int i11;
        l.e(aVar, "value");
        this.currentConnectionType = aVar;
        int[] iArr = com.staircase3.opensignal.goldstar.widget.a.f6120a;
        int i12 = iArr[aVar.ordinal()];
        if (i12 == 1) {
            i10 = -1;
        } else if (i12 == 2) {
            i10 = d.network_state_connected;
        } else if (i12 == 3) {
            i10 = d.network_state_not_connected;
        } else {
            if (i12 != 4) {
                throw new n();
            }
            i10 = d.network_state_possible_issues;
        }
        int color = getContext().getColor(i10);
        int i13 = i10 > -1 ? 0 : 8;
        ImageView imageView = this.f6118g;
        imageView.setVisibility(i13);
        imageView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        int i14 = iArr[aVar.ordinal()];
        if (i14 == 1) {
            i11 = 0;
        } else if (i14 == 2) {
            i11 = qk.l.connectivity_assistant_connect_type_connected;
        } else if (i14 == 3) {
            i11 = qk.l.connectivity_assistant_connect_type_not_connected;
        } else {
            if (i14 != 4) {
                throw new n();
            }
            i11 = qk.l.connectivity_assistant_connect_type_possible_issues;
        }
        int i15 = i11 > 0 ? 0 : 8;
        TextView textView = this.f6117d;
        textView.setVisibility(i15);
        if (i11 > 0) {
            textView.setText(getContext().getString(i11));
        }
    }
}
