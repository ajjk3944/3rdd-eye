package P4;

import P4.h;
import java.io.IOException;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes2.dex */
public final class i implements h.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f10629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f10630b;

    public i(byte[] bArr, int[] iArr) {
        this.f10629a = bArr;
        this.f10630b = iArr;
    }

    @Override // P4.h.d
    public final void a(h.c cVar, int i) throws IOException {
        int[] iArr = this.f10630b;
        try {
            cVar.read(this.f10629a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            cVar.close();
        }
    }
}
