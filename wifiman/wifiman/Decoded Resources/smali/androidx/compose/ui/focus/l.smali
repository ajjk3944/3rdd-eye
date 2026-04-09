.class public final Landroidx/compose/ui/focus/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/k;


# instance fields
.field private a:Z

.field private b:Landroidx/compose/ui/focus/o;

.field private c:Landroidx/compose/ui/focus/o;

.field private d:Landroidx/compose/ui/focus/o;

.field private e:Landroidx/compose/ui/focus/o;

.field private f:Landroidx/compose/ui/focus/o;

.field private g:Landroidx/compose/ui/focus/o;

.field private h:Landroidx/compose/ui/focus/o;

.field private i:Landroidx/compose/ui/focus/o;

.field private j:Lmh/l;

.field private k:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/focus/l;->a:Z

    sget-object v0, Landroidx/compose/ui/focus/o;->b:Landroidx/compose/ui/focus/o$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o$a;->b()Landroidx/compose/ui/focus/o;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/l;->b:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o$a;->b()Landroidx/compose/ui/focus/o;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/l;->c:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o$a;->b()Landroidx/compose/ui/focus/o;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/l;->d:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o$a;->b()Landroidx/compose/ui/focus/o;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/l;->e:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o$a;->b()Landroidx/compose/ui/focus/o;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/l;->f:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o$a;->b()Landroidx/compose/ui/focus/o;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/l;->g:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o$a;->b()Landroidx/compose/ui/focus/o;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/l;->h:Landroidx/compose/ui/focus/o;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o$a;->b()Landroidx/compose/ui/focus/o;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/focus/l;->i:Landroidx/compose/ui/focus/o;

    sget-object v0, Landroidx/compose/ui/focus/l$a;->a:Landroidx/compose/ui/focus/l$a;

    iput-object v0, p0, Landroidx/compose/ui/focus/l;->j:Lmh/l;

    sget-object v0, Landroidx/compose/ui/focus/l$b;->a:Landroidx/compose/ui/focus/l$b;

    iput-object v0, p0, Landroidx/compose/ui/focus/l;->k:Lmh/l;

    return-void
.end method


# virtual methods
.method public c()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->f:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public e()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->h:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public f()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->b:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public n()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->g:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/focus/l;->a:Z

    return v0
.end method

.method public p(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/l;->j:Lmh/l;

    return-void
.end method

.method public q(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/l;->k:Lmh/l;

    return-void
.end method

.method public r()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->c:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public s()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->d:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public t()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->k:Lmh/l;

    return-object v0
.end method

.method public u()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->i:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public v()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->e:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public w(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/focus/l;->a:Z

    return-void
.end method

.method public x()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l;->j:Lmh/l;

    return-object v0
.end method
