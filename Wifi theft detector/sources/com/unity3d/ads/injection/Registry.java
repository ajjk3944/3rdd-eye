package com.unity3d.ads.injection;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.coroutines.flow.e1;
import kotlinx.coroutines.flow.t0;
import org.jetbrains.annotations.NotNull;
import y8.h;
import y8.i;
import z8.h0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R!\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00168F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/injection/Registry;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "named", "Lkotlin/Function0;", "instance", "Lcom/unity3d/ads/injection/EntryKey;", "single", "(Ljava/lang/String;Ll9/a;)Lcom/unity3d/ads/injection/EntryKey;", "factory", "key", "Ly8/h;", "Ly8/s;", "add", "(Lcom/unity3d/ads/injection/EntryKey;Ly8/h;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", "Lkotlinx/coroutines/flow/t0;", "", "_services", "Lkotlinx/coroutines/flow/t0;", "getServices", "()Ljava/util/Map;", "services", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Registry.kt\ncom/unity3d/ads/injection/Registry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,74:1\n1#2:75\n230#3,5:76\n*S KotlinDebug\n*F\n+ 1 Registry.kt\ncom/unity3d/ads/injection/Registry\n*L\n46#1:76,5\n*E\n"})
/* loaded from: classes3.dex */
public final class Registry {

    @NotNull
    private final t0 _services = e1.a(a.h());

    public static /* synthetic */ EntryKey factory$default(Registry registry, String named, l9.a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        p.e(named, "named");
        p.e(instance, "instance");
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, t.b(Object.class));
        registry.add(entryKey, new Factory(instance));
        return entryKey;
    }

    public static /* synthetic */ Object get$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        p.e(named, "named");
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, t.b(Object.class));
        h hVar = registry.getServices().get(entryKey);
        if (hVar != null) {
            Object value = hVar.getValue();
            p.j(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public static /* synthetic */ Object getOrNull$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        p.e(named, "named");
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h hVar = registry.getServices().get(new EntryKey(named, t.b(Object.class)));
        if (hVar == null) {
            return null;
        }
        Object value = hVar.getValue();
        p.j(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return value;
    }

    public static /* synthetic */ EntryKey single$default(Registry registry, String named, l9.a instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        p.e(named, "named");
        p.e(instance, "instance");
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, t.b(Object.class));
        registry.add(entryKey, b.b(instance));
        return entryKey;
    }

    public final <T> void add(@NotNull EntryKey key, @NotNull h instance) {
        Object value;
        p.e(key, "key");
        p.e(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        t0 t0Var = this._services;
        do {
            value = t0Var.getValue();
        } while (!t0Var.h(value, a.o((Map) value, h0.f(i.a(key, instance)))));
    }

    public final /* synthetic */ <T> EntryKey factory(String named, l9.a instance) {
        p.e(named, "named");
        p.e(instance, "instance");
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, t.b(Object.class));
        add(entryKey, new Factory(instance));
        return entryKey;
    }

    public final /* synthetic */ <T> T get(String named) {
        p.e(named, "named");
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, t.b(Object.class));
        h hVar = getServices().get(entryKey);
        if (hVar != null) {
            T t10 = (T) hVar.getValue();
            p.j(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            return t10;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        p.e(named, "named");
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h hVar = getServices().get(new EntryKey(named, t.b(Object.class)));
        if (hVar == null) {
            return null;
        }
        T t10 = (T) hVar.getValue();
        p.j(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return t10;
    }

    @NotNull
    public final Map<EntryKey, h> getServices() {
        return (Map) this._services.getValue();
    }

    public final /* synthetic */ <T> EntryKey single(String named, l9.a instance) {
        p.e(named, "named");
        p.e(instance, "instance");
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        EntryKey entryKey = new EntryKey(named, t.b(Object.class));
        add(entryKey, b.b(instance));
        return entryKey;
    }
}
