.class final Lea/h$d;
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

    iput-object p1, p0, Lea/h$d;->a:Lea/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/r;)Lcom/ui/core/ui/sso/UiSSO$a;
    .locals 4

    const-string/jumbo v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lga/a;->a:Lga/a;

    iget-object v1, p0, Lea/h$d;->a:Lea/h;

    invoke-static {v1}, Lea/h;->o0(Lea/h;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, p1, v1, v2, v3}, Lga/a;->a(LEb/r;LGb/f;Lcom/ui/core/ui/sso/UiSSO$e;Z)Lcom/ui/core/ui/sso/UiSSO$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEb/r;

    invoke-virtual {p0, p1}, Lea/h$d;->a(LEb/r;)Lcom/ui/core/ui/sso/UiSSO$a;

    move-result-object p1

    return-object p1
.end method
