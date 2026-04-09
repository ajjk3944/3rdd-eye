.class Lcom/google/common/collect/l;
.super Lcom/google/common/collect/s;
.source "SourceFile"


# static fields
.field static final d:Lcom/google/common/collect/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/common/collect/l;

    invoke-direct {v0}, Lcom/google/common/collect/l;-><init>()V

    sput-object v0, Lcom/google/common/collect/l;->d:Lcom/google/common/collect/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-static {}, Lcom/google/common/collect/p;->r()Lcom/google/common/collect/p;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/google/common/collect/s;-><init>(Lcom/google/common/collect/p;ILjava/util/Comparator;)V

    return-void
.end method
