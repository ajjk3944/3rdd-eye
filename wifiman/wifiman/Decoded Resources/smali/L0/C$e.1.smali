.class final LL0/C$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL0/C$e$a;
    }
.end annotation


# static fields
.field public static final a:LL0/C$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$e;

    invoke-direct {v0}, LL0/C$e;-><init>()V

    sput-object v0, LL0/C$e;->a:LL0/C$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LL0/d$c;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p2}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LL0/v;

    if-eqz v1, :cond_0

    sget-object v0, LL0/f;->Paragraph:LL0/f;

    goto :goto_0

    :cond_0
    instance-of v1, v0, LL0/D;

    if-eqz v1, :cond_1

    sget-object v0, LL0/f;->Span:LL0/f;

    goto :goto_0

    :cond_1
    instance-of v1, v0, LL0/Y;

    if-eqz v1, :cond_2

    sget-object v0, LL0/f;->VerbatimTts:LL0/f;

    goto :goto_0

    :cond_2
    instance-of v1, v0, LL0/X;

    if-eqz v1, :cond_3

    sget-object v0, LL0/f;->Url:LL0/f;

    goto :goto_0

    :cond_3
    instance-of v1, v0, LL0/i$b;

    if-eqz v1, :cond_4

    sget-object v0, LL0/f;->Link:LL0/f;

    goto :goto_0

    :cond_4
    instance-of v0, v0, LL0/i$a;

    if-eqz v0, :cond_5

    sget-object v0, LL0/f;->Clickable:LL0/f;

    goto :goto_0

    :cond_5
    sget-object v0, LL0/f;->String:LL0/f;

    :goto_0
    sget-object v1, LL0/C$e$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p2}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p2}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LL0/i$a;

    invoke-static {}, LL0/C;->d()Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :pswitch_2
    invoke-virtual {p2}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LL0/i$b;

    invoke-static {}, LL0/C;->e()Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :pswitch_3
    invoke-virtual {p2}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LL0/X;

    invoke-static {}, LL0/C;->f()Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :pswitch_4
    invoke-virtual {p2}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LL0/Y;

    invoke-static {}, LL0/C;->g()Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :pswitch_5
    invoke-virtual {p2}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LL0/D;

    invoke-static {}, LL0/C;->v()Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :pswitch_6
    invoke-virtual {p2}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LL0/v;

    invoke-static {}, LL0/C;->i()Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-static {v0}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LL0/d$c;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2}, LL0/d$c;->f()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2}, LL0/d$c;->i()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    filled-new-array {v0, p1, v1, v2, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LZg/v;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, LL0/d$c;

    invoke-virtual {p0, p1, p2}, LL0/C$e;->a(Lc0/m;LL0/d$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
