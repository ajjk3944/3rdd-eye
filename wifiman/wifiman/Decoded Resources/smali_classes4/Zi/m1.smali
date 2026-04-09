.class public final LZi/m1;
.super LZi/K0;
.source "SourceFile"


# instance fields
.field private a:[S

.field private b:I


# direct methods
.method private constructor <init>([S)V
    .locals 1

    const-string v0, "bufferWithData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, LZi/K0;-><init>()V

    .line 3
    iput-object p1, p0, LZi/m1;->a:[S

    .line 4
    invoke-static {p1}, LYg/I;->u([S)I

    move-result p1

    iput p1, p0, LZi/m1;->b:I

    const/16 p1, 0xa

    .line 5
    invoke-virtual {p0, p1}, LZi/m1;->b(I)V

    return-void
.end method

.method public synthetic constructor <init>([SLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZi/m1;-><init>([S)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZi/m1;->f()[S

    move-result-object v0

    invoke-static {v0}, LYg/I;->b([S)LYg/I;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, LZi/m1;->a:[S

    invoke-static {v0}, LYg/I;->u([S)I

    move-result v0

    if-ge v0, p1, :cond_0

    iget-object v0, p0, LZi/m1;->a:[S

    invoke-static {v0}, LYg/I;->u([S)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {p1, v1}, Lsh/m;->d(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([SI)[S

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYg/I;->f([S)[S

    move-result-object p1

    iput-object p1, p0, LZi/m1;->a:[S

    :cond_0
    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, LZi/m1;->b:I

    return v0
.end method

.method public final e(S)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, LZi/K0;->c(LZi/K0;IILjava/lang/Object;)V

    iget-object v0, p0, LZi/m1;->a:[S

    invoke-virtual {p0}, LZi/m1;->d()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LZi/m1;->b:I

    invoke-static {v0, v1, p1}, LYg/I;->y([SIS)V

    return-void
.end method

.method public f()[S
    .locals 2

    iget-object v0, p0, LZi/m1;->a:[S

    invoke-virtual {p0}, LZi/m1;->d()I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([SI)[S

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LYg/I;->f([S)[S

    move-result-object v0

    return-object v0
.end method
