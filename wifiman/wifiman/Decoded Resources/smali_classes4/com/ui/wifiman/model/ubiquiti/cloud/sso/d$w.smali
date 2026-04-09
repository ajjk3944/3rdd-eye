.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->w()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$w;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$w;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$w;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$w;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$w;->b(Ljava/util/List;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public final b(Ljava/util/List;Ljava/util/List;)Z
    .locals 3

    const-string v0, "t1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->a(Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p2, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->a(Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
