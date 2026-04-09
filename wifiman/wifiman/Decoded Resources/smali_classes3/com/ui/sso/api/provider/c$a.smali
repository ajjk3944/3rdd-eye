.class public final enum Lcom/ui/sso/api/provider/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/sso/api/provider/c$a;

.field public static final enum AVATAR:Lcom/ui/sso/api/provider/c$a;

.field public static final enum EMAIL:Lcom/ui/sso/api/provider/c$a;

.field public static final enum USERNAME:Lcom/ui/sso/api/provider/c$a;

.field public static final enum UUID:Lcom/ui/sso/api/provider/c$a;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/sso/api/provider/c$a;
    .locals 4

    sget-object v0, Lcom/ui/sso/api/provider/c$a;->UUID:Lcom/ui/sso/api/provider/c$a;

    sget-object v1, Lcom/ui/sso/api/provider/c$a;->USERNAME:Lcom/ui/sso/api/provider/c$a;

    sget-object v2, Lcom/ui/sso/api/provider/c$a;->EMAIL:Lcom/ui/sso/api/provider/c$a;

    sget-object v3, Lcom/ui/sso/api/provider/c$a;->AVATAR:Lcom/ui/sso/api/provider/c$a;

    filled-new-array {v0, v1, v2, v3}, [Lcom/ui/sso/api/provider/c$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/sso/api/provider/c$a;

    const/4 v1, 0x0

    const-string/jumbo v2, "uuid"

    const-string/jumbo v3, "UUID"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/c$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/c$a;->UUID:Lcom/ui/sso/api/provider/c$a;

    new-instance v0, Lcom/ui/sso/api/provider/c$a;

    const/4 v1, 0x1

    const-string/jumbo v2, "username"

    const-string/jumbo v3, "USERNAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/c$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/c$a;->USERNAME:Lcom/ui/sso/api/provider/c$a;

    new-instance v0, Lcom/ui/sso/api/provider/c$a;

    const/4 v1, 0x2

    const-string/jumbo v2, "email"

    const-string/jumbo v3, "EMAIL"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/c$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/c$a;->EMAIL:Lcom/ui/sso/api/provider/c$a;

    new-instance v0, Lcom/ui/sso/api/provider/c$a;

    const/4 v1, 0x3

    const-string/jumbo v2, "avatar"

    const-string v3, "AVATAR"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/sso/api/provider/c$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/sso/api/provider/c$a;->AVATAR:Lcom/ui/sso/api/provider/c$a;

    invoke-static {}, Lcom/ui/sso/api/provider/c$a;->$values()[Lcom/ui/sso/api/provider/c$a;

    move-result-object v0

    sput-object v0, Lcom/ui/sso/api/provider/c$a;->$VALUES:[Lcom/ui/sso/api/provider/c$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/sso/api/provider/c$a;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, Lcom/ui/sso/api/provider/c$a;->id:Ljava/lang/String;

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

    sget-object v0, Lcom/ui/sso/api/provider/c$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/sso/api/provider/c$a;
    .locals 1

    const-class v0, Lcom/ui/sso/api/provider/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/sso/api/provider/c$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/sso/api/provider/c$a;
    .locals 1

    sget-object v0, Lcom/ui/sso/api/provider/c$a;->$VALUES:[Lcom/ui/sso/api/provider/c$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/sso/api/provider/c$a;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/c$a;->id:Ljava/lang/String;

    return-object v0
.end method
