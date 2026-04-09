package javax.jmdns.impl.tasks.state;

import java.io.IOException;
import java.util.Iterator;
import java.util.Timer;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.DNSQuestion;
import javax.jmdns.impl.DNSRecord;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import javax.jmdns.impl.constants.DNSState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xbill.DNS.Type;

/* loaded from: classes4.dex */
public class Prober extends DNSStateTask {
    static Logger logger = LoggerFactory.getLogger(Prober.class.getName());

    public Prober(JmDNSImpl jmDNSImpl) {
        super(jmDNSImpl, DNSStateTask.defaultTTL());
        DNSState dNSState = DNSState.PROBING_1;
        setTaskState(dNSState);
        associate(dNSState);
    }

    @Override // javax.jmdns.impl.tasks.state.DNSStateTask
    public void advanceTask() {
        setTaskState(getTaskState().advance());
        if (getTaskState().isProbing()) {
            return;
        }
        cancel();
        getDns().startAnnouncer();
    }

    @Override // javax.jmdns.impl.tasks.state.DNSStateTask
    public DNSOutgoing buildOutgoingForDNS(DNSOutgoing dNSOutgoing) throws IOException {
        dNSOutgoing.addQuestion(DNSQuestion.newQuestion(getDns().getLocalHost().getName(), DNSRecordType.TYPE_ANY, DNSRecordClass.CLASS_IN, false));
        Iterator<DNSRecord> it = getDns().getLocalHost().answers(DNSRecordClass.CLASS_ANY, false, getTTL()).iterator();
        while (it.hasNext()) {
            dNSOutgoing = addAuthoritativeAnswer(dNSOutgoing, it.next());
        }
        return dNSOutgoing;
    }

    @Override // javax.jmdns.impl.tasks.state.DNSStateTask
    public DNSOutgoing buildOutgoingForInfo(ServiceInfoImpl serviceInfoImpl, DNSOutgoing dNSOutgoing) throws IOException {
        String qualifiedName = serviceInfoImpl.getQualifiedName();
        DNSRecordType dNSRecordType = DNSRecordType.TYPE_ANY;
        DNSRecordClass dNSRecordClass = DNSRecordClass.CLASS_IN;
        return addAuthoritativeAnswer(addQuestion(dNSOutgoing, DNSQuestion.newQuestion(qualifiedName, dNSRecordType, dNSRecordClass, false)), new DNSRecord.Service(serviceInfoImpl.getQualifiedName(), dNSRecordClass, false, getTTL(), serviceInfoImpl.getPriority(), serviceInfoImpl.getWeight(), serviceInfoImpl.getPort(), getDns().getLocalHost().getName()));
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        removeAssociation();
        return super.cancel();
    }

    @Override // javax.jmdns.impl.tasks.state.DNSStateTask
    public boolean checkRunCondition() {
        return (getDns().isCanceling() || getDns().isCanceled()) ? false : true;
    }

    @Override // javax.jmdns.impl.tasks.state.DNSStateTask
    public DNSOutgoing createOugoing() {
        return new DNSOutgoing(0);
    }

    @Override // javax.jmdns.impl.tasks.DNSTask
    public String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prober(");
        sb.append(getDns() != null ? getDns().getName() : "");
        sb.append(")");
        return sb.toString();
    }

    @Override // javax.jmdns.impl.tasks.state.DNSStateTask
    public String getTaskDescription() {
        return "probing";
    }

    @Override // javax.jmdns.impl.tasks.state.DNSStateTask
    public void recoverTask(Throwable th) {
        getDns().recover();
    }

    @Override // javax.jmdns.impl.tasks.DNSTask
    public void start(Timer timer) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - getDns().getLastThrottleIncrement() < 5000) {
            getDns().setThrottle(getDns().getThrottle() + 1);
        } else {
            getDns().setThrottle(1);
        }
        getDns().setLastThrottleIncrement(jCurrentTimeMillis);
        if (getDns().isAnnounced() && getDns().getThrottle() < 10) {
            timer.schedule(this, JmDNSImpl.getRandom().nextInt(Type.IXFR), 250L);
        } else {
            if (getDns().isCanceling() || getDns().isCanceled()) {
                return;
            }
            timer.schedule(this, 1000L, 1000L);
        }
    }

    @Override // javax.jmdns.impl.tasks.DNSTask
    public String toString() {
        return super.toString() + " state: " + getTaskState();
    }
}
