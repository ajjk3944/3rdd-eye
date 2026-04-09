.class Lcom/google/common/collect/J$a;
.super Lcom/google/common/collect/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final transient c:Lcom/google/common/collect/p;

.field private final transient d:[Ljava/lang/Object;

.field private final transient e:I

.field private final transient f:I


# direct methods
.method constructor <init>(Lcom/google/common/collect/p;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/r;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/J$a;->c:Lcom/google/common/collect/p;

    iput-object p2, p0, Lcom/google/common/collect/J$a;->d:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/common/collect/J$a;->e:I

    iput p4, p0, Lcom/google/common/collect/J$a;->f:I

    return-void
.end method

.method static synthetic U0(Lcom/google/common/collect/J$a;)I
    .locals 0

    iget p0, p0, Lcom/google/common/collect/J$a;->f:I

    return p0
.end method

.method static synthetic V0(Lcom/google/common/collect/J$a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/common/collect/J$a;->d:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic W0(Lcom/google/common/collect/J$a;)I
    .locals 0

    iget p0, p0, Lcom/google/common/collect/J$a;->e:I

    return p0
.end method


# virtual methods
.method J()Lcom/google/common/collect/o;
    .locals 1

    new-instance v0, Lcom/google/common/collect/J$a$a;

    invoke-direct {v0, p0}, Lcom/google/common/collect/J$a$a;-><init>(Lcom/google/common/collect/J$a;)V

    return-object v0
.end method

.method public T()Lcom/google/common/collect/S;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/r;->v()Lcom/google/common/collect/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/o;->F()Lcom/google/common/collect/S;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/google/common/collect/J$a;->c:Lcom/google/common/collect/p;

    invoke-virtual {v2, v0}, Lcom/google/common/collect/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method g([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/r;->v()Lcom/google/common/collect/o;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/common/collect/o;->g([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/J$a;->T()Lcom/google/common/collect/S;

    move-result-object v0

    return-object v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/J$a;->f:I

    return v0
.end method
