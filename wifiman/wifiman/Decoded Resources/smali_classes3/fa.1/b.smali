.class public final synthetic Lfa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa/b;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfa/b;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    check-cast p1, Lq2/f;

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, p1, p2}, Lfa/d;->b(Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p1

    return-object p1
.end method
