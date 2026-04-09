package com.liuzh.deviceinfo.utilities;

import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final vk.h f21305a = new vk.h("\\Winit_([0-9]+)_([0-9]+)\\W");

    public static File a(String str) {
        File file = new File(str);
        if (file.exists() && file.canRead()) {
            return file;
        }
        return null;
    }

    public static Pair b(Pair pair, Pair pair2) {
        return pair == null ? pair2 : (pair2 != null && (!((Integer) pair.first).equals(pair2.first) ? ((Integer) pair.first).intValue() > ((Integer) pair2.first).intValue() : ((Integer) pair.second).intValue() > ((Integer) pair2.second).intValue())) ? pair2 : pair;
    }

    public static Pair c(String str) throws NumberFormatException {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length != 1 && strArrSplit.length != 2) {
            return null;
        }
        String strTrim = strArrSplit[0].trim();
        if (TextUtils.isEmpty(strTrim)) {
            return null;
        }
        try {
            int i4 = Integer.parseInt(strTrim);
            if (strArrSplit.length == 1) {
                return new Pair(Integer.valueOf(i4), 0);
            }
            String strTrim2 = strArrSplit[1].trim();
            if (TextUtils.isEmpty(strTrim2)) {
                return new Pair(Integer.valueOf(i4), 0);
            }
            try {
                return new Pair(Integer.valueOf(i4), Integer.valueOf(Integer.parseInt(strTrim2)));
            } catch (NumberFormatException unused) {
                return new Pair(Integer.valueOf(i4), 0);
            }
        } catch (NumberFormatException unused2) {
            return null;
        }
    }

    public static Pair d(File file, com.google.gson.internal.b bVar) throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            xmlPullParserFactoryNewInstance.setNamespaceAware(false);
            XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
            xmlPullParserNewPullParser.setInput(new InputStreamReader(new FileInputStream(file)));
            List listG = bVar.g(xmlPullParserNewPullParser);
            if (listG != null && !listG.isEmpty()) {
                Iterator it = listG.iterator();
                Pair pairB = null;
                while (it.hasNext()) {
                    Pair pairC = c((String) it.next());
                    if (pairC != null) {
                        pairB = b(pairB, pairC);
                    }
                }
                return pairB;
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        return null;
    }
}
