.class public final synthetic Lcom/ui/core/ui/sso/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/core/ui/sso/SSOAccountVM;

.field public final synthetic b:Lf2/w;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/core/ui/sso/m;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, Lcom/ui/core/ui/sso/m;->b:Lf2/w;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/core/ui/sso/m;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v1, p0, Lcom/ui/core/ui/sso/m;->b:Lf2/w;

    check-cast p1, Lcom/ui/core/ui/sso/UiSSO$a;

    invoke-static {v0, v1, p1}, Lcom/ui/core/ui/sso/d$c$b$a$a$c;->b(Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lcom/ui/core/ui/sso/UiSSO$a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
