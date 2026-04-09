package androidx.fragment.app;

import L0.I;
import android.view.View;
import c9.C2097r;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: DefaultSpecialEffectsController.kt */
/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1755h extends kotlin.jvm.internal.m implements p9.l<Map.Entry<String, View>, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Collection<String> f15886g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1755h(Collection<String> collection) {
        super(1);
        this.f15886g = collection;
    }

    @Override // p9.l
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Map.Entry<String, View> entry2 = entry;
        kotlin.jvm.internal.l.f(entry2, "entry");
        Collection<String> collection = this.f15886g;
        View value = entry2.getValue();
        WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
        return Boolean.valueOf(C2097r.k0(collection, I.d.k(value)));
    }
}
