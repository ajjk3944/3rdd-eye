.class public final enum Lcom/ui/sso/auth/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/auth/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/sso/auth/a$a;

.field public static final enum SSO_PASSWORD:Lcom/ui/sso/auth/a$a;

.field public static final enum UBIC:Lcom/ui/sso/auth/a$a;

.field public static final enum UBIC_PKCE:Lcom/ui/sso/auth/a$a;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/sso/auth/a$a;
    .locals 3

    sget-object v0, Lcom/ui/sso/auth/a$a;->UBIC:Lcom/ui/sso/auth/a$a;

    sget-object v1, Lcom/ui/sso/auth/a$a;->UBIC_PKCE:Lcom/ui/sso/auth/a$a;

    sget-object v2, Lcom/ui/sso/auth/a$a;->SSO_PASSWORD:Lcom/ui/sso/auth/a$a;

    filled-new-array {v0, v1, v2}, [Lcom/ui/sso/auth/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/sso/auth/a$a;

    const/4 v1, 0x0

    const-string/jumbo v2, "ubic"

    const-string/jumbo v3, "UBIC"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/auth/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/auth/a$a;->UBIC:Lcom/ui/sso/auth/a$a;

    new-instance v0, Lcom/ui/sso/auth/a$a;

    const/4 v1, 0x1

    const-string/jumbo v2, "ubic_pkce"

    const-string/jumbo v3, "UBIC_PKCE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/auth/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/auth/a$a;->UBIC_PKCE:Lcom/ui/sso/auth/a$a;

    new-instance v0, Lcom/ui/sso/auth/a$a;

    const/4 v1, 0x2

    const-string/jumbo v2, "sso_password"

    const-string/jumbo v3, "SSO_PASSWORD"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/auth/a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/auth/a$a;->SSO_PASSWORD:Lcom/ui/sso/auth/a$a;

    invoke-static {}, Lcom/ui/sso/auth/a$a;->$values()[Lcom/ui/sso/auth/a$a;

    move-result-object v0

    sput-object v0, Lcom/ui/sso/auth/a$a;->$VALUES:[Lcom/ui/sso/auth/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/sso/auth/a$a;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, Lcom/ui/sso/auth/a$a;->id:Ljava/lang/String;

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

    sget-object v0, Lcom/ui/sso/auth/a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/sso/auth/a$a;
    .locals 1

    const-class v0, Lcom/ui/sso/auth/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/sso/auth/a$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/sso/auth/a$a;
    .locals 1

    sget-object v0, Lcom/ui/sso/auth/a$a;->$VALUES:[Lcom/ui/sso/auth/a$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/sso/auth/a$a;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/auth/a$a;->id:Ljava/lang/String;

    return-object v0
.end method
