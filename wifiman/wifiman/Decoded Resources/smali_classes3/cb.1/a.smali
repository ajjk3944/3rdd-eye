.class public final enum Lcb/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcb/a;

.field public static final enum PRODUCTION:Lcb/a;

.field public static final enum STAGING:Lcb/a;


# instance fields
.field private final cloudConfigUrl:Ljava/lang/String;

.field private final ssoConfig:LAb/h;

.field private final tracesUrl:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcb/a;
    .locals 2

    sget-object v0, Lcb/a;->PRODUCTION:Lcb/a;

    sget-object v1, Lcb/a;->STAGING:Lcb/a;

    filled-new-array {v0, v1}, [Lcb/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lcb/a;

    const-string/jumbo v4, "https://trace.svc.ui.com"

    sget-object v5, LAb/h;->PRODUCTION:LAb/h;

    const-string/jumbo v1, "PRODUCTION"

    const/4 v2, 0x0

    const-string/jumbo v3, "https://config.svc.ui.com"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcb/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LAb/h;)V

    sput-object v6, Lcb/a;->PRODUCTION:Lcb/a;

    new-instance v0, Lcb/a;

    const-string/jumbo v11, "https://trace.dev.svc.ui.com"

    sget-object v12, LAb/h;->STAGING:LAb/h;

    const-string/jumbo v8, "STAGING"

    const/4 v9, 0x1

    const-string/jumbo v10, "https://config.stg.svc.ui.com"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcb/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LAb/h;)V

    sput-object v0, Lcb/a;->STAGING:Lcb/a;

    invoke-static {}, Lcb/a;->$values()[Lcb/a;

    move-result-object v0

    sput-object v0, Lcb/a;->$VALUES:[Lcb/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcb/a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LAb/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LAb/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcb/a;->cloudConfigUrl:Ljava/lang/String;

    iput-object p4, p0, Lcb/a;->tracesUrl:Ljava/lang/String;

    iput-object p5, p0, Lcb/a;->ssoConfig:LAb/h;

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

    sget-object v0, Lcb/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcb/a;
    .locals 1

    const-class v0, Lcb/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcb/a;

    return-object p0
.end method

.method public static values()[Lcb/a;
    .locals 1

    sget-object v0, Lcb/a;->$VALUES:[Lcb/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcb/a;

    return-object v0
.end method


# virtual methods
.method public final getCloudConfigUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcb/a;->cloudConfigUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSsoConfig()LAb/h;
    .locals 1

    iget-object v0, p0, Lcb/a;->ssoConfig:LAb/h;

    return-object v0
.end method

.method public final getTracesUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcb/a;->tracesUrl:Ljava/lang/String;

    return-object v0
.end method
