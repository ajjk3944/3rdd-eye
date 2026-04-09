package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4472a2 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final H2 f40506a;

    public C4472a2() {
        this(new H2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4550d2 fromModel(Z1 z12) {
        C4550d2 c4550d2 = new C4550d2();
        c4550d2.f40679a = new C4524c2[z12.f40453a.size()];
        int i = 0;
        int i10 = 0;
        for (PermissionState permissionState : z12.f40453a) {
            C4524c2[] c4524c2Arr = c4550d2.f40679a;
            C4524c2 c4524c2 = new C4524c2();
            c4524c2.f40606a = permissionState.name;
            c4524c2.f40607b = permissionState.granted;
            c4524c2Arr[i10] = c4524c2;
            i10++;
        }
        J2 j22 = z12.f40454b;
        if (j22 != null) {
            c4550d2.f40680b = this.f40506a.fromModel(j22);
        }
        c4550d2.f40681c = new String[z12.f40455c.size()];
        Iterator it = z12.f40455c.iterator();
        while (it.hasNext()) {
            c4550d2.f40681c[i] = (String) it.next();
            i++;
        }
        return c4550d2;
    }

    public C4472a2(H2 h22) {
        this.f40506a = h22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z1 toModel(C4550d2 c4550d2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i10 = 0;
        while (true) {
            C4524c2[] c4524c2Arr = c4550d2.f40679a;
            if (i10 >= c4524c2Arr.length) {
                break;
            }
            C4524c2 c4524c2 = c4524c2Arr[i10];
            arrayList.add(new PermissionState(c4524c2.f40606a, c4524c2.f40607b));
            i10++;
        }
        C4498b2 c4498b2 = c4550d2.f40680b;
        J2 model = c4498b2 != null ? this.f40506a.toModel(c4498b2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c4550d2.f40681c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new Z1(arrayList, model, arrayList2);
            }
        }
    }
}
