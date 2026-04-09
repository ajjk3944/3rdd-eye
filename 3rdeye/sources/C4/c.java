package C4;

import F4.a;
import g5.InterfaceC4392b;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: FirebaseABTesting.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4392b<F4.a> f920a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f921b = null;

    public c(InterfaceC4392b interfaceC4392b) {
        this.f920a = interfaceC4392b;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f914a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f914a.equals(str) && bVar2.f915b.equals(bVar.f915b)) {
                return true;
            }
        }
        return false;
    }

    public final void b(ArrayList arrayList) throws a {
        InterfaceC4392b<F4.a> interfaceC4392b = this.f920a;
        if (interfaceC4392b.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    if (interfaceC4392b.get() == null) {
                        throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = interfaceC4392b.get().b().iterator();
                    while (it2.hasNext()) {
                        interfaceC4392b.get().g(((a.C0028a) it2.next()).f1636b);
                    }
                    return;
                }
                if (interfaceC4392b.get() == null) {
                    throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList arrayListB = interfaceC4392b.get().b();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayListB.iterator();
                while (it3.hasNext()) {
                    a.C0028a c0028a = (a.C0028a) it3.next();
                    String[] strArr = b.f912g;
                    String str = c0028a.f1638d;
                    arrayList3.add(new b(c0028a.f1636b, String.valueOf(c0028a.f1637c), str != null ? str : "", new Date(c0028a.f1646m), c0028a.f1639e, c0028a.f1643j));
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    b bVar = (b) it4.next();
                    if (!a(arrayList2, bVar)) {
                        arrayList4.add(bVar.a());
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    interfaceC4392b.get().g(((a.C0028a) it5.next()).f1636b);
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    b bVar2 = (b) it6.next();
                    if (!a(arrayList3, bVar2)) {
                        arrayList5.add(bVar2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(interfaceC4392b.get().b());
                if (this.f921b == null) {
                    this.f921b = Integer.valueOf(interfaceC4392b.get().f());
                }
                int iIntValue = this.f921b.intValue();
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    b bVar3 = (b) it7.next();
                    while (arrayDeque.size() >= iIntValue) {
                        interfaceC4392b.get().g(((a.C0028a) arrayDeque.pollFirst()).f1636b);
                    }
                    a.C0028a c0028aA = bVar3.a();
                    interfaceC4392b.get().c(c0028aA);
                    arrayDeque.offer(c0028aA);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = b.f912g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = b.f912g;
            for (int i = 0; i < 5; i++) {
                String str2 = strArr3[i];
                if (!map.containsKey(str2)) {
                    arrayList6.add(str2);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", b.f913h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e4) {
                throw new a("Could not process experiment: one of the durations could not be converted into a long.", e4);
            } catch (ParseException e10) {
                throw new a("Could not process experiment: parsing experiment start time failed.", e10);
            }
        }
    }
}
