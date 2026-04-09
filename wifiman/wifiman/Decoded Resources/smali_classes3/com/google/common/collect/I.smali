.class Lcom/google/common/collect/I;
.super Lcom/google/common/collect/o;
.source "SourceFile"


# static fields
.field static final e:Lcom/google/common/collect/o;


# instance fields
.field final transient c:[Ljava/lang/Object;

.field private final transient d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/common/collect/I;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lcom/google/common/collect/I;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lcom/google/common/collect/I;->e:Lcom/google/common/collect/o;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/o;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/I;->c:[Ljava/lang/Object;

    iput p2, p0, Lcom/google/common/collect/I;->d:I

    return-void
.end method


# virtual methods
.method g([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lcom/google/common/collect/I;->c:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/common/collect/I;->d:I

    invoke-static {v0, v1, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/common/collect/I;->d:I

    add-int/2addr p2, p1

    return p2
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/google/common/collect/I;->d:I

    invoke-static {p1, v0}, Lm4/h;->g(II)I

    iget-object v0, p0, Lcom/google/common/collect/I;->c:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method j()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/I;->c:[Ljava/lang/Object;

    return-object v0
.end method

.method m()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/I;->d:I

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

    iget v0, p0, Lcom/google/common/collect/I;->d:I

    return v0
.end method
