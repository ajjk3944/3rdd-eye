package wc;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class g extends fe.s {

    /* renamed from: d, reason: collision with root package name */
    private final f f64834d = f.BLE;

    /* renamed from: e, reason: collision with root package name */
    private final String f64835e = "BluetoothScanModeOperator " + hashCode();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64836a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.BLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.BLE_AND_CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64836a = iArr;
        }
    }

    @Override // fe.s
    protected String i() {
        return this.f64835e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fe.s
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f f() {
        return this.f64834d;
    }

    @Override // fe.s
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int j(f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        int i10 = a.f64836a[fVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
