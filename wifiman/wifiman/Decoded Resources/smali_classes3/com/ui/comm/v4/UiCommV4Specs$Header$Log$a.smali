.class public final enum Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

.field public static final enum CRITICAL:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

.field public static final enum DEBUG:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

.field public static final enum ERROR:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

.field public static final enum INFO:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

.field public static final enum SILLY:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

.field public static final enum VERBOSE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

.field public static final enum WARN:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;
    .locals 7

    sget-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->SILLY:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    sget-object v1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->DEBUG:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    sget-object v2, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->VERBOSE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    sget-object v3, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->INFO:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    sget-object v4, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->WARN:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    sget-object v5, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->ERROR:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    sget-object v6, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->CRITICAL:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    filled-new-array/range {v0 .. v6}, [Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    const/4 v1, 0x0

    const-string/jumbo v2, "silly"

    const-string/jumbo v3, "SILLY"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->SILLY:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    const/4 v1, 0x1

    const-string/jumbo v2, "debug"

    const-string v3, "DEBUG"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->DEBUG:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    const/4 v1, 0x2

    const-string/jumbo v2, "verbose"

    const-string/jumbo v3, "VERBOSE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->VERBOSE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    const/4 v1, 0x3

    const-string/jumbo v2, "info"

    const-string/jumbo v3, "INFO"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->INFO:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    const/4 v1, 0x4

    const-string/jumbo v2, "warn"

    const-string/jumbo v3, "WARN"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->WARN:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    const/4 v1, 0x5

    const-string/jumbo v2, "error"

    const-string/jumbo v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->ERROR:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    const/4 v1, 0x6

    const-string/jumbo v2, "critical"

    const-string v3, "CRITICAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->CRITICAL:Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    invoke-static {}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->$values()[Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    move-result-object v0

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->$VALUES:[Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

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

    iput-object p3, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->id:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;
    .locals 1

    const-class v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;
    .locals 1

    sget-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->$VALUES:[Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Log$a;->id:Ljava/lang/String;

    return-object v0
.end method
