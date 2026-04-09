.class final LNd/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNd/f;-><init>(Lcom/ui/sso/api/UiAccountApi$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LNd/f;


# direct methods
.method constructor <init>(LNd/f;)V
    .locals 0

    iput-object p1, p0, LNd/f$e;->a:LNd/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/sso/api/UiAccountApi;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNd/f$e;->a:LNd/f;

    invoke-interface {p1}, Lcom/ui/sso/api/UiAccountApi;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p1

    invoke-static {v0, p1}, LNd/f;->e(LNd/f;Lcom/ui/sso/api/UiAccountApi$c;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    invoke-virtual {p0, p1}, LNd/f$e;->a(Lcom/ui/sso/api/UiAccountApi;)V

    return-void
.end method
