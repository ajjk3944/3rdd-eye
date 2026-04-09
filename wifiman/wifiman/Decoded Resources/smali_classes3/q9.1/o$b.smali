.class final Lq9/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq9/o;->f(Lq9/i;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/N;

.field final synthetic b:Lmh/a;


# direct methods
.method constructor <init>(LIi/N;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lq9/o$b;->a:LIi/N;

    iput-object p2, p0, Lq9/o$b;->b:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 3

    const-string v0, "$this$UiToolbar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.account.UiAccountPickerScreen.<anonymous>.<anonymous> (UiAccountPickerScreen.kt:109)"

    const v1, 0x8bf043e

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p1, LL9/i;->a:LL9/i;

    new-instance p3, Lq9/o$b$a;

    iget-object v0, p0, Lq9/o$b;->a:LIi/N;

    iget-object v1, p0, Lq9/o$b;->b:Lmh/a;

    invoke-direct {p3, v0, v1}, Lq9/o$b$a;-><init>(LIi/N;Lmh/a;)V

    const/16 v0, 0x36

    const v1, 0x4d894d69    # 2.8794397E8f

    const/4 v2, 0x1

    invoke-static {v1, v2, p3, p2, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p3

    sget v0, LL9/i;->b:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p1, p3, p2, v0, v1}, LL9/i;->b(Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lq9/o$b;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
