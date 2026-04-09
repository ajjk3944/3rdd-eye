package com.wifihacker.detector.common.wol;

import g8.k;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public abstract class WakeOnLanClient {

    public enum WakeState {
        SUCCESS,
        UNKNOWNHOST,
        FAILED
    }

    public static byte[] a(String str) {
        byte[] bArr = new byte[6];
        String[] strArrSplit = str.split("(\\:|\\-)");
        if (strArrSplit.length != 6) {
            throw new IllegalArgumentException("Invalid MAC address.");
        }
        for (int i10 = 0; i10 < 6; i10++) {
            try {
                bArr[i10] = (byte) Integer.parseInt(strArrSplit[i10], 16);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("Invalid hex digit in MAC address.");
            }
        }
        return bArr;
    }

    public static WakeState b(byte[] bArr, String str, int i10) throws IOException {
        try {
            int length = 6;
            int length2 = (bArr.length * 16) + 6;
            byte[] bArr2 = new byte[length2];
            for (int i11 = 0; i11 < 6; i11++) {
                bArr2[i11] = -1;
            }
            while (length < length2) {
                System.arraycopy(bArr, 0, bArr2, length, bArr.length);
                length += bArr.length;
            }
            DatagramPacket datagramPacket = new DatagramPacket(bArr2, length2, InetAddress.getByName(str), i10);
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
            return WakeState.SUCCESS;
        } catch (SocketException e10) {
            k.c("WakeOnLanClient SocketException", e10);
            return WakeState.FAILED;
        } catch (UnknownHostException e11) {
            k.c("WakeOnLanClient UnknownHostException", e11);
            return WakeState.UNKNOWNHOST;
        } catch (IOException e12) {
            k.c("WakeOnLanClient exception", e12);
            return WakeState.FAILED;
        }
    }
}
