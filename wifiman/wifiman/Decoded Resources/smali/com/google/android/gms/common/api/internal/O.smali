.class public final Lcom/google/android/gms/common/api/internal/O;
.super LN3/d;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/e$a;
.implements Lcom/google/android/gms/common/api/e$b;


# static fields
.field private static final k:Lcom/google/android/gms/common/api/a$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Handler;

.field private final c:Lcom/google/android/gms/common/api/a$a;

.field private final d:Ljava/util/Set;

.field private final e:Ls3/d;

.field private f:LM3/e;

.field private j:Lcom/google/android/gms/common/api/internal/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LM3/d;->c:Lcom/google/android/gms/common/api/a$a;

    sput-object v0, Lcom/google/android/gms/common/api/internal/O;->k:Lcom/google/android/gms/common/api/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ls3/d;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/api/internal/O;->k:Lcom/google/android/gms/common/api/a$a;

    invoke-direct {p0}, LN3/d;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/O;->b:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/d;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->e:Ls3/d;

    invoke-virtual {p3}, Ls3/d;->e()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->d:Ljava/util/Set;

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/O;->c:Lcom/google/android/gms/common/api/a$a;

    return-void
.end method

.method static bridge synthetic o0(Lcom/google/android/gms/common/api/internal/O;)Lcom/google/android/gms/common/api/internal/N;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/O;->j:Lcom/google/android/gms/common/api/internal/N;

    return-object p0
.end method

.method static bridge synthetic p0(Lcom/google/android/gms/common/api/internal/O;LN3/l;)V
    .locals 4

    invoke-virtual {p1}, LN3/l;->b()Lr3/b;

    move-result-object v0

    invoke-virtual {v0}, Lr3/b;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, LN3/l;->e()Ls3/K;

    move-result-object p1

    invoke-static {p1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/K;

    invoke-virtual {p1}, Ls3/K;->b()Lr3/b;

    move-result-object v0

    invoke-virtual {v0}, Lr3/b;->i()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "SignInCoordinator"

    const-string v3, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->j:Lcom/google/android/gms/common/api/internal/N;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/internal/N;->b(Lr3/b;)V

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/O;->f:LM3/e;

    invoke-interface {p0}, Lcom/google/android/gms/common/api/a$f;->disconnect()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/O;->j:Lcom/google/android/gms/common/api/internal/N;

    invoke-virtual {p1}, Ls3/K;->e()Ls3/j;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/O;->d:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/common/api/internal/N;->a(Ls3/j;Ljava/util/Set;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->j:Lcom/google/android/gms/common/api/internal/N;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/internal/N;->b(Lr3/b;)V

    :goto_0
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/O;->f:LM3/e;

    invoke-interface {p0}, Lcom/google/android/gms/common/api/a$f;->disconnect()V

    return-void
.end method


# virtual methods
.method public final b(Lr3/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/O;->j:Lcom/google/android/gms/common/api/internal/N;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/N;->b(Lr3/b;)V

    return-void
.end method

.method public final b0(LN3/l;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/api/internal/M;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/common/api/internal/M;-><init>(Lcom/google/android/gms/common/api/internal/O;LN3/l;)V

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/O;->j:Lcom/google/android/gms/common/api/internal/N;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/N;->d(I)V

    return-void
.end method

.method public final f(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->f:LM3/e;

    invoke-interface {p1, p0}, LM3/e;->i(LN3/f;)V

    return-void
.end method

.method public final q0(Lcom/google/android/gms/common/api/internal/N;)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/O;->f:LM3/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->disconnect()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/O;->e:Ls3/d;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls3/d;->i(Ljava/lang/Integer;)V

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/O;->c:Lcom/google/android/gms/common/api/a$a;

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/O;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/O;->b:Landroid/os/Handler;

    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/O;->e:Ls3/d;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-virtual {v5}, Ls3/d;->f()LM3/a;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/common/api/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Ls3/d;Ljava/lang/Object;Lcom/google/android/gms/common/api/e$a;Lcom/google/android/gms/common/api/e$b;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/O;->f:LM3/e;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->j:Lcom/google/android/gms/common/api/internal/N;

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->d:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->f:LM3/e;

    invoke-interface {p1}, LM3/e;->n()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/O;->b:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/common/api/internal/L;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/internal/L;-><init>(Lcom/google/android/gms/common/api/internal/O;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final r0()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/O;->f:LM3/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->disconnect()V

    :cond_0
    return-void
.end method
