.class public final synthetic Lcom/ui/core/ui/sso/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/core/ui/sso/d;

.field public final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;

.field public final synthetic c:Lf2/w;

.field public final synthetic d:LU9/h;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;LU9/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/core/ui/sso/g;->a:Lcom/ui/core/ui/sso/d;

    iput-object p2, p0, Lcom/ui/core/ui/sso/g;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p3, p0, Lcom/ui/core/ui/sso/g;->c:Lf2/w;

    iput-object p4, p0, Lcom/ui/core/ui/sso/g;->d:LU9/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/ui/core/ui/sso/g;->a:Lcom/ui/core/ui/sso/d;

    iget-object v1, p0, Lcom/ui/core/ui/sso/g;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v2, p0, Lcom/ui/core/ui/sso/g;->c:Lf2/w;

    iget-object v3, p0, Lcom/ui/core/ui/sso/g;->d:LU9/h;

    check-cast p1, Lf2/u;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/ui/core/ui/sso/d$c$b$a$a;->c(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;LU9/h;Lf2/u;)LYg/J;

    move-result-object p1

    return-object p1
.end method
