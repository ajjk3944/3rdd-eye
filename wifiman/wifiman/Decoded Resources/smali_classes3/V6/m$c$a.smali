.class final LV6/m$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV6/m$c;->a(Lz/f;LS6/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:LS6/k;

.field final synthetic c:Lmh/p;


# direct methods
.method constructor <init>(Lmh/a;LS6/k;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LV6/m$c$a;->a:Lmh/a;

    iput-object p2, p0, LV6/m$c$a;->b:LS6/k;

    iput-object p3, p0, LV6/m$c$a;->c:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JLT/l;I)V
    .locals 10

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1, p2}, LT/l;->j(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p4, v0

    :cond_1
    and-int/lit8 v0, p4, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p3}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string/jumbo v1, "com.skydoves.landscapist.glide.GlideImage.<anonymous>.<anonymous> (GlideImage.kt:163)"

    const v2, -0x43a8d660

    invoke-static {v2, p4, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    new-instance v5, LS6/r;

    iget-object v0, p0, LV6/m$c$a;->a:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v5, v0}, LS6/r;-><init>(Ljava/lang/Object;)V

    iget-object v6, p0, LV6/m$c$a;->b:LS6/k;

    new-instance v7, LS6/r;

    iget-object v0, p0, LV6/m$c$a;->c:Lmh/p;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p3, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/i;

    iget-object v1, p0, LV6/m$c$a;->a:Lmh/a;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/i;->p0(Ljava/lang/Object;)Lcom/bumptech/glide/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type com.bumptech.glide.RequestBuilder<kotlin.Any>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v0}, LS6/r;-><init>(Ljava/lang/Object;)V

    and-int/lit8 v9, p4, 0xe

    move-wide v3, p1

    move-object v8, p3

    invoke-static/range {v3 .. v9}, LV6/m;->n(JLS6/r;LS6/k;LS6/r;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/r;

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide v0

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, v0, v1, p2, p1}, LV6/m$c$a;->a(JLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
