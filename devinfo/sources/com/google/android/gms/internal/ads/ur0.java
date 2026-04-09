package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ur0 implements pb.b, pb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17301a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17302b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17303c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17304d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f17305e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17306f;

    public ur0(Context context, Looper looper, w5 w5Var) {
        this.f17301a = 0;
        this.f17304d = new l90(17, context.getApplicationContext());
        this.f17305e = w5Var.A(looper, null);
        this.f17306f = w5Var.A(Looper.getMainLooper(), null);
    }

    @Override // pb.b
    public void T() {
        synchronized (this.f17306f) {
            try {
                if (this.f17303c) {
                    return;
                }
                this.f17303c = true;
                try {
                    wv0 wv0Var = (wv0) ((tv0) this.f17304d).t();
                    sv0 sv0Var = new sv0(1, ((pv0) this.f17305e).b());
                    Parcel parcelT = wv0Var.T();
                    ng.c(parcelT, sv0Var);
                    wv0Var.g1(parcelT, 2);
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    g();
                    throw th2;
                }
                g();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean a(zc.g gVar) {
        int id2 = gVar.getId();
        HashSet hashSet = (HashSet) this.f17305e;
        if (hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        zc.g gVar2 = (zc.g) ((HashMap) this.f17304d).get(Integer.valueOf(c()));
        if (gVar2 != null) {
            e(gVar2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id2));
        if (!gVar.isChecked()) {
            gVar.setChecked(true);
        }
        return zAdd;
    }

    public ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.f17305e);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof zc.g) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        HashSet hashSet = (HashSet) this.f17305e;
        if (!this.f17302b || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void d() {
        km.i iVar = (km.i) this.f17306f;
        if (iVar != null) {
            new HashSet((HashSet) this.f17305e);
            ChipGroup chipGroup = (ChipGroup) iVar.f28426b;
            sc.h hVar = chipGroup.g;
            if (hVar != null) {
                chipGroup.f20434h.b(chipGroup);
                ChipGroup chipGroup2 = (ChipGroup) ((nm.d0) hVar).f30011b;
                if (chipGroup2.f20434h.f17302b) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public boolean e(zc.g gVar, boolean z3) {
        int id2 = gVar.getId();
        HashSet hashSet = (HashSet) this.f17305e;
        if (!hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z3 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id2))) {
            gVar.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id2));
        if (gVar.isChecked()) {
            gVar.setChecked(false);
        }
        return zRemove;
    }

    public void f(boolean z3) {
        if (this.f17303c == z3) {
            return;
        }
        this.f17303c = z3;
        if (this.f17302b) {
            h(true, z3);
        }
    }

    public void g() {
        synchronized (this.f17306f) {
            try {
                tv0 tv0Var = (tv0) this.f17304d;
                if (tv0Var.g() || tv0Var.c()) {
                    tv0Var.f();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(final boolean z3, final boolean z10) {
        no0 no0Var = (no0) this.f17305e;
        if (z3 && z10) {
            no0Var.e(new vq0(0, this, z3, z10));
            return;
        }
        l90 l90Var = (l90) this.f17304d;
        Objects.requireNonNull(l90Var);
        final s30 s30Var = new s30(27, l90Var);
        ((no0) this.f17306f).f14385a.postDelayed(s30Var, 1000L);
        no0Var.e(new Runnable() { // from class: com.google.android.gms.internal.ads.jr0
            @Override // java.lang.Runnable
            public final void run() {
                ur0 ur0Var = this.f12811a;
                ((no0) ur0Var.f17306f).f14385a.removeCallbacks(s30Var);
                ((l90) ur0Var.f17304d).t(z3, z10);
            }
        });
    }

    public String toString() {
        switch (this.f17301a) {
            case 3:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f17302b + ", prettyPrintIndent='" + ((String) this.f17304d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f17305e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f17303c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((nl.a) this.f17306f) + ')';
            default:
                return super.toString();
        }
    }

    public ur0(Context context, Looper looper, pv0 pv0Var) {
        this.f17301a = 1;
        this.f17306f = new Object();
        this.f17302b = false;
        this.f17303c = false;
        this.f17305e = pv0Var;
        this.f17304d = new tv0(context, looper, this, this, 12800000);
    }

    public ur0(int i4) {
        this.f17301a = i4;
        switch (i4) {
            case 4:
                this.f17304d = new HashMap();
                this.f17305e = new HashSet();
                break;
            default:
                this.f17302b = true;
                this.f17304d = "    ";
                this.f17305e = "type";
                this.f17303c = true;
                this.f17306f = nl.a.f29988a;
                break;
        }
    }

    public ur0(Context context, String str, t7.m mVar, boolean z3, boolean z10) {
        this.f17301a = 2;
        nk.k.e(context, "context");
        nk.k.e(mVar, "callback");
        this.f17304d = context;
        this.f17305e = str;
        this.f17306f = mVar;
        this.f17302b = z3;
        this.f17303c = z10;
    }

    @Override // pb.c
    public void O(nb.b bVar) {
    }

    @Override // pb.b
    public void S(int i4) {
    }
}
