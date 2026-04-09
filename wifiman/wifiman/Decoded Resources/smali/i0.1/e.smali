.class public final Li0/e;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/A0;
.implements Li0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/e$a;
    }
.end annotation


# static fields
.field public static final r:Li0/e$a;

.field public static final s:I


# instance fields
.field private final n:Lmh/l;

.field private final o:Ljava/lang/Object;

.field private p:Li0/d;

.field private q:Li0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li0/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li0/e;->r:Li0/e$a;

    const/16 v0, 0x8

    sput v0, Li0/e;->s:I

    return-void
.end method

.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Li0/e;->n:Lmh/l;

    sget-object p1, Li0/e$a$a;->a:Li0/e$a$a;

    iput-object p1, p0, Li0/e;->o:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic E2(Li0/e;)Lmh/l;
    .locals 0

    iget-object p0, p0, Li0/e;->n:Lmh/l;

    return-object p0
.end method

.method public static final synthetic F2(Li0/e;)Li0/g;
    .locals 0

    iget-object p0, p0, Li0/e;->q:Li0/g;

    return-object p0
.end method

.method public static final synthetic G2(Li0/e;Li0/d;)V
    .locals 0

    iput-object p1, p0, Li0/e;->p:Li0/d;

    return-void
.end method

.method public static final synthetic H2(Li0/e;Li0/g;)V
    .locals 0

    iput-object p1, p0, Li0/e;->q:Li0/g;

    return-void
.end method


# virtual methods
.method public D2(Li0/b;)Z
    .locals 2

    new-instance v0, Lkotlin/jvm/internal/J;

    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    new-instance v1, Li0/e$b;

    invoke-direct {v1, p1, p0, v0}, Li0/e$b;-><init>(Li0/b;Li0/e;Lkotlin/jvm/internal/J;)V

    invoke-static {p0, v1}, Li0/f;->d(LE0/A0;Lmh/l;)V

    iget-boolean p1, v0, Lkotlin/jvm/internal/J;->a:Z

    return p1
.end method

.method public G0(Li0/b;)V
    .locals 3

    iget-object v0, p0, Li0/e;->p:Li0/d;

    if-eqz v0, :cond_0

    invoke-static {p1}, Li0/i;->a(Li0/b;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Li0/f;->b(Li0/d;J)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    move-object v1, v0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v2, Li0/e$d;

    invoke-direct {v2, v1, p0, p1}, Li0/e$d;-><init>(Lkotlin/jvm/internal/N;Li0/e;Li0/b;)V

    invoke-static {p0, v2}, LE0/B0;->f(LE0/A0;Lmh/l;)V

    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, LE0/A0;

    :goto_0
    check-cast v1, Li0/d;

    :goto_1
    if-eqz v1, :cond_2

    if-nez v0, :cond_2

    invoke-static {v1, p1}, Li0/f;->c(Li0/g;Li0/b;)V

    iget-object v0, p0, Li0/e;->q:Li0/g;

    if-eqz v0, :cond_8

    invoke-interface {v0, p1}, Li0/g;->z1(Li0/b;)V

    goto :goto_2

    :cond_2
    if-nez v1, :cond_4

    if-eqz v0, :cond_4

    iget-object v2, p0, Li0/e;->q:Li0/g;

    if-eqz v2, :cond_3

    invoke-static {v2, p1}, Li0/f;->c(Li0/g;Li0/b;)V

    :cond_3
    invoke-interface {v0, p1}, Li0/g;->z1(Li0/b;)V

    goto :goto_2

    :cond_4
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    if-eqz v1, :cond_5

    invoke-static {v1, p1}, Li0/f;->c(Li0/g;Li0/b;)V

    :cond_5
    if-eqz v0, :cond_8

    invoke-interface {v0, p1}, Li0/g;->z1(Li0/b;)V

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    invoke-interface {v1, p1}, Li0/g;->G0(Li0/b;)V

    goto :goto_2

    :cond_7
    iget-object v0, p0, Li0/e;->q:Li0/g;

    if-eqz v0, :cond_8

    invoke-interface {v0, p1}, Li0/g;->G0(Li0/b;)V

    :cond_8
    :goto_2
    iput-object v1, p0, Li0/e;->p:Li0/d;

    return-void
.end method

.method public R1(Li0/b;)V
    .locals 1

    iget-object v0, p0, Li0/e;->q:Li0/g;

    if-nez v0, :cond_0

    iget-object v0, p0, Li0/e;->p:Li0/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Li0/g;->R1(Li0/b;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Li0/g;->R1(Li0/b;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public T(Li0/b;)V
    .locals 1

    iget-object v0, p0, Li0/e;->q:Li0/g;

    if-nez v0, :cond_0

    iget-object v0, p0, Li0/e;->p:Li0/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Li0/g;->T(Li0/b;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Li0/g;->T(Li0/b;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public W()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li0/e;->o:Ljava/lang/Object;

    return-object v0
.end method

.method public c1(Li0/b;)Z
    .locals 1

    iget-object v0, p0, Li0/e;->p:Li0/d;

    if-nez v0, :cond_1

    iget-object v0, p0, Li0/e;->q:Li0/g;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Li0/g;->c1(Li0/b;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Li0/g;->c1(Li0/b;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public o2()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Li0/e;->q:Li0/g;

    iput-object v0, p0, Li0/e;->p:Li0/d;

    return-void
.end method

.method public y0(Li0/b;)V
    .locals 1

    new-instance v0, Li0/e$c;

    invoke-direct {v0, p1}, Li0/e$c;-><init>(Li0/b;)V

    invoke-static {p0, v0}, Li0/f;->d(LE0/A0;Lmh/l;)V

    return-void
.end method

.method public z1(Li0/b;)V
    .locals 1

    iget-object v0, p0, Li0/e;->q:Li0/g;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Li0/g;->z1(Li0/b;)V

    :cond_0
    iget-object v0, p0, Li0/e;->p:Li0/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Li0/g;->z1(Li0/b;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Li0/e;->p:Li0/d;

    return-void
.end method
