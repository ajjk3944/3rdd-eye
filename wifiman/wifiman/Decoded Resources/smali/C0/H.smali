.class public final LC0/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# instance fields
.field private final a:LC0/G;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LC0/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC0/H;->a:LC0/G;

    return-void
.end method


# virtual methods
.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 1

    iget-object p2, p0, LC0/H;->a:LC0/G;

    invoke-static {p1}, LE0/U;->a(LC0/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3, p4}, LC0/G;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public c(LC0/o;Ljava/util/List;I)I
    .locals 1

    iget-object p2, p0, LC0/H;->a:LC0/G;

    invoke-static {p1}, LE0/U;->a(LC0/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3}, LC0/G;->c(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public e(LC0/o;Ljava/util/List;I)I
    .locals 1

    iget-object p2, p0, LC0/H;->a:LC0/G;

    invoke-static {p1}, LE0/U;->a(LC0/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3}, LC0/G;->e(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LC0/H;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LC0/H;

    iget-object v1, p0, LC0/H;->a:LC0/G;

    iget-object p1, p1, LC0/H;->a:LC0/G;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public f(LC0/o;Ljava/util/List;I)I
    .locals 1

    iget-object p2, p0, LC0/H;->a:LC0/G;

    invoke-static {p1}, LE0/U;->a(LC0/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3}, LC0/G;->f(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LC0/H;->a:LC0/G;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i(LC0/o;Ljava/util/List;I)I
    .locals 1

    iget-object p2, p0, LC0/H;->a:LC0/G;

    invoke-static {p1}, LE0/U;->a(LC0/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, p1, v0, p3}, LC0/G;->i(LC0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MultiContentMeasurePolicyImpl(measurePolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LC0/H;->a:LC0/G;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
