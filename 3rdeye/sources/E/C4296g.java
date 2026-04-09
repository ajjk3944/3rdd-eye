package e;

import f.AbstractC4328a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: ActivityResultRegistry.kt */
/* renamed from: e.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4296g extends AbstractC4292c<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4294e f37620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4328a<Object, Object> f37622c;

    public C4296g(AbstractC4294e abstractC4294e, String str, AbstractC4328a<Object, Object> abstractC4328a) {
        this.f37620a = abstractC4294e;
        this.f37621b = str;
        this.f37622c = abstractC4328a;
    }

    @Override // e.AbstractC4292c
    public final AbstractC4328a<Object, ?> a() {
        return this.f37622c;
    }

    @Override // e.AbstractC4292c
    public final void c(Object obj) throws Exception {
        AbstractC4294e abstractC4294e = this.f37620a;
        LinkedHashMap linkedHashMap = abstractC4294e.f37609b;
        String str = this.f37621b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC4328a<Object, Object> abstractC4328a = this.f37622c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC4328a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        ArrayList arrayList = abstractC4294e.f37611d;
        arrayList.add(str);
        try {
            abstractC4294e.b(iIntValue, abstractC4328a, obj);
        } catch (Exception e4) {
            arrayList.remove(str);
            throw e4;
        }
    }

    @Override // e.AbstractC4292c
    public final void d() {
        this.f37620a.f(this.f37621b);
    }
}
