.class public abstract Ls3/g;
.super Ls3/c;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/a$f;


# instance fields
.field private final F:Ls3/d;

.field private final G:Ljava/util/Set;

.field private final H:Landroid/accounts/Account;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILs3/d;Lcom/google/android/gms/common/api/e$a;Lcom/google/android/gms/common/api/e$b;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Ls3/g;-><init>(Landroid/content/Context;Landroid/os/Looper;ILs3/d;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/k;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILs3/d;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/k;)V
    .locals 9

    .line 2
    invoke-static {p1}, Ls3/h;->a(Landroid/content/Context;)Ls3/h;

    move-result-object v3

    .line 3
    invoke-static {}, Lr3/e;->n()Lr3/e;

    move-result-object v4

    .line 4
    invoke-static {p5}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    move-object v7, p5

    check-cast v7, Lcom/google/android/gms/common/api/internal/d;

    .line 5
    invoke-static {p6}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    move-object v8, p5

    check-cast v8, Lcom/google/android/gms/common/api/internal/k;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    .line 6
    invoke-direct/range {v0 .. v8}, Ls3/g;-><init>(Landroid/content/Context;Landroid/os/Looper;Ls3/h;Lr3/e;ILs3/d;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/k;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ls3/h;Lr3/e;ILs3/d;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/k;)V
    .locals 10

    move-object v9, p0

    move-object/from16 v0, p7

    move-object/from16 v1, p8

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v6, v2

    goto :goto_0

    .line 7
    :cond_0
    new-instance v3, Ls3/E;

    invoke-direct {v3, v0}, Ls3/E;-><init>(Lcom/google/android/gms/common/api/internal/d;)V

    move-object v6, v3

    :goto_0
    if-nez v1, :cond_1

    move-object v7, v2

    goto :goto_1

    .line 8
    :cond_1
    new-instance v0, Ls3/F;

    invoke-direct {v0, v1}, Ls3/F;-><init>(Lcom/google/android/gms/common/api/internal/k;)V

    move-object v7, v0

    .line 9
    :goto_1
    invoke-virtual/range {p6 .. p6}, Ls3/d;->h()Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 10
    invoke-direct/range {v0 .. v8}, Ls3/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Ls3/h;Lr3/f;ILs3/c$a;Ls3/c$b;Ljava/lang/String;)V

    move-object/from16 v0, p6

    iput-object v0, v9, Ls3/g;->F:Ls3/d;

    .line 11
    invoke-virtual/range {p6 .. p6}, Ls3/d;->a()Landroid/accounts/Account;

    move-result-object v1

    iput-object v1, v9, Ls3/g;->H:Landroid/accounts/Account;

    .line 12
    invoke-virtual/range {p6 .. p6}, Ls3/d;->c()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, v0}, Ls3/g;->i0(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, v9, Ls3/g;->G:Ljava/util/Set;

    return-void
.end method

.method private final i0(Ljava/util/Set;)Ljava/util/Set;
    .locals 3

    invoke-virtual {p0, p1}, Ls3/g;->h0(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Expanding scopes is not permitted, use implied scopes instead"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v0
.end method


# virtual methods
.method protected final A()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ls3/g;->G:Ljava/util/Set;

    return-object v0
.end method

.method public a()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Ls3/c;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/g;->G:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method protected h0(Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    return-object p1
.end method

.method public final s()Landroid/accounts/Account;
    .locals 1

    iget-object v0, p0, Ls3/g;->H:Landroid/accounts/Account;

    return-object v0
.end method

.method protected u()Ljava/util/concurrent/Executor;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
