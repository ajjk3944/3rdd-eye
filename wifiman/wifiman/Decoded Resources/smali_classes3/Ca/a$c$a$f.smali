.class public final LCa/a$c$a$f;
.super LCa/a$c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCa/a$c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field public static final a:LCa/a$c$a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCa/a$c$a$f;

    invoke-direct {v0}, LCa/a$c$a$f;-><init>()V

    sput-object v0, LCa/a$c$a$f;->a:LCa/a$c$a$f;

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

    const-string/jumbo v0, "The device for the band 5150-5250 MHz is only for indoor usage to reduce potential for harmful interference to co-channel mobile satellite systems.\nLes dispositifs fonctionnant dans la bande 5150-5250 MHz sont r\u00e9serv\u00e9s uniquement pour une utilisation \u00e0 l\'int\u00e9rieur afin de r\u00e9duire les risques de brouillage pr\u00e9judiciable aux syst\u00e8mes de satellites mobiles utilisant les m\u00eames canaux."

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LCa/a$c$a$f;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x416dce9f

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Wifi_5"

    return-object v0
.end method
