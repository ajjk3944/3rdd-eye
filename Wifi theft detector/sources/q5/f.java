package q5;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f24063b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final List f24064a = new ArrayList();

    public List a() {
        return this.f24064a;
    }

    public final void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    public void c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        b(view);
        d(str);
        if (e(view) == null) {
            this.f24064a.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public final void d(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f24063b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public final e e(View view) {
        for (e eVar : this.f24064a) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    public void f() {
        this.f24064a.clear();
    }

    public void g(View view) {
        b(view);
        e eVarE = e(view);
        if (eVarE != null) {
            this.f24064a.remove(eVarE);
        }
    }
}
