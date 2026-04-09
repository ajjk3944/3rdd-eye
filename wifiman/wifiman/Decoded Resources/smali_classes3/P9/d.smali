.class public final synthetic LP9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP9/d;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LP9/d;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-static {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->e0(Lcom/ui/core/ui/sso/SSOAccountVM;)LTa/c;

    move-result-object v0

    return-object v0
.end method
