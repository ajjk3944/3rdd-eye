package com.google.android.exoplayer2.source.hls;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4477a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, float f10, boolean z10, int i11) {
        super(i10, f10, z10);
        this.f4477a = i11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsKey(Object obj) {
        switch (this.f4477a) {
            case 2:
                if (obj instanceof String) {
                    return super.containsKey((String) obj);
                }
                return false;
            default:
                return super.containsKey(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object get(Object obj) {
        switch (this.f4477a) {
            case 2:
                if (obj instanceof String) {
                    return super.get((String) obj);
                }
                return null;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.f4477a) {
            case 2:
                return !(obj instanceof String) ? obj2 : super.getOrDefault((String) obj, obj2);
            default:
                return super.getOrDefault(obj, obj2);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object remove(Object obj) {
        switch (this.f4477a) {
            case 2:
                if (obj instanceof String) {
                    return super.remove((String) obj);
                }
                return null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f4477a) {
            case 0:
                if (size() > 4) {
                }
                break;
            case 1:
                if (size() > 4) {
                }
                break;
            default:
                if (super.size() > 256) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(oh.p pVar) {
        super(256, 0.75f, true);
        this.f4477a = 2;
    }

    @Override // java.util.HashMap, java.util.Map
    public /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.f4477a) {
            case 2:
                if (obj instanceof String) {
                    return super.remove((String) obj, obj2);
                }
                return false;
            default:
                return super.remove(obj, obj2);
        }
    }
}
