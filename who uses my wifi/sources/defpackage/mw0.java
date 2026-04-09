package defpackage;

/* loaded from: classes.dex */
public final class mw0 extends qj {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ dv k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw0(dv dvVar, qj qjVar) {
        super(qjVar);
        this.k = dvVar;
    }

    @Override // defpackage.s9
    public final Object m(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
