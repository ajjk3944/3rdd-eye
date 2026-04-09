.class public final LBc/f$x$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f$x;->a(LBc/f$c;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LBc/f;

.field final synthetic b:LBc/f$c;


# direct methods
.method public constructor <init>(LBc/f;LBc/f$c;)V
    .locals 0

    iput-object p1, p0, LBc/f$x$b;->a:LBc/f;

    iput-object p2, p0, LBc/f$x$b;->b:LBc/f$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    new-instance v0, LBc/f$e$b;

    iget-object v1, p0, LBc/f$x$b;->a:LBc/f;

    iget-object v2, p0, LBc/f$x$b;->b:LBc/f$c;

    check-cast v2, LBc/f$c$b;

    invoke-static {v1, v2}, LBc/f;->j(LBc/f;LBc/f$c$b;)LBc/a$b$b;

    move-result-object v1

    invoke-direct {v0, v1}, LBc/f$e$b;-><init>(LBc/a$b$b;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
