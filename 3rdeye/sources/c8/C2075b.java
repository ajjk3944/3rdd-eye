package c8;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: Event.java */
/* renamed from: c8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2075b {

    /* renamed from: a, reason: collision with root package name */
    public final String f18552a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18553b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f18554c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18555d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f18556e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18557f;

    public C2075b(C2075b c2075b) {
        Bundle bundle = new Bundle();
        this.f18554c = bundle;
        ArrayList arrayList = new ArrayList();
        this.f18555d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f18556e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f18557f = arrayList3;
        this.f18552a = c2075b.f18552a;
        this.f18553b = c2075b.f18553b;
        bundle.putAll(c2075b.f18554c);
        arrayList.addAll(c2075b.f18555d);
        arrayList2.addAll(c2075b.f18556e);
        arrayList3.addAll(c2075b.f18557f);
    }

    public final void a(Object obj, String str) {
        b(str, String.valueOf(obj));
    }

    public final void b(String str, String str2) {
        this.f18554c.putString(str, String.valueOf(str2));
    }

    public C2075b() {
        this.f18554c = new Bundle();
        this.f18555d = new ArrayList();
        this.f18556e = new ArrayList();
        this.f18557f = new ArrayList();
        this.f18552a = "Playpass_user";
        this.f18553b = true;
    }

    public C2075b(String str, boolean z10) {
        this.f18554c = new Bundle();
        this.f18555d = new ArrayList();
        this.f18556e = new ArrayList();
        this.f18557f = new ArrayList();
        this.f18552a = str;
        this.f18553b = z10;
    }
}
