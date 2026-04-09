.class final LN/V0$e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/V0$e;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Float;

.field final synthetic b:Lmh/p;

.field final synthetic c:J


# direct methods
.method constructor <init>(Ljava/lang/Float;Lmh/p;J)V
    .locals 0

    iput-object p1, p0, LN/V0$e$a;->a:Ljava/lang/Float;

    iput-object p2, p0, LN/V0$e$a;->b:Lmh/p;

    iput-wide p3, p0, LN/V0$e$a;->c:J

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:232)"

    const v2, -0x437bd312

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LN/V0$e$a;->a:Ljava/lang/Float;

    if-eqz p2, :cond_3

    const p2, -0x463a5940

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object p2

    iget-object v0, p0, LN/V0$e$a;->a:Ljava/lang/Float;

    invoke-virtual {p2, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p2

    iget-object v0, p0, LN/V0$e$a;->b:Lmh/p;

    sget v1, LT/I0;->i:I

    invoke-static {p2, v0, p1, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_1

    :cond_3
    const p2, -0x46379f06

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object p2

    iget-wide v0, p0, LN/V0$e$a;->c:J

    invoke-static {v0, v1}, Lm0/v0;->n(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p2

    iget-object v0, p0, LN/V0$e$a;->b:Lmh/p;

    sget v1, LT/I0;->i:I

    invoke-static {p2, v0, p1, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/V0$e$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
