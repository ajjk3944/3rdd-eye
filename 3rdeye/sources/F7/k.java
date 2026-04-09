package F7;

import b9.InterfaceC1997d;

/* compiled from: DivStorageImpl.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f1696a;

    public k(g gVar) {
        this.f1696a = gVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof k) && (obj instanceof kotlin.jvm.internal.h)) {
            return getFunctionDelegate().equals(((kotlin.jvm.internal.h) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public final InterfaceC1997d<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.k(3, this.f1696a, g.class, "onUpgrade", "onUpgrade(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;II)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
