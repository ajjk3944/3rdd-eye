.class final LL0/C$q;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LL0/C$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$q;

    invoke-direct {v0}, LL0/C$q;-><init>()V

    sput-object v0, LL0/C$q;->a:LL0/C$q;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LS0/e;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p2}, LS0/e;->g()Ljava/util/List;

    move-result-object p2

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LS0/d;

    sget-object v4, LS0/d;->b:LS0/d$a;

    invoke-static {v4}, LL0/C;->l(LS0/d$a;)Lc0/k;

    move-result-object v4

    invoke-static {v3, v4, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, LS0/e;

    invoke-virtual {p0, p1, p2}, LL0/C$q;->a(Lc0/m;LS0/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
