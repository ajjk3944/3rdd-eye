.class public abstract LS6/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/List;Lm0/J0;LT/l;I)Lr0/d;
    .locals 10

    const-string/jumbo v0, "imagePlugins"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "imageBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3850ba71

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.skydoves.landscapist.rememberBitmapPainter (RememberPainterPlugins.kt:36)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v0, -0xd179ee4

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lr0/a;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v2, v1

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, Lr0/a;-><init>(Lm0/J0;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lr0/a;

    invoke-interface {p2}, LT/l;->J()V

    shl-int/lit8 p3, p3, 0x3

    and-int/lit16 p3, p3, 0x3f0

    invoke-static {v1, p0, p1, p2, p3}, LX6/a;->a(Lr0/d;Ljava/util/List;Lm0/J0;LT/l;I)Lr0/d;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-object p0
.end method
