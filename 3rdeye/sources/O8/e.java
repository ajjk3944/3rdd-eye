package o8;

import A9.E;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import b9.C1992A;
import b9.n;
import com.google.gson.Gson;
import f9.InterfaceC4347e;
import h9.i;
import java.io.IOException;
import java.util.Map;
import p9.p;

/* compiled from: TestyUtils.kt */
@h9.e(c = "com.zipoapps.premiumhelper.configuration.testy.TestyUtils$fetchAppParams$2", f = "TestyUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class e extends i implements p<E, InterfaceC4347e<? super Map<String, ? extends String>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f44890l;

    /* compiled from: TestyUtils.kt */
    public static final class a extends D5.a<Map<String, ? extends String>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, InterfaceC4347e<? super e> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f44890l = context;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new e(this.f44890l, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super Map<String, ? extends String>> interfaceC4347e) {
        return ((e) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws IOException {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        n.b(obj);
        Context context = this.f44890l;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.zipoapps.testykal.provider.TestyContentProvider/" + context.getPackageName()), null, context.getPackageName(), null, null);
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            if (cursorQuery.getCount() != 0) {
                cursorQuery.moveToFirst();
                int columnIndex = cursorQuery.getColumnIndex("ph_params");
                if (columnIndex >= 0) {
                    Object objC = new Gson().c(cursorQuery.getString(columnIndex), new a().f1062b);
                    cursor.close();
                    return objC;
                }
            }
            cursor.close();
            return null;
        } finally {
        }
    }
}
