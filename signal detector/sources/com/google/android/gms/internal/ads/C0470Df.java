package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.Df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470Df {

    /* renamed from: a, reason: collision with root package name */
    public final Q2.a f7807a;

    /* renamed from: b, reason: collision with root package name */
    public final C0572Jf f7808b;

    /* renamed from: e, reason: collision with root package name */
    public final String f7811e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7812f;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7810d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public long f7813g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f7814h = -1;
    public long i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f7815j = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f7816k = -1;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f7809c = new LinkedList();

    public C0470Df(Q2.a aVar, C0572Jf c0572Jf, String str, String str2) {
        this.f7807a = aVar;
        this.f7808b = c0572Jf;
        this.f7811e = str;
        this.f7812f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f7810d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f7811e);
                bundle.putString("slotid", this.f7812f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f7815j);
                bundle.putLong("tresponse", this.f7816k);
                bundle.putLong("timp", this.f7813g);
                bundle.putLong("tload", this.f7814h);
                bundle.putLong("pcc", this.i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f7809c.iterator();
                while (it.hasNext()) {
                    C0453Cf c0453Cf = (C0453Cf) it.next();
                    c0453Cf.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("topen", c0453Cf.f7631a);
                    bundle2.putLong("tclose", c0453Cf.f7632b);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }
}
