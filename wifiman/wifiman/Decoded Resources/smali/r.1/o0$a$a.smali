.class public final Lr/o0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/z1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/o0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private final a:Lr/o0$d;

.field private b:Lmh/l;

.field private c:Lmh/l;

.field final synthetic d:Lr/o0$a;


# direct methods
.method public constructor <init>(Lr/o0$a;Lr/o0$d;Lmh/l;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lr/o0$a$a;->d:Lr/o0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr/o0$a$a;->a:Lr/o0$d;

    iput-object p3, p0, Lr/o0$a$a;->b:Lmh/l;

    iput-object p4, p0, Lr/o0$a$a;->c:Lmh/l;

    return-void
.end method


# virtual methods
.method public final g()Lr/o0$d;
    .locals 1

    iget-object v0, p0, Lr/o0$a$a;->a:Lr/o0$d;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/o0$a$a;->d:Lr/o0$a;

    iget-object v0, v0, Lr/o0$a;->d:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->n()Lr/o0$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lr/o0$a$a;->r(Lr/o0$b;)V

    iget-object v0, p0, Lr/o0$a$a;->a:Lr/o0$d;

    invoke-virtual {v0}, Lr/o0$d;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final i()Lmh/l;
    .locals 1

    iget-object v0, p0, Lr/o0$a$a;->c:Lmh/l;

    return-object v0
.end method

.method public final j()Lmh/l;
    .locals 1

    iget-object v0, p0, Lr/o0$a$a;->b:Lmh/l;

    return-object v0
.end method

.method public final p(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lr/o0$a$a;->c:Lmh/l;

    return-void
.end method

.method public final q(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lr/o0$a$a;->b:Lmh/l;

    return-void
.end method

.method public final r(Lr/o0$b;)V
    .locals 4

    iget-object v0, p0, Lr/o0$a$a;->c:Lmh/l;

    invoke-interface {p1}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lr/o0$a$a;->d:Lr/o0$a;

    iget-object v1, v1, Lr/o0$a;->d:Lr/o0;

    invoke-virtual {v1}, Lr/o0;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lr/o0$a$a;->c:Lmh/l;

    invoke-interface {p1}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lr/o0$a$a;->a:Lr/o0$d;

    iget-object v3, p0, Lr/o0$a$a;->b:Lmh/l;

    invoke-interface {v3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr/H;

    invoke-virtual {v2, v1, v0, p1}, Lr/o0$d;->I(Ljava/lang/Object;Ljava/lang/Object;Lr/H;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lr/o0$a$a;->a:Lr/o0$d;

    iget-object v2, p0, Lr/o0$a$a;->b:Lmh/l;

    invoke-interface {v2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr/H;

    invoke-virtual {v1, v0, p1}, Lr/o0$d;->K(Ljava/lang/Object;Lr/H;)V

    :goto_0
    return-void
.end method
