.class final Lg2/m$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/c0;

.field final synthetic b:Lf2/k;

.field final synthetic c:Lc0/e;

.field final synthetic d:LT/q0;

.field final synthetic e:LT/z1;


# direct methods
.method constructor <init>(Lr/c0;Lf2/k;Lc0/e;LT/q0;LT/z1;)V
    .locals 0

    iput-object p1, p0, Lg2/m$k;->a:Lr/c0;

    iput-object p2, p0, Lg2/m$k;->b:Lf2/k;

    iput-object p3, p0, Lg2/m$k;->c:Lc0/e;

    iput-object p4, p0, Lg2/m$k;->d:LT/q0;

    iput-object p5, p0, Lg2/m$k;->e:LT/z1;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq/b;Lf2/k;LT/l;I)V
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:689)"

    const v2, 0x30ebd9dc

    invoke-static {v2, p4, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p4, p0, Lg2/m$k;->a:Lr/c0;

    invoke-virtual {p4}, Lr/c0;->a()Ljava/lang/Object;

    move-result-object p4

    iget-object v0, p0, Lg2/m$k;->b:Lf2/k;

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    iget-object v0, p0, Lg2/m$k;->d:LT/q0;

    invoke-static {v0}, Lg2/m;->j(LT/q0;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p4, :cond_1

    goto :goto_1

    :cond_1
    iget-object p4, p0, Lg2/m$k;->e:LT/z1;

    invoke-static {p4}, Lg2/m;->m(LT/z1;)Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p4

    :cond_2
    invoke-interface {p4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lf2/k;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    move-object p2, v0

    check-cast p2, Lf2/k;

    :cond_4
    :goto_1
    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    iget-object p4, p0, Lg2/m$k;->c:Lc0/e;

    new-instance v0, Lg2/m$k$a;

    invoke-direct {v0, p2, p1}, Lg2/m$k$a;-><init>(Lf2/k;Lq/b;)V

    const/16 p1, 0x36

    const v1, -0x4b4ff5b3

    const/4 v2, 0x1

    invoke-static {v1, v2, v0, p3, p1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p1

    const/16 v0, 0x180

    invoke-static {p2, p4, p1, p3, v0}, Lg2/j;->a(Lf2/k;Lc0/e;Lmh/p;LT/l;I)V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Lf2/k;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lg2/m$k;->a(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
