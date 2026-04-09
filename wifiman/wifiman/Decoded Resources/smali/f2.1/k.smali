.class public final Lf2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;
.implements Landroidx/lifecycle/S;
.implements Landroidx/lifecycle/i;
.implements Lq2/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/k$a;,
        Lf2/k$b;,
        Lf2/k$c;
    }
.end annotation


# static fields
.field public static final o:Lf2/k$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lf2/r;

.field private final c:Landroid/os/Bundle;

.field private d:Landroidx/lifecycle/k$b;

.field private final e:Lf2/C;

.field private final f:Ljava/lang/String;

.field private final g:Landroid/os/Bundle;

.field private h:Landroidx/lifecycle/p;

.field private final i:Lq2/e;

.field private j:Z

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private m:Landroidx/lifecycle/k$b;

.field private final n:Landroidx/lifecycle/P$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf2/k;->o:Lf2/k$a;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lf2/k;->a:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lf2/k;->b:Lf2/r;

    .line 5
    iput-object p3, p0, Lf2/k;->c:Landroid/os/Bundle;

    .line 6
    iput-object p4, p0, Lf2/k;->d:Landroidx/lifecycle/k$b;

    .line 7
    iput-object p5, p0, Lf2/k;->e:Lf2/C;

    .line 8
    iput-object p6, p0, Lf2/k;->f:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lf2/k;->g:Landroid/os/Bundle;

    .line 10
    new-instance p1, Landroidx/lifecycle/p;

    invoke-direct {p1, p0}, Landroidx/lifecycle/p;-><init>(Landroidx/lifecycle/o;)V

    iput-object p1, p0, Lf2/k;->h:Landroidx/lifecycle/p;

    .line 11
    sget-object p1, Lq2/e;->d:Lq2/e$a;

    invoke-virtual {p1, p0}, Lq2/e$a;->a(Lq2/f;)Lq2/e;

    move-result-object p1

    iput-object p1, p0, Lf2/k;->i:Lq2/e;

    .line 12
    new-instance p1, Lf2/k$d;

    invoke-direct {p1, p0}, Lf2/k$d;-><init>(Lf2/k;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lf2/k;->k:LYg/m;

    .line 13
    new-instance p1, Lf2/k$e;

    invoke-direct {p1, p0}, Lf2/k$e;-><init>(Lf2/k;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lf2/k;->l:LYg/m;

    .line 14
    sget-object p1, Landroidx/lifecycle/k$b;->INITIALIZED:Landroidx/lifecycle/k$b;

    iput-object p1, p0, Lf2/k;->m:Landroidx/lifecycle/k$b;

    .line 15
    invoke-direct {p0}, Lf2/k;->e()Landroidx/lifecycle/K;

    move-result-object p1

    iput-object p1, p0, Lf2/k;->n:Landroidx/lifecycle/P$c;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lf2/k;-><init>(Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Lf2/k;Landroid/os/Bundle;)V
    .locals 9

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v2, p1, Lf2/k;->a:Landroid/content/Context;

    .line 17
    iget-object v3, p1, Lf2/k;->b:Lf2/r;

    .line 18
    iget-object v5, p1, Lf2/k;->d:Landroidx/lifecycle/k$b;

    .line 19
    iget-object v6, p1, Lf2/k;->e:Lf2/C;

    .line 20
    iget-object v7, p1, Lf2/k;->f:Ljava/lang/String;

    .line 21
    iget-object v8, p1, Lf2/k;->g:Landroid/os/Bundle;

    move-object v1, p0

    move-object v4, p2

    .line 22
    invoke-direct/range {v1 .. v8}, Lf2/k;-><init>(Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 23
    iget-object p2, p1, Lf2/k;->d:Landroidx/lifecycle/k$b;

    iput-object p2, p0, Lf2/k;->d:Landroidx/lifecycle/k$b;

    .line 24
    iget-object p1, p1, Lf2/k;->m:Landroidx/lifecycle/k$b;

    invoke-virtual {p0, p1}, Lf2/k;->p(Landroidx/lifecycle/k$b;)V

    return-void
.end method

.method public static final synthetic a(Lf2/k;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lf2/k;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic c(Lf2/k;)Z
    .locals 0

    iget-boolean p0, p0, Lf2/k;->j:Z

    return p0
.end method

.method private final e()Landroidx/lifecycle/K;
    .locals 1

    iget-object v0, p0, Lf2/k;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/K;

    return-object v0
.end method


# virtual methods
.method public O()Landroidx/lifecycle/k;
    .locals 1

    iget-object v0, p0, Lf2/k;->h:Landroidx/lifecycle/p;

    return-object v0
.end method

.method public final d()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Lf2/k;->c:Landroid/os/Bundle;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    iget-object v1, p0, Lf2/k;->c:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    instance-of v1, p1, Lf2/k;

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Lf2/k;->f:Ljava/lang/String;

    check-cast p1, Lf2/k;

    iget-object v2, p1, Lf2/k;->f:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lf2/k;->b:Lf2/r;

    iget-object v2, p1, Lf2/k;->b:Lf2/r;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v1

    invoke-virtual {p1}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lf2/k;->t()Lq2/d;

    move-result-object v1

    invoke-virtual {p1}, Lf2/k;->t()Lq2/d;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lf2/k;->c:Landroid/os/Bundle;

    iget-object v2, p1, Lf2/k;->c:Landroid/os/Bundle;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lf2/k;->c:Landroid/os/Bundle;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_5

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lf2/k;->c:Landroid/os/Bundle;

    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p1, Lf2/k;->c:Landroid/os/Bundle;

    if-eqz v4, :cond_3

    invoke-virtual {v4, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x1

    :cond_5
    :goto_2
    return v0
.end method

.method public final f()Lf2/r;
    .locals 1

    iget-object v0, p0, Lf2/k;->b:Lf2/r;

    return-object v0
.end method

.method public g()Landroidx/lifecycle/P$c;
    .locals 1

    iget-object v0, p0, Lf2/k;->n:Landroidx/lifecycle/P$c;

    return-object v0
.end method

.method public h()Lb2/a;
    .locals 4

    new-instance v0, Lb2/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lb2/b;-><init>(Lb2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, Lf2/k;->a:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    instance-of v3, v1, Landroid/app/Application;

    if-eqz v3, :cond_1

    move-object v2, v1

    check-cast v2, Landroid/app/Application;

    :cond_1
    if-eqz v2, :cond_2

    sget-object v1, Landroidx/lifecycle/P$a;->h:Lb2/a$b;

    invoke-virtual {v0, v1, v2}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    :cond_2
    sget-object v1, Landroidx/lifecycle/H;->a:Lb2/a$b;

    invoke-virtual {v0, v1, p0}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    sget-object v1, Landroidx/lifecycle/H;->b:Lb2/a$b;

    invoke-virtual {v0, v1, p0}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf2/k;->d()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v2, Landroidx/lifecycle/H;->c:Lb2/a$b;

    invoke-virtual {v0, v2, v1}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    :cond_3
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lf2/k;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf2/k;->b:Lf2/r;

    invoke-virtual {v1}, Lf2/r;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lf2/k;->c:Landroid/os/Bundle;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, Lf2/k;->c:Landroid/os/Bundle;

    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lf2/k;->t()Lq2/d;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf2/k;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Landroidx/lifecycle/k$b;
    .locals 1

    iget-object v0, p0, Lf2/k;->m:Landroidx/lifecycle/k$b;

    return-object v0
.end method

.method public final k()Landroidx/lifecycle/E;
    .locals 1

    iget-object v0, p0, Lf2/k;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/E;

    return-object v0
.end method

.method public final l(Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/k$a;->getTargetState()Landroidx/lifecycle/k$b;

    move-result-object p1

    iput-object p1, p0, Lf2/k;->d:Landroidx/lifecycle/k$b;

    invoke-virtual {p0}, Lf2/k;->q()V

    return-void
.end method

.method public final m(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outBundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/k;->i:Lq2/e;

    invoke-virtual {v0, p1}, Lq2/e;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public final n(Lf2/r;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf2/k;->b:Lf2/r;

    return-void
.end method

.method public o()Landroidx/lifecycle/Q;
    .locals 2

    iget-boolean v0, p0, Lf2/k;->j:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lf2/k;->e:Lf2/C;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lf2/k;->f:Ljava/lang/String;

    invoke-interface {v0, v1}, Lf2/C;->l(Ljava/lang/String;)Landroidx/lifecycle/Q;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s ViewModels after the NavBackStackEntry is destroyed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s ViewModels until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p(Landroidx/lifecycle/k$b;)V
    .locals 1

    const-string v0, "maxState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf2/k;->m:Landroidx/lifecycle/k$b;

    invoke-virtual {p0}, Lf2/k;->q()V

    return-void
.end method

.method public final q()V
    .locals 2

    iget-boolean v0, p0, Lf2/k;->j:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lf2/k;->i:Lq2/e;

    invoke-virtual {v0}, Lq2/e;->c()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf2/k;->j:Z

    iget-object v0, p0, Lf2/k;->e:Lf2/C;

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/H;->c(Lq2/f;)V

    :cond_0
    iget-object v0, p0, Lf2/k;->i:Lq2/e;

    iget-object v1, p0, Lf2/k;->g:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lq2/e;->d(Landroid/os/Bundle;)V

    :cond_1
    iget-object v0, p0, Lf2/k;->d:Landroidx/lifecycle/k$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Lf2/k;->m:Landroidx/lifecycle/k$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lf2/k;->h:Landroidx/lifecycle/p;

    iget-object v1, p0, Lf2/k;->d:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->m(Landroidx/lifecycle/k$b;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lf2/k;->h:Landroidx/lifecycle/p;

    iget-object v1, p0, Lf2/k;->m:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->m(Landroidx/lifecycle/k$b;)V

    :goto_0
    return-void
.end method

.method public t()Lq2/d;
    .locals 1

    iget-object v0, p0, Lf2/k;->i:Lq2/e;

    invoke-virtual {v0}, Lq2/e;->b()Lq2/d;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lf2/k;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x28

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf2/k;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf2/k;->b:Lf2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sb.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
