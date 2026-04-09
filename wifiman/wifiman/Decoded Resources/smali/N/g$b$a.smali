.class final LN/g$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/g$b;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/N;

.field final synthetic b:Lmh/q;


# direct methods
.method constructor <init>(Lz/N;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LN/g$b$a;->a:Lz/N;

    iput-object p2, p0, LN/g$b$a;->b:Lmh/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 4

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

    const-string v1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:119)"

    const v2, -0x6545fb91

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LN/f0;->a:LN/f0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object p2

    invoke-virtual {p2}, LN/c1;->c()LL0/U;

    move-result-object p2

    new-instance v0, LN/g$b$a$a;

    iget-object v1, p0, LN/g$b$a;->a:Lz/N;

    iget-object v2, p0, LN/g$b$a;->b:Lmh/q;

    invoke-direct {v0, v1, v2}, LN/g$b$a$a;-><init>(Lz/N;Lmh/q;)V

    const/16 v1, 0x36

    const v2, -0x25921360

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {p2, v0, p1, v1}, LN/a1;->a(LL0/U;Lmh/p;LT/l;I)V

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

    invoke-virtual {p0, p1, p2}, LN/g$b$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
