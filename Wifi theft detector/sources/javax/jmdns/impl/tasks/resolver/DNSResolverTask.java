package javax.jmdns.impl.tasks.resolver;

import java.io.IOException;
import java.util.Timer;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.tasks.DNSTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes4.dex */
public abstract class DNSResolverTask extends DNSTask {
    private static Logger logger = LoggerFactory.getLogger(DNSResolverTask.class.getName());
    protected int _count;

    public DNSResolverTask(JmDNSImpl jmDNSImpl) {
        super(jmDNSImpl);
        this._count = 0;
    }

    public abstract DNSOutgoing addAnswers(DNSOutgoing dNSOutgoing) throws IOException;

    public abstract DNSOutgoing addQuestions(DNSOutgoing dNSOutgoing) throws IOException;

    public abstract String description();

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            if (!getDns().isCanceling() && !getDns().isCanceled()) {
                int i10 = this._count;
                this._count = i10 + 1;
                if (i10 >= 3) {
                    cancel();
                    return;
                }
                if (logger.isDebugEnabled()) {
                    logger.debug(getName() + ".run() JmDNS " + description());
                }
                DNSOutgoing dNSOutgoingAddQuestions = addQuestions(new DNSOutgoing(0));
                if (getDns().isAnnounced()) {
                    dNSOutgoingAddQuestions = addAnswers(dNSOutgoingAddQuestions);
                }
                if (dNSOutgoingAddQuestions.isEmpty()) {
                    return;
                }
                getDns().send(dNSOutgoingAddQuestions);
                return;
            }
            cancel();
        } catch (Throwable th) {
            logger.warn(getName() + ".run() exception ", th);
            getDns().recover();
        }
    }

    @Override // javax.jmdns.impl.tasks.DNSTask
    public void start(Timer timer) {
        if (getDns().isCanceling() || getDns().isCanceled()) {
            return;
        }
        timer.schedule(this, 225L, 225L);
    }

    @Override // javax.jmdns.impl.tasks.DNSTask
    public String toString() {
        return super.toString() + " count: " + this._count;
    }
}
