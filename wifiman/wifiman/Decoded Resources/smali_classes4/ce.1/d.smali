.class public final Lce/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lce/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/d;

    invoke-direct {v0}, Lce/d;-><init>()V

    sput-object v0, Lce/d;->a:Lce/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LS8/a;
    .locals 4

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "US"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ac"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v3, LS8/a;->AC:LS8/a;

    goto :goto_0

    :cond_0
    const-string v0, "ad"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v3, LS8/a;->AD:LS8/a;

    goto :goto_0

    :cond_1
    const-string v0, "ax"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v3, LS8/a;->AX:LS8/a;

    goto :goto_0

    :cond_2
    const-string v0, "be"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v3, LS8/a;->BE:LS8/a;

    goto :goto_0

    :cond_3
    const-string v0, "n"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v3, LS8/a;->N:LS8/a;

    goto :goto_0

    :cond_4
    const-string v0, "g"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v3, LS8/a;->G:LS8/a;

    goto :goto_0

    :cond_5
    const-string v0, "b"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v3, LS8/a;->B:LS8/a;

    goto :goto_0

    :cond_6
    const-string v0, "a"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object v3, LS8/a;->A:LS8/a;

    :cond_7
    :goto_0
    return-object v3
.end method
