.class public final LVc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVc/f$a;
    }
.end annotation


# static fields
.field public static final a:LVc/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LVc/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LVc/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LVc/f;->a:LVc/f$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(LVc/f;Lb7/f;Lb7/f;)LVc/g;
    .locals 0

    invoke-static {p0, p1, p2}, LVc/f;->h(LVc/f;Lb7/f;Lb7/f;)LVc/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LVc/f;Lb7/f;Lb7/f;)LVc/h;
    .locals 0

    invoke-static {p0, p1, p2}, LVc/f;->l(LVc/f;Lb7/f;Lb7/f;)LVc/h;

    move-result-object p0

    return-object p0
.end method

.method private static final h(LVc/f;Lb7/f;Lb7/f;)LVc/g;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LVc/f;->f(Lb7/f;)LVc/g;

    move-result-object p0

    return-object p0
.end method

.method private static final l(LVc/f;Lb7/f;Lb7/f;)LVc/h;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LVc/f;->j(Lb7/f;)LVc/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Lb7/h;Lb7/b;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    check-cast p3, LVc/g;

    invoke-virtual {p0, p1, p2, p3, p4}, LVc/f;->o(Lb7/h;Lb7/b;LVc/g;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic b(Lb7/f;Lb7/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LVc/f;->e(Lb7/f;Lb7/b;)LVc/g;

    move-result-object p1

    return-object p1
.end method

.method public e(Lb7/f;Lb7/b;)LVc/g;
    .locals 3

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LVc/f;->n(Lb7/f;)V

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p1}, Lb7/f;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lb7/f;->a()V

    invoke-virtual {p1}, Lb7/f;->S()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, LVc/f;->n(Lb7/f;)V

    const-string v1, "device"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/t;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, LVc/f;->f(Lb7/f;)LVc/g;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, LVc/f;->m(Lb7/f;)V

    :goto_0
    invoke-virtual {p1}, Lb7/f;->h()V

    if-eqz p2, :cond_0

    :cond_2
    if-eqz p2, :cond_3

    return-object p2

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Device element not found in xml"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Lb7/f;)LVc/g;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    move v4, v3

    :goto_0
    if-eqz v4, :cond_6

    invoke-virtual {p1}, Lb7/f;->p()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p1}, Lb7/f;->p0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb7/f;->s()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {p1}, Lb7/f;->a()V

    invoke-virtual {p0, p1}, LVc/f;->n(Lb7/f;)V

    invoke-virtual {p1}, Lb7/f;->S()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lb7/f;->s()Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v6, "deviceList"

    invoke-static {v5, v6, v3}, Lkotlin/text/t;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p0, p1}, LVc/f;->g(Lb7/f;)Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v6, "serviceList"

    invoke-static {v5, v6, v3}, Lkotlin/text/t;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p0, p1}, LVc/f;->k(Lb7/f;)Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, LVc/f;->m(Lb7/f;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lb7/f;->v()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lb7/f;->Y()Ljava/lang/String;

    move-result-object v6

    const-string v7, "nextTextContent(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p1}, LVc/f;->m(Lb7/f;)V

    :goto_1
    invoke-virtual {p1}, Lb7/f;->h()V

    goto :goto_0

    :cond_5
    const/4 v4, 0x0

    goto :goto_0

    :cond_6
    new-instance p1, LVc/g;

    invoke-direct {p1, v0, v1, v2}, LVc/g;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method public final g(Lb7/f;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVc/e;

    invoke-direct {v0, p0, p1}, LVc/e;-><init>(LVc/f;Lb7/f;)V

    const-string v1, "device"

    invoke-virtual {p0, p1, v1, v0}, LVc/f;->i(Lb7/f;Ljava/lang/String;Lmh/l;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lb7/f;Ljava/lang/String;Lmh/l;)Ljava/util/List;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requiredName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementReader"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lb7/f;->p()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lb7/f;->p0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb7/f;->s()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lb7/f;->a()V

    invoke-virtual {p1}, Lb7/f;->S()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p1}, LVc/f;->n(Lb7/f;)V

    invoke-static {v3, p2, v1}, Lkotlin/text/t;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, LVc/f;->m(Lb7/f;)V

    :goto_1
    invoke-virtual {p1}, Lb7/f;->h()V

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public final j(Lb7/f;)LVc/h;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lb7/f;->p()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lb7/f;->p0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb7/f;->s()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lb7/f;->a()V

    invoke-virtual {p1}, Lb7/f;->S()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1}, LVc/f;->n(Lb7/f;)V

    invoke-virtual {p1}, Lb7/f;->s()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, p1}, LVc/f;->m(Lb7/f;)V

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lb7/f;->Y()Ljava/lang/String;

    move-result-object v3

    const-string v4, "nextTextContent(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-virtual {p1}, Lb7/f;->h()V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    :cond_3
    new-instance p1, LVc/h;

    invoke-direct {p1, v0}, LVc/h;-><init>(Ljava/util/Map;)V

    return-object p1
.end method

.method public final k(Lb7/f;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVc/d;

    invoke-direct {v0, p0, p1}, LVc/d;-><init>(LVc/f;Lb7/f;)V

    const-string v1, "service"

    invoke-virtual {p0, p1, v1, v0}, LVc/f;->i(Lb7/f;Ljava/lang/String;Lmh/l;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final m(Lb7/f;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lb7/f;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lb7/f;->p0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb7/f;->s()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lb7/f;->a()V

    invoke-virtual {p1}, Lb7/f;->S()Ljava/lang/String;

    invoke-virtual {p0, p1}, LVc/f;->n(Lb7/f;)V

    invoke-virtual {p1}, Lb7/f;->s()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, LVc/f;->m(Lb7/f;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lb7/f;->Y()Ljava/lang/String;

    :goto_1
    invoke-virtual {p1}, Lb7/f;->h()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lb7/f;->v()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lb7/f;->Y()Ljava/lang/String;

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final n(Lb7/f;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, Lb7/f;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lb7/f;->p0()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(Lb7/h;Lb7/b;LVc/g;Ljava/lang/String;)V
    .locals 0

    new-instance p1, LYg/r;

    const-string p2, "we\'ll never parse it back to XML"

    invoke-direct {p1, p2}, LYg/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method
