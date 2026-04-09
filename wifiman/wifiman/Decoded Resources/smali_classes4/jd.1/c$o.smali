.class final Ljd/c$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljd/c;-><init>(LZc/f;LZc/a;Lje/u;LDc/e;Lbe/e;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ljd/c$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljd/c$o;

    invoke-direct {v0}, Ljd/c$o;-><init>()V

    sput-object v0, Ljd/c$o;->a:Ljd/c$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ljava/util/List;
    .locals 7

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lce/b;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lce/b;->d()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v3, Lce/b$a;

    const/4 v5, 0x0

    if-nez v2, :cond_1

    :goto_1
    move-object v3, v5

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-ne v2, v6, :cond_2

    goto :goto_1

    :cond_2
    :goto_2
    if-eqz v3, :cond_3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    move v2, v4

    goto :goto_0

    :cond_4
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    :cond_5
    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ljd/c$o;->a(Ll9/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
