package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements ys0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ wg(i5 i5Var, int i) {
        this.a = i;
        this.b = i5Var;
    }

    @Override // defpackage.ys0
    public final Bundle a() {
        i5 i5Var;
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bh bhVar = this.b.m;
                bhVar.getClass();
                LinkedHashMap linkedHashMap = bhVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(bhVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(bhVar.g));
                return bundle;
        }
        do {
            i5Var = this.b;
        } while (i5.p(i5Var.o()));
        i5Var.x.d(t50.ON_STOP);
        return new Bundle();
    }
}
