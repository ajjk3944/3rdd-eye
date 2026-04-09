.class final Lfb/n$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfb/n;->j(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkb/o;


# direct methods
.method constructor <init>(Ljava/lang/String;Lkb/o;)V
    .locals 0

    iput-object p1, p0, Lfb/n$e;->a:Ljava/lang/String;

    iput-object p2, p0, Lfb/n$e;->b:Lkb/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LMj/w;)Lkb/b;
    .locals 3

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LMj/w;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lkb/b;->c:Lkb/b$a;

    invoke-virtual {v0, p1}, Lkb/b$a;->a(LMj/w;)Lkb/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/ui/unifi/core/base/net/exceptions/ApiRequestException;

    iget-object v1, p0, Lfb/n$e;->a:Ljava/lang/String;

    iget-object v2, p0, Lfb/n$e;->b:Lkb/o;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/ui/unifi/core/base/net/exceptions/ApiRequestException;-><init>(Ljava/lang/String;Ljava/lang/String;LMj/w;)V

    throw v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMj/w;

    invoke-virtual {p0, p1}, Lfb/n$e;->a(LMj/w;)Lkb/b;

    move-result-object p1

    return-object p1
.end method
