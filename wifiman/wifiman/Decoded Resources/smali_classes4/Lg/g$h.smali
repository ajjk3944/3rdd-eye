.class LLg/g$h;
.super LLg/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LLg/g;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-void
.end method


# virtual methods
.method public C(LLg/l;)Z
    .locals 2

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v1

    invoke-virtual {v1}, LLg/k;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public z(LLg/l;Ljava/util/Set;)V
    .locals 2

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLg/q;

    invoke-virtual {p0, p1, p2, v0}, LLg/g;->A(LLg/l;Ljava/util/Set;LLg/q;)V

    return-void
.end method
