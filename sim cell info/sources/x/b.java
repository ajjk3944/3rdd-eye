package x;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import s.f;
import t.k;
import x.c;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    static final k.e<String, Typeface> f3365a = new k.e<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final x.c f3366b = new x.c("fonts", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f3367c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final k.g<String, ArrayList<c.d<g>>> f3368d = new k.g<>();

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<byte[]> f3369e = new d();

    class a implements Callable<g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f3370a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x.a f3371b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3372c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3373d;

        a(Context context, x.a aVar, int i2, String str) {
            this.f3370a = context;
            this.f3371b = aVar;
            this.f3372c = i2;
            this.f3373d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g call() {
            g gVarF = b.f(this.f3370a, this.f3371b, this.f3372c);
            Typeface typeface = gVarF.f3384a;
            if (typeface != null) {
                b.f3365a.d(this.f3373d, typeface);
            }
            return gVarF;
        }
    }

    /* renamed from: x.b$b, reason: collision with other inner class name */
    class C0038b implements c.d<g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f.a f3374a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f3375b;

        C0038b(f.a aVar, Handler handler) {
            this.f3374a = aVar;
            this.f3375b = handler;
        }

        @Override // x.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            int i2;
            f.a aVar;
            if (gVar == null) {
                aVar = this.f3374a;
                i2 = 1;
            } else {
                i2 = gVar.f3385b;
                if (i2 == 0) {
                    this.f3374a.b(gVar.f3384a, this.f3375b);
                    return;
                }
                aVar = this.f3374a;
            }
            aVar.a(i2, this.f3375b);
        }
    }

    class c implements c.d<g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3376a;

        c(String str) {
            this.f3376a = str;
        }

        @Override // x.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            synchronized (b.f3367c) {
                k.g<String, ArrayList<c.d<g>>> gVar2 = b.f3368d;
                ArrayList<c.d<g>> arrayList = gVar2.get(this.f3376a);
                if (arrayList == null) {
                    return;
                }
                gVar2.remove(this.f3376a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2).a(gVar);
                }
            }
        }
    }

    class d implements Comparator<byte[]> {
        d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length == bArr2.length) {
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    if (bArr[i2] != bArr2[i2]) {
                        length = bArr[i2];
                        length2 = bArr2[i2];
                    }
                }
                return 0;
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f3377a;

        /* renamed from: b, reason: collision with root package name */
        private final f[] f3378b;

        public e(int i2, f[] fVarArr) {
            this.f3377a = i2;
            this.f3378b = fVarArr;
        }

        public f[] a() {
            return this.f3378b;
        }

        public int b() {
            return this.f3377a;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f3379a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3380b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3381c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f3382d;

        /* renamed from: e, reason: collision with root package name */
        private final int f3383e;

        public f(Uri uri, int i2, int i3, boolean z2, int i4) {
            this.f3379a = (Uri) z.g.b(uri);
            this.f3380b = i2;
            this.f3381c = i3;
            this.f3382d = z2;
            this.f3383e = i4;
        }

        public int a() {
            return this.f3383e;
        }

        public int b() {
            return this.f3380b;
        }

        public Uri c() {
            return this.f3379a;
        }

        public int d() {
            return this.f3381c;
        }

        public boolean e() {
            return this.f3382d;
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f3384a;

        /* renamed from: b, reason: collision with root package name */
        final int f3385b;

        g(Typeface typeface, int i2) {
            this.f3384a = typeface;
            this.f3385b = i2;
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static e c(Context context, CancellationSignal cancellationSignal, x.a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoH = h(context.getPackageManager(), aVar, context.getResources());
        return providerInfoH == null ? new e(1, null) : new e(0, e(context, aVar, providerInfoH.authority, cancellationSignal));
    }

    private static List<List<byte[]>> d(x.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : s.c.c(resources, aVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static x.b.f[] e(android.content.Context r23, x.a r24, java.lang.String r25, android.os.CancellationSignal r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.b.e(android.content.Context, x.a, java.lang.String, android.os.CancellationSignal):x.b$f[]");
    }

    static g f(Context context, x.a aVar, int i2) {
        try {
            e eVarC = c(context, null, aVar);
            if (eVarC.b() != 0) {
                return new g(null, eVarC.b() == 1 ? -2 : -3);
            }
            Typeface typefaceB = t.d.b(context, null, eVarC.a(), i2);
            return new g(typefaceB, typefaceB != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface g(Context context, x.a aVar, f.a aVar2, Handler handler, boolean z2, int i2, int i3) {
        String str = aVar.c() + "-" + i3;
        Typeface typefaceC = f3365a.c(str);
        if (typefaceC != null) {
            if (aVar2 != null) {
                aVar2.d(typefaceC);
            }
            return typefaceC;
        }
        if (z2 && i2 == -1) {
            g gVarF = f(context, aVar, i3);
            if (aVar2 != null) {
                int i4 = gVarF.f3385b;
                if (i4 == 0) {
                    aVar2.b(gVarF.f3384a, handler);
                } else {
                    aVar2.a(i4, handler);
                }
            }
            return gVarF.f3384a;
        }
        a aVar3 = new a(context, aVar, i3, str);
        if (z2) {
            try {
                return ((g) f3366b.e(aVar3, i2)).f3384a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0038b c0038b = aVar2 == null ? null : new C0038b(aVar2, handler);
        synchronized (f3367c) {
            k.g<String, ArrayList<c.d<g>>> gVar = f3368d;
            ArrayList<c.d<g>> arrayList = gVar.get(str);
            if (arrayList != null) {
                if (c0038b != null) {
                    arrayList.add(c0038b);
                }
                return null;
            }
            if (c0038b != null) {
                ArrayList<c.d<g>> arrayList2 = new ArrayList<>();
                arrayList2.add(c0038b);
                gVar.put(str, arrayList2);
            }
            f3366b.d(aVar3, new c(str));
            return null;
        }
    }

    public static ProviderInfo h(PackageManager packageManager, x.a aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strD = aVar.d();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strD, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strD);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strD + ", but package was not " + aVar.e());
        }
        List<byte[]> listA = a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listA, f3369e);
        List<List<byte[]>> listD = d(aVar, resources);
        for (int i2 = 0; i2 < listD.size(); i2++) {
            ArrayList arrayList = new ArrayList(listD.get(i2));
            Collections.sort(arrayList, f3369e);
            if (b(listA, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri uriC = fVar.c();
                if (!map.containsKey(uriC)) {
                    map.put(uriC, k.f(context, cancellationSignal, uriC));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
