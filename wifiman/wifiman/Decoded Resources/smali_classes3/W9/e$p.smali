.class public final LW9/e$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW9/e;->B0(LW9/e;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LW9/e$p;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    sget-object v0, LW9/e$n;->a:LW9/e$n;

    new-instance v1, Lcom/ui/core/ui/sso/UiSSO$SuppressedError;

    const-string/jumbo v2, "Initial code request failed"

    iget-object v3, p0, LW9/e$p;->a:Ljava/lang/Throwable;

    invoke-direct {v1, v2, v3}, Lcom/ui/core/ui/sso/UiSSO$SuppressedError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v1}, LS9/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LW9/e$p;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
