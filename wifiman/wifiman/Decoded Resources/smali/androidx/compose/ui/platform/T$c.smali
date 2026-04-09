.class final Landroidx/compose/ui/platform/T$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/T;->j(Lmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/n;

.field final synthetic b:Landroidx/compose/ui/platform/T;

.field final synthetic c:Lmh/l;


# direct methods
.method constructor <init>(LIi/n;Landroidx/compose/ui/platform/T;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/T$c;->a:LIi/n;

    iput-object p2, p0, Landroidx/compose/ui/platform/T$c;->b:Landroidx/compose/ui/platform/T;

    iput-object p3, p0, Landroidx/compose/ui/platform/T$c;->c:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/T$c;->a:LIi/n;

    iget-object v1, p0, Landroidx/compose/ui/platform/T$c;->c:Lmh/l;

    :try_start_0
    sget-object v2, LYg/u;->b:LYg/u$a;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object p2, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
