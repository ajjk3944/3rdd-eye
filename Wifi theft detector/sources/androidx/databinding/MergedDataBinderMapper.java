package androidx.databinding;

import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class MergedDataBinderMapper extends e {

    /* renamed from: a, reason: collision with root package name */
    public Set f2847a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public List f2848b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public List f2849c = new CopyOnWriteArrayList();

    @Override // androidx.databinding.e
    public ViewDataBinding b(f fVar, View view, int i10) {
        Iterator it = this.f2848b.iterator();
        while (it.hasNext()) {
            ViewDataBinding viewDataBindingB = ((e) it.next()).b(fVar, view, i10);
            if (viewDataBindingB != null) {
                return viewDataBindingB;
            }
        }
        if (e()) {
            return b(fVar, view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.e
    public ViewDataBinding c(f fVar, View[] viewArr, int i10) {
        Iterator it = this.f2848b.iterator();
        while (it.hasNext()) {
            ViewDataBinding viewDataBindingC = ((e) it.next()).c(fVar, viewArr, i10);
            if (viewDataBindingC != null) {
                return viewDataBindingC;
            }
        }
        if (e()) {
            return c(fVar, viewArr, i10);
        }
        return null;
    }

    public void d(e eVar) {
        if (this.f2847a.add(eVar.getClass())) {
            this.f2848b.add(eVar);
            Iterator it = eVar.a().iterator();
            while (it.hasNext()) {
                d((e) it.next());
            }
        }
    }

    public final boolean e() throws ClassNotFoundException {
        boolean z10 = false;
        for (String str : this.f2849c) {
            try {
                Class<?> cls = Class.forName(str);
                if (e.class.isAssignableFrom(cls)) {
                    d((e) cls.newInstance());
                    this.f2849c.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }
}
