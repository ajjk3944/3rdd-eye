.class public final Lr/o0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/o0$a$a;
    }
.end annotation


# instance fields
.field private final a:Lr/s0;

.field private final b:Ljava/lang/String;

.field private final c:LT/q0;

.field final synthetic d:Lr/o0;


# direct methods
.method public constructor <init>(Lr/o0;Lr/s0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lr/o0$a;->d:Lr/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr/o0$a;->a:Lr/s0;

    iput-object p3, p0, Lr/o0$a;->b:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lr/o0$a;->c:LT/q0;

    return-void
.end method


# virtual methods
.method public final a(Lmh/l;Lmh/l;)LT/z1;
    .locals 8

    invoke-virtual {p0}, Lr/o0$a;->b()Lr/o0$a$a;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lr/o0$a$a;

    new-instance v7, Lr/o0$d;

    iget-object v2, p0, Lr/o0$a;->d:Lr/o0;

    invoke-virtual {v2}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object v1, p0, Lr/o0$a;->a:Lr/s0;

    iget-object v4, p0, Lr/o0$a;->d:Lr/o0;

    invoke-virtual {v4}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v4}, Lr/l;->i(Lr/s0;Ljava/lang/Object;)Lr/q;

    move-result-object v4

    iget-object v5, p0, Lr/o0$a;->a:Lr/s0;

    iget-object v6, p0, Lr/o0$a;->b:Ljava/lang/String;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lr/o0$d;-><init>(Lr/o0;Ljava/lang/Object;Lr/q;Lr/s0;Ljava/lang/String;)V

    invoke-direct {v0, p0, v7, p1, p2}, Lr/o0$a$a;-><init>(Lr/o0$a;Lr/o0$d;Lmh/l;Lmh/l;)V

    iget-object v1, p0, Lr/o0$a;->d:Lr/o0;

    invoke-virtual {p0, v0}, Lr/o0$a;->c(Lr/o0$a$a;)V

    invoke-virtual {v0}, Lr/o0$a$a;->g()Lr/o0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lr/o0;->c(Lr/o0$d;)Z

    :cond_0
    iget-object v1, p0, Lr/o0$a;->d:Lr/o0;

    invoke-virtual {v0, p2}, Lr/o0$a$a;->p(Lmh/l;)V

    invoke-virtual {v0, p1}, Lr/o0$a$a;->q(Lmh/l;)V

    invoke-virtual {v1}, Lr/o0;->n()Lr/o0$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lr/o0$a$a;->r(Lr/o0$b;)V

    return-object v0
.end method

.method public final b()Lr/o0$a$a;
    .locals 1

    iget-object v0, p0, Lr/o0$a;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr/o0$a$a;

    return-object v0
.end method

.method public final c(Lr/o0$a$a;)V
    .locals 1

    iget-object v0, p0, Lr/o0$a;->c:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final d()V
    .locals 6

    invoke-virtual {p0}, Lr/o0$a;->b()Lr/o0$a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lr/o0$a;->d:Lr/o0;

    invoke-virtual {v0}, Lr/o0$a$a;->g()Lr/o0$d;

    move-result-object v2

    invoke-virtual {v0}, Lr/o0$a$a;->i()Lmh/l;

    move-result-object v3

    invoke-virtual {v1}, Lr/o0;->n()Lr/o0$b;

    move-result-object v4

    invoke-interface {v4}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Lr/o0$a$a;->i()Lmh/l;

    move-result-object v4

    invoke-virtual {v1}, Lr/o0;->n()Lr/o0$b;

    move-result-object v5

    invoke-interface {v5}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0}, Lr/o0$a$a;->j()Lmh/l;

    move-result-object v0

    invoke-virtual {v1}, Lr/o0;->n()Lr/o0$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr/H;

    invoke-virtual {v2, v3, v4, v0}, Lr/o0$d;->I(Ljava/lang/Object;Ljava/lang/Object;Lr/H;)V

    :cond_0
    return-void
.end method
