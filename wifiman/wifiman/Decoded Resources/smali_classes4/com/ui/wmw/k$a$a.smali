.class final Lcom/ui/wmw/k$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/k$a;->a(Lcom/ui/wmw/api/v1/b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/k;


# direct methods
.method constructor <init>(Lcom/ui/wmw/k;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/k$a$a;->a:Lcom/ui/wmw/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/ApiV1Settings;)Lgg/f;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wmw/k$a$a;->a:Lcom/ui/wmw/k;

    new-instance v1, Lcom/ui/wmw/k$a$a$a;

    invoke-direct {v1, v0, p1}, Lcom/ui/wmw/k$a$a$a;-><init>(Lcom/ui/wmw/k;Lcom/ui/wmw/api/v1/ApiV1Settings;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1Settings;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/k$a$a;->a(Lcom/ui/wmw/api/v1/ApiV1Settings;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
