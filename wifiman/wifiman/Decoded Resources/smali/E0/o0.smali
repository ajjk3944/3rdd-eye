.class public final LE0/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:I


# instance fields
.field private final a:Landroidx/compose/runtime/snapshots/l;

.field private final b:Lmh/l;

.field private final c:Lmh/l;

.field private final d:Lmh/l;

.field private final e:Lmh/l;

.field private final f:Lmh/l;

.field private final g:Lmh/l;

.field private final h:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Landroidx/compose/runtime/snapshots/l;->k:I

    sput v0, LE0/o0;->i:I

    return-void
.end method

.method public constructor <init>(Lmh/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/compose/runtime/snapshots/l;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/snapshots/l;-><init>(Lmh/l;)V

    iput-object v0, p0, LE0/o0;->a:Landroidx/compose/runtime/snapshots/l;

    sget-object p1, LE0/o0$f;->a:LE0/o0$f;

    iput-object p1, p0, LE0/o0;->b:Lmh/l;

    sget-object p1, LE0/o0$g;->a:LE0/o0$g;

    iput-object p1, p0, LE0/o0;->c:Lmh/l;

    sget-object p1, LE0/o0$h;->a:LE0/o0$h;

    iput-object p1, p0, LE0/o0;->d:Lmh/l;

    sget-object p1, LE0/o0$b;->a:LE0/o0$b;

    iput-object p1, p0, LE0/o0;->e:Lmh/l;

    sget-object p1, LE0/o0$c;->a:LE0/o0$c;

    iput-object p1, p0, LE0/o0;->f:Lmh/l;

    sget-object p1, LE0/o0$d;->a:LE0/o0$d;

    iput-object p1, p0, LE0/o0;->g:Lmh/l;

    sget-object p1, LE0/o0$e;->a:LE0/o0$e;

    iput-object p1, p0, LE0/o0;->h:Lmh/l;

    return-void
.end method

.method public static synthetic d(LE0/o0;LE0/G;ZLmh/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LE0/o0;->c(LE0/G;ZLmh/a;)V

    return-void
.end method

.method public static synthetic f(LE0/o0;LE0/G;ZLmh/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LE0/o0;->e(LE0/G;ZLmh/a;)V

    return-void
.end method

.method public static synthetic h(LE0/o0;LE0/G;ZLmh/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LE0/o0;->g(LE0/G;ZLmh/a;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LE0/o0;->a:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/l;->k(Ljava/lang/Object;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LE0/o0;->a:Landroidx/compose/runtime/snapshots/l;

    sget-object v1, LE0/o0$a;->a:LE0/o0$a;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/l;->l(Lmh/l;)V

    return-void
.end method

.method public final c(LE0/G;ZLmh/a;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LE0/G;->a0()LE0/G;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LE0/o0;->g:Lmh/l;

    invoke-virtual {p0, p1, p2, p3}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LE0/o0;->f:Lmh/l;

    invoke-virtual {p0, p1, p2, p3}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    :goto_0
    return-void
.end method

.method public final e(LE0/G;ZLmh/a;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LE0/G;->a0()LE0/G;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LE0/o0;->h:Lmh/l;

    invoke-virtual {p0, p1, p2, p3}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LE0/o0;->e:Lmh/l;

    invoke-virtual {p0, p1, p2, p3}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    :goto_0
    return-void
.end method

.method public final g(LE0/G;ZLmh/a;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LE0/G;->a0()LE0/G;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LE0/o0;->b:Lmh/l;

    invoke-virtual {p0, p1, p2, p3}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LE0/o0;->c:Lmh/l;

    invoke-virtual {p0, p1, p2, p3}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    :goto_0
    return-void
.end method

.method public final i(LE0/n0;Lmh/l;Lmh/a;)V
    .locals 1

    iget-object v0, p0, LE0/o0;->a:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/runtime/snapshots/l;->o(Ljava/lang/Object;Lmh/l;Lmh/a;)V

    return-void
.end method

.method public final j(LE0/G;Lmh/a;)V
    .locals 1

    iget-object v0, p0, LE0/o0;->d:Lmh/l;

    invoke-virtual {p0, p1, v0, p2}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    return-void
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, LE0/o0;->a:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/l;->s()V

    return-void
.end method

.method public final l()V
    .locals 1

    iget-object v0, p0, LE0/o0;->a:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/l;->t()V

    iget-object v0, p0, LE0/o0;->a:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/l;->j()V

    return-void
.end method
