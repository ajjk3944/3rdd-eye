package com.liuzh.deviceinfo.view.kv;

import ah.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.y;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import li.a;
import li.b;
import wb.e;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class KvCard extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f21385a;

    /* renamed from: b, reason: collision with root package name */
    public a f21386b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f21387c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21388d;

    public KvCard(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iE;
        super(context, attributeSet);
        int iP = d.p(7.0f, getResources().getDisplayMetrics());
        if (isInEditMode()) {
            iE = getContext().getResources().getColor(R.color.colorPrimary);
        } else {
            f fVar = f.f21256b;
            iE = f.e();
        }
        this.f21388d = iE;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f21385a = linearLayout;
        linearLayout.setOrientation(1);
        this.f21385a.setPadding(0, 0, 0, iP);
        addView(this.f21385a);
        setBackgroundResource(R.drawable.bg_common_card);
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
    }

    public final void a(String str, List list) {
        if (this.f21385a.getChildCount() == 0) {
            b(str, list);
        }
    }

    public final void b(String str, List list) {
        LinearLayout linearLayout = this.f21385a;
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.kvcard_name, (ViewGroup) linearLayout, false);
        this.f21387c = textView;
        int i4 = this.f21388d;
        textView.setTextColor(i4);
        setCardName(str);
        linearLayout.addView(this.f21387c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            View viewInflate = layoutInflaterFrom.inflate(bVar.f28823d == 0 ? R.layout.kvcard_item : R.layout.kvcard_item_vertical, (ViewGroup) linearLayout, false);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.name);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.value);
            viewInflate.setTag(bVar.f28820a);
            textView2.setText(bVar.f28820a);
            textView3.setTextColor(i4);
            textView3.setText(bVar.f28821b);
            textView3.setFocusable(true);
            if (bVar.f28822c != -1) {
                textView3.setTextIsSelectable(false);
                if (d.k()) {
                    y.k(textView3);
                }
                textView3.setOnClickListener(new g(7, this, bVar));
                textView3.setBackground(y.a(getContext()));
            } else {
                textView3.setOnClickListener(null);
                if (d.k()) {
                    textView3.setTextIsSelectable(false);
                    textView3.setFocusable(false);
                } else {
                    textView3.setTextIsSelectable(true);
                }
                textView3.setBackground(null);
            }
            if (bVar.f28824e != null) {
                textView3.setTextIsSelectable(false);
                if (d.k()) {
                    y.k(textView3);
                }
                textView3.setBackground(y.a(getContext()));
                Drawable drawable = getContext().getDrawable(R.drawable.ic_view_detail);
                Objects.requireNonNull(drawable);
                ArrayList arrayList = i.f38298a;
                f fVar = f.f21256b;
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(e.M(drawable, f.d()), (Drawable) null, (Drawable) null, (Drawable) null);
                textView3.setCompoundDrawablePadding(a4.a.b(4.0f));
                textView3.setOnClickListener(bVar.f28824e);
            }
            linearLayout.addView(viewInflate);
        }
    }

    public int getKVCount() {
        int childCount = this.f21385a.getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return childCount - 1;
    }

    public void setCardName(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f21387c.setVisibility(8);
        } else {
            this.f21387c.setText(charSequence);
        }
    }

    public void setPermissionRequester(a aVar) {
        this.f21386b = aVar;
    }
}
