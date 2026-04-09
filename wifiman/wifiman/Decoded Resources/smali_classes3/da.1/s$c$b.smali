.class final Lda/s$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/s$c;->a(LA9/i;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lda/s$c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/s$c$b;

    invoke-direct {v0}, Lda/s$c$b;-><init>()V

    sput-object v0, Lda/s$c$b;->a:Lda/s$c$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 36

    move-object/from16 v0, p2

    const-string/jumbo v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x3de4e027

    invoke-interface {v0, v1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.register.UiRegisterLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiRegisterLayout.kt:194)"

    move/from16 v4, p3

    invoke-static {v1, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v1, LL0/d$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ls9/d$b;

    sget v3, LP9/b;->w0:I

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    invoke-static {v2, v0, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ls9/d$b;

    sget v5, LP9/b;->v0:I

    invoke-direct {v3, v5}, Ls9/d$b;-><init>(I)V

    invoke-static {v3, v0, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ls9/d$b;

    sget v6, LP9/b;->u0:I

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ls9/d$b;-><init>(ILjava/util/List;)V

    invoke-static {v5, v0, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, LL0/d$a;->i(Ljava/lang/String;)V

    const v4, 0x1ba2870d

    invoke-interface {v0, v4}, LT/l;->U(I)V

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v5

    move-object v7, v3

    invoke-static/range {v6 .. v11}, Lkotlin/text/t;->k0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v4

    const-string/jumbo v6, "https://www.ui.com/eula/"

    const-string/jumbo v11, "URL"

    invoke-virtual {v1, v11, v6, v4, v3}, LL0/d$a;->a(Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v6, LL0/D;

    move-object v12, v6

    sget-object v10, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v10, v0, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$a;->f()J

    move-result-wide v13

    const v33, 0xfffe

    const/16 v34, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v12 .. v34}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6, v4, v3}, LL0/d$a;->c(LL0/D;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v3, 0x1ba2d6d9

    invoke-interface {v0, v3}, LT/l;->U(I)V

    const/4 v3, 0x6

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v6, v2

    move v12, v9

    move v9, v3

    move-object v3, v10

    move-object v10, v4

    invoke-static/range {v5 .. v10}, Lkotlin/text/t;->k0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v4

    const-string/jumbo v5, "https://www.ui.com/legal/termsofservice/"

    invoke-virtual {v1, v11, v5, v4, v2}, LL0/d$a;->a(Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v5, LL0/D;

    move-object v13, v5

    invoke-virtual {v3, v0, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v14

    const v34, 0xfffe

    const/16 v35, 0x0

    const-wide/16 v16, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v13 .. v35}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v5, v4, v2}, LL0/d$a;->c(LL0/D;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v1}, LL0/d$a;->p()LL0/d;

    move-result-object v1

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lda/s$c$b;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
