.class public final LL/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL/c$a;
    }
.end annotation


# static fields
.field public static final h:LL/c$a;

.field public static final i:I

.field private static j:LL/c;


# instance fields
.field private final a:LY0/t;

.field private final b:LL0/U;

.field private final c:LY0/d;

.field private final d:LQ0/k$b;

.field private final e:LL0/U;

.field private f:F

.field private g:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LL/c;->h:LL/c$a;

    const/16 v0, 0x8

    sput v0, LL/c;->i:I

    return-void
.end method

.method private constructor <init>(LY0/t;LL0/U;LY0/d;LQ0/k$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LL/c;->a:LY0/t;

    .line 4
    iput-object p2, p0, LL/c;->b:LL0/U;

    .line 5
    iput-object p3, p0, LL/c;->c:LY0/d;

    .line 6
    iput-object p4, p0, LL/c;->d:LQ0/k$b;

    .line 7
    invoke-static {p2, p1}, LL0/V;->d(LL0/U;LY0/t;)LL0/U;

    move-result-object p1

    iput-object p1, p0, LL/c;->e:LL0/U;

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 8
    iput p1, p0, LL/c;->f:F

    .line 9
    iput p1, p0, LL/c;->g:F

    return-void
.end method

.method public synthetic constructor <init>(LY0/t;LL0/U;LY0/d;LQ0/k$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LL/c;-><init>(LY0/t;LL0/U;LY0/d;LQ0/k$b;)V

    return-void
.end method

.method public static final synthetic a()LL/c;
    .locals 1

    sget-object v0, LL/c;->j:LL/c;

    return-object v0
.end method

.method public static final synthetic b(LL/c;)V
    .locals 0

    sput-object p0, LL/c;->j:LL/c;

    return-void
.end method


# virtual methods
.method public final c(JI)J
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p3

    iget v2, v0, LL/c;->g:F

    iget v3, v0, LL/c;->f:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    invoke-static {}, LL/d;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, LL/c;->e:LL0/U;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v7

    iget-object v9, v0, LL/c;->c:LY0/d;

    iget-object v10, v0, LL/c;->d:LQ0/k$b;

    const/16 v15, 0x60

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static/range {v5 .. v16}, LL0/u;->b(Ljava/lang/String;LL0/U;JLY0/d;LQ0/k$b;Ljava/util/List;Ljava/util/List;IZILjava/lang/Object;)LL0/p;

    move-result-object v2

    invoke-interface {v2}, LL0/p;->getHeight()F

    move-result v2

    invoke-static {}, LL/d;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, LL/c;->e:LL0/U;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v5

    iget-object v7, v0, LL/c;->c:LY0/d;

    iget-object v8, v0, LL/c;->d:LQ0/k$b;

    const/16 v13, 0x60

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static/range {v3 .. v14}, LL0/u;->b(Ljava/lang/String;LL0/U;JLY0/d;LQ0/k$b;Ljava/util/List;Ljava/util/List;IZILjava/lang/Object;)LL0/p;

    move-result-object v3

    invoke-interface {v3}, LL0/p;->getHeight()F

    move-result v3

    sub-float/2addr v3, v2

    iput v2, v0, LL/c;->g:F

    iput v3, v0, LL/c;->f:F

    :cond_1
    const/4 v4, 0x1

    if-eq v1, v4, :cond_2

    sub-int/2addr v1, v4

    int-to-float v1, v1

    mul-float/2addr v3, v1

    add-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    invoke-static/range {p1 .. p2}, LY0/b;->k(J)I

    move-result v2

    invoke-static {v1, v2}, Lsh/m;->g(II)I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p2}, LY0/b;->m(J)I

    move-result v1

    :goto_0
    invoke-static/range {p1 .. p2}, LY0/b;->k(J)I

    move-result v2

    invoke-static/range {p1 .. p2}, LY0/b;->n(J)I

    move-result v3

    invoke-static/range {p1 .. p2}, LY0/b;->l(J)I

    move-result v4

    invoke-static {v3, v4, v1, v2}, LY0/c;->a(IIII)J

    move-result-wide v1

    return-wide v1
.end method

.method public final d()LY0/d;
    .locals 1

    iget-object v0, p0, LL/c;->c:LY0/d;

    return-object v0
.end method

.method public final e()LQ0/k$b;
    .locals 1

    iget-object v0, p0, LL/c;->d:LQ0/k$b;

    return-object v0
.end method

.method public final f()LL0/U;
    .locals 1

    iget-object v0, p0, LL/c;->b:LL0/U;

    return-object v0
.end method

.method public final g()LY0/t;
    .locals 1

    iget-object v0, p0, LL/c;->a:LY0/t;

    return-object v0
.end method
