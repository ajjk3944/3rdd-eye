package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oq0 {
    public final String a;
    public final Context b;
    public ArrayList c;
    public Executor d;
    public Executor e;
    public jz0 f;
    public boolean g;
    public boolean h = true;
    public boolean i;
    public final hm j;
    public HashSet k;

    public oq0(Context context, String str) {
        this.b = context;
        this.a = str;
        hm hmVar = new hm();
        hmVar.a = new HashMap();
        this.j = hmVar;
    }

    public final void a(se0... se0VarArr) {
        if (this.k == null) {
            this.k = new HashSet();
        }
        for (se0 se0Var : se0VarArr) {
            this.k.add(Integer.valueOf(se0Var.a));
            this.k.add(Integer.valueOf(se0Var.b));
        }
        hm hmVar = this.j;
        hmVar.getClass();
        for (se0 se0Var2 : se0VarArr) {
            int i = se0Var2.a;
            int i2 = se0Var2.b;
            HashMap map = hmVar.a;
            TreeMap treeMap = (TreeMap) map.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(Integer.valueOf(i), treeMap);
            }
            se0 se0Var3 = (se0) treeMap.get(Integer.valueOf(i2));
            if (se0Var3 != null) {
                se0Var3.toString();
                se0Var2.toString();
            }
            treeMap.put(Integer.valueOf(i2), se0Var2);
        }
    }
}
