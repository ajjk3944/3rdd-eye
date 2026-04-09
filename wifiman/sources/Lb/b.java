package Lb;

import gg.i;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public interface b {

    public static final class a {
        public static boolean a(b bVar, List accountAdditions, List accountDeletions) {
            AbstractC6492s.i(accountAdditions, "accountAdditions");
            AbstractC6492s.i(accountDeletions, "accountDeletions");
            Iterator it = accountAdditions.iterator();
            while (it.hasNext()) {
                bVar.g((Lb.a) it.next());
            }
            Iterator it2 = accountDeletions.iterator();
            while (it2.hasNext()) {
                bVar.b(((Lb.a) it2.next()).k());
            }
            return true;
        }

        public static int b(b bVar, UUID id2, InterfaceC6835l updater) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(updater, "updater");
            String string = id2.toString();
            AbstractC6492s.h(string, "toString(...)");
            Lb.a aVar = bVar.get(string);
            if (aVar == null) {
                return 0;
            }
            return bVar.f((Lb.a) updater.invoke(aVar));
        }
    }

    int b(String str);

    i c();

    int d(UUID uuid, InterfaceC6835l interfaceC6835l);

    boolean e(List list, List list2);

    int f(Lb.a aVar);

    void g(Lb.a aVar);

    Lb.a get(String str);

    int h(String str);
}
