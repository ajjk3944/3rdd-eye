package s3;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: s3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7903s {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f61345a;

    /* renamed from: b, reason: collision with root package name */
    private final String f61346b;

    public C7903s(Context context) {
        AbstractC7901p.l(context);
        Resources resources = context.getResources();
        this.f61345a = resources;
        this.f61346b = resources.getResourcePackageName(r3.j.f60096a);
    }

    public String a(String str) {
        int identifier = this.f61345a.getIdentifier(str, "string", this.f61346b);
        if (identifier == 0) {
            return null;
        }
        return this.f61345a.getString(identifier);
    }
}
