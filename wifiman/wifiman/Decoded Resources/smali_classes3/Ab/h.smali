.class public final enum LAb/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LAb/h;

.field public static final enum DEV:LAb/h;

.field public static final enum PRODUCTION:LAb/h;

.field public static final enum STAGING:LAb/h;


# instance fields
.field private final accountUrl:Ljava/lang/String;

.field private final ssoUrl:Ljava/lang/String;

.field private final ubicAuthCookieName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LAb/h;
    .locals 3

    sget-object v0, LAb/h;->PRODUCTION:LAb/h;

    sget-object v1, LAb/h;->STAGING:LAb/h;

    sget-object v2, LAb/h;->DEV:LAb/h;

    filled-new-array {v0, v1, v2}, [LAb/h;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    new-instance v6, LAb/h;

    const-string/jumbo v4, "https://account.ui.com/"

    const-string/jumbo v5, "UBIC_AUTH"

    const-string/jumbo v1, "PRODUCTION"

    const/4 v2, 0x0

    const-string/jumbo v3, "https://sso.ui.com/"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LAb/h;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v6, LAb/h;->PRODUCTION:LAb/h;

    new-instance v0, LAb/h;

    const-string/jumbo v11, "https://account.stg.ui.com/"

    const-string/jumbo v12, "STG_UBIC_AUTH"

    const-string/jumbo v8, "STAGING"

    const/4 v9, 0x1

    const-string/jumbo v10, "https://sso.stg.ui.com/"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LAb/h;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LAb/h;->STAGING:LAb/h;

    new-instance v0, LAb/h;

    const-string/jumbo v5, "https://account.dev.ui.com/"

    const-string v6, "DEV_UBIC_AUTH"

    const-string v2, "DEV"

    const/4 v3, 0x2

    const-string/jumbo v4, "https://sso.dev.ui.com/"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LAb/h;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LAb/h;->DEV:LAb/h;

    invoke-static {}, LAb/h;->$values()[LAb/h;

    move-result-object v0

    sput-object v0, LAb/h;->$VALUES:[LAb/h;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LAb/h;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LAb/h;->ssoUrl:Ljava/lang/String;

    iput-object p4, p0, LAb/h;->accountUrl:Ljava/lang/String;

    iput-object p5, p0, LAb/h;->ubicAuthCookieName:Ljava/lang/String;

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

    sget-object v0, LAb/h;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LAb/h;
    .locals 1

    const-class v0, LAb/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LAb/h;

    return-object p0
.end method

.method public static values()[LAb/h;
    .locals 1

    sget-object v0, LAb/h;->$VALUES:[LAb/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LAb/h;

    return-object v0
.end method


# virtual methods
.method public final getAccountUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LAb/h;->accountUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSsoUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LAb/h;->ssoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getUbicAuthCookieName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LAb/h;->ubicAuthCookieName:Ljava/lang/String;

    return-object v0
.end method
