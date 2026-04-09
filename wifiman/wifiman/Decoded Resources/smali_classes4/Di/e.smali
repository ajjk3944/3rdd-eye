.class public final LDi/e;
.super LDi/b;
.source "SourceFile"

# interfaces
.implements LCi/f;


# instance fields
.field private final b:[Ljava/lang/Object;

.field private final c:[Ljava/lang/Object;

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;II)V
    .locals 1

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LDi/b;-><init>()V

    iput-object p1, p0, LDi/e;->b:[Ljava/lang/Object;

    iput-object p2, p0, LDi/e;->c:[Ljava/lang/Object;

    iput p3, p0, LDi/e;->d:I

    iput p4, p0, LDi/e;->e:I

    invoke-virtual {p0}, LZg/b;->size()I

    move-result p1

    const/16 p3, 0x20

    if-le p1, p3, :cond_1

    invoke-virtual {p0}, LZg/b;->size()I

    move-result p1

    invoke-virtual {p0}, LZg/b;->size()I

    move-result p4

    invoke-static {p4}, LDi/l;->c(I)I

    move-result p4

    sub-int/2addr p1, p4

    array-length p2, p2

    invoke-static {p2, p3}, Lsh/m;->g(II)I

    move-result p2

    if-gt p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, LHi/a;->a(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Trie-based persistent vector should have at least 33 elements, got "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LZg/b;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final J()I
    .locals 1

    invoke-virtual {p0}, LZg/b;->size()I

    move-result v0

    invoke-static {v0}, LDi/l;->c(I)I

    move-result v0

    return v0
.end method

.method private final y(I)[Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, LDi/e;->J()I

    move-result v0

    if-gt v0, p1, :cond_0

    iget-object p1, p0, LDi/e;->c:[Ljava/lang/Object;

    return-object p1

    :cond_0
    iget-object v0, p0, LDi/e;->b:[Ljava/lang/Object;

    iget v1, p0, LDi/e;->e:I

    :goto_0
    if-lez v1, :cond_1

    invoke-static {p1, v1}, LDi/l;->a(II)I

    move-result v2

    aget-object v0, v0, v2

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    add-int/lit8 v1, v1, -0x5

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public C()LDi/f;
    .locals 4

    new-instance v0, LDi/f;

    iget-object v1, p0, LDi/e;->b:[Ljava/lang/Object;

    iget-object v2, p0, LDi/e;->c:[Ljava/lang/Object;

    iget v3, p0, LDi/e;->e:I

    invoke-direct {v0, p0, v1, v2, v3}, LDi/f;-><init>(LCi/f;[Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-object v0
.end method

.method public bridge synthetic c()LCi/f$a;
    .locals 1

    invoke-virtual {p0}, LDi/e;->C()LDi/f;

    move-result-object v0

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZg/b;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->a(II)V

    invoke-direct {p0, p1}, LDi/e;->y(I)[Ljava/lang/Object;

    move-result-object v0

    and-int/lit8 p1, p1, 0x1f

    aget-object p1, v0, p1

    return-object p1
.end method

.method public j()I
    .locals 1

    iget v0, p0, LDi/e;->d:I

    return v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 7

    invoke-virtual {p0}, LZg/b;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->b(II)V

    new-instance v0, LDi/g;

    iget-object v2, p0, LDi/e;->b:[Ljava/lang/Object;

    iget-object v3, p0, LDi/e;->c:[Ljava/lang/Object;

    invoke-virtual {p0}, LZg/b;->size()I

    move-result v5

    iget v1, p0, LDi/e;->e:I

    div-int/lit8 v1, v1, 0x5

    add-int/lit8 v6, v1, 0x1

    move-object v1, v0

    move v4, p1

    invoke-direct/range {v1 .. v6}, LDi/g;-><init>([Ljava/lang/Object;[Ljava/lang/Object;III)V

    return-object v0
.end method
