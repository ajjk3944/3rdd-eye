package N7;

import A7.b;
import N7.C1155ea;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivStretchIndicatorItemPlacement.kt */
/* renamed from: N7.da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140da implements InterfaceC5868a {

    /* renamed from: d, reason: collision with root package name */
    public static final W4 f8125d = new W4(new b.C0000b(5L));

    /* renamed from: e, reason: collision with root package name */
    public static final b.C0000b f8126e = new b.C0000b(10L);

    /* renamed from: a, reason: collision with root package name */
    public final W4 f8127a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f8128b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8129c;

    public C1140da() {
        this(f8125d, f8126e);
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1155ea.a) D7.a.f1071b.f6869q7.getValue()).b(D7.a.f1070a, this);
    }

    public C1140da(W4 itemSpacing, A7.b<Long> maxVisibleItems) {
        kotlin.jvm.internal.l.f(itemSpacing, "itemSpacing");
        kotlin.jvm.internal.l.f(maxVisibleItems, "maxVisibleItems");
        this.f8127a = itemSpacing;
        this.f8128b = maxVisibleItems;
    }
}
