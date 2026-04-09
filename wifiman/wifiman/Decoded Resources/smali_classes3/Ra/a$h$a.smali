.class final LRa/a$h$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRa/a$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LRa/a;


# direct methods
.method constructor <init>(LRa/a;)V
    .locals 0

    iput-object p1, p0, LRa/a$h$a;->a:LRa/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LRa/a$h$a;->a:LRa/a;

    invoke-static {v0}, LRa/a;->j(LRa/a;)Lcom/ui/sso/account/UIAccountManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ui/sso/account/UIAccountManager;->g(Lcom/ui/sso/account/UIAccountManager$a;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LRa/a$h$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
