package com.ui.wifiman.db;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* loaded from: classes3.dex */
public final class A {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, d2 = {"com/ui/wifiman/db/A$a", "Lcom/google/gson/reflect/a;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "app-db_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<ArrayList<Long>> {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ui/wifiman/db/A$b", "Lcom/google/gson/reflect/a;", "", "", "app-db_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<List<? extends String>> {
        b() {
        }
    }

    public final ArrayList a(String str) {
        if (str != null) {
            return (ArrayList) new com.google.gson.e().j(str, new a().d());
        }
        return null;
    }

    public final String b(ArrayList arrayList) {
        if (arrayList != null) {
            return new com.google.gson.e().s(arrayList);
        }
        return null;
    }

    public final List c(String str) {
        if (str != null) {
            return (List) new com.google.gson.e().j(str, new b().d());
        }
        return null;
    }

    public final String d(List list) {
        if (list != null) {
            return new com.google.gson.e().s(list);
        }
        return null;
    }
}
