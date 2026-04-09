package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* loaded from: classes3.dex */
class u extends RecyclerView.g {

    /* renamed from: c, reason: collision with root package name */
    private final i f37470c;

    public static class a extends RecyclerView.C {

        /* renamed from: t, reason: collision with root package name */
        final TextView f37471t;

        a(TextView textView) {
            super(textView);
            this.f37471t = textView;
        }
    }

    u(i iVar) {
        this.f37470c = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f37470c.M1().l();
    }

    int t(int i10) {
        return i10 - this.f37470c.M1().k().f37446c;
    }

    int u(int i10) {
        return this.f37470c.M1().k().f37446c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void i(a aVar, int i10) {
        int iU = u(i10);
        aVar.f37471t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iU)));
        TextView textView = aVar.f37471t;
        textView.setContentDescription(e.e(textView.getContext(), iU));
        c cVarN1 = this.f37470c.N1();
        if (t.g().get(1) == iU) {
            b bVar = cVarN1.f37362f;
        } else {
            b bVar2 = cVarN1.f37360d;
        }
        this.f37470c.P1();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public a k(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(O3.g.f17113p, viewGroup, false));
    }
}
