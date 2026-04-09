.class public final LRa/a$h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/account/UIAccountManager$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRa/a$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LKi/t;


# direct methods
.method constructor <init>(LKi/t;)V
    .locals 0

    iput-object p1, p0, LRa/a$h$b;->a:LKi/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LRa/a$h$b;->a:LKi/t;

    sget-object v1, LRa/a$b$a;->a:LRa/a$b$a;

    invoke-interface {v0, v1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Ljava/util/UUID;)V
    .locals 2

    const-string/jumbo v0, "accountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LRa/a$h$b;->a:LKi/t;

    new-instance v1, LRa/a$b$b;

    invoke-direct {v1, p1}, LRa/a$b$b;-><init>(Ljava/util/UUID;)V

    invoke-interface {v0, v1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
