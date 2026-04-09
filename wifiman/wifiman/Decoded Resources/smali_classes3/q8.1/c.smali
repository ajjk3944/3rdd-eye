.class public final Lq8/c;
.super Lk8/m;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lq8/b;

    invoke-direct {v0}, Lq8/b;-><init>()V

    invoke-direct {p0, v0}, Lk8/m;-><init>(Lmh/p;)V

    return-void
.end method

.method public static synthetic h(LCc/a;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lq8/c;->i(LCc/a;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final i(LCc/a;Ljava/lang/String;)Z
    .locals 4

    const-string/jumbo v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-static {v0, p1, v2}, Lkotlin/text/t;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_4

    invoke-interface {p0}, LCc/a;->l()Lh9/a;

    move-result-object v0

    const-string v3, ":"

    if-eqz v0, :cond_1

    invoke-virtual {v0, v3}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1, v2}, Lkotlin/text/t;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-nez v0, :cond_4

    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lwc/a;->d()Lh9/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, v3}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, p1, v2}, Lkotlin/text/t;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    if-nez v0, :cond_4

    invoke-interface {p0}, LCc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/ui/wifiman/model/vendor/d;->getName()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0, p1, v2}, Lkotlin/text/t;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    goto :goto_3

    :cond_3
    move p0, v1

    :goto_3
    if-eqz p0, :cond_5

    :cond_4
    move v1, v2

    :cond_5
    return v1
.end method
