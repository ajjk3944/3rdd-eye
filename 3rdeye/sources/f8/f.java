package f8;

import A9.E;
import android.content.SharedPreferences;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.i;
import k8.G;
import p9.p;

/* compiled from: PremiumViewModel.kt */
@h9.e(c = "com.zipoapps.premium.PremiumViewModel$fetchProductInfo$1", f = "PremiumViewModel.kt", l = {105, 114, 168}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public G f37852l;

    /* renamed from: m, reason: collision with root package name */
    public String f37853m;

    /* renamed from: n, reason: collision with root package name */
    public String f37854n;

    /* renamed from: o, reason: collision with root package name */
    public String f37855o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f37856p;

    /* renamed from: q, reason: collision with root package name */
    public int f37857q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC4342e f37858r;

    /* compiled from: PremiumViewModel.kt */
    @h9.e(c = "com.zipoapps.premium.PremiumViewModel$fetchProductInfo$1$1", f = "PremiumViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC4342e f37859l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4342e abstractC4342e, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37859l = abstractC4342e;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f37859l, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            n.b(obj);
            AbstractC4342e abstractC4342e = this.f37859l;
            if (abstractC4342e.f37844o == null) {
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                SharedPreferences sharedPreferences = e.a.a().f37010B.f136b.f37004a;
                if (sharedPreferences.getLong("one_time_offer_start_time", 0L) == 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong("one_time_offer_start_time", jCurrentTimeMillis);
                    editorEdit.apply();
                }
                h hVar = new h((e.a.a().i.f37004a.getLong("one_time_offer_start_time", 0L) + com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) - System.currentTimeMillis(), abstractC4342e);
                abstractC4342e.f37844o = hVar;
                hVar.start();
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AbstractC4342e abstractC4342e, InterfaceC4347e<? super f> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f37858r = abstractC4342e;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new f(this.f37858r, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((f) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0195 A[Catch: all -> 0x0025, Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:8:0x0020, B:112:0x01d4, B:114:0x01ed, B:115:0x01ff, B:15:0x0032, B:50:0x00d0, B:53:0x00d6, B:59:0x00ea, B:63:0x00f8, B:65:0x010a, B:69:0x0117, B:71:0x011b, B:80:0x0146, B:83:0x014e, B:85:0x0152, B:92:0x016d, B:98:0x0186, B:103:0x0195, B:104:0x01a1, B:107:0x01a9, B:97:0x0179, B:86:0x0158, B:88:0x015c, B:90:0x0166, B:73:0x0125, B:75:0x0129, B:77:0x0134, B:79:0x013b, B:64:0x0103, B:56:0x00df, B:57:0x00e8, B:16:0x003a, B:38:0x009d, B:40:0x00a7, B:42:0x00af, B:44:0x00b3, B:47:0x00b9, B:117:0x0222, B:118:0x022b, B:19:0x0043, B:21:0x0050, B:25:0x0061, B:26:0x0063, B:28:0x0074, B:29:0x0076, B:31:0x007c, B:33:0x0080, B:35:0x0085, B:34:0x0083), top: B:125:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ed A[Catch: all -> 0x0025, Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:8:0x0020, B:112:0x01d4, B:114:0x01ed, B:115:0x01ff, B:15:0x0032, B:50:0x00d0, B:53:0x00d6, B:59:0x00ea, B:63:0x00f8, B:65:0x010a, B:69:0x0117, B:71:0x011b, B:80:0x0146, B:83:0x014e, B:85:0x0152, B:92:0x016d, B:98:0x0186, B:103:0x0195, B:104:0x01a1, B:107:0x01a9, B:97:0x0179, B:86:0x0158, B:88:0x015c, B:90:0x0166, B:73:0x0125, B:75:0x0129, B:77:0x0134, B:79:0x013b, B:64:0x0103, B:56:0x00df, B:57:0x00e8, B:16:0x003a, B:38:0x009d, B:40:0x00a7, B:42:0x00af, B:44:0x00b3, B:47:0x00b9, B:117:0x0222, B:118:0x022b, B:19:0x0043, B:21:0x0050, B:25:0x0061, B:26:0x0063, B:28:0x0074, B:29:0x0076, B:31:0x007c, B:33:0x0080, B:35:0x0085, B:34:0x0083), top: B:125:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[Catch: all -> 0x0025, Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:8:0x0020, B:112:0x01d4, B:114:0x01ed, B:115:0x01ff, B:15:0x0032, B:50:0x00d0, B:53:0x00d6, B:59:0x00ea, B:63:0x00f8, B:65:0x010a, B:69:0x0117, B:71:0x011b, B:80:0x0146, B:83:0x014e, B:85:0x0152, B:92:0x016d, B:98:0x0186, B:103:0x0195, B:104:0x01a1, B:107:0x01a9, B:97:0x0179, B:86:0x0158, B:88:0x015c, B:90:0x0166, B:73:0x0125, B:75:0x0129, B:77:0x0134, B:79:0x013b, B:64:0x0103, B:56:0x00df, B:57:0x00e8, B:16:0x003a, B:38:0x009d, B:40:0x00a7, B:42:0x00af, B:44:0x00b3, B:47:0x00b9, B:117:0x0222, B:118:0x022b, B:19:0x0043, B:21:0x0050, B:25:0x0061, B:26:0x0063, B:28:0x0074, B:29:0x0076, B:31:0x007c, B:33:0x0080, B:35:0x0085, B:34:0x0083), top: B:125:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103 A[Catch: all -> 0x0025, Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:8:0x0020, B:112:0x01d4, B:114:0x01ed, B:115:0x01ff, B:15:0x0032, B:50:0x00d0, B:53:0x00d6, B:59:0x00ea, B:63:0x00f8, B:65:0x010a, B:69:0x0117, B:71:0x011b, B:80:0x0146, B:83:0x014e, B:85:0x0152, B:92:0x016d, B:98:0x0186, B:103:0x0195, B:104:0x01a1, B:107:0x01a9, B:97:0x0179, B:86:0x0158, B:88:0x015c, B:90:0x0166, B:73:0x0125, B:75:0x0129, B:77:0x0134, B:79:0x013b, B:64:0x0103, B:56:0x00df, B:57:0x00e8, B:16:0x003a, B:38:0x009d, B:40:0x00a7, B:42:0x00af, B:44:0x00b3, B:47:0x00b9, B:117:0x0222, B:118:0x022b, B:19:0x0043, B:21:0x0050, B:25:0x0061, B:26:0x0063, B:28:0x0074, B:29:0x0076, B:31:0x007c, B:33:0x0080, B:35:0x0085, B:34:0x0083), top: B:125:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013b A[Catch: all -> 0x0025, Exception -> 0x022c, TryCatch #0 {Exception -> 0x022c, blocks: (B:8:0x0020, B:112:0x01d4, B:114:0x01ed, B:115:0x01ff, B:15:0x0032, B:50:0x00d0, B:53:0x00d6, B:59:0x00ea, B:63:0x00f8, B:65:0x010a, B:69:0x0117, B:71:0x011b, B:80:0x0146, B:83:0x014e, B:85:0x0152, B:92:0x016d, B:98:0x0186, B:103:0x0195, B:104:0x01a1, B:107:0x01a9, B:97:0x0179, B:86:0x0158, B:88:0x015c, B:90:0x0166, B:73:0x0125, B:75:0x0129, B:77:0x0134, B:79:0x013b, B:64:0x0103, B:56:0x00df, B:57:0x00e8, B:16:0x003a, B:38:0x009d, B:40:0x00a7, B:42:0x00af, B:44:0x00b3, B:47:0x00b9, B:117:0x0222, B:118:0x022b, B:19:0x0043, B:21:0x0050, B:25:0x0061, B:26:0x0063, B:28:0x0074, B:29:0x0076, B:31:0x007c, B:33:0x0080, B:35:0x0085, B:34:0x0083), top: B:125:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0179 A[Catch: all -> 0x0025, Exception -> 0x022c, TRY_ENTER, TryCatch #0 {Exception -> 0x022c, blocks: (B:8:0x0020, B:112:0x01d4, B:114:0x01ed, B:115:0x01ff, B:15:0x0032, B:50:0x00d0, B:53:0x00d6, B:59:0x00ea, B:63:0x00f8, B:65:0x010a, B:69:0x0117, B:71:0x011b, B:80:0x0146, B:83:0x014e, B:85:0x0152, B:92:0x016d, B:98:0x0186, B:103:0x0195, B:104:0x01a1, B:107:0x01a9, B:97:0x0179, B:86:0x0158, B:88:0x015c, B:90:0x0166, B:73:0x0125, B:75:0x0129, B:77:0x0134, B:79:0x013b, B:64:0x0103, B:56:0x00df, B:57:0x00e8, B:16:0x003a, B:38:0x009d, B:40:0x00a7, B:42:0x00af, B:44:0x00b3, B:47:0x00b9, B:117:0x0222, B:118:0x022b, B:19:0x0043, B:21:0x0050, B:25:0x0061, B:26:0x0063, B:28:0x0074, B:29:0x0076, B:31:0x007c, B:33:0x0080, B:35:0x0085, B:34:0x0083), top: B:125:0x000c, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.CharSequence[]] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
