.class final LNd/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


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

    iput-object p1, p0, LNd/f$c;->a:LNd/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIi/N;)LLi/g;
    .locals 1

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNd/f$c;->a:LNd/f;

    invoke-static {v0}, LNd/f;->d(LNd/f;)Lcom/ui/sso/api/UiAccountApi$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ui/sso/api/UiAccountApi$b;->a(LIi/N;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    invoke-virtual {p0, p1}, LNd/f$c;->a(LIi/N;)LLi/g;

    move-result-object p1

    return-object p1
.end method
