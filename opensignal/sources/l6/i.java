package l6;

import a5.v;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import oe.h0;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f14822a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i10, v vVar) {
        int iG = vVar.g();
        if (vVar.g() == 1684108385) {
            vVar.F(8);
            String strP = vVar.p(iG - 16);
            return new CommentFrame("und", strP, strP);
        }
        a5.a.B("MetadataUtil", "Failed to parse comment attribute: " + c5.a.d(i10));
        return null;
    }

    public static ApicFrame b(v vVar) {
        int iG = vVar.g();
        if (vVar.g() != 1684108385) {
            a5.a.B("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iG2 = vVar.g() & 16777215;
        String str = iG2 == 13 ? "image/jpeg" : iG2 == 14 ? "image/png" : null;
        if (str == null) {
            c7.a.z("Unrecognized cover art flags: ", iG2, "MetadataUtil");
            return null;
        }
        vVar.F(4);
        int i10 = iG - 16;
        byte[] bArr = new byte[i10];
        vVar.e(bArr, 0, i10);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static TextInformationFrame c(int i10, String str, v vVar) {
        int iG = vVar.g();
        if (vVar.g() == 1684108385 && iG >= 22) {
            vVar.F(10);
            int iY = vVar.y();
            if (iY > 0) {
                String strH = h0.b.h(iY, "");
                int iY2 = vVar.y();
                if (iY2 > 0) {
                    strH = strH + "/" + iY2;
                }
                return new TextInformationFrame(str, null, h0.p(strH));
            }
        }
        a5.a.B("MetadataUtil", "Failed to parse index/count attribute: " + c5.a.d(i10));
        return null;
    }

    public static TextInformationFrame d(int i10, String str, v vVar) {
        int iG = vVar.g();
        if (vVar.g() == 1684108385) {
            vVar.F(8);
            return new TextInformationFrame(str, null, h0.p(vVar.p(iG - 16)));
        }
        a5.a.B("MetadataUtil", "Failed to parse text attribute: " + c5.a.d(i10));
        return null;
    }

    public static Id3Frame e(int i10, String str, v vVar, boolean z10, boolean z11) {
        int iF = f(vVar);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z10 ? new TextInformationFrame(str, null, h0.p(Integer.toString(iF))) : new CommentFrame("und", str, Integer.toString(iF));
        }
        a5.a.B("MetadataUtil", "Failed to parse uint8 attribute: " + c5.a.d(i10));
        return null;
    }

    public static int f(v vVar) {
        vVar.F(4);
        if (vVar.g() == 1684108385) {
            vVar.F(8);
            return vVar.t();
        }
        a5.a.B("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
