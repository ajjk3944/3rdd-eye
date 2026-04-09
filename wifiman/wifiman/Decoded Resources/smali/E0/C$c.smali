.class public final LE0/C$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/C;->T(J)Landroidx/compose/ui/layout/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:LC0/D;

.field private final b:I

.field private final c:I


# direct methods
.method constructor <init>(LC0/D;LE0/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/C$c;->a:LC0/D;

    invoke-virtual {p2}, LE0/C;->C2()LE0/Q;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p1

    iput p1, p0, LE0/C$c;->b:I

    invoke-virtual {p2}, LE0/C;->C2()LE0/Q;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p1

    iput p1, p0, LE0/C$c;->c:I

    return-void
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    iget v0, p0, LE0/C$c;->c:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, LE0/C$c;->b:I

    return v0
.end method

.method public p()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LE0/C$c;->a:LC0/D;

    invoke-interface {v0}, LC0/D;->p()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, LE0/C$c;->a:LC0/D;

    invoke-interface {v0}, LC0/D;->q()V

    return-void
.end method

.method public r()Lmh/l;
    .locals 1

    iget-object v0, p0, LE0/C$c;->a:LC0/D;

    invoke-interface {v0}, LC0/D;->r()Lmh/l;

    move-result-object v0

    return-object v0
.end method
