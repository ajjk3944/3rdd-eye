package jc;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.h0;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public c f13586a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f13587b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList f13588c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f13589d = new h0(this);

    public static void b(FrameLayout frameLayout) {
        zb.c cVar = zb.c.f26814e;
        Context context = frameLayout.getContext();
        int iB = cVar.b(context, zb.d.f26816a);
        String strB = cc.j.b(context, iB);
        String strC = cc.j.c(context, iB);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strB);
        linearLayout.addView(textView);
        Intent intentA = cVar.a(iB, context, null);
        if (intentA != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strC);
            linearLayout.addView(button);
            button.setOnClickListener(new h(context, intentA));
        }
    }

    public abstract void a(h0 h0Var);

    public final void c(int i10) {
        while (!this.f13588c.isEmpty() && ((j) this.f13588c.getLast()).a() >= i10) {
            this.f13588c.removeLast();
        }
    }

    public final void d(Bundle bundle, j jVar) {
        if (this.f13586a != null) {
            jVar.b();
            return;
        }
        if (this.f13588c == null) {
            this.f13588c = new LinkedList();
        }
        this.f13588c.add(jVar);
        if (bundle != null) {
            Bundle bundle2 = this.f13587b;
            if (bundle2 == null) {
                this.f13587b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f13589d);
    }
}
