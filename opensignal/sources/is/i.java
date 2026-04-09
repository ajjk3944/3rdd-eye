package is;

import lq.b0;

/* loaded from: classes.dex */
public final class i extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12957d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12958g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f12959r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, int i10, String str2) {
        super(1);
        this.f12957d = i10;
        this.f12958g = str;
        this.f12959r = str2;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f12957d) {
            case 0:
                m mVar = (m) obj;
                br.l.e(mVar, "$this$function");
                d dVar = j.f12961b;
                String str = this.f12958g;
                mVar.a(str, dVar);
                d dVar2 = j.f12960a;
                mVar.a(this.f12959r, dVar, dVar, dVar2, dVar2);
                mVar.b(str, dVar2);
                break;
            case 1:
                m mVar2 = (m) obj;
                br.l.e(mVar2, "$this$function");
                d dVar3 = j.f12961b;
                String str2 = this.f12958g;
                mVar2.a(str2, dVar3);
                mVar2.a(this.f12959r, dVar3, dVar3, dVar3);
                mVar2.b(str2, dVar3);
                break;
            case 2:
                m mVar3 = (m) obj;
                br.l.e(mVar3, "$this$function");
                d dVar4 = j.f12961b;
                String str3 = this.f12958g;
                mVar3.a(str3, dVar4);
                d dVar5 = j.f12962c;
                d dVar6 = j.f12960a;
                mVar3.a(this.f12959r, dVar4, dVar4, dVar5, dVar6);
                mVar3.b(str3, dVar6);
                break;
            case 3:
                m mVar4 = (m) obj;
                br.l.e(mVar4, "$this$function");
                d dVar7 = j.f12961b;
                String str4 = this.f12958g;
                mVar4.a(str4, dVar7);
                d dVar8 = j.f12962c;
                mVar4.a(str4, dVar8);
                d dVar9 = j.f12960a;
                mVar4.a(this.f12959r, dVar7, dVar8, dVar8, dVar9);
                mVar4.b(str4, dVar9);
                break;
            case 4:
                m mVar5 = (m) obj;
                br.l.e(mVar5, "$this$function");
                d dVar10 = j.f12962c;
                mVar5.a(this.f12958g, dVar10);
                mVar5.b(this.f12959r, j.f12961b, dVar10);
                break;
            default:
                m mVar6 = (m) obj;
                br.l.e(mVar6, "$this$function");
                mVar6.a(this.f12958g, j.f12960a);
                mVar6.b(this.f12959r, j.f12961b, j.f12962c);
                break;
        }
        return b0.f15562a;
    }
}
