package p4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends ek.j implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31198b;

    /* renamed from: c, reason: collision with root package name */
    public int f31199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, ck.c cVar, int i4) {
        super(1, cVar);
        this.f31198b = i4;
        this.f31200d = obj;
    }

    @Override // ek.a
    public final ck.c create(ck.c cVar) {
        switch (this.f31198b) {
            case 0:
                return new f((r4.c) this.f31200d, cVar, 0);
            default:
                return new f((w) this.f31200d, cVar, 1);
        }
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        ck.c cVar = (ck.c) obj;
        switch (this.f31198b) {
        }
        return ((f) create(cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Context context;
        String str;
        switch (this.f31198b) {
            case 0:
                int i4 = this.f31199c;
                yj.u uVar = yj.u.f37649a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                r4.c cVar = (r4.c) this.f31200d;
                this.f31199c = 1;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f32804e.getValue()).edit();
                Set set = cVar.f32805f;
                if (set == null) {
                    editorEdit.clear();
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        editorEdit.remove((String) it.next());
                    }
                }
                if (!editorEdit.commit()) {
                    throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                }
                if (((SharedPreferences) cVar.f32804e.getValue()).getAll().isEmpty() && (context = cVar.f32802c) != null && (str = cVar.f32803d) != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        r4.a.a(context, str);
                    } else {
                        File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                        File file2 = new File(file.getPath() + ".bak");
                        file.delete();
                        file2.delete();
                    }
                }
                if (set != null) {
                    set.clear();
                }
                dk.a aVar = dk.a.f22275a;
                return uVar == aVar ? aVar : uVar;
            default:
                int i10 = this.f31199c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                w wVar = (w) this.f31200d;
                this.f31199c = 1;
                Object objInvoke = wVar.invoke(this);
                dk.a aVar2 = dk.a.f22275a;
                return objInvoke == aVar2 ? aVar2 : objInvoke;
        }
    }
}
