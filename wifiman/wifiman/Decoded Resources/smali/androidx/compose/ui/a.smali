.class public final Landroidx/compose/ui/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/e;


# instance fields
.field private final a:Landroidx/compose/ui/e;

.field private final b:Landroidx/compose/ui/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/e;Landroidx/compose/ui/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/e;

    return-void
.end method


# virtual methods
.method public L(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/e;

    iget-object v1, p0, Landroidx/compose/ui/a;->a:Landroidx/compose/ui/e;

    invoke-interface {v1, p1, p2}, Landroidx/compose/ui/e;->L(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/e;->L(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a()Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/e;

    return-object v0
.end method

.method public final c()Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/a;->a:Landroidx/compose/ui/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/compose/ui/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/a;->a:Landroidx/compose/ui/e;

    check-cast p1, Landroidx/compose/ui/a;

    iget-object v1, p1, Landroidx/compose/ui/a;->a:Landroidx/compose/ui/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/e;

    iget-object p1, p1, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/e;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/a;->a:Landroidx/compose/ui/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/e;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

.method public s(Lmh/l;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/a;->a:Landroidx/compose/ui/e;

    invoke-interface {v0, p1}, Landroidx/compose/ui/e;->s(Lmh/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/e;

    invoke-interface {v0, p1}, Landroidx/compose/ui/e;->s(Lmh/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ""

    sget-object v2, Landroidx/compose/ui/a$a;->a:Landroidx/compose/ui/a$a;

    invoke-virtual {p0, v1, v2}, Landroidx/compose/ui/a;->L(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
