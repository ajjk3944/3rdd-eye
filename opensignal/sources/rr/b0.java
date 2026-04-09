package rr;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21676a;

    public b0(ArrayList arrayList) {
        this.f21676a = arrayList;
        if (mq.b0.V(arrayList).size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f21676a + ')';
    }
}
