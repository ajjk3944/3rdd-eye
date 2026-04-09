.class final LE8/f$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/f;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/f$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/f$j;

    invoke-direct {v0}, LE8/f$j;-><init>()V

    sput-object v0, LE8/f$j;->a:LE8/f$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    check-cast p2, LE8/a$a;

    check-cast p3, La8/a;

    invoke-virtual {p0, p1, p2, p3}, LE8/f$j;->b(Ljava/util/Map;LE8/a$a;La8/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Map;LE8/a$a;La8/a;)Ljava/util/List;
    .locals 4

    const-string/jumbo v0, "discoveryResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "popupState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "devices"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LE8/a$a$b;

    if-nez v0, :cond_3

    instance-of v0, p2, LE8/a$a$c;

    if-eqz v0, :cond_2

    check-cast p2, LE8/a$a$c;

    invoke-virtual {p2}, LE8/a$a$c;->a()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE8/a$a$a;

    invoke-virtual {v1}, LE8/a$a$a;->a()Lrd/b$a;

    move-result-object v2

    invoke-virtual {v1}, LE8/a$a$a;->a()Lrd/b$a;

    move-result-object v1

    invoke-virtual {v1}, Lrd/b$a;->b()Linet/ipaddr/g;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDc/j;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LDc/j;->getId()La8/b;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v3}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LCc/a$b;

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, LDc/n;->a(LDc/j;)LCc/a;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    new-instance v1, LE8/f$a;

    invoke-direct {v1, v2, v3}, LE8/f$a;-><init>(Lrd/b$a;LCc/a;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_4
    return-object v0
.end method
