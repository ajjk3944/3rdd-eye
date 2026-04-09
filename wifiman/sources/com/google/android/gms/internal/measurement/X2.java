package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class X2 implements U2 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f35152a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private HashMap f35153b = null;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f35154c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f35155d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f35156e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f35157f = new HashMap(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private Object f35158g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f35159h = false;

    /* renamed from: i, reason: collision with root package name */
    private String[] f35160i = new String[0];

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC4310b3 f35161j = new Y2();

    @Override // com.google.android.gms.internal.measurement.U2
    public final String a(ContentResolver contentResolver, String str, String str2) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                if (this.f35153b == null) {
                    this.f35152a.set(false);
                    this.f35153b = new HashMap(16, 1.0f);
                    this.f35158g = new Object();
                    contentResolver.registerContentObserver(S2.f35103a, true, new C4301a3(this, null));
                } else if (this.f35152a.getAndSet(false)) {
                    this.f35153b.clear();
                    this.f35154c.clear();
                    this.f35155d.clear();
                    this.f35156e.clear();
                    this.f35157f.clear();
                    this.f35158g = new Object();
                    this.f35159h = false;
                }
                Object obj = this.f35158g;
                if (this.f35153b.containsKey(str)) {
                    String str3 = (String) this.f35153b.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : this.f35160i) {
                    if (str.startsWith(str4)) {
                        if (!this.f35159h) {
                            try {
                                HashMap map = (HashMap) this.f35161j.b(contentResolver, this.f35160i, new InterfaceC4319c3() { // from class: com.google.android.gms.internal.measurement.W2
                                    @Override // com.google.android.gms.internal.measurement.InterfaceC4319c3
                                    public final Map zza(int i10) {
                                        return new HashMap(i10, 1.0f);
                                    }
                                });
                                if (!map.isEmpty()) {
                                    Set setKeySet = map.keySet();
                                    setKeySet.removeAll(this.f35154c.keySet());
                                    setKeySet.removeAll(this.f35155d.keySet());
                                    setKeySet.removeAll(this.f35156e.keySet());
                                    setKeySet.removeAll(this.f35157f.keySet());
                                }
                                if (!map.isEmpty()) {
                                    if (this.f35153b.isEmpty()) {
                                        this.f35153b = map;
                                    } else {
                                        this.f35153b.putAll(map);
                                    }
                                }
                                this.f35159h = true;
                            } catch (zzhe unused) {
                            }
                            if (this.f35153b.containsKey(str)) {
                                String str5 = (String) this.f35153b.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    String strA = this.f35161j.a(contentResolver, str);
                    if (strA != null && strA.equals(null)) {
                        strA = null;
                    }
                    synchronized (this) {
                        try {
                            if (obj == this.f35158g) {
                                this.f35153b.put(str, strA);
                            }
                        } finally {
                        }
                    }
                    if (strA != null) {
                        return strA;
                    }
                    return null;
                } catch (zzhe unused2) {
                    return null;
                }
            } finally {
            }
        }
    }
}
