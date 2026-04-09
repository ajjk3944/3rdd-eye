package r1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l1.InterfaceC2639e;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2872b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23336a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23337b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23338c;

    public /* synthetic */ C2872b(Object obj, int i, Object obj2) {
        this.f23336a = i;
        this.f23338c = obj;
        this.f23337b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, r1.a] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, r1.f] */
    @Override // r1.r
    public final q a(Object obj, int i, int i3, l1.h hVar) throws NumberFormatException {
        q qVarA;
        Uri uri;
        switch (this.f23336a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new q(new G1.b(uri2), this.f23337b.g((AssetManager) this.f23338c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) hVar.c(w1.d.f23945b);
                return new q(new G1.b(num), new C2875e(theme, theme != null ? theme.getResources() : ((Context) this.f23338c).getResources(), this.f23337b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f23338c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC2639e interfaceC2639e = null;
                for (int i6 = 0; i6 < size; i6++) {
                    r rVar = (r) arrayList.get(i6);
                    if (rVar.b(obj) && (qVarA = rVar.a(obj, i, i3, hVar)) != null) {
                        interfaceC2639e = qVarA.f23368a;
                        arrayList2.add(qVarA.f23370c);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC2639e == null) {
                    return null;
                }
                return new q(interfaceC2639e, new v(arrayList2, (Q.b) this.f23337b));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f23337b).getResourcePackageName(num2.intValue()) + '/' + num2);
                } catch (Resources.NotFoundException e6) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e6);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((r) this.f23338c).a(uri, i, i3, hVar);
            default:
                Uri uri3 = (Uri) obj;
                r rVar2 = (r) this.f23337b;
                List<String> pathSegments = uri3.getPathSegments();
                q qVarA2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i7 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i7 != 0) {
                            qVarA2 = rVar2.a(Integer.valueOf(i7), i, i3, hVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return qVarA2;
                    } catch (NumberFormatException e7) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return qVarA2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e7);
                        return qVarA2;
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
                Context context = (Context) this.f23338c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return rVar2.a(Integer.valueOf(identifier), i, i3, hVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    @Override // r1.r
    public final boolean b(Object obj) {
        switch (this.f23336a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                ArrayList arrayList = (ArrayList) this.f23338c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((r) obj2).b(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f23338c).getPackageName().equals(uri2.getAuthority());
        }
    }

    public String toString() {
        switch (this.f23336a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f23338c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C2872b(Resources resources, r rVar) {
        this.f23336a = 3;
        this.f23337b = resources;
        this.f23338c = rVar;
    }

    public C2872b(Context context, f fVar) {
        this.f23336a = 1;
        this.f23338c = context.getApplicationContext();
        this.f23337b = fVar;
    }

    public C2872b(Context context, r rVar) {
        this.f23336a = 4;
        this.f23338c = context.getApplicationContext();
        this.f23337b = rVar;
    }
}
