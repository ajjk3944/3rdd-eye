.class public final Lc/G$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/G$g;->a(Lmh/l;Lmh/l;Lmh/a;Lmh/a;)Landroid/window/OnBackInvokedCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Lmh/l;

.field final synthetic c:Lmh/a;

.field final synthetic d:Lmh/a;


# direct methods
.method constructor <init>(Lmh/l;Lmh/l;Lmh/a;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lc/G$g$a;->a:Lmh/l;

    iput-object p2, p0, Lc/G$g$a;->b:Lmh/l;

    iput-object p3, p0, Lc/G$g$a;->c:Lmh/a;

    iput-object p4, p0, Lc/G$g$a;->d:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackCancelled()V
    .locals 1

    iget-object v0, p0, Lc/G$g$a;->d:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lc/G$g$a;->c:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/G$g$a;->b:Lmh/l;

    new-instance v1, Lc/b;

    invoke-direct {v1, p1}, Lc/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/G$g$a;->a:Lmh/l;

    new-instance v1, Lc/b;

    invoke-direct {v1, p1}, Lc/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
