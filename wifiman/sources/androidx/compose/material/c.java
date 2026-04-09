package androidx.compose.material;

import N.D;
import Zg.AbstractC3689v;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements D {

    /* renamed from: a, reason: collision with root package name */
    private final Map f28607a;

    public c(Map map) {
        this.f28607a = map;
    }

    @Override // N.D
    public int a() {
        return this.f28607a.size();
    }

    @Override // N.D
    public float b() {
        Float fI0 = AbstractC3689v.I0(this.f28607a.values());
        if (fI0 != null) {
            return fI0.floatValue();
        }
        return Float.NaN;
    }

    @Override // N.D
    public Object c(float f10, boolean z10) {
        Object next;
        Iterator it = this.f28607a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f11 = z10 ? fFloatValue - f10 : f10 - fFloatValue;
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f12 = z10 ? fFloatValue2 - f10 : f10 - fFloatValue2;
                    if (f12 < 0.0f) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        next = next2;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // N.D
    public Object d(float f10) {
        Object next;
        Iterator it = this.f28607a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f10 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f10 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // N.D
    public float e(Object obj) {
        Float f10 = (Float) this.f28607a.get(obj);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return AbstractC6492s.d(this.f28607a, ((c) obj).f28607a);
        }
        return false;
    }

    @Override // N.D
    public boolean f(Object obj) {
        return this.f28607a.containsKey(obj);
    }

    @Override // N.D
    public float g() {
        Float fG0 = AbstractC3689v.G0(this.f28607a.values());
        if (fG0 != null) {
            return fG0.floatValue();
        }
        return Float.NaN;
    }

    public int hashCode() {
        return this.f28607a.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.f28607a + ')';
    }
}
