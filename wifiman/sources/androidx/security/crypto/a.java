package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C7011b;
import o4.InterfaceC7066a;
import o4.InterfaceC7070e;
import o4.l;
import o4.m;
import o4.n;
import p4.AbstractC7218a;
import t4.AbstractC8028b;
import u4.C8131a;

/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f32322a;

    /* renamed from: b, reason: collision with root package name */
    final CopyOnWriteArrayList f32323b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    final String f32324c;

    /* renamed from: d, reason: collision with root package name */
    final String f32325d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC7066a f32326e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC7070e f32327f;

    /* renamed from: androidx.security.crypto.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1125a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32328a;

        static {
            int[] iArr = new int[c.values().length];
            f32328a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32328a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32328a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32328a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32328a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32328a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        private final a f32329a;

        /* renamed from: b, reason: collision with root package name */
        private final SharedPreferences.Editor f32330b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f32332d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private final List f32331c = new CopyOnWriteArrayList();

        b(a aVar, SharedPreferences.Editor editor) {
            this.f32329a = aVar;
            this.f32330b = editor;
        }

        private void a() {
            if (this.f32332d.getAndSet(false)) {
                for (String str : this.f32329a.getAll().keySet()) {
                    if (!this.f32331c.contains(str) && !this.f32329a.g(str)) {
                        this.f32330b.remove(this.f32329a.d(str));
                    }
                }
            }
        }

        private void b() {
            Iterator it = this.f32329a.f32323b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.f32331c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f32329a, (String) it2.next());
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.f32329a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f32331c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair pairE = this.f32329a.e(str, bArr);
                this.f32330b.putString((String) pairE.first, (String) pairE.second);
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f32330b.apply();
            b();
            this.f32331c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f32332d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f32330b.commit();
            } finally {
                b();
                this.f32331c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(c.BOOLEAN.getId());
            byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.FLOAT.getId());
            byteBufferAllocate.putFloat(f10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.INT.getId());
            byteBufferAllocate.putInt(i10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(c.LONG.getId());
            byteBufferAllocate.putLong(j10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(c.STRING.getId());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new C7011b();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(c.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f32329a.g(str)) {
                this.f32330b.remove(this.f32329a.d(str));
                this.f32331c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    private enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        c(int i10) {
            this.mId = i10;
        }

        public static c fromId(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum d {
        AES256_SIV("AES256_SIV");

        private final String mDeterministicAeadKeyTemplateName;

        d(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        l getKeyTemplate() throws GeneralSecurityException {
            return m.a(this.mDeterministicAeadKeyTemplateName);
        }
    }

    public enum e {
        AES256_GCM("AES256_GCM");

        private final String mAeadKeyTemplateName;

        e(String str) {
            this.mAeadKeyTemplateName = str;
        }

        l getKeyTemplate() throws GeneralSecurityException {
            return m.a(this.mAeadKeyTemplateName);
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, InterfaceC7066a interfaceC7066a, InterfaceC7070e interfaceC7070e) {
        this.f32324c = str;
        this.f32322a = sharedPreferences;
        this.f32325d = str2;
        this.f32326e = interfaceC7066a;
        this.f32327f = interfaceC7070e;
    }

    public static SharedPreferences a(Context context, String str, androidx.security.crypto.b bVar, d dVar, e eVar) {
        return b(str, bVar.a(), context, dVar, eVar);
    }

    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        AbstractC8028b.a();
        AbstractC7218a.b();
        Context applicationContext = context.getApplicationContext();
        n nVarD = new C8131a.b().l(dVar.getKeyTemplate()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        n nVarD2 = new C8131a.b().l(eVar.getKeyTemplate()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (InterfaceC7066a) nVarD2.k(InterfaceC7066a.class), (InterfaceC7070e) nVarD.k(InterfaceC7070e.class));
    }

    private Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strD = d(str);
            String string = this.f32322a.getString(strD, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA = B4.e.a(string, 0);
            InterfaceC7066a interfaceC7066a = this.f32326e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC7066a.b(bArrA, strD.getBytes(charset)));
            byteBufferWrap.position(0);
            int i10 = byteBufferWrap.getInt();
            c cVarFromId = c.fromId(i10);
            if (cVarFromId == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
            }
            switch (C1125a.f32328a[cVarFromId.ordinal()]) {
                case 1:
                    int i11 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i11);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (string2.equals("__NULL__")) {
                        return null;
                    }
                    return string2;
                case 2:
                    return Integer.valueOf(byteBufferWrap.getInt());
                case 3:
                    return Long.valueOf(byteBufferWrap.getLong());
                case 4:
                    return Float.valueOf(byteBufferWrap.getFloat());
                case 5:
                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                case 6:
                    C7011b c7011b = new C7011b();
                    while (byteBufferWrap.hasRemaining()) {
                        int i12 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i12);
                        byteBufferWrap.position(byteBufferWrap.position() + i12);
                        c7011b.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (c7011b.size() == 1 && "__NULL__".equals(c7011b.u(0))) {
                        return null;
                    }
                    return c7011b;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + cVarFromId);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f32327f.b(B4.e.a(str, 0), this.f32324c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f32322a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return B4.e.d(this.f32327f.a(str.getBytes(StandardCharsets.UTF_8), this.f32324c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    Pair e(String str, byte[] bArr) {
        String strD = d(str);
        return new Pair(strD, B4.e.d(this.f32326e.a(bArr, strD.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f32322a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f32322a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String strC = c(entry.getKey());
                map.put(strC, f(strC));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        Object objF = f(str);
        return objF instanceof Boolean ? ((Boolean) objF).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        Object objF = f(str);
        return objF instanceof Float ? ((Float) objF).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        Object objF = f(str);
        return objF instanceof Integer ? ((Integer) objF).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        Object objF = f(str);
        return objF instanceof Long ? ((Long) objF).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object objF = f(str);
        return objF instanceof String ? (String) objF : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object objF = f(str);
        Set c7011b = objF instanceof Set ? (Set) objF : new C7011b();
        return c7011b.size() > 0 ? c7011b : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f32323b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f32323b.remove(onSharedPreferenceChangeListener);
    }
}
