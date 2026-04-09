package com.ui.sso.api.provider;

import Zg.AbstractC3689v;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.ui.sso.api.provider.UiAccountProviderCursor;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import java.util.UUID;
import jh.AbstractC6329b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class c implements UiAccountProviderCursor.Serializer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: id, reason: collision with root package name */
        private final String f42098id;
        public static final a UUID = new a("UUID", 0, "uuid");
        public static final a USERNAME = new a("USERNAME", 1, "username");
        public static final a EMAIL = new a("EMAIL", 2, "email");
        public static final a AVATAR = new a("AVATAR", 3, "avatar");

        private static final /* synthetic */ a[] $values() {
            return new a[]{UUID, USERNAME, EMAIL, AVATAR};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2) {
            this.f42098id = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String getId() {
            return this.f42098id;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f42099a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N n10) {
            super(0);
            this.f42099a = n10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "UI Account API returned multiple accounts with same ID " + this.f42099a.f51689a + ". This should never happened and be handled by API internally";
        }
    }

    private final UiAccountProviderCursor.a c(Cursor cursor) {
        try {
            List listC = AbstractC3689v.c();
            if (cursor.moveToFirst()) {
                try {
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow(a.UUID.getId());
                    int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(a.USERNAME.getId());
                    int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(a.EMAIL.getId());
                    int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(a.AVATAR.getId());
                    N n10 = new N();
                    do {
                        String string = cursor.getString(columnIndexOrThrow);
                        if (string == null) {
                            throw new UiAccountProviderCursor.Serializer.Error("UUID unavailable", null, 2, null);
                        }
                        n10.f51689a = string;
                        try {
                            UUID uuidFromString = UUID.fromString(string);
                            String string2 = cursor.getString(columnIndexOrThrow2);
                            if (string2 == null) {
                                throw new UiAccountProviderCursor.Serializer.Error("Username unavailable", null, 2, null);
                            }
                            String string3 = cursor.getString(columnIndexOrThrow3);
                            if (string3 == null) {
                                throw new UiAccountProviderCursor.Serializer.Error("Email unavailable", null, 2, null);
                            }
                            String string4 = cursor.getString(columnIndexOrThrow4);
                            AbstractC6492s.f(uuidFromString);
                            if (!listC.add(new Na.b(uuidFromString, string3, string2, string4))) {
                                Ua.a.g(new b(n10), null, 2, null);
                            }
                        } catch (IllegalArgumentException unused) {
                            throw new UiAccountProviderCursor.Serializer.Error("UUID in invalid format", null, 2, null);
                        }
                    } while (cursor.moveToNext());
                } catch (IllegalArgumentException e10) {
                    throw new UiAccountProviderCursor.Serializer.Error("Cursor doesn't contain required field: " + e10.getMessage(), null, 2, null);
                }
            }
            UiAccountProviderCursor.a aVar = new UiAccountProviderCursor.a(AbstractC3689v.a(listC));
            AbstractC6329b.a(cursor, null);
            return aVar;
        } finally {
        }
    }

    private final Cursor e(UiAccountProviderCursor.a aVar) throws UiAccountProviderCursor.Serializer.Error {
        MatrixCursor matrixCursorD = d(new String[]{a.UUID.getId(), a.USERNAME.getId(), a.EMAIL.getId(), a.AVATAR.getId()});
        try {
            for (Na.b bVar : aVar.a()) {
                matrixCursorD.addRow(AbstractC3689v.o(bVar.c().toString(), bVar.d(), bVar.b(), bVar.a()));
            }
            return matrixCursorD;
        } catch (IllegalArgumentException e10) {
            throw new UiAccountProviderCursor.Serializer.Error("Failed to serialize accounts", e10);
        }
    }

    @Override // com.ui.sso.api.provider.UiAccountProviderCursor.Serializer
    public UiAccountProviderCursor a(Cursor cursor, th.d clazz) throws UiAccountProviderCursor.Serializer.Error {
        AbstractC6492s.i(cursor, "cursor");
        AbstractC6492s.i(clazz, "clazz");
        if (AbstractC6492s.d(clazz, O.b(UiAccountProviderCursor.a.class))) {
            UiAccountProviderCursor.a aVarC = c(cursor);
            AbstractC6492s.g(aVarC, "null cannot be cast to non-null type TT of com.ui.sso.api.provider.UiAccountProviderCursorSerializerImpl.deserialize");
            return aVarC;
        }
        throw new UiAccountProviderCursor.Serializer.Error("unable to deserialize " + clazz.l(), null, 2, null);
    }

    @Override // com.ui.sso.api.provider.UiAccountProviderCursor.Serializer
    public Cursor b(UiAccountProviderCursor cursor) {
        AbstractC6492s.i(cursor, "cursor");
        if (cursor instanceof UiAccountProviderCursor.a) {
            return e((UiAccountProviderCursor.a) cursor);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final MatrixCursor d(String[] columnNames) {
        AbstractC6492s.i(columnNames, "columnNames");
        return new MatrixCursor(columnNames);
    }
}
