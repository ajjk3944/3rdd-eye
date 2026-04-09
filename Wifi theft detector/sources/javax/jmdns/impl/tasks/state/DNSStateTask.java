package javax.jmdns.impl.tasks.state;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.DNSOutgoing;
import javax.jmdns.impl.DNSStatefulObject;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.ServiceInfoImpl;
import javax.jmdns.impl.constants.DNSConstants;
import javax.jmdns.impl.constants.DNSState;
import javax.jmdns.impl.tasks.DNSTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes4.dex */
public abstract class DNSStateTask extends DNSTask {
    private DNSState _taskState;
    private final int _ttl;
    static Logger logger1 = LoggerFactory.getLogger(DNSStateTask.class.getName());
    private static int _defaultTTL = DNSConstants.DNS_TTL;

    public DNSStateTask(JmDNSImpl jmDNSImpl, int i10) {
        super(jmDNSImpl);
        this._taskState = null;
        this._ttl = i10;
    }

    public static int defaultTTL() {
        return _defaultTTL;
    }

    public static void setDefaultTTL(int i10) {
        _defaultTTL = i10;
    }

    public void advanceObjectsState(List<DNSStatefulObject> list) {
        if (list != null) {
            for (DNSStatefulObject dNSStatefulObject : list) {
                synchronized (dNSStatefulObject) {
                    dNSStatefulObject.advanceState(this);
                }
            }
        }
    }

    public abstract void advanceTask();

    public void associate(DNSState dNSState) {
        synchronized (getDns()) {
            getDns().associateWithTask(this, dNSState);
        }
        Iterator<ServiceInfo> it = getDns().getServices().values().iterator();
        while (it.hasNext()) {
            ((ServiceInfoImpl) it.next()).associateWithTask(this, dNSState);
        }
    }

    public abstract DNSOutgoing buildOutgoingForDNS(DNSOutgoing dNSOutgoing) throws IOException;

    public abstract DNSOutgoing buildOutgoingForInfo(ServiceInfoImpl serviceInfoImpl, DNSOutgoing dNSOutgoing) throws IOException;

    public abstract boolean checkRunCondition();

    public abstract DNSOutgoing createOugoing();

    public int getTTL() {
        return this._ttl;
    }

    public abstract String getTaskDescription();

    public DNSState getTaskState() {
        return this._taskState;
    }

    public abstract void recoverTask(Throwable th);

    public void removeAssociation() {
        synchronized (getDns()) {
            getDns().removeAssociationWithTask(this);
        }
        Iterator<ServiceInfo> it = getDns().getServices().values().iterator();
        while (it.hasNext()) {
            ((ServiceInfoImpl) it.next()).removeAssociationWithTask(this);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        DNSOutgoing dNSOutgoingCreateOugoing = createOugoing();
        try {
        } catch (Throwable th) {
            logger1.warn(getName() + ".run() exception ", th);
            recoverTask(th);
        }
        if (!checkRunCondition()) {
            cancel();
            return;
        }
        List<DNSStatefulObject> arrayList = new ArrayList<>();
        synchronized (getDns()) {
            try {
                if (getDns().isAssociatedWithTask(this, getTaskState())) {
                    logger1.debug(getName() + ".run() JmDNS " + getTaskDescription() + " " + getDns().getName());
                    arrayList.add(getDns());
                    dNSOutgoingCreateOugoing = buildOutgoingForDNS(dNSOutgoingCreateOugoing);
                }
            } finally {
            }
        }
        Iterator<ServiceInfo> it = getDns().getServices().values().iterator();
        while (it.hasNext()) {
            ServiceInfoImpl serviceInfoImpl = (ServiceInfoImpl) it.next();
            synchronized (serviceInfoImpl) {
                try {
                    if (serviceInfoImpl.isAssociatedWithTask(this, getTaskState())) {
                        logger1.debug(getName() + ".run() JmDNS " + getTaskDescription() + " " + serviceInfoImpl.getQualifiedName());
                        arrayList.add(serviceInfoImpl);
                        dNSOutgoingCreateOugoing = buildOutgoingForInfo(serviceInfoImpl, dNSOutgoingCreateOugoing);
                    }
                } finally {
                }
            }
        }
        if (dNSOutgoingCreateOugoing.isEmpty()) {
            advanceObjectsState(arrayList);
            cancel();
            return;
        }
        logger1.debug(getName() + ".run() JmDNS " + getTaskDescription() + " #" + getTaskState());
        getDns().send(dNSOutgoingCreateOugoing);
        advanceObjectsState(arrayList);
        advanceTask();
    }

    public void setTaskState(DNSState dNSState) {
        this._taskState = dNSState;
    }
}
