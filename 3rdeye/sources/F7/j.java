package F7;

import b9.InterfaceC1997d;

/* compiled from: DivStorageImpl.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f1695a;

    public j(g gVar) {
        this.f1695a = gVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j) && (obj instanceof kotlin.jvm.internal.h)) {
            return getFunctionDelegate().equals(((kotlin.jvm.internal.h) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public final InterfaceC1997d<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.k(1, this.f1695a, g.class, "onCreate", "onCreate(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
