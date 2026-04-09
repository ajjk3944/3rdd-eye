.class public final enum Lcom/ui/sso/api/UiAccountApi$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/UiAccountApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/sso/api/UiAccountApi$a;

.field public static final enum CONTENT_PROVIDER:Lcom/ui/sso/api/UiAccountApi$a;

.field public static final enum DIRECT:Lcom/ui/sso/api/UiAccountApi$a;


# direct methods
.method private static final synthetic $values()[Lcom/ui/sso/api/UiAccountApi$a;
    .locals 2

    sget-object v0, Lcom/ui/sso/api/UiAccountApi$a;->CONTENT_PROVIDER:Lcom/ui/sso/api/UiAccountApi$a;

    sget-object v1, Lcom/ui/sso/api/UiAccountApi$a;->DIRECT:Lcom/ui/sso/api/UiAccountApi$a;

    filled-new-array {v0, v1}, [Lcom/ui/sso/api/UiAccountApi$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/sso/api/UiAccountApi$a;

    const-string v1, "CONTENT_PROVIDER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/sso/api/UiAccountApi$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/sso/api/UiAccountApi$a;->CONTENT_PROVIDER:Lcom/ui/sso/api/UiAccountApi$a;

    new-instance v0, Lcom/ui/sso/api/UiAccountApi$a;

    const-string v1, "DIRECT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/sso/api/UiAccountApi$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/sso/api/UiAccountApi$a;->DIRECT:Lcom/ui/sso/api/UiAccountApi$a;

    invoke-static {}, Lcom/ui/sso/api/UiAccountApi$a;->$values()[Lcom/ui/sso/api/UiAccountApi$a;

    move-result-object v0

    sput-object v0, Lcom/ui/sso/api/UiAccountApi$a;->$VALUES:[Lcom/ui/sso/api/UiAccountApi$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/sso/api/UiAccountApi$a;->$ENTRIES:Lfh/a;

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

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/ui/sso/api/UiAccountApi$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/sso/api/UiAccountApi$a;
    .locals 1

    const-class v0, Lcom/ui/sso/api/UiAccountApi$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/sso/api/UiAccountApi$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/sso/api/UiAccountApi$a;
    .locals 1

    sget-object v0, Lcom/ui/sso/api/UiAccountApi$a;->$VALUES:[Lcom/ui/sso/api/UiAccountApi$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/sso/api/UiAccountApi$a;

    return-object v0
.end method
