.class final Lea/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/h;->p0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lea/h;


# direct methods
.method constructor <init>(Lea/h;)V
    .locals 0

    iput-object p1, p0, Lea/h$f;->a:Lea/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/core/ui/sso/UiSSO$a;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "authResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lea/h$f$a;

    iget-object v1, p0, Lea/h$f;->a:Lea/h;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lea/h$f$a;-><init>(Lea/h;Lcom/ui/core/ui/sso/UiSSO$a;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v2, v0, p1, v2}, LQi/g;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/core/ui/sso/UiSSO$a;

    invoke-virtual {p0, p1}, Lea/h$f;->a(Lcom/ui/core/ui/sso/UiSSO$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
