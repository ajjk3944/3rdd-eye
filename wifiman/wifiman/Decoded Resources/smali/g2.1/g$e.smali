.class final Lg2/g$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/g;->d(Ljava/util/List;Ljava/util/Collection;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/k;

.field final synthetic b:Z

.field final synthetic c:Ljava/util/List;


# direct methods
.method constructor <init>(Lf2/k;ZLjava/util/List;)V
    .locals 0

    iput-object p1, p0, Lg2/g$e;->a:Lf2/k;

    iput-boolean p2, p0, Lg2/g$e;->b:Z

    iput-object p3, p0, Lg2/g$e;->c:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(ZLjava/util/List;Lf2/k;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lg2/g$e;->h(ZLjava/util/List;Lf2/k;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method private static final h(ZLjava/util/List;Lf2/k;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object p0, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    if-ne p4, p0, :cond_1

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    sget-object p0, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    if-ne p4, p0, :cond_2

    invoke-interface {p1, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method


# virtual methods
.method public final c(LT/L;)LT/K;
    .locals 3

    iget-boolean p1, p0, Lg2/g$e;->b:Z

    iget-object v0, p0, Lg2/g$e;->c:Ljava/util/List;

    iget-object v1, p0, Lg2/g$e;->a:Lf2/k;

    new-instance v2, Lg2/h;

    invoke-direct {v2, p1, v0, v1}, Lg2/h;-><init>(ZLjava/util/List;Lf2/k;)V

    iget-object p1, p0, Lg2/g$e;->a:Lf2/k;

    invoke-virtual {p1}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    iget-object p1, p0, Lg2/g$e;->a:Lf2/k;

    new-instance v0, Lg2/g$e$a;

    invoke-direct {v0, p1, v2}, Lg2/g$e$a;-><init>(Lf2/k;Landroidx/lifecycle/m;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lg2/g$e;->c(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
