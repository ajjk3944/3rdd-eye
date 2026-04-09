package l5;

import a5.d0;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements y {

    /* renamed from: d, reason: collision with root package name */
    public static final s f14765d = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14766a;

    public /* synthetic */ s(int i10) {
        this.f14766a = i10;
    }

    @Override // l5.y, oa.j
    public int a(Object obj) {
        n nVar = (n) obj;
        switch (this.f14766a) {
            case 1:
                String str = nVar.f14723a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (d0.f105a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return nVar.f14723a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
