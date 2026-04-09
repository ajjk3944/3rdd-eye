package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f21067b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final List<e> f21068a = new ArrayList();

    private e b(View view) {
        for (e eVar : this.f21068a) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    public List<e> a() {
        return this.f21068a;
    }

    public void c(View view) {
        a(view);
        e eVarB = b(view);
        if (eVarB != null) {
            this.f21068a.remove(eVarB);
        }
    }

    private void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    public void b() {
        this.f21068a.clear();
    }

    public void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        a(view);
        a(str);
        if (b(view) == null) {
            this.f21068a.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f21067b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
