package o8;

import A9.E;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.i;
import java.io.IOException;
import p9.p;

/* compiled from: TestyUtils.kt */
@h9.e(c = "com.zipoapps.premiumhelper.configuration.testy.TestyUtils$checkTestyAppAuthorised$2", f = "TestyUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends i implements p<E, InterfaceC4347e<? super Boolean>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f44889l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, InterfaceC4347e<? super d> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f44889l = context;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new d(this.f44889l, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
        return ((d) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws IOException {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        n.b(obj);
        Uri uri = Uri.parse("content://com.zipoapps.testykal.provider.TestyContentProvider/is_auth_signed_in");
        Context context = this.f44889l;
        Cursor cursorQuery = context.getContentResolver().query(uri, null, context.getPackageName(), null, null);
        boolean z10 = false;
        if (cursorQuery != null) {
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                if (cursor2.getCount() != 0) {
                    cursor2.moveToFirst();
                    int columnIndex = cursor2.getColumnIndex("is_auth_signed_in");
                    if (columnIndex >= 0) {
                        if (cursor2.getInt(columnIndex) == 1) {
                            z10 = true;
                        }
                    }
                }
                cursor.close();
            } finally {
            }
        }
        return Boolean.valueOf(z10);
    }
}
