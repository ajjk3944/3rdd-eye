package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import f4.InterfaceFutureC2326a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.lA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1463lA implements InterfaceC1409kA, InterfaceC2151xy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15353a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15354b;

    /* renamed from: c, reason: collision with root package name */
    public final C1948uA f15355c;

    /* renamed from: d, reason: collision with root package name */
    public final ID f15356d;

    /* renamed from: e, reason: collision with root package name */
    public final Xx f15357e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f15358f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceFutureC2326a f15359g;

    public C1463lA(Context context, C1948uA c1948uA, Xx xx, ID id) {
        this.f15353a = 0;
        this.f15358f = new AtomicBoolean(false);
        this.f15359g = AbstractC1984ut.e("E");
        this.f15354b = context;
        this.f15355c = c1948uA;
        this.f15357e = xx;
        this.f15356d = id;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2151xy
    public final InterfaceFutureC2326a a() {
        switch (this.f15353a) {
            case 0:
                if (this.f15358f.getAndSet(true)) {
                    return ED.f7928b;
                }
                return ((C0623Mf) this.f15356d).b(new Zs(8, this));
            default:
                if (this.f15358f.getAndSet(true) || !this.f15357e.H()) {
                    return ED.f7928b;
                }
                return ((C0623Mf) this.f15356d).a(new Fu(8, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void b(HashMap map) {
        switch (this.f15353a) {
            case 0:
                e(map);
                break;
            default:
                map.put("gs", this.f15359g);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void c(HashMap map) {
        switch (this.f15353a) {
            case 0:
                e(map);
                break;
            default:
                map.put("gs", this.f15359g);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void d(HashMap map, Context context, View view) {
        switch (this.f15353a) {
            case 0:
                e(map);
                break;
            default:
                map.put("gs", this.f15359g);
                break;
        }
    }

    public void e(HashMap map) {
        synchronized (this) {
            map.put("ai", this.f15359g);
        }
    }

    public C1463lA(Context context, C1948uA c1948uA, ID id, Xx xx) {
        this.f15353a = 1;
        this.f15358f = new AtomicBoolean(false);
        this.f15359g = ED.f7928b;
        this.f15354b = context;
        this.f15355c = c1948uA;
        this.f15356d = id;
        this.f15357e = xx;
    }
}
