package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513Fo {

    /* renamed from: a, reason: collision with root package name */
    public final C2087wo f8185a;

    /* renamed from: b, reason: collision with root package name */
    public final C0546Hn f8186b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8187c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8188d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8189e;

    public C0513Fo(C2087wo c2087wo, C0546Hn c0546Hn) {
        this.f8185a = c2087wo;
        this.f8186b = c0546Hn;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f8187c) {
            try {
                if (!this.f8189e) {
                    C2087wo c2087wo = this.f8185a;
                    if (!c2087wo.f17474b) {
                        BinderC0462Co binderC0462Co = new BinderC0462Co(0, this);
                        C2087wo c2087wo2 = this.f8185a;
                        c2087wo2.getClass();
                        c2087wo2.f17477e.f10212a.a(new CD(c2087wo2, 28, binderC0462Co), c2087wo2.f17481j);
                        return jSONArray;
                    }
                    b(c2087wo.b());
                }
                ArrayList arrayList = this.f8188d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jSONArray.put(((C0479Do) obj).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        C2184yd c2184yd;
        C0529Gn c0529GnB;
        C0529Gn c0529GnB2;
        C2184yd c2184yd2;
        synchronized (this.f8187c) {
            try {
                if (this.f8189e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0772Vb c0772Vb = (C0772Vb) it.next();
                    E9 e9 = H9.Ba;
                    C2841s c2841s = C2841s.f23267e;
                    String string = (!((Boolean) c2841s.f23270c.a(e9)).booleanValue() || (c0529GnB2 = this.f8186b.b(c0772Vb.f12033a)) == null || (c2184yd2 = c0529GnB2.f8440c) == null) ? "" : c2184yd2.toString();
                    String str = string;
                    boolean z6 = ((Boolean) c2841s.f23270c.a(H9.Ca)).booleanValue() && (c0529GnB = this.f8186b.b(c0772Vb.f12033a)) != null && c0529GnB.f8441d;
                    ArrayList arrayList = this.f8188d;
                    String str2 = c0772Vb.f12033a;
                    C0529Gn c0529GnB3 = this.f8186b.b(str2);
                    String string2 = (c0529GnB3 == null || (c2184yd = c0529GnB3.f8439b) == null) ? "" : c2184yd.toString();
                    arrayList.add(new C0479Do(str2, str, z6, c0772Vb.f12034b ? 1 : 0, string2, c0772Vb.f12035c, c0772Vb.f12036d));
                }
                this.f8189e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
