package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class s2 extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    protected Context f5283a;

    /* renamed from: b, reason: collision with root package name */
    private List f5284b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Map f5285c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private a f5286d;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a(j2 j2Var, r2 r2Var);
    }

    public s2(Context context) {
        this.f5283a = context.getApplicationContext();
    }

    public r2 a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r2 getItem(int i4) {
        return (r2) this.f5284b.get(i4);
    }

    public abstract List c(int i4);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new v9(14, this));
    }

    public abstract int d(int i4);

    public abstract r2 e(int i4);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5284b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return getItem(i4).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        q2 q2Var;
        r2 item = getItem(i4);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            q2Var = new q2();
            q2Var.f5155a = (TextView) view.findViewById(R.id.text1);
            q2Var.f5156b = (TextView) view.findViewById(R.id.text2);
            q2Var.f5157c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            q2Var.f5158d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(q2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            q2Var = (q2) view.getTag();
        }
        q2Var.a(i4);
        q2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return r2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i4) {
        return getItem(i4).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i4;
        this.f5284b = new ArrayList();
        int iB = b();
        this.f5285c = new HashMap(iB);
        r2 r2VarA = a();
        if (r2VarA != null) {
            this.f5284b.add(r2VarA);
            i4 = 1;
        } else {
            i4 = 0;
        }
        for (int i10 = 0; i10 < iB; i10++) {
            int iD = d(i10);
            if (iD != 0) {
                this.f5284b.add(e(i10));
                this.f5284b.addAll(c(i10));
                this.f5285c.put(Integer.valueOf(i10), Integer.valueOf(i4));
                i4 = iD + 1 + i4;
            }
        }
        this.f5284b.add(new v4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q2 q2Var = (q2) view.getTag();
        r2 r2VarB = q2Var.b();
        j2 j2VarA = a(q2Var.a());
        a aVar = this.f5286d;
        if (aVar == null || j2VarA == null) {
            return;
        }
        aVar.a(j2VarA, r2VarB);
    }

    public void a(a aVar) {
        this.f5286d = aVar;
    }

    private j2 a(int i4) {
        for (int i10 = 0; i10 < b(); i10++) {
            Integer num = (Integer) this.f5285c.get(Integer.valueOf(i10));
            if (num != null) {
                if (i4 <= num.intValue() + d(i10)) {
                    return new j2(i10, i4 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(m0.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f5283a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
