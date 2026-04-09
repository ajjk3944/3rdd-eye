package as;

/* loaded from: classes.dex */
public final class g extends j0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f2216l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final rr.u a(rr.u uVar) {
        br.l.e(uVar, "functionDescriptor");
        qs.g name = ((ur.n) uVar).getName();
        br.l.d(name, "functionDescriptor.name");
        if (b(name)) {
            return (rr.u) xs.d.b(uVar, f.f2211g);
        }
        return null;
    }

    public static boolean b(qs.g gVar) {
        br.l.e(gVar, "<this>");
        return j0.f2228e.contains(gVar);
    }
}
