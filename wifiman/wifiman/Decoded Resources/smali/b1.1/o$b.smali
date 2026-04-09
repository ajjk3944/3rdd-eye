.class final Lb1/o$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/o;-><init>(Lb1/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/o;


# direct methods
.method constructor <init>(Lb1/o;)V
    .locals 0

    iput-object p1, p0, Lb1/o$b;->a:Lb1/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/a;)V
    .locals 0

    invoke-static {p0}, Lb1/o$b;->h(Lmh/a;)V

    return-void
.end method

.method private static final h(Lmh/a;)V
    .locals 0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lmh/a;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb1/o$b;->a:Lb1/o;

    invoke-static {v0}, Lb1/o;->f(Lb1/o;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v1, p0, Lb1/o$b;->a:Lb1/o;

    invoke-static {v1, v0}, Lb1/o;->h(Lb1/o;Landroid/os/Handler;)V

    :cond_1
    new-instance v1, Lb1/p;

    invoke-direct {v1, p1}, Lb1/p;-><init>(Lmh/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmh/a;

    invoke-virtual {p0, p1}, Lb1/o$b;->c(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
