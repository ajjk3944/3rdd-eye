package s;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.InterfaceC1809b;

/* compiled from: CustomTabsServiceConnection.java */
/* loaded from: classes.dex */
public abstract class h implements ServiceConnection {
    private Context mApplicationContext;

    /* compiled from: CustomTabsServiceConnection.java */
    public class a extends f {
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, f fVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1809b interfaceC1809b;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = InterfaceC1809b.a.f17052b;
        if (iBinder == null) {
            interfaceC1809b = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1809b.f17051k8);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1809b)) {
                InterfaceC1809b.a.C0274a c0274a = new InterfaceC1809b.a.C0274a();
                c0274a.f17053b = iBinder;
                interfaceC1809b = c0274a;
            } else {
                interfaceC1809b = (InterfaceC1809b) iInterfaceQueryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new a(interfaceC1809b, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
