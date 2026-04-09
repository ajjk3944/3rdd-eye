package H7;

/* compiled from: StorageStatements.kt */
/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F7.i f2299a;

    public n(F7.i iVar) {
        this.f2299a = iVar;
    }

    @Override // H7.j
    public final void a(c cVar) {
        h hVarA = cVar.a("SELECT * FROM raw_json", new String[0]);
        try {
            this.f2299a.invoke(hVarA);
            hVarA.close();
        } finally {
        }
    }

    public final String toString() {
        return "Selecting all raw jsons";
    }
}
