package sa;

import U9.E;

/* compiled from: HttpException.java */
/* loaded from: classes3.dex */
public final class i extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final int f46210b;

    public i(u<?> uVar) {
        StringBuilder sb = new StringBuilder("HTTP ");
        E e4 = uVar.f46333a;
        int i = e4.f12565e;
        sb.append(i);
        sb.append(" ");
        sb.append(e4.f12564d);
        super(sb.toString());
        this.f46210b = i;
    }
}
