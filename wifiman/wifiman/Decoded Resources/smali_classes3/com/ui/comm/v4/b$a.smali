.class public final enum Lcom/ui/comm/v4/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ui/comm/v4/b$a;

.field public static final enum BINARY:Lcom/ui/comm/v4/b$a;

.field public static final enum JSON:Lcom/ui/comm/v4/b$a;

.field public static final enum STRING:Lcom/ui/comm/v4/b$a;


# direct methods
.method private static final synthetic $values()[Lcom/ui/comm/v4/b$a;
    .locals 3

    sget-object v0, Lcom/ui/comm/v4/b$a;->JSON:Lcom/ui/comm/v4/b$a;

    sget-object v1, Lcom/ui/comm/v4/b$a;->STRING:Lcom/ui/comm/v4/b$a;

    sget-object v2, Lcom/ui/comm/v4/b$a;->BINARY:Lcom/ui/comm/v4/b$a;

    filled-new-array {v0, v1, v2}, [Lcom/ui/comm/v4/b$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/comm/v4/b$a;

    const-string/jumbo v1, "JSON"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/b$a;->JSON:Lcom/ui/comm/v4/b$a;

    new-instance v0, Lcom/ui/comm/v4/b$a;

    const-string/jumbo v1, "STRING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/b$a;->STRING:Lcom/ui/comm/v4/b$a;

    new-instance v0, Lcom/ui/comm/v4/b$a;

    const-string v1, "BINARY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/b$a;->BINARY:Lcom/ui/comm/v4/b$a;

    invoke-static {}, Lcom/ui/comm/v4/b$a;->$values()[Lcom/ui/comm/v4/b$a;

    move-result-object v0

    sput-object v0, Lcom/ui/comm/v4/b$a;->$VALUES:[Lcom/ui/comm/v4/b$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ui/comm/v4/b$a;
    .locals 1

    const-class v0, Lcom/ui/comm/v4/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/comm/v4/b$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/comm/v4/b$a;
    .locals 1

    sget-object v0, Lcom/ui/comm/v4/b$a;->$VALUES:[Lcom/ui/comm/v4/b$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/comm/v4/b$a;

    return-object v0
.end method
