.class final Lz/O;
.super Lz/D;
.source "SourceFile"


# instance fields
.field private final b:Lz/N;


# direct methods
.method public constructor <init>(Lz/N;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lz/D;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lz/O;->b:Lz/N;

    return-void
.end method


# virtual methods
.method public a(Lz/f0;)Lz/f0;
    .locals 1

    iget-object v0, p0, Lz/O;->b:Lz/N;

    invoke-static {v0}, Lz/h0;->e(Lz/N;)Lz/f0;

    move-result-object v0

    invoke-static {v0, p1}, Lz/h0;->d(Lz/f0;Lz/f0;)Lz/f0;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lz/O;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lz/O;

    iget-object p1, p1, Lz/O;->b:Lz/N;

    iget-object v0, p0, Lz/O;->b:Lz/N;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lz/O;->b:Lz/N;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
