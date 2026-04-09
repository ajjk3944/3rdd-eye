.class final LN/V0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/V0;->a(LN/Z0;Ljava/lang/String;Lmh/p;LR0/c0;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZZZLy/k;Lz/N;Lm0/i1;LN/S0;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/S0;

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:Ly/k;


# direct methods
.method constructor <init>(LN/S0;ZZLy/k;)V
    .locals 0

    iput-object p1, p0, LN/V0$c;->a:LN/S0;

    iput-boolean p2, p0, LN/V0$c;->b:Z

    iput-boolean p3, p0, LN/V0$c;->c:Z

    iput-object p4, p0, LN/V0$c;->d:Ly/k;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/b0;LT/l;I)J
    .locals 9

    const v0, -0x4bdf89af

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:94)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, p0, LN/V0$c;->a:LN/S0;

    iget-boolean v4, p0, LN/V0$c;->b:Z

    sget-object p3, LN/b0;->UnfocusedEmpty:LN/b0;

    if-ne p1, p3, :cond_1

    const/4 p1, 0x0

    :goto_0
    move v5, p1

    goto :goto_1

    :cond_1
    iget-boolean p1, p0, LN/V0$c;->c:Z

    goto :goto_0

    :goto_1
    iget-object v6, p0, LN/V0$c;->d:Ly/k;

    const/4 v8, 0x0

    move-object v7, p2

    invoke-interface/range {v3 .. v8}, LN/S0;->d(ZZLy/k;LT/l;I)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/v0;

    invoke-virtual {p1}, Lm0/v0;->u()J

    move-result-wide v0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->J()V

    return-wide v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/b0;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/V0$c;->a(LN/b0;LT/l;I)J

    move-result-wide p1

    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    return-object p1
.end method
