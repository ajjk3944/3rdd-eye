.class public final LEe/z$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEe/z;->B(Landroidx/compose/ui/e;LEe/g;ZLmh/l;ZZLmh/r;Lmh/r;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lmh/r;

.field final synthetic c:Lmh/l;

.field final synthetic d:Z

.field final synthetic e:Lmh/r;

.field final synthetic f:Lmh/q;


# direct methods
.method public constructor <init>(Ljava/util/List;Lmh/r;Lmh/l;ZLmh/r;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LEe/z$h;->a:Ljava/util/List;

    iput-object p2, p0, LEe/z$h;->b:Lmh/r;

    iput-object p3, p0, LEe/z$h;->c:Lmh/l;

    iput-boolean p4, p0, LEe/z$h;->d:Z

    iput-object p5, p0, LEe/z$h;->e:Lmh/r;

    iput-object p6, p0, LEe/z$h;->f:Lmh/q;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/c;ILT/l;I)V
    .locals 8

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, LT/l;->i(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x93

    const/16 v1, 0x92

    if-ne p4, v1, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v2, -0x25b7f321

    invoke-static {v2, v0, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    iget-object p4, p0, LEe/z$h;->a:Ljava/util/List;

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, LEe/f;

    const p2, 0x23b01cdb

    invoke-interface {p3, p2}, LT/l;->U(I)V

    new-instance v1, LEe/z$d;

    invoke-direct {v1, p1}, LEe/z$d;-><init>(LA/c;)V

    iget-object v3, p0, LEe/z$h;->b:Lmh/r;

    new-instance p1, LEe/z$e;

    iget-object p2, p0, LEe/z$h;->c:Lmh/l;

    iget-boolean p4, p0, LEe/z$h;->d:Z

    iget-object v2, p0, LEe/z$h;->e:Lmh/r;

    iget-object v4, p0, LEe/z$h;->f:Lmh/q;

    invoke-direct {p1, p2, p4, v2, v4}, LEe/z$e;-><init>(Lmh/l;ZLmh/r;Lmh/q;)V

    const/16 p2, 0x36

    const p4, -0x3184383a

    const/4 v2, 0x1

    invoke-static {p4, v2, p1, p3, p2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    const/16 v6, 0x6000

    const/4 v7, 0x4

    const/4 v2, 0x0

    move-object v5, p3

    invoke-static/range {v0 .. v7}, LEe/z;->S(LEe/f;Lmh/p;Lmh/l;Lmh/r;Lmh/r;LT/l;II)V

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/c;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LEe/z$h;->a(LA/c;ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
