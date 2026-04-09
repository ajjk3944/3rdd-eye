package s9;

import kotlin.jvm.internal.l;
import w9.i;

/* compiled from: ObservableProperty.kt */
/* renamed from: s9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5588a<V> {
    private V value;

    public AbstractC5588a(V v10) {
        this.value = v10;
    }

    public void afterChange(i<?> property, V v10, V v11) {
        l.f(property, "property");
    }

    public boolean beforeChange(i<?> property, V v10, V v11) {
        l.f(property, "property");
        return true;
    }

    public V getValue(Object obj, i<?> property) {
        l.f(property, "property");
        return this.value;
    }

    public void setValue(Object obj, i<?> property, V v10) {
        l.f(property, "property");
        V v11 = this.value;
        if (beforeChange(property, v11, v10)) {
            this.value = v10;
            afterChange(property, v11, v10);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
