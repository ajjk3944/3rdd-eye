package h3;

/* loaded from: classes.dex */
public abstract class b {
    public static Object a(int i10, Object obj, InterfaceC5947a interfaceC5947a, c cVar) {
        Object objApply;
        if (i10 < 1) {
            return interfaceC5947a.apply(obj);
        }
        do {
            objApply = interfaceC5947a.apply(obj);
            obj = cVar.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return objApply;
    }
}
