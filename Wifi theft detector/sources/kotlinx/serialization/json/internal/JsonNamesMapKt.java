package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.internal.q;

/* loaded from: classes4.dex */
public abstract class JsonNamesMapKt {

    /* renamed from: a, reason: collision with root package name */
    public static final q.a f22972a = new q.a();

    public static final Map a(kotlinx.serialization.descriptors.f fVar) {
        String[] strArr;
        kotlin.jvm.internal.p.e(fVar, "<this>");
        int iD = fVar.d();
        Map mapA = null;
        for (int i10 = 0; i10 < iD; i10++) {
            List listF = fVar.f(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (obj instanceof JsonNames) {
                    arrayList.add(obj);
                }
            }
            JsonNames jsonNames = (JsonNames) z8.z.X(arrayList);
            if (jsonNames != null && (strArr = jsonNames.get_names()) != null) {
                for (String str : strArr) {
                    if (mapA == null) {
                        mapA = p.a(fVar.d());
                    }
                    kotlin.jvm.internal.p.b(mapA);
                    b(mapA, fVar, str, i10);
                }
            }
        }
        return mapA == null ? kotlin.collections.a.h() : mapA;
    }

    public static final void b(Map map, kotlinx.serialization.descriptors.f fVar, String str, int i10) {
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for property " + fVar.e(i10) + " is already one of the names for property " + fVar.e(((Number) kotlin.collections.a.i(map, str)).intValue()) + " in " + fVar);
    }

    public static final q.a c() {
        return f22972a;
    }

    public static final int d(kotlinx.serialization.descriptors.f fVar, z9.a json, String name) {
        kotlin.jvm.internal.p.e(fVar, "<this>");
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(name, "name");
        int iC = fVar.c(name);
        if (iC != -3 || !json.e().j()) {
            return iC;
        }
        Integer num = (Integer) ((Map) z9.r.a(json).b(fVar, f22972a, new JsonNamesMapKt$getJsonNameIndex$alternativeNamesMap$1(fVar))).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int e(kotlinx.serialization.descriptors.f fVar, z9.a json, String name, String suffix) {
        kotlin.jvm.internal.p.e(fVar, "<this>");
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(name, "name");
        kotlin.jvm.internal.p.e(suffix, "suffix");
        int iD = d(fVar, json, name);
        if (iD != -3) {
            return iD;
        }
        throw new SerializationException(fVar.h() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int f(kotlinx.serialization.descriptors.f fVar, z9.a aVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return e(fVar, aVar, str, str2);
    }
}
