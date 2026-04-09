package org.xbill.DNS;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* loaded from: classes4.dex */
public class MXRecord extends U16NameBase {
    private static final long serialVersionUID = 2914841027584208546L;

    public MXRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return getNameField();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new MXRecord();
    }

    public int getPriority() {
        return getU16Field();
    }

    public Name getTarget() {
        return getNameField();
    }

    @Override // org.xbill.DNS.U16NameBase, org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z10) {
        dNSOutput.writeU16(this.u16Field);
        this.nameField.toWire(dNSOutput, compression, z10);
    }

    public MXRecord(Name name, int i10, long j10, int i11, Name name2) {
        super(name, 15, i10, j10, i11, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, name2, "target");
    }
}
