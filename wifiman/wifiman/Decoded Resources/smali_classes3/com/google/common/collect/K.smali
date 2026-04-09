.class final Lcom/google/common/collect/K;
.super Lcom/google/common/collect/r;
.source "SourceFile"


# static fields
.field private static final h:[Ljava/lang/Object;

.field static final i:Lcom/google/common/collect/K;


# instance fields
.field final transient c:[Ljava/lang/Object;

.field private final transient d:I

.field final transient e:[Ljava/lang/Object;

.field private final transient f:I

.field private final transient g:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    sput-object v4, Lcom/google/common/collect/K;->h:[Ljava/lang/Object;

    new-instance v0, Lcom/google/common/collect/K;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    move-object v2, v4

    invoke-direct/range {v1 .. v6}, Lcom/google/common/collect/K;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v0, Lcom/google/common/collect/K;->i:Lcom/google/common/collect/K;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/r;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/K;->c:[Ljava/lang/Object;

    iput p2, p0, Lcom/google/common/collect/K;->d:I

    iput-object p3, p0, Lcom/google/common/collect/K;->e:[Ljava/lang/Object;

    iput p4, p0, Lcom/google/common/collect/K;->f:I

    iput p5, p0, Lcom/google/common/collect/K;->g:I

    return-void
.end method


# virtual methods
.method J()Lcom/google/common/collect/o;
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/K;->c:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/common/collect/K;->g:I

    invoke-static {v0, v1}, Lcom/google/common/collect/o;->y([Ljava/lang/Object;I)Lcom/google/common/collect/o;

    move-result-object v0

    return-object v0
.end method

.method S()Z
    .locals 1

    const/4 v0, 0x1

    return v0
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
    .locals 4

    iget-object v0, p0, Lcom/google/common/collect/K;->e:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    array-length v2, v0

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lcom/google/common/collect/m;->c(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    iget v3, p0, Lcom/google/common/collect/K;->f:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method g([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lcom/google/common/collect/K;->c:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/common/collect/K;->g:I

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/common/collect/K;->g:I

    add-int/2addr p2, p1

    return p2
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/K;->d:I

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/K;->T()Lcom/google/common/collect/S;

    move-result-object v0

    return-object v0
.end method

.method j()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/K;->c:[Ljava/lang/Object;

    return-object v0
.end method

.method m()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/K;->g:I

    return v0
.end method

.method o()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/K;->g:I

    return v0
.end method
