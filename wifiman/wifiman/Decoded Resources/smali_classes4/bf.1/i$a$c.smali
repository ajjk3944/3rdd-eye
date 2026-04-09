.class final Lbf/i$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/i$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbf/e;


# direct methods
.method constructor <init>(Lbf/e;)V
    .locals 0

    iput-object p1, p0, Lbf/i$a$c;->a:Lbf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speed.hosts.NetworkHostlistItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkHostListItem.kt:159)"

    const v3, 0x15a4a288

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, v0, Lbf/i$a$c;->a:Lbf/e;

    invoke-virtual {v1}, Lbf/e;->c()Lb8/b;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {v1, v2}, LNe/d;->c(Lb8/b;Z)Ls9/d;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_1
    iget-object v1, v0, Lbf/i$a$c;->a:Lbf/e;

    invoke-virtual {v1}, Lbf/e;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ls9/d$b;

    sget v3, Lm8/c;->z4:I

    invoke-direct {v1, v3}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance v1, Ls9/d$c;

    const-string v3, ""

    invoke-direct {v1, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_3
    :goto_0
    invoke-static {v1, v14, v2}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v22

    sget-object v1, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v1, v14, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->b()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->b()LL0/U;

    move-result-object v23

    iget-object v1, v0, Lbf/i$a$c;->a:Lbf/e;

    invoke-virtual {v1}, Lbf/e;->c()Lb8/b;

    move-result-object v1

    const v3, -0x76b7de64

    invoke-interface {v14, v3}, LT/l;->U(I)V

    if-nez v1, :cond_4

    const/4 v1, 0x0

    goto :goto_1

    :cond_4
    invoke-static {v1, v14, v2}, LNe/d;->a(Lb8/b;LT/l;I)J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    :goto_1
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v3, -0x76b7e008

    invoke-interface {v14, v3}, LT/l;->U(I)V

    if-nez v1, :cond_5

    sget-object v1, Lb8/b;->a:Lb8/b$b;

    const v3, 0x7fffffff

    invoke-virtual {v1, v3}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v1

    invoke-static {v1, v14, v2}, LNe/d;->a(Lb8/b;LT/l;I)J

    move-result-wide v1

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v1

    :goto_2
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v7, 0x180

    const/16 v8, 0xa

    const/4 v3, 0x0

    const-string v4, "edit mode"

    const/4 v5, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v3

    const/16 v25, 0x0

    const v26, 0x1fffa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    move-wide v14, v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v1, v22

    move-object/from16 v22, v23

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lbf/i$a$c;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
