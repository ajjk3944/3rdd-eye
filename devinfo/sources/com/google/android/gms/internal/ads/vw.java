package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vw {

    /* renamed from: a, reason: collision with root package name */
    public final tb.a f17736a;

    /* renamed from: b, reason: collision with root package name */
    public final bx f17737b;

    /* renamed from: e, reason: collision with root package name */
    public final String f17740e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17741f;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17739d = new Object();
    public long g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f17742h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f17743i = 0;
    public long j = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f17744k = -1;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f17738c = new LinkedList();

    public vw(tb.a aVar, bx bxVar, String str, String str2) {
        this.f17736a = aVar;
        this.f17737b = bxVar;
        this.f17740e = str;
        this.f17741f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f17739d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f17740e);
                bundle.putString("slotid", this.f17741f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.j);
                bundle.putLong("tresponse", this.f17744k);
                bundle.putLong("timp", this.g);
                bundle.putLong("tload", this.f17742h);
                bundle.putLong("pcc", this.f17743i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f17738c.iterator();
                while (it.hasNext()) {
                    uw uwVar = (uw) it.next();
                    uwVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("topen", uwVar.f17364a);
                    bundle2.putLong("tclose", uwVar.f17365b);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }
}
