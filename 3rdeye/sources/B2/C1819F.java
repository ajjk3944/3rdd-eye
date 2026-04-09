package b2;

import android.net.Uri;
import android.os.Build;
import androidx.work.d;
import androidx.work.t;
import b9.C1992A;
import g0.C4356c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: WorkTypeConverters.kt */
/* renamed from: b2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819F {

    /* compiled from: WorkTypeConverters.kt */
    /* renamed from: b2.F$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17108a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f17109b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f17110c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f17111d;

        static {
            int[] iArr = new int[t.b.values().length];
            try {
                iArr[t.b.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.b.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.b.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.b.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.b.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.b.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f17108a = iArr;
            int[] iArr2 = new int[androidx.work.a.values().length];
            try {
                iArr2[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f17109b = iArr2;
            int[] iArr3 = new int[androidx.work.n.values().length];
            try {
                iArr3[androidx.work.n.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[androidx.work.n.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[androidx.work.n.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[androidx.work.n.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[androidx.work.n.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f17110c = iArr3;
            int[] iArr4 = new int[androidx.work.r.values().length];
            try {
                iArr4[androidx.work.r.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[androidx.work.r.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f17111d = iArr4;
        }
    }

    public static final int a(androidx.work.a backoffPolicy) {
        kotlin.jvm.internal.l.f(backoffPolicy, "backoffPolicy");
        int i = a.f17109b[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new b9.j();
    }

    public static final LinkedHashSet b(byte[] bytes) throws IOException {
        ObjectInputStream objectInputStream;
        kotlin.jvm.internal.l.f(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                try {
                    int i = objectInputStream.readInt();
                    for (int i10 = 0; i10 < i; i10++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        kotlin.jvm.internal.l.e(uri, "uri");
                        linkedHashSet.add(new d.a(z10, uri));
                    }
                    C1992A c1992a = C1992A.f18074a;
                    objectInputStream.close();
                    C1992A c1992a2 = C1992A.f18074a;
                    byteArrayInputStream.close();
                } finally {
                }
            } finally {
            }
        }
        return linkedHashSet;
    }

    public static final androidx.work.a c(int i) {
        if (i == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException(C4356c.i(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final androidx.work.n d(int i) {
        if (i == 0) {
            return androidx.work.n.NOT_REQUIRED;
        }
        if (i == 1) {
            return androidx.work.n.CONNECTED;
        }
        if (i == 2) {
            return androidx.work.n.UNMETERED;
        }
        if (i == 3) {
            return androidx.work.n.NOT_ROAMING;
        }
        if (i == 4) {
            return androidx.work.n.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(C4356c.i(i, "Could not convert ", " to NetworkType"));
        }
        return androidx.work.n.TEMPORARILY_UNMETERED;
    }

    public static final androidx.work.r e(int i) {
        if (i == 0) {
            return androidx.work.r.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return androidx.work.r.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(C4356c.i(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final t.b f(int i) {
        if (i == 0) {
            return t.b.ENQUEUED;
        }
        if (i == 1) {
            return t.b.RUNNING;
        }
        if (i == 2) {
            return t.b.SUCCEEDED;
        }
        if (i == 3) {
            return t.b.FAILED;
        }
        if (i == 4) {
            return t.b.BLOCKED;
        }
        if (i == 5) {
            return t.b.CANCELLED;
        }
        throw new IllegalArgumentException(C4356c.i(i, "Could not convert ", " to State"));
    }

    public static final int g(androidx.work.n networkType) {
        kotlin.jvm.internal.l.f(networkType, "networkType");
        int i = a.f17110c[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.n.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static final int h(androidx.work.r policy) {
        kotlin.jvm.internal.l.f(policy, "policy");
        int i = a.f17111d[policy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new b9.j();
    }

    public static final byte[] i(Set<d.a> triggers) throws IOException {
        kotlin.jvm.internal.l.f(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (d.a aVar : triggers) {
                    objectOutputStream.writeUTF(aVar.f16890a.toString());
                    objectOutputStream.writeBoolean(aVar.f16891b);
                }
                C1992A c1992a = C1992A.f18074a;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.l.e(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int j(t.b state) {
        kotlin.jvm.internal.l.f(state, "state");
        switch (a.f17108a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new b9.j();
        }
    }
}
