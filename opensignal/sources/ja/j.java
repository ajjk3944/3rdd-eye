package ja;

import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import io.sentry.android.core.e0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f13484a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i10, fb.f fVar) {
        int iD = fVar.d();
        if (fVar.d() == 1684108385) {
            fVar.z(8);
            String strL = fVar.l(iD - 16);
            return new CommentFrame("und", strL, strL);
        }
        String strValueOf = String.valueOf(c5.a.c(i10));
        e0.p("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    public static ApicFrame b(fb.f fVar) {
        int iD = fVar.d();
        if (fVar.d() != 1684108385) {
            e0.p("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iD2 = fVar.d() & 16777215;
        String str = iD2 == 13 ? "image/jpeg" : iD2 == 14 ? "image/png" : null;
        if (str == null) {
            c7.a.y("Unrecognized cover art flags: ", 41, iD2, "MetadataUtil");
            return null;
        }
        fVar.z(4);
        int i10 = iD - 16;
        byte[] bArr = new byte[i10];
        fVar.c(bArr, 0, i10);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static TextInformationFrame c(int i10, fb.f fVar, String str) {
        int iD = fVar.d();
        if (fVar.d() == 1684108385 && iD >= 22) {
            fVar.z(10);
            int iT = fVar.t();
            if (iT > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(iT);
                String string = sb2.toString();
                int iT2 = fVar.t();
                if (iT2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 12);
                    sb3.append(strValueOf);
                    sb3.append("/");
                    sb3.append(iT2);
                    string = sb3.toString();
                }
                return new TextInformationFrame(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(c5.a.c(i10));
        e0.p("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static TextInformationFrame d(int i10, fb.f fVar, String str) {
        int iD = fVar.d();
        if (fVar.d() == 1684108385) {
            fVar.z(8);
            return new TextInformationFrame(str, null, fVar.l(iD - 16));
        }
        String strValueOf = String.valueOf(c5.a.c(i10));
        e0.p("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static Id3Frame e(int i10, String str, fb.f fVar, boolean z10, boolean z11) {
        int iF = f(fVar);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z10 ? new TextInformationFrame(str, null, Integer.toString(iF)) : new CommentFrame("und", str, Integer.toString(iF));
        }
        String strValueOf = String.valueOf(c5.a.c(i10));
        e0.p("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    public static int f(fb.f fVar) {
        fVar.z(4);
        if (fVar.d() == 1684108385) {
            fVar.z(8);
            return fVar.o();
        }
        e0.p("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
