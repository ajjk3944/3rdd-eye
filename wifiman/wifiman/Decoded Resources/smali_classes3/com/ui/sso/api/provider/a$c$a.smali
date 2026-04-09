.class public final Lcom/ui/sso/api/provider/a$c$a;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/a$c;->b(Landroid/os/Handler;)Landroid/database/ContentObserver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/sso/api/provider/a$c;


# direct methods
.method constructor <init>(Landroid/os/Handler;Lcom/ui/sso/api/provider/a$c;)V
    .locals 0

    iput-object p2, p0, Lcom/ui/sso/api/provider/a$c$a;->a:Lcom/ui/sso/api/provider/a$c;

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(ZLandroid/net/Uri;)V
    .locals 2

    new-instance p1, Lcom/ui/sso/api/provider/a$c$a$a;

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$c$a;->a:Lcom/ui/sso/api/provider/a$c;

    const/4 v1, 0x0

    invoke-direct {p1, p2, v0, v1}, Lcom/ui/sso/api/provider/a$c$a$a;-><init>(Landroid/net/Uri;Lcom/ui/sso/api/provider/a$c;Ldh/e;)V

    const/4 p2, 0x1

    invoke-static {v1, p1, p2, v1}, LIi/i;->f(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
