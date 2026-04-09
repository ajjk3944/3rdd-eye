package a9;

import java.util.Map;
import kotlin.jvm.internal.p;
import z8.h;

/* loaded from: classes4.dex */
public abstract class a extends h {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return e((Map.Entry) obj);
        }
        return false;
    }

    public final boolean e(Map.Entry element) {
        p.e(element, "element");
        return f(element);
    }

    public abstract boolean f(Map.Entry entry);

    public abstract /* bridge */ boolean g(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }
}
