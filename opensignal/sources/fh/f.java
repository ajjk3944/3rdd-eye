package fh;

import android.graphics.Matrix;
import android.graphics.Path;
import br.l;
import ch.n;
import com.google.android.gms.internal.measurement.y3;
import e9.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ou.s;
import t8.v;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8871a;

    public f(List list) {
        this.f8871a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    public void a(String str, String str2) {
        l.e(str, "name");
        l.e(str2, "value");
        ou.d.a(str);
        ou.d.b(str2, str);
        c(str, str2);
    }

    public void b(String str) {
        int iA0 = tt.l.A0(str, ':', 1, 4);
        if (iA0 != -1) {
            String strSubstring = str.substring(0, iA0);
            l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = str.substring(iA0 + 1);
            l.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            c(strSubstring, strSubstring2);
            return;
        }
        if (str.charAt(0) != ':') {
            c("", str);
            return;
        }
        String strSubstring3 = str.substring(1);
        l.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
        c("", strSubstring3);
    }

    public void c(String str, String str2) {
        l.e(str, "name");
        l.e(str2, "value");
        ArrayList arrayList = this.f8871a;
        arrayList.add(str);
        arrayList.add(tt.l.a1(str2).toString());
    }

    public void d(String str, String str2) {
        l.e(str, "name");
        l.e(str2, "value");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(pu.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
            }
        }
        c(str, str2);
    }

    public void e(Path path) {
        ArrayList arrayList = this.f8871a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v vVar = (v) arrayList.get(size);
            Matrix matrix = j.f8019a;
            if (vVar != null && !vVar.f22659a) {
                j.a(path, vVar.f22662d.m() / 100.0f, vVar.f22663e.m() / 100.0f, vVar.f22664f.m() / 360.0f);
            }
        }
    }

    public s f() {
        return new s((String[]) this.f8871a.toArray(new String[0]));
    }

    public String g(String str) {
        l.e(str, "name");
        ArrayList arrayList = this.f8871a;
        int size = arrayList.size() - 2;
        int iV = y3.v(size, 0, -2);
        if (iV > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iV) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public void h(e eVar) {
        synchronized (this.f8871a) {
            n.b("EventRecorderImpl", "recordEvent: " + eVar.f8867a);
            this.f8871a.add(eVar);
        }
    }

    public void i(Throwable th2, d[] dVarArr, long j) {
        e eVar;
        e eVar2;
        synchronized (this.f8871a) {
            try {
                if (this.f8871a.isEmpty()) {
                    eVar = null;
                } else {
                    eVar = (e) this.f8871a.get(r3.size() - 1);
                }
            } finally {
            }
        }
        d[] dVarArr2 = {new d(th2.getMessage(), "MESSAGE"), new d(th2.getClass().getCanonicalName(), "CLASS_NAME")};
        if (dVarArr != null) {
            d[] dVarArr3 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length + 2);
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr.length, 2);
            eVar2 = new e("EXCEPTION", dVarArr3, j, 1);
        } else {
            eVar2 = new e("EXCEPTION", dVarArr2, j, 1);
        }
        if (eVar == null || !eVar.f8867a.equals("EXCEPTION")) {
            h(eVar2);
            return;
        }
        if (eVar.hashCode() != eVar2.hashCode()) {
            h(eVar2);
            return;
        }
        eVar.f8870d++;
        synchronized (this.f8871a) {
            this.f8871a.set(r0.size() - 1, eVar);
        }
    }

    public void j(String str) {
        l.e(str, "name");
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8871a;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }

    public f(int i10) {
        switch (i10) {
            case 2:
                this.f8871a = new ArrayList(20);
                break;
            case 3:
                this.f8871a = new ArrayList();
                break;
            default:
                this.f8871a = new ArrayList();
                break;
        }
    }
}
