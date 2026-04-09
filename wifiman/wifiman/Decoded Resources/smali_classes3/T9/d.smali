.class public final synthetic LT9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Lcom/ui/core/ui/sso/login/g;


# direct methods
.method public synthetic constructor <init>(LIi/N;Lcom/ui/core/ui/sso/login/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT9/d;->a:LIi/N;

    iput-object p2, p0, LT9/d;->b:Lcom/ui/core/ui/sso/login/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LT9/d;->a:LIi/N;

    iget-object v1, p0, LT9/d;->b:Lcom/ui/core/ui/sso/login/g;

    invoke-static {v0, v1}, LT9/j;->g(LIi/N;Lcom/ui/core/ui/sso/login/g;)LYg/J;

    move-result-object v0

    return-object v0
.end method
