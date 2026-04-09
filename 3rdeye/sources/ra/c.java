package ra;

import N7.B8;
import androidx.work.s;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: TzdbZoneRulesProvider.java */
/* loaded from: classes3.dex */
public final class c extends i {

    /* renamed from: c, reason: collision with root package name */
    public List<String> f45842c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentSkipListMap f45843d = new ConcurrentSkipListMap();

    /* compiled from: TzdbZoneRulesProvider.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f45844a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f45845b;

        /* renamed from: c, reason: collision with root package name */
        public final short[] f45846c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f45847d;

        public a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f45847d = atomicReferenceArray;
            this.f45844a = str;
            this.f45845b = strArr;
            this.f45846c = sArr;
        }

        public final String toString() {
            return this.f45844a;
        }
    }

    public c(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            e(inputStream);
        } catch (Exception e4) {
            throw new g("Unable to load TZDB time-zone rules", e4);
        }
    }

    @Override // ra.i
    public final f b(String str) {
        f fVar;
        com.google.gson.internal.c.v(str, "zoneId");
        a aVar = (a) this.f45843d.lastEntry().getValue();
        int iBinarySearch = Arrays.binarySearch(aVar.f45845b, str);
        if (iBinarySearch < 0) {
            fVar = null;
        } else {
            try {
                short s10 = aVar.f45846c[iBinarySearch];
                AtomicReferenceArray<Object> atomicReferenceArray = aVar.f45847d;
                Object objB = atomicReferenceArray.get(s10);
                if (objB instanceof byte[]) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) objB));
                    objB = ra.a.b(dataInputStream.readByte(), dataInputStream);
                    atomicReferenceArray.set(s10, objB);
                }
                fVar = (f) objB;
            } catch (Exception e4) {
                StringBuilder sbK = B8.k("Invalid binary time-zone data: TZDB:", str, ", version: ");
                sbK.append(aVar.f45844a);
                throw new g(sbK.toString(), e4);
            }
        }
        if (fVar != null) {
            return fVar;
        }
        throw new g("Unknown time-zone ID: ".concat(str));
    }

    @Override // ra.i
    public final HashSet c() {
        return new HashSet(this.f45842c);
    }

    public final void e(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int i = dataInputStream.readShort();
        String[] strArr = new String[i];
        for (int i10 = 0; i10 < i; i10++) {
            strArr[i10] = dataInputStream.readUTF();
        }
        int i11 = dataInputStream.readShort();
        String[] strArr2 = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr2[i12] = dataInputStream.readUTF();
        }
        this.f45842c = Arrays.asList(strArr2);
        int i13 = dataInputStream.readShort();
        Object[] objArr = new Object[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i14] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet hashSet = new HashSet(i);
        for (int i15 = 0; i15 < i; i15++) {
            int i16 = dataInputStream.readShort();
            String[] strArr3 = new String[i16];
            short[] sArr = new short[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                strArr3[i17] = strArr2[dataInputStream.readShort()];
                sArr[i17] = dataInputStream.readShort();
            }
            hashSet.add(new a(strArr[i15], strArr3, sArr, atomicReferenceArray));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a aVar2 = (a) this.f45843d.putIfAbsent(aVar.f45844a, aVar);
            if (aVar2 != null) {
                String str = aVar2.f45844a;
                String str2 = aVar.f45844a;
                if (!str.equals(str2)) {
                    throw new g(s.d("Data already loaded for TZDB time-zone rules version: ", str2));
                }
            }
        }
    }

    public final String toString() {
        return "TZDB";
    }
}
