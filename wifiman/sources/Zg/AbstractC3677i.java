package Zg;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import nh.InterfaceC6948e;

/* renamed from: Zg.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3677i extends AbstractMap implements Map, InterfaceC6948e {
    protected AbstractC3677i() {
    }

    public abstract Set b();

    public abstract /* bridge */ Set d();

    public abstract /* bridge */ int e();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return b();
    }

    public abstract /* bridge */ Collection f();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return f();
    }
}
