.class public final Lpi/s;
.super Lpi/p0;
.source "SourceFile"


# instance fields
.field private final a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/p0;-><init>()V

    iput-object p1, p0, Lpi/s;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lpi/p0;)Lpi/p0;
    .locals 0

    check-cast p1, Lpi/s;

    invoke-virtual {p0, p1}, Lpi/s;->d(Lpi/s;)Lpi/s;

    move-result-object p1

    return-object p1
.end method

.method public b()Lth/d;
    .locals 1

    const-class v0, Lpi/s;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Lpi/p0;)Lpi/p0;
    .locals 0

    check-cast p1, Lpi/s;

    invoke-virtual {p0, p1}, Lpi/s;->f(Lpi/s;)Lpi/s;

    move-result-object p1

    return-object p1
.end method

.method public d(Lpi/s;)Lpi/s;
    .locals 2

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lpi/s;

    iget-object v1, p0, Lpi/s;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    iget-object p1, p1, Lpi/s;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    invoke-static {v1, p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/j;->a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    invoke-direct {v0, p1}, Lpi/s;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    return-object v0
.end method

.method public final e()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    iget-object v0, p0, Lpi/s;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lpi/s;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lpi/s;

    iget-object p1, p1, Lpi/s;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    iget-object v0, p0, Lpi/s;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Lpi/s;)Lpi/s;
    .locals 0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lpi/s;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
