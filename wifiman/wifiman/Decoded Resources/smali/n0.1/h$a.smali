.class public final Ln0/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ln0/h$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Ln0/h$a;Ln0/c;Ln0/c;I)[F
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ln0/h$a;->b(Ln0/c;Ln0/c;I)[F

    move-result-object p0

    return-object p0
.end method

.method private final b(Ln0/c;Ln0/c;I)[F
    .locals 9

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    sget-object v3, Ln0/n;->a:Ln0/n$a;

    invoke-virtual {v3}, Ln0/n$a;->a()I

    move-result v3

    invoke-static {p3, v3}, Ln0/n;->e(II)Z

    move-result p3

    const/4 v3, 0x0

    if-nez p3, :cond_0

    return-object v3

    :cond_0
    invoke-virtual {p1}, Ln0/c;->e()J

    move-result-wide v4

    sget-object p3, Ln0/b;->a:Ln0/b$a;

    invoke-virtual {p3}, Ln0/b$a;->b()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ln0/b;->e(JJ)Z

    move-result v4

    invoke-virtual {p2}, Ln0/c;->e()J

    move-result-wide v5

    invoke-virtual {p3}, Ln0/b$a;->b()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ln0/b;->e(JJ)Z

    move-result p3

    if-eqz v4, :cond_1

    if-eqz p3, :cond_1

    return-object v3

    :cond_1
    if-nez v4, :cond_3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    return-object v3

    :cond_3
    :goto_0
    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, p2

    :goto_1
    const-string p2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ln0/x;

    if-eqz v4, :cond_5

    invoke-virtual {p1}, Ln0/x;->N()Ln0/z;

    move-result-object p2

    invoke-virtual {p2}, Ln0/z;->c()[F

    move-result-object p2

    goto :goto_2

    :cond_5
    sget-object p2, Ln0/k;->a:Ln0/k;

    invoke-virtual {p2}, Ln0/k;->c()[F

    move-result-object p2

    :goto_2
    if-eqz p3, :cond_6

    invoke-virtual {p1}, Ln0/x;->N()Ln0/z;

    move-result-object p1

    invoke-virtual {p1}, Ln0/z;->c()[F

    move-result-object p1

    goto :goto_3

    :cond_6
    sget-object p1, Ln0/k;->a:Ln0/k;

    invoke-virtual {p1}, Ln0/k;->c()[F

    move-result-object p1

    :goto_3
    aget p3, p2, v2

    aget v3, p1, v2

    div-float/2addr p3, v3

    aget v3, p2, v1

    aget v4, p1, v1

    div-float/2addr v3, v4

    aget p2, p2, v0

    aget p1, p1, v0

    div-float/2addr p2, p1

    const/4 p1, 0x3

    new-array p1, p1, [F

    aput p3, p1, v2

    aput v3, p1, v1

    aput p2, p1, v0

    return-object p1
.end method


# virtual methods
.method public final c(Ln0/c;)Ln0/h;
    .locals 2

    sget-object v0, Ln0/n;->a:Ln0/n$a;

    invoke-virtual {v0}, Ln0/n$a;->c()I

    move-result v0

    new-instance v1, Ln0/h$a$a;

    invoke-direct {v1, p1, v0}, Ln0/h$a$a;-><init>(Ln0/c;I)V

    return-object v1
.end method
