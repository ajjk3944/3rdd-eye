package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e13 {
    public final String a;
    public final ArrayList b;
    public final Set c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final int g;
    public final Set h;
    public final Bundle i;
    public final Set j;
    public final boolean k;
    public final int l;
    public long m = 0;

    public e13(o7 o7Var) {
        this.a = (String) o7Var.j;
        this.b = (ArrayList) o7Var.k;
        this.c = Collections.unmodifiableSet((HashSet) o7Var.d);
        this.d = (Bundle) o7Var.e;
        Collections.unmodifiableMap((HashMap) o7Var.f);
        this.e = (String) o7Var.l;
        this.f = (String) o7Var.m;
        this.g = o7Var.a;
        this.h = Collections.unmodifiableSet((HashSet) o7Var.g);
        this.i = (Bundle) o7Var.h;
        this.j = Collections.unmodifiableSet((HashSet) o7Var.i);
        this.k = o7Var.b;
        this.l = o7Var.c;
    }
}
