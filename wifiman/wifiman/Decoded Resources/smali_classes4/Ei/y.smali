.class public final LEi/y;
.super LEi/u;
.source "SourceFile"


# instance fields
.field private final d:LEi/i;


# direct methods
.method public constructor <init>(LEi/i;)V
    .locals 1

    const-string v0, "parentIterator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEi/u;-><init>()V

    iput-object p1, p0, LEi/y;->d:LEi/i;

    return-void
.end method


# virtual methods
.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LEi/y;->r()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public r()Ljava/util/Map$Entry;
    .locals 5

    invoke-virtual {p0}, LEi/u;->h()Z

    move-result v0

    invoke-static {v0}, LHi/a;->a(Z)V

    invoke-virtual {p0}, LEi/u;->g()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, LEi/u;->q(I)V

    new-instance v0, LEi/c;

    iget-object v1, p0, LEi/y;->d:LEi/i;

    invoke-virtual {p0}, LEi/u;->f()[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, LEi/u;->g()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    aget-object v2, v2, v3

    invoke-virtual {p0}, LEi/u;->f()[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0}, LEi/u;->g()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    aget-object v3, v3, v4

    invoke-direct {v0, v1, v2, v3}, LEi/c;-><init>(LEi/i;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
