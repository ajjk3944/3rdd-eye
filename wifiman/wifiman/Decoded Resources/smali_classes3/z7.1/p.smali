.class public final enum Lz7/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lz7/p;

.field public static final enum CELULAR:Lz7/p;

.field public static final enum ETHERNET:Lz7/p;

.field public static final enum UNKNOWN:Lz7/p;

.field public static final enum VPN:Lz7/p;

.field public static final enum WIFI:Lz7/p;


# direct methods
.method private static final synthetic $values()[Lz7/p;
    .locals 5

    sget-object v0, Lz7/p;->UNKNOWN:Lz7/p;

    sget-object v1, Lz7/p;->CELULAR:Lz7/p;

    sget-object v2, Lz7/p;->ETHERNET:Lz7/p;

    sget-object v3, Lz7/p;->WIFI:Lz7/p;

    sget-object v4, Lz7/p;->VPN:Lz7/p;

    filled-new-array {v0, v1, v2, v3, v4}, [Lz7/p;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz7/p;

    const-string/jumbo v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz7/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz7/p;->UNKNOWN:Lz7/p;

    new-instance v0, Lz7/p;

    const-string v1, "CELULAR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz7/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz7/p;->CELULAR:Lz7/p;

    new-instance v0, Lz7/p;

    const-string/jumbo v1, "ETHERNET"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz7/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz7/p;->ETHERNET:Lz7/p;

    new-instance v0, Lz7/p;

    const-string/jumbo v1, "WIFI"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lz7/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz7/p;->WIFI:Lz7/p;

    new-instance v0, Lz7/p;

    const-string/jumbo v1, "VPN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lz7/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz7/p;->VPN:Lz7/p;

    invoke-static {}, Lz7/p;->$values()[Lz7/p;

    move-result-object v0

    sput-object v0, Lz7/p;->$VALUES:[Lz7/p;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lz7/p;
    .locals 1

    const-class v0, Lz7/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz7/p;

    return-object p0
.end method

.method public static values()[Lz7/p;
    .locals 1

    sget-object v0, Lz7/p;->$VALUES:[Lz7/p;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz7/p;

    return-object v0
.end method
