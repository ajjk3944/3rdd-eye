package nm;

import ak.j1;
import ak.k1;
import ak.p;
import ak.y;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final el.b f18466a;

    /* renamed from: b, reason: collision with root package name */
    public final zj.a f18467b;

    public e(el.b bVar, zj.a aVar) {
        l.e(bVar, "firebaseManager");
        this.f18466a = bVar;
        this.f18467b = aVar;
    }

    public final j1 a() {
        String str = this.f18466a.E;
        if (str.length() == 0) {
            return p.b();
        }
        j1 j1VarA = this.f18467b.a(new JSONObject(str), p.b());
        List list = j1VarA.j;
        if (list.isEmpty()) {
            return p.b();
        }
        int iNextInt = new Random().nextInt(100) + 1;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            int i12 = ((k1) list.get(i10)).f602a;
            if (iNextInt > i11 && iNextInt <= i12 + i11) {
                break;
            }
            i11 += i12;
            i10++;
        }
        List listH = e5.H(k1.a((k1) list.get(i10), 62));
        int i13 = j1VarA.f579a;
        int i14 = j1VarA.f580b;
        int i15 = j1VarA.f581c;
        int i16 = j1VarA.f582d;
        long j = j1VarA.f583e;
        long j7 = j1VarA.f584f;
        long j10 = j1VarA.f585g;
        long j11 = j1VarA.f586h;
        long j12 = j1VarA.f587i;
        long j13 = j1VarA.k;
        String str2 = j1VarA.f588l;
        boolean z10 = j1VarA.f589m;
        int i17 = j1VarA.f590n;
        y yVar = j1VarA.f591o;
        String str3 = j1VarA.f592p;
        String str4 = j1VarA.f593q;
        String str5 = j1VarA.f594r;
        ak.a aVar = j1VarA.f595s;
        String str6 = j1VarA.f596t;
        String str7 = j1VarA.f597u;
        long j14 = j1VarA.f598v;
        l.e(str2, "youtubeUrlFormat");
        l.e(str3, "youtubeConsentUrl");
        l.e(str4, "youtubePlayerResponseRegex");
        l.e(str5, "youtubeConsentFormParamsRegex");
        l.e(str6, "remoteUrlEndpoint");
        return new j1(i13, i14, i15, i16, j, j7, j10, j11, j12, listH, j13, str2, z10, i17, yVar, str3, str4, str5, aVar, str6, str7, j14);
    }
}
