.class public final Lq2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/e$a;
    }
.end annotation


# static fields
.field public static final d:Lq2/e$a;


# instance fields
.field private final a:Lq2/f;

.field private final b:Lq2/d;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq2/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq2/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lq2/e;->d:Lq2/e$a;

    return-void
.end method

.method private constructor <init>(Lq2/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/e;->a:Lq2/f;

    .line 3
    new-instance p1, Lq2/d;

    invoke-direct {p1}, Lq2/d;-><init>()V

    iput-object p1, p0, Lq2/e;->b:Lq2/d;

    return-void
.end method

.method public synthetic constructor <init>(Lq2/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq2/e;-><init>(Lq2/f;)V

    return-void
.end method

.method public static final a(Lq2/f;)Lq2/e;
    .locals 1

    sget-object v0, Lq2/e;->d:Lq2/e$a;

    invoke-virtual {v0, p0}, Lq2/e$a;->a(Lq2/f;)Lq2/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Lq2/d;
    .locals 1

    iget-object v0, p0, Lq2/e;->b:Lq2/d;

    return-object v0
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lq2/e;->a:Lq2/f;

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/k$b;->INITIALIZED:Landroidx/lifecycle/k$b;

    if-ne v1, v2, :cond_0

    new-instance v1, Lq2/b;

    iget-object v2, p0, Lq2/e;->a:Lq2/f;

    invoke-direct {v1, v2}, Lq2/b;-><init>(Lq2/f;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    iget-object v1, p0, Lq2/e;->b:Lq2/d;

    invoke-virtual {v1, v0}, Lq2/d;->e(Landroidx/lifecycle/k;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq2/e;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 3

    iget-boolean v0, p0, Lq2/e;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lq2/e;->c()V

    :cond_0
    iget-object v0, p0, Lq2/e;->a:Lq2/f;

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lq2/e;->b:Lq2/d;

    invoke-virtual {v0, p1}, Lq2/d;->f(Landroid/os/Bundle;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "performRestore cannot be called when owner is "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outBundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/e;->b:Lq2/d;

    invoke-virtual {v0, p1}, Lq2/d;->g(Landroid/os/Bundle;)V

    return-void
.end method
