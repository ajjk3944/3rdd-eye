package c;

import android.os.Bundle;
import androidx.lifecycle.EnumC0291m;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: c.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0381f implements F0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f5827b;

    public /* synthetic */ C0381f(AbstractActivityC2349g abstractActivityC2349g, int i) {
        this.f5826a = i;
        this.f5827b = abstractActivityC2349g;
    }

    @Override // F0.e
    public final Bundle a() {
        AbstractActivityC2349g abstractActivityC2349g;
        switch (this.f5826a) {
            case 0:
                Bundle bundle = new Bundle();
                C0387l c0387l = this.f5827b.i;
                c0387l.getClass();
                LinkedHashMap linkedHashMap = c0387l.f5840b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0387l.f5842d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0387l.f5845g));
                return bundle;
        }
        do {
            abstractActivityC2349g = this.f5827b;
        } while (AbstractActivityC2349g.u(abstractActivityC2349g.s()));
        abstractActivityC2349g.f20342J.d(EnumC0291m.ON_STOP);
        return new Bundle();
    }
}
