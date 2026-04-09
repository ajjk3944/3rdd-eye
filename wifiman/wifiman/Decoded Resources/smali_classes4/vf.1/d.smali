.class public final Lvf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvf/d$a;
    }
.end annotation


# static fields
.field public static final a:Lvf/d;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvf/d;

    invoke-direct {v0}, Lvf/d;-><init>()V

    sput-object v0, Lvf/d;->a:Lvf/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d(Lvf/d;Ljava/lang/String;JLjava/lang/String;Lmh/p;ILjava/lang/Object;)LL0/d;
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const-string p4, "\\[([^\\[\\]]+)\\]"

    :cond_0
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lvf/d;->c(Ljava/lang/String;JLjava/lang/String;Lmh/p;)LL0/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LT/l;I)J
    .locals 3

    const v0, -0x3b3b517f

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.util.HyperlinkText.hyperlinkColorDefault (HyperlinkText.kt:20)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p2, p1, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method public final b(LL0/d;JLjava/lang/String;)LL0/d;
    .locals 26

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    move-wide/from16 v3, p2

    const-string v2, "text"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "url"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, LL0/d$a;

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v15, v6, v2, v5}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "hostAddress"

    invoke-virtual {v15, v2, v1}, LL0/d$a;->m(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, LL0/D;

    move-object v2, v1

    const v23, 0xfffe

    const/16 v24, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v25, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v2 .. v24}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v25

    invoke-virtual {v2, v1}, LL0/d$a;->n(LL0/D;)I

    move-result v1

    :try_start_0
    invoke-virtual {v2, v0}, LL0/d$a;->g(LL0/d;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v1}, LL0/d$a;->l(I)V

    invoke-virtual {v2}, LL0/d$a;->k()V

    invoke-virtual {v2}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v1}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public final c(Ljava/lang/String;JLjava/lang/String;Lmh/p;)LL0/d;
    .locals 34

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    const-string v3, "text"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "hyperlinkPattern"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "hyperlinkCreator"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LL0/d$a;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lkotlin/text/p;

    invoke-direct {v7, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {v7, v0, v4, v1, v6}, Lkotlin/text/p;->h(Lkotlin/text/p;Ljava/lang/CharSequence;IILjava/lang/Object;)Lzi/j;

    move-result-object v1

    invoke-interface {v1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/text/l;

    invoke-interface {v7}, Lkotlin/text/l;->d()Lsh/i;

    move-result-object v8

    invoke-virtual {v8}, Lsh/g;->i()I

    move-result v8

    invoke-virtual {v0, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v8, "substring(...)"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-interface {v7}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v2, v9, v4}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lvf/d$a;

    invoke-virtual {v9}, Lvf/d$a;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Lvf/d$a;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v10, v9}, LL0/d$a;->m(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v9, LL0/D;

    move-object v11, v9

    const v32, 0xfffe

    const/16 v33, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-wide/from16 v12, p2

    invoke-direct/range {v11 .. v33}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v9}, LL0/d$a;->n(LL0/D;)I

    move-result v9

    :try_start_0
    invoke-virtual {v3, v4}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v4, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3, v9}, LL0/d$a;->l(I)V

    invoke-virtual {v3}, LL0/d$a;->k()V

    invoke-interface {v7}, Lkotlin/text/l;->d()Lsh/i;

    move-result-object v4

    invoke-virtual {v4}, Lsh/g;->j()I

    move-result v4

    add-int/2addr v4, v5

    add-int/2addr v6, v5

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v0, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v7}, LL0/d$a;->i(Ljava/lang/String;)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v3, v9}, LL0/d$a;->l(I)V

    throw v0

    :cond_1
    invoke-virtual {v3, v0}, LL0/d$a;->i(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v3}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    return-object v0
.end method
