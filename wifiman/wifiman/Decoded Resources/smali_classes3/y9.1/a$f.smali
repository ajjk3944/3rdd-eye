.class final Ly9/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly9/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly9/a$f;

    invoke-direct {v0}, Ly9/a$f;-><init>()V

    sput-object v0, Ly9/a$f;->a:Ly9/a$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LL0/d;I)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Ly9/a$f;->c(LL0/d;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LL0/d;I)LYg/J;
    .locals 0

    invoke-virtual {p0, p1, p1}, LL0/d;->m(II)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/d$c;

    invoke-virtual {p0}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/X;

    invoke-virtual {p0}, LL0/X;->a()Ljava/lang/String;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 29

    move-object/from16 v0, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.dialog.ComposableSingletons$UiDialogAlertBottomKt.lambda-4.<anonymous> (UiDialogAlertBottom.kt:223)"

    const v5, -0x64613448

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x1e5bffe6

    invoke-interface {v0, v1}, LT/l;->U(I)V

    new-instance v1, LL0/d$a;

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v1, v2, v4, v5}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v2, "Start of text with clickable "

    invoke-virtual {v1, v2}, LL0/d$a;->i(Ljava/lang/String;)V

    new-instance v2, LL0/X;

    const-string/jumbo v4, "www.google.com"

    invoke-direct {v2, v4}, LL0/X;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LL0/d$a;->o(LL0/X;)I

    new-instance v2, LL0/D;

    move-object v6, v2

    sget-object v4, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v4, v0, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$a;->f()J

    move-result-wide v7

    sget-object v4, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v4}, LQ0/A$a;->b()LQ0/A;

    move-result-object v11

    const v27, 0xfffa

    const/16 v28, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v6 .. v28}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, LL0/d$a;->n(LL0/D;)I

    move-result v2

    :try_start_0
    const-string/jumbo v4, "Link"

    invoke-virtual {v1, v4}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v4, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, v2}, LL0/d$a;->l(I)V

    invoke-virtual {v1}, LL0/d$a;->k()V

    const-string v2, "."

    invoke-virtual {v1, v2}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-virtual {v1}, LL0/d$a;->p()LL0/d;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v2, 0x1e5c3dd0

    invoke-interface {v0, v2}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_3

    new-instance v2, Ly9/c;

    invoke-direct {v2, v1}, Ly9/c;-><init>(LL0/d;)V

    invoke-interface {v0, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v10, v2

    check-cast v10, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v2, Ls9/d$c;

    move-object v9, v2

    invoke-direct {v2, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v1, Ls9/c$a;

    move-object v7, v1

    sget v2, Lt9/a;->b:I

    invoke-direct {v1, v2, v5, v3, v5}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v23, 0x6030

    const v24, 0x7b65d

    const/4 v1, 0x0

    const-string v2, "Dialog Title"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v13, "Approve Everything"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v16, "Cancel"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v22, 0x6000030

    move-object/from16 v21, p1

    invoke-static/range {v1 .. v24}, Ly9/q;->k(Landroidx/compose/ui/e;Ljava/lang/String;IIJLs9/c;Lmh/r;Ls9/d;Lmh/l;Ls9/b;Lmh/a;Ljava/lang/String;Lmh/s;Lmh/a;Ljava/lang/String;Lmh/s;Lmh/a;Ljava/lang/String;Ljava/lang/String;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_1
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1, v2}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ly9/a$f;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
