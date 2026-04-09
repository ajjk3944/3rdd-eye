package bc;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d0 extends Fragment implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f2594d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final f0 f2595a = new f0();

    @Override // bc.f
    public final void b(String str, e eVar) {
        this.f2595a.w(str, eVar);
    }

    @Override // bc.f
    public final e c(Class cls, String str) {
        return (e) cls.cast(((Map) this.f2595a.f2603g).get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f2595a.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Override // bc.f
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = ((Map) this.f2595a.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).c(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2595a.x(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f0 f0Var = this.f2595a;
        f0Var.f2602d = 5;
        Iterator it = ((Map) f0Var.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        f0 f0Var = this.f2595a;
        f0Var.f2602d = 3;
        Iterator it = ((Map) f0Var.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).e();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f2595a.y(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        f0 f0Var = this.f2595a;
        f0Var.f2602d = 2;
        Iterator it = ((Map) f0Var.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        f0 f0Var = this.f2595a;
        f0Var.f2602d = 4;
        Iterator it = ((Map) f0Var.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).h();
        }
    }
}
