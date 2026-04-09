.class public final LJh/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbi/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lbi/j$a;
    .locals 1

    sget-object v0, Lbi/j$a;->BOTH:Lbi/j$a;

    return-object v0
.end method

.method public b(LBh/a;LBh/a;LBh/e;)Lbi/j$b;
    .locals 1

    const-string p3, "superDescriptor"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "subDescriptor"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p2, LBh/Y;

    if-eqz p3, :cond_5

    instance-of p3, p1, LBh/Y;

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    check-cast p2, LBh/Y;

    invoke-interface {p2}, LBh/I;->getName()LZh/f;

    move-result-object p3

    check-cast p1, LBh/Y;

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    sget-object p1, Lbi/j$b;->UNKNOWN:Lbi/j$b;

    return-object p1

    :cond_1
    invoke-static {p2}, LNh/d;->a(LBh/Y;)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p1}, LNh/d;->a(LBh/Y;)Z

    move-result p3

    if-eqz p3, :cond_2

    sget-object p1, Lbi/j$b;->OVERRIDABLE:Lbi/j$b;

    return-object p1

    :cond_2
    invoke-static {p2}, LNh/d;->a(LBh/Y;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-static {p1}, LNh/d;->a(LBh/Y;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lbi/j$b;->UNKNOWN:Lbi/j$b;

    return-object p1

    :cond_4
    :goto_0
    sget-object p1, Lbi/j$b;->INCOMPATIBLE:Lbi/j$b;

    return-object p1

    :cond_5
    :goto_1
    sget-object p1, Lbi/j$b;->UNKNOWN:Lbi/j$b;

    return-object p1
.end method
