.class public final Lm0/k0;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;


# instance fields
.field private n:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Lm0/k0;->n:Lmh/l;

    return-void
.end method


# virtual methods
.method public final D2()Lmh/l;
    .locals 1

    iget-object v0, p0, Lm0/k0;->n:Lmh/l;

    return-object v0
.end method

.method public final E2()V
    .locals 3

    const/4 v0, 0x2

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->H2()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lm0/k0;->n:Lmh/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LE0/c0;->w3(Lmh/l;Z)V

    :cond_0
    return-void
.end method

.method public final F2(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lm0/k0;->n:Lmh/l;

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 7

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Lm0/k0$a;

    invoke-direct {v4, p2, p0}, Lm0/k0$a;-><init>(Landroidx/compose/ui/layout/t;Lm0/k0;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public i2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BlockGraphicsLayerModifier(block="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/k0;->n:Lmh/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
