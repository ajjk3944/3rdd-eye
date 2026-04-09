.class public final enum Lcom/amazonaws/logging/LogFactory$Level;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amazonaws/logging/LogFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Level"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amazonaws/logging/LogFactory$Level;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amazonaws/logging/LogFactory$Level;

.field public static final enum ALL:Lcom/amazonaws/logging/LogFactory$Level;

.field public static final enum DEBUG:Lcom/amazonaws/logging/LogFactory$Level;

.field public static final enum ERROR:Lcom/amazonaws/logging/LogFactory$Level;

.field public static final enum INFO:Lcom/amazonaws/logging/LogFactory$Level;

.field public static final enum OFF:Lcom/amazonaws/logging/LogFactory$Level;

.field public static final enum TRACE:Lcom/amazonaws/logging/LogFactory$Level;

.field public static final enum WARN:Lcom/amazonaws/logging/LogFactory$Level;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/amazonaws/logging/LogFactory$Level;

    const/high16 v1, -0x80000000

    const-string v2, "ALL"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/amazonaws/logging/LogFactory$Level;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/amazonaws/logging/LogFactory$Level;->ALL:Lcom/amazonaws/logging/LogFactory$Level;

    new-instance v1, Lcom/amazonaws/logging/LogFactory$Level;

    const-string v2, "TRACE"

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v3}, Lcom/amazonaws/logging/LogFactory$Level;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/amazonaws/logging/LogFactory$Level;->TRACE:Lcom/amazonaws/logging/LogFactory$Level;

    new-instance v2, Lcom/amazonaws/logging/LogFactory$Level;

    const-string v3, "DEBUG"

    const/4 v5, 0x2

    invoke-direct {v2, v3, v5, v4}, Lcom/amazonaws/logging/LogFactory$Level;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/amazonaws/logging/LogFactory$Level;->DEBUG:Lcom/amazonaws/logging/LogFactory$Level;

    new-instance v3, Lcom/amazonaws/logging/LogFactory$Level;

    const-string v4, "INFO"

    const/4 v6, 0x3

    invoke-direct {v3, v4, v6, v5}, Lcom/amazonaws/logging/LogFactory$Level;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/amazonaws/logging/LogFactory$Level;->INFO:Lcom/amazonaws/logging/LogFactory$Level;

    new-instance v4, Lcom/amazonaws/logging/LogFactory$Level;

    const-string v5, "WARN"

    const/4 v7, 0x4

    invoke-direct {v4, v5, v7, v6}, Lcom/amazonaws/logging/LogFactory$Level;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/amazonaws/logging/LogFactory$Level;->WARN:Lcom/amazonaws/logging/LogFactory$Level;

    new-instance v5, Lcom/amazonaws/logging/LogFactory$Level;

    const-string v6, "ERROR"

    const/4 v8, 0x5

    invoke-direct {v5, v6, v8, v7}, Lcom/amazonaws/logging/LogFactory$Level;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/amazonaws/logging/LogFactory$Level;->ERROR:Lcom/amazonaws/logging/LogFactory$Level;

    new-instance v6, Lcom/amazonaws/logging/LogFactory$Level;

    const/4 v7, 0x6

    const v8, 0x7fffffff

    const-string v9, "OFF"

    invoke-direct {v6, v9, v7, v8}, Lcom/amazonaws/logging/LogFactory$Level;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/amazonaws/logging/LogFactory$Level;->OFF:Lcom/amazonaws/logging/LogFactory$Level;

    filled-new-array/range {v0 .. v6}, [Lcom/amazonaws/logging/LogFactory$Level;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/logging/LogFactory$Level;->$VALUES:[Lcom/amazonaws/logging/LogFactory$Level;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/amazonaws/logging/LogFactory$Level;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/logging/LogFactory$Level;
    .locals 1

    const-class v0, Lcom/amazonaws/logging/LogFactory$Level;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/logging/LogFactory$Level;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/logging/LogFactory$Level;
    .locals 1

    sget-object v0, Lcom/amazonaws/logging/LogFactory$Level;->$VALUES:[Lcom/amazonaws/logging/LogFactory$Level;

    invoke-virtual {v0}, [Lcom/amazonaws/logging/LogFactory$Level;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/logging/LogFactory$Level;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/amazonaws/logging/LogFactory$Level;->value:I

    return v0
.end method
