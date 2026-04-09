package ih;

import ch.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class m {
    public long B;
    public long C;

    /* renamed from: h, reason: collision with root package name */
    public long f11416h;

    /* renamed from: i, reason: collision with root package name */
    public long f11417i;
    public long j;

    /* renamed from: o, reason: collision with root package name */
    public int f11421o;

    /* renamed from: p, reason: collision with root package name */
    public int f11422p;

    /* renamed from: r, reason: collision with root package name */
    public final int f11424r;

    /* renamed from: s, reason: collision with root package name */
    public final int f11425s;

    /* renamed from: t, reason: collision with root package name */
    public long f11426t;

    /* renamed from: u, reason: collision with root package name */
    public long f11427u;

    /* renamed from: v, reason: collision with root package name */
    public long f11428v;

    /* renamed from: w, reason: collision with root package name */
    public List f11429w;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f11409a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f11410b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f11411c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f11412d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f11413e = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f11414f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f11415g = new CopyOnWriteArrayList();
    public String k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f11418l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f11419m = "";

    /* renamed from: n, reason: collision with root package name */
    public String f11420n = "";

    /* renamed from: q, reason: collision with root package name */
    public l f11423q = l.OS_TRAFFIC;

    /* renamed from: x, reason: collision with root package name */
    public long f11430x = -1;

    /* renamed from: y, reason: collision with root package name */
    public long f11431y = -1;

    /* renamed from: z, reason: collision with root package name */
    public String f11432z = "unknown";
    public String A = "unknown";

    public m(int i10, int i11, List list) {
        this.f11424r = i10;
        this.f11425s = i11;
        this.f11429w = list;
    }

    public static synchronized float h(int i10, List list) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        Object[] array = list.toArray();
        int length = array.length;
        Arrays.sort(array);
        if (i10 == 50) {
            int iFloor = (int) Math.floor(length / 2.0f);
            if (length % 2 == 0) {
                return (((Float) array[iFloor - 1]).floatValue() + ((Float) array[iFloor]).floatValue()) / 2.0f;
            }
            return ((Float) array[iFloor]).floatValue();
        }
        int iFloor2 = (int) Math.floor((i10 * length) / 100.0f);
        int i11 = length - iFloor2;
        int i12 = 0;
        float fFloatValue = 0.0f;
        while (iFloor2 < i11) {
            fFloatValue += ((Float) array[iFloor2]).floatValue();
            i12++;
            iFloor2++;
        }
        if (i12 == 0) {
            return 0.0f;
        }
        return fFloatValue / i12;
    }

    public static String i(CopyOnWriteArrayList copyOnWriteArrayList) {
        try {
            return new JSONArray((Collection) copyOnWriteArrayList).toString();
        } catch (ConcurrentModificationException e4) {
            n.d("SpeedMeasurementResult", "Something has gone wrong with concurrency upstream", e4);
            return "";
        }
    }

    public static ArrayList j(CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2) {
        ArrayList arrayList = new ArrayList();
        int size = copyOnWriteArrayList.size();
        if (!copyOnWriteArrayList.contains(null) && !copyOnWriteArrayList2.contains(null) && size != 0) {
            int size2 = copyOnWriteArrayList2.size();
            if (size != size2) {
                n.b("SpeedMeasurementResult", "numSize != denomSize");
                size = Math.min(size, size2);
            }
            if (size != 0) {
                if (((Long) copyOnWriteArrayList2.get(0)).longValue() > 0) {
                    arrayList.add(Float.valueOf(((Long) copyOnWriteArrayList.get(0)).longValue() / ((Long) copyOnWriteArrayList2.get(0)).longValue()));
                }
                if (size != 1) {
                    long jLongValue = 0;
                    long jLongValue2 = 0;
                    for (int i10 = 1; i10 < size; i10++) {
                        int i11 = i10 - 1;
                        if (((Long) copyOnWriteArrayList2.get(i10)).longValue() - ((Long) copyOnWriteArrayList2.get(i11)).longValue() > 0) {
                            jLongValue = ((Long) copyOnWriteArrayList2.get(i11)).longValue();
                            jLongValue2 = ((Long) copyOnWriteArrayList.get(i11)).longValue();
                        }
                        arrayList.add(Float.valueOf((((Long) copyOnWriteArrayList.get(i10)).longValue() - jLongValue2) / (((Long) copyOnWriteArrayList2.get(i10)).longValue() - jLongValue)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void a(long j) {
        this.f11426t = j;
        this.f11411c.add(Long.valueOf(j));
    }

    public final synchronized void b(long j) {
        this.f11416h = j;
        this.f11410b.add(Long.valueOf(j));
    }

    public final synchronized void c(long j) {
        this.f11428v = j;
        this.f11415g.add(Long.valueOf(j));
    }

    public final synchronized void d(long j) {
        this.j = j;
        this.f11414f.add(Long.valueOf(j));
    }

    public final synchronized void e(long j) {
        this.f11427u = j;
        this.f11413e.add(Long.valueOf(j));
    }

    public final synchronized void f(long j) {
        this.f11417i = j;
        this.f11412d.add(Long.valueOf(j));
    }

    public final long g() {
        return Math.round(h(10, j(this.f11414f, this.f11415g)) * 8.0f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpeedMeasurementResult{mHttpLatencies=");
        sb2.append(this.f11409a);
        sb2.append(", mDownloadFileSizes=");
        sb2.append(this.f11410b);
        sb2.append(", mDownloadTimes=");
        sb2.append(this.f11411c);
        sb2.append(", mUploadTransferFileSizes=");
        sb2.append(this.f11412d);
        sb2.append(", mUploadTransferTimes=");
        sb2.append(this.f11413e);
        sb2.append(", mUploadBufferFileSizes=");
        sb2.append(this.f11414f);
        sb2.append(", mUploadBufferTimes=");
        sb2.append(this.f11415g);
        sb2.append(", mDownloadFileSize=");
        sb2.append(this.f11416h);
        sb2.append(", mUploadTransferFileSize=");
        sb2.append(this.f11417i);
        sb2.append(", mUploadBufferFileSize=");
        sb2.append(this.j);
        sb2.append(", mDownloadIp='");
        sb2.append(this.k);
        sb2.append("', mUploadIp='");
        sb2.append(this.f11418l);
        sb2.append("', mDownloadHost='");
        sb2.append(this.f11419m);
        sb2.append("', mUploadHost='");
        sb2.append(this.f11420n);
        sb2.append("', mDownloadThreadsCount=");
        sb2.append(this.f11421o);
        sb2.append(", mUploadThreadsCount=");
        sb2.append(this.f11422p);
        sb2.append(", mUnreliableDownload=0, mUnreliableUpload=0, mUnreliableLatency=0, mUploadMonitorType=");
        sb2.append(this.f11423q);
        sb2.append(", mNetworkConnectionType=");
        sb2.append(this.f11424r);
        sb2.append(", mNetworkType=");
        sb2.append(this.f11425s);
        sb2.append(", mDownloadElapsedTime=");
        sb2.append(this.f11426t);
        sb2.append(", mUploadTransferElapsedTime=");
        sb2.append(this.f11427u);
        sb2.append(", mUploadBufferElapsedTime=");
        sb2.append(this.f11428v);
        sb2.append(", mLatencyTestResults=");
        sb2.append(this.f11429w);
        sb2.append(", mDownloadTimeResponse=");
        sb2.append(this.f11430x);
        sb2.append(", mUploadTimeResponse=");
        sb2.append(this.f11431y);
        sb2.append(", mUploadCdnName='");
        sb2.append(this.f11432z);
        sb2.append("', mDownloadCdnName='");
        sb2.append(this.A);
        sb2.append("', mHasReadLatestLatency=false, mHasReadLatestUploadSpeed=false, mHasReadLatestDownloadSpeed=false, mUploadTestDuration='");
        sb2.append(this.C);
        sb2.append("', mDownloadTestDuration='");
        return c7.a.n(this.B, "'}", sb2);
    }
}
