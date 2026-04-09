package androidx.camera.core.impl;

import C.InterfaceC0630q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: LensFacingCameraFilter.java */
/* renamed from: androidx.camera.core.impl.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1702m0 implements InterfaceC0630q {

    /* renamed from: b, reason: collision with root package name */
    public final int f15095b;

    public C1702m0(int i) {
        this.f15095b = i;
    }

    @Override // C.InterfaceC0630q
    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C.r rVar = (C.r) it.next();
            A2.l.k("The camera info doesn't contain internal implementation.", rVar instanceof I);
            if (rVar.g() == this.f15095b) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    @Override // C.InterfaceC0630q
    public final C1691h getIdentifier() {
        return InterfaceC0630q.f767a;
    }
}
