package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<b<String>>> f13998a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f13999b = new HashMap();

    public void a(String str, b<String> bVar) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                ((List) this.f13998a.computeIfAbsent(str, new Function() { // from class: x6.b
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return com.mbridge.msdk.config.dynamic.binddata.wrapper.a.a((String) obj);
                    }
                })).add(bVar);
                return;
            }
            List<b<String>> copyOnWriteArrayList = this.f13998a.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f13998a.put(str, copyOnWriteArrayList);
            }
            if (copyOnWriteArrayList.contains(bVar)) {
                return;
            }
            copyOnWriteArrayList.add(bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to add map observer: " + e10.getMessage(), e10);
        }
    }

    public boolean d() {
        return this.f13999b.isEmpty();
    }

    public int e() {
        return this.f13999b.size();
    }

    @NonNull
    public String toString() {
        return this.f13999b.toString();
    }

    public void b(String str, b<String> bVar) {
        try {
            a(str, bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to pre-register map observer: " + e10.getMessage(), e10);
        }
    }

    public Map<String, List<b<String>>> c() {
        return this.f13998a;
    }

    @Nullable
    public Object c(@Nullable Object obj) {
        return this.f13999b.remove(obj);
    }

    public Map<String, Object> b() {
        return this.f13999b;
    }

    public void b(Map<String, List<b<String>>> map) {
        this.f13998a.clear();
        this.f13998a.putAll(map);
    }

    @Nullable
    public Object b(@Nullable Object obj) {
        return this.f13999b.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(String str) {
        return new CopyOnWriteArrayList();
    }

    public boolean a(@Nullable Object obj) {
        return this.f13999b.containsKey(obj);
    }

    @NonNull
    public Set<Map.Entry<String, Object>> a() {
        return this.f13999b.entrySet();
    }

    public void a(@NonNull Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public Integer a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            this.f13999b.put(str, obj);
            a(str, obj, str);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", e10.getMessage(), e10);
            return 0;
        }
    }

    public Integer a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        try {
            this.f13999b.put(str2, obj);
            a(str, obj, str2);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to notify map observers: " + e10.getMessage(), e10);
            return 0;
        }
    }

    private void a(final String str, final Object obj, String str2) {
        List<b<String>> list;
        if (this.f13998a.containsKey(str) && (list = this.f13998a.get(str)) != null) {
            for (final b<String> bVar : list) {
                if (bVar instanceof d) {
                    View viewA = ((d) bVar).a();
                    if (viewA != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            bVar.a(str, obj);
                        } else {
                            viewA.post(new Runnable() { // from class: x6.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bVar.a(str, obj);
                                }
                            });
                        }
                    } else {
                        bVar.a(str, obj);
                    }
                } else {
                    bVar.a(str, obj);
                }
            }
        }
    }
}
