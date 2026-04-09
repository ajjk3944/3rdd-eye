package ot;

import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final qs.g f19805a;

    /* renamed from: b, reason: collision with root package name */
    public final tt.k f19806b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f19807c;

    /* renamed from: d, reason: collision with root package name */
    public final ar.k f19808d;

    /* renamed from: e, reason: collision with root package name */
    public final e[] f19809e;

    public i(qs.g gVar, tt.k kVar, Collection collection, ar.k kVar2, e... eVarArr) {
        this.f19805a = gVar;
        this.f19806b = kVar;
        this.f19807c = collection;
        this.f19808d = kVar2;
        this.f19809e = eVarArr;
    }

    public /* synthetic */ i(qs.g gVar, e[] eVarArr) {
        this(gVar, eVarArr, h.f19800g);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(qs.g gVar, e[] eVarArr, ar.k kVar) {
        this(gVar, null, null, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        br.l.e(gVar, "name");
    }

    public /* synthetic */ i(Collection collection, e[] eVarArr) {
        this(collection, eVarArr, h.f19802x);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Collection collection, e[] eVarArr, ar.k kVar) {
        this(null, null, collection, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        br.l.e(collection, "nameList");
    }
}
