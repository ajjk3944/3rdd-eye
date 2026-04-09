.class final LN/V0$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/V0;->b(JLL0/U;Ljava/lang/Float;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/Float;

.field final synthetic c:Lmh/p;


# direct methods
.method constructor <init>(JLjava/lang/Float;Lmh/p;)V
    .locals 0

    iput-wide p1, p0, LN/V0$e;->a:J

    iput-object p3, p0, LN/V0$e;->b:Ljava/lang/Float;

    iput-object p4, p0, LN/V0$e;->c:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 5

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:231)"

    const v2, 0x1d7c49ae

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object p2

    iget-wide v0, p0, LN/V0$e;->a:J

    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    invoke-virtual {p2, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p2

    new-instance v0, LN/V0$e$a;

    iget-object v1, p0, LN/V0$e;->b:Ljava/lang/Float;

    iget-object v2, p0, LN/V0$e;->c:Lmh/p;

    iget-wide v3, p0, LN/V0$e;->a:J

    invoke-direct {v0, v1, v2, v3, v4}, LN/V0$e$a;-><init>(Ljava/lang/Float;Lmh/p;J)V

    const/16 v1, 0x36

    const v2, -0x437bd312

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v1, LT/I0;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/V0$e;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
