.class final Lcom/ui/wifiman/model/network/hosts/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a;->a(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/network/hosts/a;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/network/hosts/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a$d;->a:Lcom/ui/wifiman/model/network/hosts/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/network/hosts/a$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lgg/f;
    .locals 3

    const-string v0, "hosts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$d;->a:Lcom/ui/wifiman/model/network/hosts/a;

    iget-object v1, p0, Lcom/ui/wifiman/model/network/hosts/a$d;->b:Ljava/lang/String;

    new-instance v2, Lcom/ui/wifiman/model/network/hosts/a$d$a;

    invoke-direct {v2, p1, v0, v1}, Lcom/ui/wifiman/model/network/hosts/a$d$a;-><init>(Ljava/util/List;Lcom/ui/wifiman/model/network/hosts/a;Ljava/lang/String;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/network/hosts/a$d;->a(Ljava/util/List;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
