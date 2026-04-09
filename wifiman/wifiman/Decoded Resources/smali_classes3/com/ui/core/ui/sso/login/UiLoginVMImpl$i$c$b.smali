.class public final Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;->b(Ljava/lang/Throwable;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;


# direct methods
.method public constructor <init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$b;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$b;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    new-instance v1, Ls9/d$b;

    sget v2, LP9/b;->n:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {v0, v1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->A0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Ls9/d;)V

    return-void
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
