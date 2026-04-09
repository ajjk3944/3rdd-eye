.class final enum Lcom/google/ar/core/M;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lcom/google/ar/core/M;

.field public static final enum b:Lcom/google/ar/core/M;

.field public static final enum c:Lcom/google/ar/core/M;

.field private static final synthetic d:[Lcom/google/ar/core/M;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/ar/core/M;

    const-string v1, "ACCEPTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/ar/core/M;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/ar/core/M;->a:Lcom/google/ar/core/M;

    new-instance v1, Lcom/google/ar/core/M;

    const-string v2, "CANCELLED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/google/ar/core/M;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/ar/core/M;->b:Lcom/google/ar/core/M;

    new-instance v2, Lcom/google/ar/core/M;

    const-string v3, "COMPLETED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/google/ar/core/M;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/google/ar/core/M;->c:Lcom/google/ar/core/M;

    filled-new-array {v0, v1, v2}, [Lcom/google/ar/core/M;

    move-result-object v0

    sput-object v0, Lcom/google/ar/core/M;->d:[Lcom/google/ar/core/M;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/ar/core/M;
    .locals 1

    sget-object v0, Lcom/google/ar/core/M;->d:[Lcom/google/ar/core/M;

    invoke-virtual {v0}, [Lcom/google/ar/core/M;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/ar/core/M;

    return-object v0
.end method
