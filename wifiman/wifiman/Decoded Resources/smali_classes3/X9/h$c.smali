.class public final LX9/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/h;->G0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:LX9/h;

.field final synthetic c:Ls9/d;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;LX9/h;Ls9/d;)V
    .locals 0

    iput-object p1, p0, LX9/h$c;->a:Ljava/lang/Throwable;

    iput-object p2, p0, LX9/h$c;->b:LX9/h;

    iput-object p3, p0, LX9/h$c;->c:Ls9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    sget-object v0, LX9/h$b;->a:LX9/h$b;

    new-instance v1, Lcom/ui/core/ui/sso/UiSSO$SuppressedError;

    const-string/jumbo v2, "Failed to submit code"

    iget-object v3, p0, LX9/h$c;->a:Ljava/lang/Throwable;

    invoke-direct {v1, v2, v3}, Lcom/ui/core/ui/sso/UiSSO$SuppressedError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v1}, LS9/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    iget-object v0, p0, LX9/h$c;->b:LX9/h;

    invoke-virtual {v0}, LX9/c;->W0()LLi/z;

    move-result-object v0

    iget-object v1, p0, LX9/h$c;->c:Ls9/d;

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX9/h$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
