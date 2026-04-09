package c0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4173b {

    /* renamed from: c0.b$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f33587a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f33587a = interfaceC6839p;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(InterfaceC4184m interfaceC4184m, Object obj) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) this.f33587a.invoke(interfaceC4184m, obj)).entrySet()) {
                arrayList.add(entry.getKey());
                arrayList.add(entry.getValue());
            }
            return arrayList;
        }
    }

    /* renamed from: c0.b$b, reason: collision with other inner class name */
    static final class C1170b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f33588a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1170b(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f33588a = interfaceC6835l;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list.size() % 2 != 0) {
                throw new IllegalStateException("non-zero remainder");
            }
            for (int i10 = 0; i10 < list.size(); i10 += 2) {
                Object obj = list.get(i10);
                AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, list.get(i10 + 1));
            }
            return this.f33588a.invoke(linkedHashMap);
        }
    }

    public static final InterfaceC4182k a(InterfaceC6839p interfaceC6839p, InterfaceC6835l interfaceC6835l) {
        return AbstractC4172a.a(new a(interfaceC6839p), new C1170b(interfaceC6835l));
    }
}
