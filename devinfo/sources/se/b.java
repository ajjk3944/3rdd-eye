package se;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.security.identity.IdentityCredential;
import android.util.Base64;
import android.util.JsonWriter;
import b4.m;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.al;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p.o1;
import w4.p;
import ya.f0;
import z7.k;
import z7.s;
import z7.y;
import za.e;
import za.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33556a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f33557b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f33558c;

    /* renamed from: d, reason: collision with root package name */
    public Object f33559d;

    public /* synthetic */ b(String str, String str2, Object obj, Object obj2) {
        this.f33556a = str;
        this.f33557b = str2;
        this.f33558c = obj;
        this.f33559d = obj2;
    }

    public synchronized void a(x7.e eVar, s sVar) {
        z7.a aVar = (z7.a) ((HashMap) this.f33557b).put(eVar, new z7.a(eVar, sVar, (ReferenceQueue) this.f33558c));
        if (aVar != null) {
            aVar.f37976c = null;
            aVar.clear();
        }
    }

    public void b(z7.a aVar) {
        y yVar;
        synchronized (this) {
            ((HashMap) this.f33557b).remove(aVar.f37974a);
            if (aVar.f37975b && (yVar = aVar.f37976c) != null) {
                ((k) this.f33559d).f(aVar.f37974a, new s(yVar, true, false, aVar.f37974a, (k) this.f33559d));
            }
        }
    }

    @Override // za.e
    public void i(JsonWriter jsonWriter) throws IOException {
        String str = (String) this.f33556a;
        String str2 = (String) this.f33557b;
        Map map = (Map) this.f33558c;
        byte[] bArr = (byte[]) this.f33559d;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        f.d(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public b(f0 f0Var, al alVar, Bundle bundle, Context context, Uri uri) {
        this.f33556a = alVar;
        this.f33557b = bundle;
        this.f33558c = context;
        this.f33559d = uri;
    }

    public b() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new m(1));
        this.f33557b = new HashMap();
        this.f33558c = new ReferenceQueue();
        this.f33556a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new o1(23, this));
    }

    public b(Context context, ArrayList arrayList) {
        this.f33558c = new ArrayList();
        this.f33556a = context;
        this.f33557b = arrayList;
    }

    public b(Typeface typeface, x4.b bVar) {
        int i4;
        int i10;
        int i11;
        int i12;
        this.f33559d = typeface;
        this.f33556a = bVar;
        this.f33558c = new p(Segment.SHARE_MINIMUM);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i13 = iA + bVar.f443a;
            i4 = ((ByteBuffer) bVar.f446d).getInt(((ByteBuffer) bVar.f446d).getInt(i13) + i13);
        } else {
            i4 = 0;
        }
        this.f33557b = new char[i4 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + bVar.f443a;
            i10 = ((ByteBuffer) bVar.f446d).getInt(((ByteBuffer) bVar.f446d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            w4.s sVar = new w4.s(this, i15);
            x4.a aVarB = sVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f446d).getInt(iA3 + aVarB.f443a) : 0, (char[]) this.f33557b, i15 * 2);
            x4.a aVarB2 = sVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i16 = iA4 + aVarB2.f443a;
                i11 = ((ByteBuffer) aVarB2.f446d).getInt(((ByteBuffer) aVarB2.f446d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            pk.a.c("invalid metadata codepoint length", i11 > 0);
            p pVar = (p) this.f33558c;
            x4.a aVarB3 = sVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i17 = iA5 + aVarB3.f443a;
                i12 = ((ByteBuffer) aVarB3.f446d).getInt(((ByteBuffer) aVarB3.f446d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            pVar.a(sVar, 0, i12 - 1);
        }
    }

    public b(Signature signature) {
        this.f33556a = signature;
        this.f33557b = null;
        this.f33558c = null;
        this.f33559d = null;
    }

    public b(Cipher cipher) {
        this.f33556a = null;
        this.f33557b = cipher;
        this.f33558c = null;
        this.f33559d = null;
    }

    public b(Mac mac) {
        this.f33556a = null;
        this.f33557b = null;
        this.f33558c = mac;
        this.f33559d = null;
    }

    public b(IdentityCredential identityCredential) {
        this.f33556a = null;
        this.f33557b = null;
        this.f33558c = null;
        this.f33559d = identityCredential;
    }
}
