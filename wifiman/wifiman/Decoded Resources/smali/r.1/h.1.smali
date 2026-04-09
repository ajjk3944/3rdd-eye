.class public final Lr/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr/s0;

.field private final b:Ljava/lang/Object;

.field private final c:J

.field private final d:Lmh/a;

.field private final e:LT/q0;

.field private f:Lr/q;

.field private g:J

.field private h:J

.field private final i:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lr/s0;Lr/q;JLjava/lang/Object;JZLmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr/h;->a:Lr/s0;

    iput-object p6, p0, Lr/h;->b:Ljava/lang/Object;

    iput-wide p7, p0, Lr/h;->c:J

    iput-object p10, p0, Lr/h;->d:Lmh/a;

    const/4 p2, 0x0

    const/4 p6, 0x2

    invoke-static {p1, p2, p6, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lr/h;->e:LT/q0;

    invoke-static {p3}, Lr/r;->e(Lr/q;)Lr/q;

    move-result-object p1

    iput-object p1, p0, Lr/h;->f:Lr/q;

    iput-wide p4, p0, Lr/h;->g:J

    const-wide/high16 p3, -0x8000000000000000L

    iput-wide p3, p0, Lr/h;->h:J

    invoke-static {p9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, p2, p6, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lr/h;->i:LT/q0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lr/h;->k(Z)V

    iget-object v0, p0, Lr/h;->d:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lr/h;->h:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lr/h;->g:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lr/h;->c:J

    return-wide v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/h;->e:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lr/h;->a:Lr/s0;

    invoke-interface {v0}, Lr/s0;->b()Lmh/l;

    move-result-object v0

    iget-object v1, p0, Lr/h;->f:Lr/q;

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lr/q;
    .locals 1

    iget-object v0, p0, Lr/h;->f:Lr/q;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lr/h;->i:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final i(J)V
    .locals 0

    iput-wide p1, p0, Lr/h;->h:J

    return-void
.end method

.method public final j(J)V
    .locals 0

    iput-wide p1, p0, Lr/h;->g:J

    return-void
.end method

.method public final k(Z)V
    .locals 1

    iget-object v0, p0, Lr/h;->i:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr/h;->e:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final m(Lr/q;)V
    .locals 0

    iput-object p1, p0, Lr/h;->f:Lr/q;

    return-void
.end method
