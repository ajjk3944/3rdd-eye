.class public final enum Lcom/ui/comm/v4/a$h$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/a$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ui/comm/v4/a$h$a;

.field public static final enum CRITICAL:Lcom/ui/comm/v4/a$h$a;

.field public static final enum DEBUG:Lcom/ui/comm/v4/a$h$a;

.field public static final enum ERROR:Lcom/ui/comm/v4/a$h$a;

.field public static final enum INFO:Lcom/ui/comm/v4/a$h$a;

.field public static final enum SILLY:Lcom/ui/comm/v4/a$h$a;

.field public static final enum VERBOSE:Lcom/ui/comm/v4/a$h$a;

.field public static final enum WARN:Lcom/ui/comm/v4/a$h$a;


# direct methods
.method private static final synthetic $values()[Lcom/ui/comm/v4/a$h$a;
    .locals 7

    sget-object v0, Lcom/ui/comm/v4/a$h$a;->SILLY:Lcom/ui/comm/v4/a$h$a;

    sget-object v1, Lcom/ui/comm/v4/a$h$a;->DEBUG:Lcom/ui/comm/v4/a$h$a;

    sget-object v2, Lcom/ui/comm/v4/a$h$a;->VERBOSE:Lcom/ui/comm/v4/a$h$a;

    sget-object v3, Lcom/ui/comm/v4/a$h$a;->INFO:Lcom/ui/comm/v4/a$h$a;

    sget-object v4, Lcom/ui/comm/v4/a$h$a;->WARN:Lcom/ui/comm/v4/a$h$a;

    sget-object v5, Lcom/ui/comm/v4/a$h$a;->ERROR:Lcom/ui/comm/v4/a$h$a;

    sget-object v6, Lcom/ui/comm/v4/a$h$a;->CRITICAL:Lcom/ui/comm/v4/a$h$a;

    filled-new-array/range {v0 .. v6}, [Lcom/ui/comm/v4/a$h$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/comm/v4/a$h$a;

    const-string/jumbo v1, "SILLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/a$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/a$h$a;->SILLY:Lcom/ui/comm/v4/a$h$a;

    new-instance v0, Lcom/ui/comm/v4/a$h$a;

    const-string v1, "DEBUG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/a$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/a$h$a;->DEBUG:Lcom/ui/comm/v4/a$h$a;

    new-instance v0, Lcom/ui/comm/v4/a$h$a;

    const-string/jumbo v1, "VERBOSE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/a$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/a$h$a;->VERBOSE:Lcom/ui/comm/v4/a$h$a;

    new-instance v0, Lcom/ui/comm/v4/a$h$a;

    const-string/jumbo v1, "INFO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/a$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/a$h$a;->INFO:Lcom/ui/comm/v4/a$h$a;

    new-instance v0, Lcom/ui/comm/v4/a$h$a;

    const-string/jumbo v1, "WARN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/a$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/a$h$a;->WARN:Lcom/ui/comm/v4/a$h$a;

    new-instance v0, Lcom/ui/comm/v4/a$h$a;

    const-string/jumbo v1, "ERROR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/a$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/a$h$a;->ERROR:Lcom/ui/comm/v4/a$h$a;

    new-instance v0, Lcom/ui/comm/v4/a$h$a;

    const-string v1, "CRITICAL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/ui/comm/v4/a$h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/comm/v4/a$h$a;->CRITICAL:Lcom/ui/comm/v4/a$h$a;

    invoke-static {}, Lcom/ui/comm/v4/a$h$a;->$values()[Lcom/ui/comm/v4/a$h$a;

    move-result-object v0

    sput-object v0, Lcom/ui/comm/v4/a$h$a;->$VALUES:[Lcom/ui/comm/v4/a$h$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ui/comm/v4/a$h$a;
    .locals 1

    const-class v0, Lcom/ui/comm/v4/a$h$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/comm/v4/a$h$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/comm/v4/a$h$a;
    .locals 1

    sget-object v0, Lcom/ui/comm/v4/a$h$a;->$VALUES:[Lcom/ui/comm/v4/a$h$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/comm/v4/a$h$a;

    return-object v0
.end method
