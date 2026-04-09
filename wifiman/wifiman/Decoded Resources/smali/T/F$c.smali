.class final LT/F$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/F;->j(Lmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/n;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(LIi/n;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LT/F$c;->a:LIi/n;

    iput-object p2, p0, LT/F$c;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 3

    iget-object v0, p0, LT/F$c;->a:LIi/n;

    sget-object v1, LT/F;->a:LT/F;

    iget-object v1, p0, LT/F$c;->b:Lmh/l;

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
