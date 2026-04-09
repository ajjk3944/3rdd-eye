.class final LV6/m$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV6/m;->l(JLS6/r;LS6/k;LS6/r;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV6/p;

.field final synthetic b:LS6/k;


# direct methods
.method constructor <init>(LV6/p;LS6/k;)V
    .locals 0

    iput-object p1, p0, LV6/m$e;->a:LV6/p;

    iput-object p2, p0, LV6/m$e;->b:LS6/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;LS6/j;LT/l;I)V
    .locals 2

    const-string v0, "$this$ImageRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "imageState"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p4, 0x30

    if-nez p1, :cond_1

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x20

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    :goto_0
    or-int/2addr p4, p1

    :cond_1
    and-int/lit16 p1, p4, 0x91

    const/16 v0, 0x90

    if-ne p1, v0, :cond_3

    invoke-interface {p3}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, -0x1

    const-string/jumbo v0, "com.skydoves.landscapist.glide.GlideThumbnail.<anonymous> (GlideImage.kt:327)"

    const v1, -0x344d0387    # -2.3460082E7f

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object p1, p0, LV6/m$e;->a:LV6/p;

    invoke-static {p2, p1}, LV6/g;->a(LS6/j;LV6/p;)LV6/f;

    move-result-object p1

    instance-of p2, p1, LV6/f$d;

    if-eqz p2, :cond_7

    check-cast p1, LV6/f$d;

    invoke-virtual {p1}, LV6/f$d;->a()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_6

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-void

    :cond_6
    iget-object p2, p0, LV6/m$e;->b:LS6/k;

    sget-object p4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {p1, v0, p3, v1}, LS6/p;->a(Landroid/graphics/drawable/Drawable;Ljava/util/List;LT/l;I)Lr0/d;

    move-result-object p1

    invoke-static {p2, p4, p1, p3, v1}, LS6/o;->b(LS6/k;Landroidx/compose/ui/e;Lr0/d;LT/l;I)V

    :cond_7
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_2
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LS6/j;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LV6/m$e;->a(Lz/f;LS6/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
