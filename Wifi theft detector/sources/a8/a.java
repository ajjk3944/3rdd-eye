package a8;

import android.os.AsyncTask;
import b8.c;
import com.wifi.netdiscovery.data.HostInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public List f177a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f178b = Executors.newFixedThreadPool(4);

    /* renamed from: a8.a$a, reason: collision with other inner class name */
    public class RunnableC0002a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f179a;

        public RunnableC0002a(List list) {
            this.f179a = list;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException, IOException {
            try {
                DatagramChannel datagramChannelOpen = DatagramChannel.open();
                datagramChannelOpen.configureBlocking(false);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                for (String str : this.f179a) {
                    try {
                        byteBufferAllocate.clear();
                        datagramChannelOpen.send(byteBufferAllocate, new InetSocketAddress(InetAddress.getByName(str), 137));
                        Thread.sleep(10L);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e10) {
                c.a("DiscoveryTask executeSubQuery exception", e10);
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voidArr) {
        if (this.f177a == null) {
            return null;
        }
        d();
        return null;
    }

    public final void b(List list) {
        this.f178b.execute(new RunnableC0002a(list));
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(HostInfo... hostInfoArr) {
        super.onProgressUpdate(hostInfoArr);
    }

    public final void d() {
        e(this.f177a);
    }

    public final void e(List list) {
        if (list != null) {
            int i10 = 0;
            while (i10 < 4) {
                try {
                    int size = (list.size() * i10) / 4;
                    i10++;
                    b(list.subList(size, (list.size() * i10) / 4));
                } catch (Exception e10) {
                    c.a("DiscoveryTask sendQueryInfo exception", e10);
                    return;
                }
            }
        }
    }

    public void f(List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f177a = Collections.synchronizedList(list);
        executeOnExecutor(this.f178b, new Void[0]);
    }
}
