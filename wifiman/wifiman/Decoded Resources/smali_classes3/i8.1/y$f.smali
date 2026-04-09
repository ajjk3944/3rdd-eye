.class public final Li8/y$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/y;->a()Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/y;


# direct methods
.method public constructor <init>(Li8/y;)V
    .locals 0

    iput-object p1, p0, Li8/y$f;->a:Li8/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Li8/y$f;->a:Li8/y;

    invoke-static {v0}, Li8/y;->i(Li8/y;)LFg/a;

    move-result-object v0

    invoke-virtual {v0}, LFg/a;->l2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/s;

    if-eqz v0, :cond_0

    iget-object v2, p0, Li8/y$f;->a:Li8/y;

    invoke-static {v2}, Li8/y;->i(Li8/y;)LFg/a;

    move-result-object v2

    new-instance v3, Ll9/a;

    invoke-direct {v3, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, LFg/a;->h(Ljava/lang/Object;)V

    move-object v1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
