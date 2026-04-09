package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4567dj implements InterfaceC4592ej {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40751a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40752b = "content://" + a() + "/clids";

    /* renamed from: c, reason: collision with root package name */
    public final String f40753c = "clid_key";

    /* renamed from: d, reason: collision with root package name */
    public final String f40754d = "clid_value";

    public C4567dj(Context context) {
        this.f40751a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4592ej, p9.InterfaceC5480a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final N3 invoke() {
        Cursor cursorQuery;
        String string;
        String string2;
        if (!PackageManagerUtils.hasContentProvider(this.f40751a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC4877pj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f40751a.getContentResolver().query(Uri.parse(this.f40752b), null, null, null, null);
            try {
            } catch (Throwable th) {
                th = th;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Error while getting satellite clids\n" + StringUtils.throwableToString(th), new Object[0]);
                    return null;
                } finally {
                    AbstractC4623fo.a(cursorQuery);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            AbstractC4877pj.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorQuery.moveToNext()) {
            try {
                string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f40753c));
                string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f40754d));
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                AbstractC4877pj.a("Invalid clid {%s : %s}", string, string2);
            } else {
                linkedHashMap.put(string, string2);
            }
        }
        AbstractC4877pj.a("Clids from satellite: %s", linkedHashMap);
        return new N3(linkedHashMap, EnumC4685i8.f41061d);
    }
}
