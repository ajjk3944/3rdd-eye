.class public final synthetic Lcom/ui/core/ui/sso/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lcom/ui/core/ui/sso/d;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/core/ui/sso/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/core/ui/sso/f;->a:Lcom/ui/core/ui/sso/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/core/ui/sso/f;->a:Lcom/ui/core/ui/sso/d;

    check-cast p1, Lq2/f;

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, p1, p2}, Lcom/ui/core/ui/sso/d$c$b;->a(Lcom/ui/core/ui/sso/d;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p1

    return-object p1
.end method
