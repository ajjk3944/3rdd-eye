package e;

import c.C0387l;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: e.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2291h extends AbstractC2286c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0387l f19850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19851c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R2.a f19852d;

    public /* synthetic */ C2291h(C0387l c0387l, String str, R2.a aVar, int i) {
        this.f19849a = i;
        this.f19850b = c0387l;
        this.f19851c = str;
        this.f19852d = aVar;
    }

    @Override // e.AbstractC2286c
    public final void a(Object obj) {
        switch (this.f19849a) {
            case 0:
                C0387l c0387l = this.f19850b;
                ArrayList arrayList = c0387l.f5842d;
                LinkedHashMap linkedHashMap = c0387l.f5840b;
                String str = this.f19851c;
                Object obj2 = linkedHashMap.get(str);
                R2.a aVar = this.f19852d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    c0387l.b(iIntValue, aVar, obj);
                    return;
                } catch (Exception e6) {
                    arrayList.remove(str);
                    throw e6;
                }
            default:
                C0387l c0387l2 = this.f19850b;
                ArrayList arrayList2 = c0387l2.f5842d;
                LinkedHashMap linkedHashMap2 = c0387l2.f5840b;
                String str2 = this.f19851c;
                Object obj3 = linkedHashMap2.get(str2);
                R2.a aVar2 = this.f19852d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    c0387l2.b(iIntValue2, aVar2, obj);
                    return;
                } catch (Exception e7) {
                    arrayList2.remove(str2);
                    throw e7;
                }
        }
    }

    public void b() {
        this.f19850b.f(this.f19851c);
    }
}
