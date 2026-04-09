package androidx.databinding;

import Y.b;
import Y.h;
import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends b {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f5130a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5131b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f5132c = new CopyOnWriteArrayList();

    @Override // Y.b
    public final h b(int i, View view) {
        Iterator it = this.f5131b.iterator();
        while (it.hasNext()) {
            h hVarB = ((b) it.next()).b(i, view);
            if (hVarB != null) {
                return hVarB;
            }
        }
        if (e()) {
            return b(i, view);
        }
        return null;
    }

    @Override // Y.b
    public final int c(String str) {
        Iterator it = this.f5131b.iterator();
        while (it.hasNext()) {
            int iC = ((b) it.next()).c(str);
            if (iC != 0) {
                return iC;
            }
        }
        if (e()) {
            return c(str);
        }
        return 0;
    }

    public final void d(b bVar) {
        if (this.f5130a.add(bVar.getClass())) {
            this.f5131b.add(bVar);
            Iterator it = bVar.a().iterator();
            while (it.hasNext()) {
                d((b) it.next());
            }
        }
    }

    public final boolean e() throws ClassNotFoundException {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5132c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (b.class.isAssignableFrom(cls)) {
                    d((b) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z6 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e6) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e6);
            } catch (InstantiationException e7) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e7);
            }
        }
        return z6;
    }
}
