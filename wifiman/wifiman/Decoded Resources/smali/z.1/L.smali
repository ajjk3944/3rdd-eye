.class public final Lz/L;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/p0;


# instance fields
.field private n:F

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FZ)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput p1, p0, Lz/L;->n:F

    iput-boolean p2, p0, Lz/L;->o:Z

    return-void
.end method


# virtual methods
.method public D2(LY0/d;Ljava/lang/Object;)Lz/V;
    .locals 7

    instance-of p1, p2, Lz/V;

    if-eqz p1, :cond_0

    check-cast p2, Lz/V;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    new-instance p2, Lz/V;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Lz/V;-><init>(FZLz/m;Lz/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    iget p1, p0, Lz/L;->n:F

    invoke-virtual {p2, p1}, Lz/V;->g(F)V

    iget-boolean p1, p0, Lz/L;->o:Z

    invoke-virtual {p2, p1}, Lz/V;->f(Z)V

    return-object p2
.end method

.method public final E2(Z)V
    .locals 0

    iput-boolean p1, p0, Lz/L;->o:Z

    return-void
.end method

.method public final F2(F)V
    .locals 0

    iput p1, p0, Lz/L;->n:F

    return-void
.end method

.method public bridge synthetic M(LY0/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz/L;->D2(LY0/d;Ljava/lang/Object;)Lz/V;

    move-result-object p1

    return-object p1
.end method
