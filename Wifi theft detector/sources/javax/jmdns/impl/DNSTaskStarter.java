package javax.jmdns.impl;

import java.net.InetAddress;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.jmdns.impl.tasks.RecordReaper;
import javax.jmdns.impl.tasks.Responder;
import javax.jmdns.impl.tasks.resolver.ServiceInfoResolver;
import javax.jmdns.impl.tasks.resolver.ServiceResolver;
import javax.jmdns.impl.tasks.resolver.TypeResolver;
import javax.jmdns.impl.tasks.state.Announcer;
import javax.jmdns.impl.tasks.state.Canceler;
import javax.jmdns.impl.tasks.state.Prober;
import javax.jmdns.impl.tasks.state.Renewer;

/* loaded from: classes4.dex */
public interface DNSTaskStarter {

    public static final class DNSTaskStarterImpl implements DNSTaskStarter {
        private final JmDNSImpl _jmDNSImpl;
        private final Timer _stateTimer;
        private final Timer _timer;

        public DNSTaskStarterImpl(JmDNSImpl jmDNSImpl) {
            this._jmDNSImpl = jmDNSImpl;
            this._timer = new StarterTimer("JmDNS(" + jmDNSImpl.getName() + ").Timer", true);
            this._stateTimer = new StarterTimer("JmDNS(" + jmDNSImpl.getName() + ").State.Timer", true);
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void cancelStateTimer() {
            this._stateTimer.cancel();
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void cancelTimer() {
            this._timer.cancel();
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void purgeStateTimer() {
            this._stateTimer.purge();
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void purgeTimer() {
            this._timer.purge();
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void startAnnouncer() {
            new Announcer(this._jmDNSImpl).start(this._stateTimer);
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void startCanceler() {
            new Canceler(this._jmDNSImpl).start(this._stateTimer);
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void startProber() {
            new Prober(this._jmDNSImpl).start(this._stateTimer);
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void startReaper() {
            new RecordReaper(this._jmDNSImpl).start(this._timer);
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void startRenewer() {
            new Renewer(this._jmDNSImpl).start(this._stateTimer);
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void startResponder(DNSIncoming dNSIncoming, InetAddress inetAddress, int i10) {
            new Responder(this._jmDNSImpl, dNSIncoming, inetAddress, i10).start(this._timer);
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void startServiceInfoResolver(ServiceInfoImpl serviceInfoImpl) {
            new ServiceInfoResolver(this._jmDNSImpl, serviceInfoImpl).start(this._timer);
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void startServiceResolver(String str) {
            new ServiceResolver(this._jmDNSImpl, str).start(this._timer);
        }

        @Override // javax.jmdns.impl.DNSTaskStarter
        public void startTypeResolver() {
            new TypeResolver(this._jmDNSImpl).start(this._timer);
        }

        public static class StarterTimer extends Timer {
            private volatile boolean _cancelled;

            public StarterTimer() {
                this._cancelled = false;
            }

            @Override // java.util.Timer
            public synchronized void cancel() {
                if (this._cancelled) {
                    return;
                }
                this._cancelled = true;
                super.cancel();
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j10) {
                if (this._cancelled) {
                    return;
                }
                super.schedule(timerTask, j10);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, long j10, long j11) throws Throwable {
                try {
                    if (this._cancelled) {
                        return;
                    }
                    super.scheduleAtFixedRate(timerTask, j10, j11);
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }

            public StarterTimer(boolean z10) {
                super(z10);
                this._cancelled = false;
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date) {
                if (this._cancelled) {
                    return;
                }
                super.schedule(timerTask, date);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j10) {
                if (this._cancelled) {
                    return;
                }
                super.scheduleAtFixedRate(timerTask, date, j10);
            }

            public StarterTimer(String str, boolean z10) {
                super(str, z10);
                this._cancelled = false;
            }

            public StarterTimer(String str) {
                super(str);
                this._cancelled = false;
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j10, long j11) throws Throwable {
                try {
                    if (this._cancelled) {
                        return;
                    }
                    super.schedule(timerTask, j10, j11);
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date, long j10) {
                if (this._cancelled) {
                    return;
                }
                super.schedule(timerTask, date, j10);
            }
        }
    }

    public static final class Factory {
        private static final AtomicReference<ClassDelegate> _databaseClassDelegate = new AtomicReference<>();
        private static volatile Factory _instance;
        private final ConcurrentMap<JmDNSImpl, DNSTaskStarter> _instances = new ConcurrentHashMap(20);

        public interface ClassDelegate {
            DNSTaskStarter newDNSTaskStarter(JmDNSImpl jmDNSImpl);
        }

        private Factory() {
        }

        public static ClassDelegate classDelegate() {
            return _databaseClassDelegate.get();
        }

        public static Factory getInstance() {
            if (_instance == null) {
                synchronized (Factory.class) {
                    try {
                        if (_instance == null) {
                            _instance = new Factory();
                        }
                    } finally {
                    }
                }
            }
            return _instance;
        }

        public static DNSTaskStarter newDNSTaskStarter(JmDNSImpl jmDNSImpl) {
            ClassDelegate classDelegate = _databaseClassDelegate.get();
            DNSTaskStarter dNSTaskStarterNewDNSTaskStarter = classDelegate != null ? classDelegate.newDNSTaskStarter(jmDNSImpl) : null;
            return dNSTaskStarterNewDNSTaskStarter != null ? dNSTaskStarterNewDNSTaskStarter : new DNSTaskStarterImpl(jmDNSImpl);
        }

        public static void setClassDelegate(ClassDelegate classDelegate) {
            _databaseClassDelegate.set(classDelegate);
        }

        public void disposeStarter(JmDNSImpl jmDNSImpl) {
            this._instances.remove(jmDNSImpl);
        }

        public DNSTaskStarter getStarter(JmDNSImpl jmDNSImpl) {
            DNSTaskStarter dNSTaskStarter = this._instances.get(jmDNSImpl);
            if (dNSTaskStarter != null) {
                return dNSTaskStarter;
            }
            this._instances.putIfAbsent(jmDNSImpl, newDNSTaskStarter(jmDNSImpl));
            return this._instances.get(jmDNSImpl);
        }
    }

    void cancelStateTimer();

    void cancelTimer();

    void purgeStateTimer();

    void purgeTimer();

    void startAnnouncer();

    void startCanceler();

    void startProber();

    void startReaper();

    void startRenewer();

    void startResponder(DNSIncoming dNSIncoming, InetAddress inetAddress, int i10);

    void startServiceInfoResolver(ServiceInfoImpl serviceInfoImpl);

    void startServiceResolver(String str);

    void startTypeResolver();
}
