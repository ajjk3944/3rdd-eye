.class final LC3/G;
.super LC3/F;
.source "SourceFile"


# static fields
.field static final e:LC3/F;


# instance fields
.field final transient c:[Ljava/lang/Object;

.field private final transient d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LC3/G;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, LC3/G;-><init>([Ljava/lang/Object;I)V

    sput-object v0, LC3/G;->e:LC3/F;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, LC3/F;-><init>()V

    iput-object p1, p0, LC3/G;->c:[Ljava/lang/Object;

    iput p2, p0, LC3/G;->d:I

    return-void
.end method


# virtual methods
.method final g()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC3/G;->c:[Ljava/lang/Object;

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LC3/G;->d:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LC3/z;->a(IILjava/lang/String;)I

    iget-object v0, p0, LC3/G;->c:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method final j()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final m()I
    .locals 1

    iget v0, p0, LC3/G;->d:I

    return v0
.end method

.method final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LC3/G;->d:I

    return v0
.end method

.method final v([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, LC3/G;->c:[Ljava/lang/Object;

    const/4 v0, 0x0

    iget v1, p0, LC3/G;->d:I

    invoke-static {p2, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, LC3/G;->d:I

    return p1
.end method
