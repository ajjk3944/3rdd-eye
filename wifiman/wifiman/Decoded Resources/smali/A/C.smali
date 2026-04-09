.class public abstract LA/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:LA/s;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    const/4 v0, 0x1

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LA/C;->a:F

    new-instance v0, LA/C$a;

    move-object v6, v0

    invoke-direct {v0}, LA/C$a;-><init>()V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v13

    sget-object v18, Lw/q;->Vertical:Lw/q;

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v9

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, LY0/f;->b(FFILjava/lang/Object;)LY0/d;

    move-result-object v10

    const/16 v4, 0xf

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v11

    new-instance v0, LA/s;

    move-object v1, v0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v1 .. v21}, LA/s;-><init>(LA/t;IZFLC0/D;FZLIi/N;LY0/d;JLjava/util/List;IIIZLw/q;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LA/C;->b:LA/s;

    return-void
.end method

.method public static final synthetic a()F
    .locals 1

    sget v0, LA/C;->a:F

    return v0
.end method

.method public static final synthetic b()LA/s;
    .locals 1

    sget-object v0, LA/C;->b:LA/s;

    return-object v0
.end method

.method public static final c(IILT/l;II)LA/B;
    .locals 10

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move p1, v1

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_2

    const/4 p4, -0x1

    const-string v0, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:80)"

    const v2, 0x57a86af4

    invoke-static {v2, p3, p4, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-array v3, v1, [Ljava/lang/Object;

    sget-object p4, LA/B;->y:LA/B$c;

    invoke-virtual {p4}, LA/B$c;->a()Lc0/k;

    move-result-object v4

    and-int/lit8 p4, p3, 0xe

    xor-int/lit8 p4, p4, 0x6

    const/4 v0, 0x4

    const/4 v2, 0x1

    if-le p4, v0, :cond_3

    invoke-interface {p2, p0}, LT/l;->i(I)Z

    move-result p4

    if-nez p4, :cond_4

    :cond_3
    and-int/lit8 p4, p3, 0x6

    if-ne p4, v0, :cond_5

    :cond_4
    move p4, v2

    goto :goto_0

    :cond_5
    move p4, v1

    :goto_0
    and-int/lit8 v0, p3, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v5, 0x20

    if-le v0, v5, :cond_6

    invoke-interface {p2, p1}, LT/l;->i(I)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v5, :cond_8

    :cond_7
    move v1, v2

    :cond_8
    or-int p3, p4, v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    if-nez p3, :cond_9

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p4, p3, :cond_a

    :cond_9
    new-instance p4, LA/C$b;

    invoke-direct {p4, p0, p1}, LA/C$b;-><init>(II)V

    invoke-interface {p2, p4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v6, p4

    check-cast v6, Lmh/a;

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v5, 0x0

    move-object v7, p2

    invoke-static/range {v3 .. v9}, Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LA/B;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    return-object p0
.end method
