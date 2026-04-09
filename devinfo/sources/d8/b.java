package d8;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21988a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21989b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21990c;

    public /* synthetic */ b(int i4, Object obj, Object obj2) {
        this.f21988a = i4;
        this.f21990c = obj;
        this.f21989b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [d8.j, java.lang.Object] */
    @Override // d8.v
    public final u a(Object obj, int i4, int i10, x7.h hVar) throws NumberFormatException {
        u uVarA;
        Uri uri;
        switch (this.f21988a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new u(new s8.d(uri2), this.f21989b.s((AssetManager) this.f21990c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) hVar.c(i8.e.f25939b);
                return new u(new s8.d(num), new i(theme, theme != null ? theme.getResources() : ((Context) this.f21990c).getResources(), this.f21989b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f21990c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                x7.e eVar = null;
                for (int i11 = 0; i11 < size; i11++) {
                    v vVar = (v) arrayList.get(i11);
                    if (vVar.b(obj) && (uVarA = vVar.a(obj, i4, i10, hVar)) != null) {
                        eVar = uVarA.f22047a;
                        arrayList2.add(uVarA.f22049c);
                    }
                }
                if (arrayList2.isEmpty() || eVar == null) {
                    return null;
                }
                return new u(eVar, new z(arrayList2, (d4.c) this.f21989b));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f21989b).getResourcePackageName(num2.intValue()) + '/' + num2);
                } catch (Resources.NotFoundException e2) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e2);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((v) this.f21990c).a(uri, i4, i10, hVar);
            default:
                Uri uri3 = (Uri) obj;
                v vVar2 = (v) this.f21989b;
                List<String> pathSegments = uri3.getPathSegments();
                u uVarA2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i12 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i12 != 0) {
                            uVarA2 = vVar2.a(Integer.valueOf(i12), i4, i10, hVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return uVarA2;
                    } catch (NumberFormatException e10) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return uVarA2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e10);
                        return uVarA2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f21990c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return vVar2.a(Integer.valueOf(identifier), i4, i10, hVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    @Override // d8.v
    public final boolean b(Object obj) {
        switch (this.f21988a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                ArrayList arrayList = (ArrayList) this.f21990c;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    if (((v) obj2).b(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f21990c).getPackageName().equals(uri2.getAuthority());
        }
    }

    public String toString() {
        switch (this.f21988a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f21990c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public b(Resources resources, v vVar) {
        this.f21988a = 3;
        this.f21989b = resources;
        this.f21990c = vVar;
    }

    public b(Context context, j jVar) {
        this.f21988a = 1;
        this.f21990c = context.getApplicationContext();
        this.f21989b = jVar;
    }

    public b(Context context, v vVar) {
        this.f21988a = 4;
        this.f21990c = context.getApplicationContext();
        this.f21989b = vVar;
    }
}
