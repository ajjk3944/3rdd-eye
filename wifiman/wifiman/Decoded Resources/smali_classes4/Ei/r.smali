.class public final LEi/r;
.super LZg/b;
.source "SourceFile"

# interfaces
.implements LCi/b;


# instance fields
.field private final a:LEi/d;


# direct methods
.method public constructor <init>(LEi/d;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/b;-><init>()V

    iput-object p1, p0, LEi/r;->a:LEi/d;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LEi/r;->a:LEi/d;

    invoke-virtual {v0, p1}, LZg/f;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LEi/s;

    iget-object v1, p0, LEi/r;->a:LEi/d;

    invoke-virtual {v1}, LEi/d;->t()LEi/t;

    move-result-object v1

    invoke-direct {v0, v1}, LEi/s;-><init>(LEi/t;)V

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LEi/r;->a:LEi/d;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    return v0
.end method
