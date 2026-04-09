package u3;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: BaseProxy.java */
/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5630a implements IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f46562b;

    public C5630a(IBinder iBinder) {
        this.f46562b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46562b;
    }
}
