package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class e01 {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f26611a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static nq a(int i, uf1 uf1Var) {
        int iH = uf1Var.h();
        if (uf1Var.h() == 1684108385) {
            uf1Var.f(8);
            String strB = uf1Var.b(iH - 16);
            return new nq("und", strB, strB);
        }
        rs0.d("MetadataUtil", "Failed to parse comment attribute: " + dh.a(i));
        return null;
    }

    private static g42 b(int i, uf1 uf1Var, String str) {
        int iH = uf1Var.h();
        if (uf1Var.h() == 1684108385) {
            uf1Var.f(8);
            return new g42(str, null, uf1Var.b(iH - 16));
        }
        rs0.d("MetadataUtil", "Failed to parse text attribute: " + dh.a(i));
        return null;
    }

    private static yd a(uf1 uf1Var) {
        String str;
        int iH = uf1Var.h();
        if (uf1Var.h() == 1684108385) {
            int iH2 = uf1Var.h() & 16777215;
            if (iH2 == 13) {
                str = "image/jpeg";
            } else {
                str = iH2 == 14 ? "image/png" : null;
            }
            if (str == null) {
                kr0.a("Unrecognized cover art flags: ", iH2, "MetadataUtil");
                return null;
            }
            uf1Var.f(4);
            int i = iH - 16;
            byte[] bArr = new byte[i];
            uf1Var.a(bArr, 0, i);
            return new yd(str, null, 3, bArr);
        }
        rs0.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.ei0 b(com.yandex.mobile.ads.impl.uf1 r13) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e01.b(com.yandex.mobile.ads.impl.uf1):com.yandex.mobile.ads.impl.ei0");
    }

    private static g42 a(int i, uf1 uf1Var, String str) {
        int iH = uf1Var.h();
        if (uf1Var.h() == 1684108385 && iH >= 22) {
            uf1Var.f(10);
            int iZ = uf1Var.z();
            if (iZ > 0) {
                String strA = fe.a("", iZ);
                int iZ2 = uf1Var.z();
                if (iZ2 > 0) {
                    strA = strA + "/" + iZ2;
                }
                return new g42(str, null, strA);
            }
        }
        rs0.d("MetadataUtil", "Failed to parse index/count attribute: " + dh.a(i));
        return null;
    }

    private static ei0 a(int i, String str, uf1 uf1Var, boolean z10, boolean z11) {
        int iMin;
        uf1Var.f(4);
        if (uf1Var.h() == 1684108385) {
            uf1Var.f(8);
            iMin = uf1Var.t();
        } else {
            rs0.d("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z11) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            if (z10) {
                return new g42(str, null, Integer.toString(iMin));
            }
            return new nq("und", str, Integer.toString(iMin));
        }
        rs0.d("MetadataUtil", "Failed to parse uint8 attribute: " + dh.a(i));
        return null;
    }
}
