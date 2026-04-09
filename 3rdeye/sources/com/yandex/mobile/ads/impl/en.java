package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
final class en {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, dn> f26909a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f26910b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f26911c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f26912d = new SparseBooleanArray();

    /* renamed from: e, reason: collision with root package name */
    private c f26913e;

    /* renamed from: f, reason: collision with root package name */
    private c f26914f;

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f26920a = false;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f26921b = null;

        /* renamed from: c, reason: collision with root package name */
        private final SecretKeySpec f26922c = null;

        /* renamed from: d, reason: collision with root package name */
        private final SecureRandom f26923d = null;

        /* renamed from: e, reason: collision with root package name */
        private final fh f26924e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f26925f;

        /* renamed from: g, reason: collision with root package name */
        private ir1 f26926g;

        public b(File file) {
            this.f26924e = new fh(file);
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(long j4) {
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void b() {
            this.f26924e.a();
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final boolean a() {
            return this.f26924e.b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.io.DataOutputStream, java.io.OutputStream] */
        @Override // com.yandex.mobile.ads.impl.en.c
        public final void b(HashMap<String, dn> map) throws Throwable {
            ?? dataOutputStream;
            ir1 ir1Var;
            DataOutputStream dataOutputStream2;
            Object obj = null;
            try {
                OutputStream outputStreamD = this.f26924e.d();
                ir1 ir1Var2 = this.f26926g;
                if (ir1Var2 == null) {
                    this.f26926g = new ir1(outputStreamD);
                } else {
                    ir1Var2.a(outputStreamD);
                }
                ir1Var = this.f26926g;
                dataOutputStream = new DataOutputStream(ir1Var);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.f26920a ? 1 : 0);
                dataOutputStream2 = dataOutputStream;
                if (this.f26920a) {
                    byte[] bArr = new byte[16];
                    SecureRandom secureRandom = this.f26923d;
                    int i = s82.f32899a;
                    secureRandom.nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f26921b.init(1, this.f26922c, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(ir1Var, this.f26921b));
                    } catch (InvalidAlgorithmParameterException e4) {
                        e = e4;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e10) {
                        e = e10;
                        throw new IllegalStateException(e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                s82.a((Closeable) dataOutputStream);
                throw th;
            }
            try {
                dataOutputStream2.writeInt(map.size());
                int iA = 0;
                for (dn dnVar : map.values()) {
                    dataOutputStream2.writeInt(dnVar.f26270a);
                    dataOutputStream2.writeUTF(dnVar.f26271b);
                    Set<Map.Entry<String, byte[]>> setA = dnVar.a().a();
                    dataOutputStream2.writeInt(setA.size());
                    for (Map.Entry<String, byte[]> entry : setA) {
                        dataOutputStream2.writeUTF(entry.getKey());
                        byte[] value = entry.getValue();
                        dataOutputStream2.writeInt(value.length);
                        dataOutputStream2.write(value);
                    }
                    iA += a(dnVar, 2);
                }
                dataOutputStream2.writeInt(iA);
                this.f26924e.a(dataOutputStream2);
                int i10 = s82.f32899a;
                this.f26925f = false;
            } catch (Throwable th3) {
                th = th3;
                obj = dataOutputStream2;
                dataOutputStream = obj;
                s82.a((Closeable) dataOutputStream);
                throw th;
            }
        }

        private static int a(dn dnVar, int i) {
            int iHashCode = dnVar.f26271b.hashCode() + (dnVar.f26270a * 31);
            if (i < 2) {
                long jB = dnVar.a().b();
                return (iHashCode * 31) + ((int) (jB ^ (jB >>> 32)));
            }
            return dnVar.a().hashCode() + (iHashCode * 31);
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(HashMap<String, dn> map, SparseArray<String> sparseArray) throws Throwable {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            if (!this.f26925f) {
                if (this.f26924e.b()) {
                    DataInputStream dataInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(this.f26924e.c());
                        dataInputStream = new DataInputStream(bufferedInputStream);
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        int i = dataInputStream.readInt();
                        if (i >= 0 && i <= 2) {
                            if ((dataInputStream.readInt() & 1) != 0) {
                                if (this.f26921b != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        Cipher cipher = this.f26921b;
                                        SecretKeySpec secretKeySpec = this.f26922c;
                                        int i10 = s82.f32899a;
                                        cipher.init(2, secretKeySpec, ivParameterSpec);
                                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f26921b));
                                    } catch (InvalidAlgorithmParameterException e4) {
                                        e = e4;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e10) {
                                        e = e10;
                                        throw new IllegalStateException(e);
                                    }
                                } else {
                                    s82.a((Closeable) dataInputStream);
                                }
                            } else if (this.f26920a) {
                                this.f26925f = true;
                            }
                            int i11 = dataInputStream.readInt();
                            int iA = 0;
                            for (int i12 = 0; i12 < i11; i12++) {
                                dn dnVarA = a(i, dataInputStream);
                                map.put(dnVarA.f26271b, dnVarA);
                                sparseArray.put(dnVarA.f26270a, dnVarA.f26271b);
                                iA += a(dnVarA, i);
                            }
                            int i13 = dataInputStream.readInt();
                            boolean z10 = dataInputStream.read() == -1;
                            if (i13 == iA && z10) {
                                s82.a((Closeable) dataInputStream);
                                return;
                            }
                            s82.a((Closeable) dataInputStream);
                        } else {
                            s82.a((Closeable) dataInputStream);
                        }
                    } catch (IOException unused2) {
                        dataInputStream2 = dataInputStream;
                        if (dataInputStream2 != null) {
                            s82.a((Closeable) dataInputStream2);
                        }
                        map.clear();
                        sparseArray.clear();
                        this.f26924e.a();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream2 = dataInputStream;
                        if (dataInputStream2 != null) {
                            s82.a((Closeable) dataInputStream2);
                        }
                        throw th;
                    }
                    map.clear();
                    sparseArray.clear();
                    this.f26924e.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(dn dnVar, boolean z10) {
            this.f26925f = true;
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(dn dnVar) {
            this.f26925f = true;
        }

        private static dn a(int i, DataInputStream dataInputStream) throws IOException {
            iz izVarA;
            int i10 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i >= 2) {
                izVarA = en.a(dataInputStream);
            } else {
                long j4 = dataInputStream.readLong();
                yr yrVar = new yr();
                yr.a(yrVar, j4);
                izVarA = iz.f28900c.a(yrVar);
            }
            return new dn(i10, utf, izVarA);
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(HashMap<String, dn> map) throws Throwable {
            if (this.f26925f) {
                b(map);
            }
        }
    }

    public interface c {
        void a(long j4);

        void a(dn dnVar);

        void a(dn dnVar, boolean z10);

        void a(HashMap<String, dn> map) throws Throwable;

        void a(HashMap<String, dn> map, SparseArray<String> sparseArray) throws Throwable;

        boolean a() throws Throwable;

        void b() throws Throwable;

        void b(HashMap<String, dn> map) throws Throwable;
    }

    public en(f60 f60Var, File file) {
        a aVar = new a(f60Var);
        b bVar = new b(new File(file, "monetization_cached_content_index.exi"));
        this.f26913e = aVar;
        this.f26914f = bVar;
    }

    public final void a(String str, yr yrVar) {
        dn dnVarC = c(str);
        if (dnVarC.a(yrVar)) {
            this.f26913e.a(dnVarC);
        }
    }

    public final dn c(String str) {
        dn dnVar = this.f26909a.get(str);
        if (dnVar != null) {
            return dnVar;
        }
        SparseArray<String> sparseArray = this.f26910b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        dn dnVar2 = new dn(iKeyAt, str, iz.f28900c);
        this.f26909a.put(str, dnVar2);
        this.f26910b.put(iKeyAt, str);
        this.f26912d.put(iKeyAt, true);
        this.f26913e.a(dnVar2);
        return dnVar2;
    }

    public final void d(String str) {
        dn dnVar = this.f26909a.get(str);
        if (dnVar != null && dnVar.c() && dnVar.d()) {
            this.f26909a.remove(str);
            int i = dnVar.f26270a;
            boolean z10 = this.f26912d.get(i);
            this.f26913e.a(dnVar, z10);
            if (z10) {
                this.f26910b.remove(i);
                this.f26912d.delete(i);
            } else {
                this.f26910b.put(i, null);
                this.f26911c.put(i, true);
            }
        }
    }

    public final iz b(String str) {
        dn dnVar = this.f26909a.get(str);
        return dnVar != null ? dnVar.a() : iz.f28900c;
    }

    public static final class a implements c {

        /* renamed from: e, reason: collision with root package name */
        private static final String[] f26915e = {FacebookMediationAdapter.KEY_ID, "key", "metadata"};

        /* renamed from: a, reason: collision with root package name */
        private final uv f26916a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<dn> f26917b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private String f26918c;

        /* renamed from: d, reason: collision with root package name */
        private String f26919d;

        public a(f60 f60Var) {
            this.f26916a = f60Var;
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final boolean a() throws Throwable {
            SQLiteDatabase readableDatabase = this.f26916a.getReadableDatabase();
            String str = this.f26918c;
            str.getClass();
            return wa2.a(readableDatabase, 1, str) != -1;
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void b() throws Throwable {
            uv uvVar = this.f26916a;
            String str = this.f26918c;
            str.getClass();
            try {
                String strConcat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = uvVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i = wa2.f34870a;
                    try {
                        if (s82.a(writableDatabase, "ExoPlayerVersions")) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                        writableDatabase.setTransactionSuccessful();
                    } catch (SQLException e4) {
                        throw new tv(e4);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new tv(e10);
            }
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(long j4) {
            String hexString = Long.toHexString(j4);
            this.f26918c = hexString;
            this.f26919d = androidx.work.s.d("ExoPlayerCacheIndex", hexString);
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(HashMap<String, dn> map, SparseArray<String> sparseArray) throws Throwable {
            if (this.f26917b.size() == 0) {
                try {
                    SQLiteDatabase readableDatabase = this.f26916a.getReadableDatabase();
                    String str = this.f26918c;
                    str.getClass();
                    if (wa2.a(readableDatabase, 1, str) != 1) {
                        SQLiteDatabase writableDatabase = this.f26916a.getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        try {
                            String str2 = this.f26918c;
                            str2.getClass();
                            wa2.a(writableDatabase, 1, str2, 1);
                            String str3 = this.f26919d;
                            str3.getClass();
                            writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str3));
                            writableDatabase.execSQL("CREATE TABLE " + this.f26919d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                        } catch (Throwable th) {
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    }
                    SQLiteDatabase readableDatabase2 = this.f26916a.getReadableDatabase();
                    String str4 = this.f26919d;
                    str4.getClass();
                    Cursor cursorQuery = readableDatabase2.query(str4, f26915e, null, null, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        try {
                            int i = cursorQuery.getInt(0);
                            String string = cursorQuery.getString(1);
                            string.getClass();
                            map.put(string, new dn(i, string, en.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                            sparseArray.put(i, string);
                        } finally {
                        }
                    }
                    cursorQuery.close();
                    return;
                } catch (SQLiteException e4) {
                    map.clear();
                    sparseArray.clear();
                    throw new tv(e4);
                }
            }
            throw new IllegalStateException();
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void b(HashMap<String, dn> map) throws Throwable {
            try {
                SQLiteDatabase writableDatabase = this.f26916a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    String str = this.f26918c;
                    str.getClass();
                    wa2.a(writableDatabase, 1, str, 1);
                    String str2 = this.f26919d;
                    str2.getClass();
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                    writableDatabase.execSQL("CREATE TABLE " + this.f26919d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                    for (dn dnVar : map.values()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        iz izVarA = dnVar.a();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry<String, byte[]>> setA = izVarA.a();
                        dataOutputStream.writeInt(setA.size());
                        for (Map.Entry<String, byte[]> entry : setA) {
                            dataOutputStream.writeUTF(entry.getKey());
                            byte[] value = entry.getValue();
                            dataOutputStream.writeInt(value.length);
                            dataOutputStream.write(value);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(FacebookMediationAdapter.KEY_ID, Integer.valueOf(dnVar.f26270a));
                        contentValues.put("key", dnVar.f26271b);
                        contentValues.put("metadata", byteArray);
                        String str3 = this.f26919d;
                        str3.getClass();
                        writableDatabase.replaceOrThrow(str3, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f26917b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e4) {
                throw new tv(e4);
            }
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(dn dnVar, boolean z10) {
            if (z10) {
                this.f26917b.delete(dnVar.f26270a);
            } else {
                this.f26917b.put(dnVar.f26270a, null);
            }
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(dn dnVar) {
            this.f26917b.put(dnVar.f26270a, dnVar);
        }

        @Override // com.yandex.mobile.ads.impl.en.c
        public final void a(HashMap<String, dn> map) throws Throwable {
            if (this.f26917b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f26916a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.f26917b.size(); i++) {
                    try {
                        dn dnVarValueAt = this.f26917b.valueAt(i);
                        if (dnVarValueAt == null) {
                            int iKeyAt = this.f26917b.keyAt(i);
                            String str = this.f26919d;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            iz izVarA = dnVarValueAt.a();
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            Set<Map.Entry<String, byte[]>> setA = izVarA.a();
                            dataOutputStream.writeInt(setA.size());
                            for (Map.Entry<String, byte[]> entry : setA) {
                                dataOutputStream.writeUTF(entry.getKey());
                                byte[] value = entry.getValue();
                                dataOutputStream.writeInt(value.length);
                                dataOutputStream.write(value);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(FacebookMediationAdapter.KEY_ID, Integer.valueOf(dnVarValueAt.f26270a));
                            contentValues.put("key", dnVarValueAt.f26271b);
                            contentValues.put("metadata", byteArray);
                            String str2 = this.f26919d;
                            str2.getClass();
                            writableDatabase.replaceOrThrow(str2, null, contentValues);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f26917b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e4) {
                throw new tv(e4);
            }
        }
    }

    public final dn a(String str) {
        return this.f26909a.get(str);
    }

    public final void b() {
        Iterator it = zj0.a(this.f26909a.keySet()).iterator();
        while (it.hasNext()) {
            d((String) it.next());
        }
    }

    public final Collection<dn> a() {
        return Collections.unmodifiableCollection(this.f26909a.values());
    }

    public final String a(int i) {
        return this.f26910b.get(i);
    }

    public final void a(long j4) throws Throwable {
        c cVar;
        this.f26913e.a(j4);
        c cVar2 = this.f26914f;
        if (cVar2 != null) {
            cVar2.a(j4);
        }
        if (!this.f26913e.a() && (cVar = this.f26914f) != null && cVar.a()) {
            this.f26914f.a(this.f26909a, this.f26910b);
            this.f26913e.b(this.f26909a);
        } else {
            this.f26913e.a(this.f26909a, this.f26910b);
        }
        c cVar3 = this.f26914f;
        if (cVar3 != null) {
            cVar3.b();
            this.f26914f = null;
        }
    }

    public final void c() throws Throwable {
        this.f26913e.a(this.f26909a);
        int size = this.f26911c.size();
        for (int i = 0; i < size; i++) {
            this.f26910b.remove(this.f26911c.keyAt(i));
        }
        this.f26911c.clear();
        this.f26912d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iz a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < i; i10++) {
            String utf = dataInputStream.readUTF();
            int i11 = dataInputStream.readInt();
            if (i11 >= 0) {
                int iMin = Math.min(i11, 10485760);
                byte[] bArrCopyOf = s82.f32904f;
                int i12 = 0;
                while (i12 != i11) {
                    int i13 = i12 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i13);
                    dataInputStream.readFully(bArrCopyOf, i12, iMin);
                    iMin = Math.min(i11 - i13, 10485760);
                    i12 = i13;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(fe.a("Invalid value size: ", i11));
            }
        }
        return new iz(map);
    }
}
