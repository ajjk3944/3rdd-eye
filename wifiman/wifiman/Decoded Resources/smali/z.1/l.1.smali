.class final Lz/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/d;


# instance fields
.field private final a:Lmh/l;

.field private b:Lz/f0;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/l;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public Z0(LD0/k;)V
    .locals 1

    invoke-static {}, Lz/i0;->b()LD0/l;

    move-result-object v0

    invoke-interface {p1, v0}, LD0/k;->z(LD0/c;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz/f0;

    iget-object v0, p0, Lz/l;->b:Lz/f0;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lz/l;->b:Lz/f0;

    iget-object v0, p0, Lz/l;->a:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz/l;

    iget-object p1, p1, Lz/l;->a:Lmh/l;

    iget-object v1, p0, Lz/l;->a:Lmh/l;

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lz/l;->a:Lmh/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
