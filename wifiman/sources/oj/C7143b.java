package oj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import kj.j;
import kj.o;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

/* renamed from: oj.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7143b implements MqttClientPersistence {

    /* renamed from: d, reason: collision with root package name */
    private static FilenameFilter f55742d;

    /* renamed from: a, reason: collision with root package name */
    private File f55743a;

    /* renamed from: b, reason: collision with root package name */
    private File f55744b;

    /* renamed from: c, reason: collision with root package name */
    private j f55745c;

    public C7143b() {
        this(System.getProperty("user.dir"));
    }

    private void a() throws MqttPersistenceException {
        if (this.f55744b == null) {
            throw new MqttPersistenceException();
        }
    }

    private static FilenameFilter g() {
        if (f55742d == null) {
            f55742d = new d(".msg");
        }
        return f55742d;
    }

    private File[] h() throws MqttPersistenceException {
        a();
        File[] fileArrListFiles = this.f55744b.listFiles(g());
        if (fileArrListFiles != null) {
            return fileArrListFiles;
        }
        throw new MqttPersistenceException();
    }

    private boolean j(char c10) {
        return Character.isJavaIdentifierPart(c10) || c10 == '-';
    }

    private void p(File file) throws MqttPersistenceException {
        File[] fileArrListFiles = file.listFiles(new C7144c(".bup"));
        if (fileArrListFiles == null) {
            throw new MqttPersistenceException();
        }
        for (File file2 : fileArrListFiles) {
            File file3 = new File(file, file2.getName().substring(0, file2.getName().length() - 4));
            if (!file2.renameTo(file3)) {
                file3.delete();
                file2.renameTo(file3);
            }
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void clear() throws MqttPersistenceException {
        a();
        for (File file : h()) {
            file.delete();
        }
        this.f55744b.delete();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                j jVar = this.f55745c;
                if (jVar != null) {
                    jVar.a();
                }
                if (h().length == 0) {
                    this.f55744b.delete();
                }
                this.f55744b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public boolean containsKey(String str) throws MqttPersistenceException {
        a();
        return new File(this.f55744b, String.valueOf(str) + ".msg").exists();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public MqttPersistable get(String str) throws IOException, MqttPersistenceException {
        a();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f55744b, String.valueOf(str) + ".msg"));
            int iAvailable = fileInputStream.available();
            byte[] bArr = new byte[iAvailable];
            for (int i10 = 0; i10 < iAvailable; i10 += fileInputStream.read(bArr, i10, iAvailable - i10)) {
            }
            fileInputStream.close();
            return new o(str, bArr, 0, iAvailable, null, 0, 0);
        } catch (IOException e10) {
            throw new MqttPersistenceException(e10);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public Enumeration keys() throws MqttPersistenceException {
        a();
        File[] fileArrH = h();
        Vector vector = new Vector(fileArrH.length);
        for (File file : fileArrH) {
            vector.addElement(file.getName().substring(0, r5.length() - 4));
        }
        return vector.elements();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void open(String str, String str2) throws MqttPersistenceException {
        if (this.f55743a.exists() && !this.f55743a.isDirectory()) {
            throw new MqttPersistenceException();
        }
        if (!this.f55743a.exists() && !this.f55743a.mkdirs()) {
            throw new MqttPersistenceException();
        }
        if (!this.f55743a.canWrite()) {
            throw new MqttPersistenceException();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (j(cCharAt)) {
                stringBuffer.append(cCharAt);
            }
        }
        stringBuffer.append("-");
        for (int i11 = 0; i11 < str2.length(); i11++) {
            char cCharAt2 = str2.charAt(i11);
            if (j(cCharAt2)) {
                stringBuffer.append(cCharAt2);
            }
        }
        synchronized (this) {
            if (this.f55744b == null) {
                File file = new File(this.f55743a, stringBuffer.toString());
                this.f55744b = file;
                if (!file.exists()) {
                    this.f55744b.mkdir();
                }
            }
            try {
                j jVar = this.f55745c;
                if (jVar != null) {
                    jVar.a();
                }
                this.f55745c = new j(this.f55744b, ".lck");
            } catch (Exception unused) {
            }
            p(this.f55744b);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void put(String str, MqttPersistable mqttPersistable) throws MqttPersistenceException {
        a();
        File file = new File(this.f55744b, String.valueOf(str) + ".msg");
        File file2 = new File(this.f55744b, String.valueOf(str) + ".msg.bup");
        if (file.exists() && !file.renameTo(file2)) {
            file2.delete();
            file.renameTo(file2);
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(mqttPersistable.getHeaderBytes(), mqttPersistable.getHeaderOffset(), mqttPersistable.getHeaderLength());
                if (mqttPersistable.getPayloadBytes() != null) {
                    fileOutputStream.write(mqttPersistable.getPayloadBytes(), mqttPersistable.getPayloadOffset(), mqttPersistable.getPayloadLength());
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file2.exists()) {
                    file2.delete();
                }
                if (!file2.exists() || file2.renameTo(file)) {
                    return;
                }
                file.delete();
                file2.renameTo(file);
            } catch (IOException e10) {
                throw new MqttPersistenceException(e10);
            }
        } catch (Throwable th2) {
            if (file2.exists() && !file2.renameTo(file)) {
                file.delete();
                file2.renameTo(file);
            }
            throw th2;
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void remove(String str) throws MqttPersistenceException {
        a();
        File file = new File(this.f55744b, String.valueOf(str) + ".msg");
        if (file.exists()) {
            file.delete();
        }
    }

    public C7143b(String str) {
        this.f55744b = null;
        this.f55745c = null;
        this.f55743a = new File(str);
    }
}
