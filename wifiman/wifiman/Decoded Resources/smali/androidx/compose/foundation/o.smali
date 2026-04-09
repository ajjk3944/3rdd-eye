.class public final Landroidx/compose/foundation/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/o$c;
    }
.end annotation


# static fields
.field public static final i:Landroidx/compose/foundation/o$c;

.field private static final j:Lc0/k;


# instance fields
.field private final a:LT/n0;

.field private final b:LT/n0;

.field private final c:Ly/m;

.field private d:LT/n0;

.field private e:F

.field private final f:Lw/y;

.field private final g:LT/z1;

.field private final h:LT/z1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/o$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/o$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/o;->i:Landroidx/compose/foundation/o$c;

    sget-object v0, Landroidx/compose/foundation/o$a;->a:Landroidx/compose/foundation/o$a;

    sget-object v1, Landroidx/compose/foundation/o$b;->a:Landroidx/compose/foundation/o$b;

    invoke-static {v0, v1}, Lc0/l;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    sput-object v0, Landroidx/compose/foundation/o;->j:Lc0/k;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/o;->a:LT/n0;

    const/4 p1, 0x0

    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/o;->b:LT/n0;

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/o;->c:Ly/m;

    const p1, 0x7fffffff

    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/o;->d:LT/n0;

    new-instance p1, Landroidx/compose/foundation/o$f;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/o$f;-><init>(Landroidx/compose/foundation/o;)V

    invoke-static {p1}, Lw/z;->a(Lmh/l;)Lw/y;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/o;->f:Lw/y;

    new-instance p1, Landroidx/compose/foundation/o$e;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/o$e;-><init>(Landroidx/compose/foundation/o;)V

    invoke-static {p1}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/o;->g:LT/z1;

    new-instance p1, Landroidx/compose/foundation/o$d;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/o$d;-><init>(Landroidx/compose/foundation/o;)V

    invoke-static {p1}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/o;->h:LT/z1;

    return-void
.end method

.method public static final synthetic g(Landroidx/compose/foundation/o;)F
    .locals 0

    iget p0, p0, Landroidx/compose/foundation/o;->e:F

    return p0
.end method

.method public static final synthetic h()Lc0/k;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/o;->j:Lc0/k;

    return-object v0
.end method

.method public static final synthetic i(Landroidx/compose/foundation/o;F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/o;->e:F

    return-void
.end method

.method public static final synthetic j(Landroidx/compose/foundation/o;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/o;->o(I)V

    return-void
.end method

.method private final o(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->a:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->f:Lw/y;

    invoke-interface {v0}, Lw/y;->a()Z

    move-result v0

    return v0
.end method

.method public c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->f:Lw/y;

    invoke-interface {v0, p1, p2, p3}, Lw/y;->c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->h:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->g:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public f(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->f:Lw/y;

    invoke-interface {v0, p1}, Lw/y;->f(F)F

    move-result p1

    return p1
.end method

.method public final k()Ly/m;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->c:Ly/m;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->d:LT/n0;

    invoke-interface {v0}, LT/n0;->e()I

    move-result v0

    return v0
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->a:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method public final n(I)V
    .locals 5

    iget-object v0, p0, Landroidx/compose/foundation/o;->d:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/foundation/o;->m()I

    move-result v4

    if-le v4, p1, :cond_1

    invoke-direct {p0, p1}, Landroidx/compose/foundation/o;->o(I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    return-void

    :goto_2
    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw p1
.end method

.method public final p(I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/o;->b:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method
