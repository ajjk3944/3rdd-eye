package javax.jmdns;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.jmdns.impl.JmmDNSImpl;

/* loaded from: classes4.dex */
public interface JmmDNS extends Closeable {

    public static final class Factory {
        private static final AtomicReference<ClassDelegate> _databaseClassDelegate = new AtomicReference<>();
        private static volatile JmmDNS _instance;

        public interface ClassDelegate {
            JmmDNS newJmmDNS();
        }

        private Factory() {
        }

        public static ClassDelegate classDelegate() {
            return _databaseClassDelegate.get();
        }

        public static void close() throws IOException {
            synchronized (Factory.class) {
                _instance.close();
                _instance = null;
            }
        }

        public static JmmDNS getInstance() {
            JmmDNS jmmDNS;
            synchronized (Factory.class) {
                try {
                    if (_instance == null) {
                        _instance = newJmmDNS();
                    }
                    jmmDNS = _instance;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jmmDNS;
        }

        public static JmmDNS newJmmDNS() {
            ClassDelegate classDelegate = _databaseClassDelegate.get();
            JmmDNS jmmDNSNewJmmDNS = classDelegate != null ? classDelegate.newJmmDNS() : null;
            return jmmDNSNewJmmDNS != null ? jmmDNSNewJmmDNS : new JmmDNSImpl();
        }

        public static void setClassDelegate(ClassDelegate classDelegate) {
            _databaseClassDelegate.set(classDelegate);
        }
    }

    void addNetworkTopologyListener(NetworkTopologyListener networkTopologyListener);

    void addServiceListener(String str, ServiceListener serviceListener);

    void addServiceTypeListener(ServiceTypeListener serviceTypeListener) throws IOException;

    JmDNS[] getDNS();

    String[] getHostNames();

    InetAddress[] getInetAddresses() throws IOException;

    @Deprecated
    InetAddress[] getInterfaces() throws IOException;

    String[] getNames();

    ServiceInfo[] getServiceInfos(String str, String str2);

    ServiceInfo[] getServiceInfos(String str, String str2, long j10);

    ServiceInfo[] getServiceInfos(String str, String str2, boolean z10);

    ServiceInfo[] getServiceInfos(String str, String str2, boolean z10, long j10);

    ServiceInfo[] list(String str);

    ServiceInfo[] list(String str, long j10);

    Map<String, ServiceInfo[]> listBySubtype(String str);

    Map<String, ServiceInfo[]> listBySubtype(String str, long j10);

    NetworkTopologyListener[] networkListeners();

    void registerService(ServiceInfo serviceInfo) throws IOException;

    void registerServiceType(String str);

    void removeNetworkTopologyListener(NetworkTopologyListener networkTopologyListener);

    void removeServiceListener(String str, ServiceListener serviceListener);

    void removeServiceTypeListener(ServiceTypeListener serviceTypeListener);

    void requestServiceInfo(String str, String str2);

    void requestServiceInfo(String str, String str2, long j10);

    void requestServiceInfo(String str, String str2, boolean z10);

    void requestServiceInfo(String str, String str2, boolean z10, long j10);

    void unregisterAllServices();

    void unregisterService(ServiceInfo serviceInfo);
}
