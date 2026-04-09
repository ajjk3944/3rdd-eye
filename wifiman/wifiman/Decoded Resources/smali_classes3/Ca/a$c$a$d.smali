.class public final LCa/a$c$a$d;
.super LCa/a$c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCa/a$c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:LCa/a$c$a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCa/a$c$a$d;

    invoke-direct {v0}, LCa/a$c$a$d;-><init>()V

    sput-object v0, LCa/a$c$a$d;->a:LCa/a$c$a$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LCa/a$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "(i) the device for operation in the band 5150-5250 MHz is only for indoor use to reduce the potential for harmful interference to co-channel mobile satellite systems;\n\n(ii) for devices with detachable antenna(s), the maximum antenna gain permitted for devices in the bands 5250-5350 MHz and 5470-5725 MHz shall be such that the equipment still complies with the e.i.r.p. limit; and\n\n(iii) for devices with detachable antenna(s), the maximum antenna gain permitted for devices in the band 5725-5850 MHz shall be such that the equipment still complies with the e.i.r.p. limits as appropriate.\n\n(i) les dispositifs fonctionnant dans la bande 5150-5250 MHz sont r\u00e9serv\u00e9s uniquement pour une utilisation \u00e0 l\'int\u00e9rieur afin de r\u00e9duire les risques de brouillage pr\u00e9judiciable aux syst\u00e8mes de satellites mobiles utilisant les m\u00eames canaux;\n\n(ii) pour les dispositifs munis d\'antennes amovibles, le gain maximal d\'antenne permis pour les dispositifs utilisant les bandes de 5 250 \u00e0 5 350 MHz et de 5 470 \u00e0 5 725 MHz doit \u00eatre conforme \u00e0 la limite de la p.i.r.e;\n\n(iii) pour les dispositifs munis d\'antennes amovibles, le gain maximal d\'antenne permis (pour les dispositifs utilisant la bande de 5 725 \u00e0 5 850 MHz) doit \u00eatre conforme \u00e0 la limite de la p.i.r.e. sp\u00e9cifi\u00e9e, selon le cas."

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LCa/a$c$a$d;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0xdbee172

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "WiFi_5_DetAnt"

    return-object v0
.end method
