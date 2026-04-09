.class public final enum Lc8/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lc8/a;

.field public static final enum DEV:Lc8/a;

.field public static final enum PRODUCTION:Lc8/a;

.field public static final enum STAGE:Lc8/a;


# instance fields
.field private final baseUrl:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lc8/a;
    .locals 3

    sget-object v0, Lc8/a;->PRODUCTION:Lc8/a;

    sget-object v1, Lc8/a;->STAGE:Lc8/a;

    sget-object v2, Lc8/a;->DEV:Lc8/a;

    filled-new-array {v0, v1, v2}, [Lc8/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lc8/a;

    const/4 v1, 0x0

    const-string/jumbo v2, "https://sp-dir.uwn.com"

    const-string/jumbo v3, "PRODUCTION"

    invoke-direct {v0, v3, v1, v2}, Lc8/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lc8/a;->PRODUCTION:Lc8/a;

    new-instance v0, Lc8/a;

    const/4 v1, 0x1

    const-string/jumbo v2, "https://stg-sp-dir.uwn.com"

    const-string/jumbo v3, "STAGE"

    invoke-direct {v0, v3, v1, v2}, Lc8/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lc8/a;->STAGE:Lc8/a;

    new-instance v0, Lc8/a;

    const/4 v1, 0x2

    const-string/jumbo v2, "https://dev-sp-dir.uwn.com"

    const-string v3, "DEV"

    invoke-direct {v0, v3, v1, v2}, Lc8/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lc8/a;->DEV:Lc8/a;

    invoke-static {}, Lc8/a;->$values()[Lc8/a;

    move-result-object v0

    sput-object v0, Lc8/a;->$VALUES:[Lc8/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lc8/a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lc8/a;->baseUrl:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lc8/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lc8/a;
    .locals 1

    const-class v0, Lc8/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc8/a;

    return-object p0
.end method

.method public static values()[Lc8/a;
    .locals 1

    sget-object v0, Lc8/a;->$VALUES:[Lc8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc8/a;

    return-object v0
.end method


# virtual methods
.method public final getBaseUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc8/a;->baseUrl:Ljava/lang/String;

    return-object v0
.end method
