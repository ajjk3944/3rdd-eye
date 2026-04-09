package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import b9.C1992A;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class W extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f42531d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f42532a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5480a f42533b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C5144j f42534c;

    public W(ClientContext clientContext, r rVar) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f42532a = clientContext;
        this.f42533b = rVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        C5144j c5144j;
        super.onChange(z10, uri);
        if (!y9.n.a0(String.valueOf(uri), f42531d, false) || (c5144j = this.f42534c) == null) {
            return;
        }
        try {
            List elements = c5144j.f42567b;
            kotlin.jvm.internal.l.f(elements, "elements");
            Object[] objArrCopyOf = Arrays.copyOf(new String[]{"date_added"}, elements.size() + 1);
            Iterator it = elements.iterator();
            int i = 1;
            while (it.hasNext()) {
                objArrCopyOf[i] = it.next();
                i++;
            }
            kotlin.jvm.internal.l.c(objArrCopyOf);
            String[] strArr = (String[]) objArrCopyOf;
            Cursor cursorQuery = this.f42532a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c5144j.f42568c)}, "date_added DESC");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it2 = c5144j.f42567b.iterator();
                        while (it2.hasNext()) {
                            if (y9.q.b0(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot", false)) {
                                this.f42533b.invoke();
                            }
                        }
                    }
                } finally {
                }
            }
            C1992A c1992a = C1992A.f18074a;
            A9.I.o(cursorQuery, null);
        } catch (Exception unused) {
        }
    }
}
