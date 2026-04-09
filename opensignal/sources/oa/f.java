package oa;

import qb.v;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final f f19206d = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19207a;

    public /* synthetic */ f(int i10) {
        this.f19207a = i10;
    }

    @Override // oa.j
    public int a(Object obj) {
        c cVar = (c) obj;
        switch (this.f19207a) {
            case 1:
                String str = cVar.f19169a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (v.f20828a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return cVar.f19169a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
