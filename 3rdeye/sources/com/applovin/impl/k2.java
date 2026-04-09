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

/* loaded from: classes.dex */
public abstract class k2 extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    protected Context f19645a;

    /* renamed from: b, reason: collision with root package name */
    private List f19646b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Map f19647c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private a f19648d;

    public interface a {
        void a(d2 d2Var, j2 j2Var);
    }

    public k2(Context context) {
        this.f19645a = context.getApplicationContext();
    }

    public j2 a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j2 getItem(int i) {
        return (j2) this.f19646b.get(i);
    }

    public abstract List c(int i);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new B.b(this, 18));
    }

    public abstract int d(int i);

    public abstract j2 e(int i);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f19646b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        i2 i2Var;
        j2 item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            i2Var = new i2();
            i2Var.f19517a = (TextView) view.findViewById(R.id.text1);
            i2Var.f19518b = (TextView) view.findViewById(R.id.text2);
            i2Var.f19519c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            i2Var.f19520d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(i2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            i2Var = (i2) view.getTag();
        }
        i2Var.a(i);
        i2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return j2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i;
        this.f19646b = new ArrayList();
        int iB = b();
        this.f19647c = new HashMap(iB);
        j2 j2VarA = a();
        if (j2VarA != null) {
            this.f19646b.add(j2VarA);
            i = 1;
        } else {
            i = 0;
        }
        for (int i10 = 0; i10 < iB; i10++) {
            int iD = d(i10);
            if (iD != 0) {
                this.f19646b.add(e(i10));
                this.f19646b.addAll(c(i10));
                this.f19647c.put(Integer.valueOf(i10), Integer.valueOf(i));
                i = iD + 1 + i;
            }
        }
        this.f19646b.add(new j4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        i2 i2Var = (i2) view.getTag();
        j2 j2VarB = i2Var.b();
        d2 d2VarA = a(i2Var.a());
        a aVar = this.f19648d;
        if (aVar == null || d2VarA == null) {
            return;
        }
        aVar.a(d2VarA, j2VarB);
    }

    public void a(a aVar) {
        this.f19648d = aVar;
    }

    private d2 a(int i) {
        for (int i10 = 0; i10 < b(); i10++) {
            Integer num = (Integer) this.f19647c.get(Integer.valueOf(i10));
            if (num != null) {
                if (i <= num.intValue() + d(i10)) {
                    return new d2(i10, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AbstractC2124i0.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f19645a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
