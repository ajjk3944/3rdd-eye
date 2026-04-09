package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class yn extends n {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn(hk hkVar, boolean z, int i) {
        super(hkVar, z);
        this.i = i;
    }

    @Override // defpackage.g40
    public boolean B(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.i) {
            case 1:
                uk2.q(this.h, th);
                return true;
            default:
                return super.B(th);
        }
    }
}
