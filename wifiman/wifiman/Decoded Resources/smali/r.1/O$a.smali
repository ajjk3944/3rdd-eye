.class public final Lr/O$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/z1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Ljava/lang/Object;

.field private final c:Lr/s0;

.field private final d:Ljava/lang/String;

.field private final e:LT/q0;

.field private f:Lr/i;

.field private g:Lr/n0;

.field private h:Z

.field private i:Z

.field private j:J

.field final synthetic k:Lr/O;


# direct methods
.method public constructor <init>(Lr/O;Ljava/lang/Object;Ljava/lang/Object;Lr/s0;Lr/i;Ljava/lang/String;)V
    .locals 8

    iput-object p1, p0, Lr/O$a;->k:Lr/O;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr/O$a;->a:Ljava/lang/Object;

    iput-object p3, p0, Lr/O$a;->b:Ljava/lang/Object;

    iput-object p4, p0, Lr/O$a;->c:Lr/s0;

    iput-object p6, p0, Lr/O$a;->d:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p3, 0x2

    invoke-static {p2, p1, p3, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lr/O$a;->e:LT/q0;

    iput-object p5, p0, Lr/O$a;->f:Lr/i;

    new-instance p1, Lr/n0;

    iget-object v1, p0, Lr/O$a;->f:Lr/i;

    iget-object v3, p0, Lr/O$a;->a:Ljava/lang/Object;

    iget-object v4, p0, Lr/O$a;->b:Ljava/lang/Object;

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object v2, p4

    invoke-direct/range {v0 .. v7}, Lr/n0;-><init>(Lr/i;Lr/s0;Ljava/lang/Object;Ljava/lang/Object;Lr/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lr/O$a;->g:Lr/n0;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/O$a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/O$a;->e:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/O$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lr/O$a;->h:Z

    return v0
.end method

.method public final p(J)V
    .locals 2

    iget-object v0, p0, Lr/O$a;->k:Lr/O;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lr/O;->d(Lr/O;Z)V

    iget-boolean v0, p0, Lr/O$a;->i:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lr/O$a;->i:Z

    iput-wide p1, p0, Lr/O$a;->j:J

    :cond_0
    iget-wide v0, p0, Lr/O$a;->j:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Lr/O$a;->g:Lr/n0;

    invoke-virtual {v0, p1, p2}, Lr/n0;->f(J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lr/O$a;->r(Ljava/lang/Object;)V

    iget-object v0, p0, Lr/O$a;->g:Lr/n0;

    invoke-interface {v0, p1, p2}, Lr/d;->e(J)Z

    move-result p1

    iput-boolean p1, p0, Lr/O$a;->h:Z

    return-void
.end method

.method public final q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr/O$a;->i:Z

    return-void
.end method

.method public r(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr/O$a;->e:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, Lr/O$a;->g:Lr/n0;

    invoke-virtual {v0}, Lr/n0;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lr/O$a;->r(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr/O$a;->i:Z

    return-void
.end method

.method public final t(Ljava/lang/Object;Ljava/lang/Object;Lr/i;)V
    .locals 9

    iput-object p1, p0, Lr/O$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lr/O$a;->b:Ljava/lang/Object;

    iput-object p3, p0, Lr/O$a;->f:Lr/i;

    new-instance v8, Lr/n0;

    iget-object v2, p0, Lr/O$a;->c:Lr/s0;

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p3

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v7}, Lr/n0;-><init>(Lr/i;Lr/s0;Ljava/lang/Object;Ljava/lang/Object;Lr/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, p0, Lr/O$a;->g:Lr/n0;

    iget-object p1, p0, Lr/O$a;->k:Lr/O;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lr/O;->d(Lr/O;Z)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lr/O$a;->h:Z

    iput-boolean p2, p0, Lr/O$a;->i:Z

    return-void
.end method
