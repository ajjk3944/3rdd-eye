package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.ump.ConsentInformation;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19382b;

    public /* synthetic */ j(int i4, Object obj) {
        this.f19381a = i4;
        this.f19382b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i4 = this.f19381a;
        Object obj = this.f19382b;
        switch (i4) {
            case 0:
                ((m) obj).b(new r1(4, "Web view timed out."));
                break;
            case 1:
                ((q) obj).b();
                break;
            case 2:
                e0 e0Var = (e0) obj;
                AtomicReference atomicReference = e0Var.f19331k;
                String str = (String) e0Var.f19323a.get();
                if (str == null) {
                    Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
                    break;
                } else {
                    int size = ((Queue) atomicReference.get()).size();
                    for (int i10 = 0; i10 < size; i10++) {
                        w2 w2Var = (w2) ((Queue) atomicReference.get()).poll();
                        if (w2Var != null) {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
                                httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(e0Var.f19324b));
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                int iC = w2Var.c();
                                Logger logger = q5.g;
                                if (iC > 4096) {
                                    iC = 4096;
                                }
                                q5 q5Var = new q5(outputStream, iC);
                                w2Var.a(q5Var);
                                if (q5Var.f19498e > 0) {
                                    q5Var.k();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode != 200 && responseCode != 204) {
                                    Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + responseCode + ".\n" + (httpURLConnection.getErrorStream() != null ? new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next() : null));
                                    ((Queue) atomicReference.get()).add(w2Var);
                                }
                            } catch (IOException e2) {
                                Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(String.valueOf(e2.getMessage())));
                                ((Queue) atomicReference.get()).add(w2Var);
                            } catch (URISyntaxException e10) {
                                Log.w("UserMessagingPlatform", "Metrics reporting URL " + str + " is not valid: " + e10.getMessage());
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                ((ConsentInformation.OnConsentInfoUpdateSuccessListener) obj).onConsentInfoUpdateSuccess();
                break;
        }
    }
}
