package O6;

/* compiled from: DivBorderSupportsMixin.kt */
/* renamed from: O6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479e implements InterfaceC1478d {

    /* renamed from: b, reason: collision with root package name */
    public C1476b f10419b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10420c;

    @Override // O6.InterfaceC1478d
    public final void c() {
        C1476b divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0098  */
    @Override // O6.InterfaceC1478d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(H6.C0672i r11, N7.X2 r12, android.view.View r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O6.C1479e.d(H6.i, N7.X2, android.view.View):void");
    }

    @Override // O6.InterfaceC1478d
    public final C1476b getDivBorderDrawer() {
        return this.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public final boolean getNeedClipping() {
        return this.f10420c;
    }

    @Override // O6.InterfaceC1478d
    public final void setNeedClipping(boolean z10) {
        C1476b c1476b = this.f10419b;
        if (c1476b != null && c1476b.f10393o != z10) {
            c1476b.f10393o = z10;
            c1476b.j();
            c1476b.f10382c.invalidate();
        }
        this.f10420c = z10;
    }
}
