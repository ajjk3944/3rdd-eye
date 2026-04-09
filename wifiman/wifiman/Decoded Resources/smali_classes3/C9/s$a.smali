.class final LC9/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/s;->i(Landroidx/compose/ui/e;LC9/i;Lmh/a;Lmh/a;ZZLC9/h;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(Lmh/a;LT/q0;)V
    .locals 0

    iput-object p1, p0, LC9/s$a;->a:Lmh/a;

    iput-object p2, p0, LC9/s$a;->b:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/a;LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LC9/s$a;->c(Lmh/a;LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/a;LT/q0;)LYg/J;
    .locals 1

    invoke-static {p1}, LC9/s;->x(LT/q0;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x1

    invoke-static {p1, p0}, LC9/s;->y(LT/q0;Z)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(ZLT/l;I)V
    .locals 15

    move-object v0, p0

    move/from16 v1, p1

    move-object/from16 v14, p2

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v14, v1}, LT/l;->c(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.notifications.UiExpandableNotification.<anonymous>.<anonymous>.<anonymous> (UiNotifications.kt:358)"

    const v5, -0x689b2244

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    if-eqz v1, :cond_6

    const v1, -0x607c0f2f

    invoke-interface {v14, v1}, LT/l;->U(I)V

    const v1, -0x31cc194

    invoke-interface {v14, v1}, LT/l;->U(I)V

    iget-object v1, v0, LC9/s$a;->a:Lmh/a;

    iget-object v2, v0, LC9/s$a;->b:LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_5

    new-instance v3, LC9/r;

    invoke-direct {v3, v1, v2}, LC9/r;-><init>(Lmh/a;LT/q0;)V

    invoke-interface {v14, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v11, v3

    check-cast v11, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    sget-object v1, LN/e;->a:LN/e;

    sget-object v2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v2}, Lm0/v0$a;->d()J

    move-result-wide v2

    sget v4, LN/e;->l:I

    shl-int/lit8 v4, v4, 0x9

    or-int/lit8 v9, v4, 0x6

    const/4 v10, 0x6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v8, p2

    invoke-virtual/range {v1 .. v10}, LN/e;->g(JJJLT/l;II)LN/d;

    move-result-object v8

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v6

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, Landroidx/compose/foundation/layout/o;->a(F)Lz/N;

    move-result-object v9

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v2, 0x28

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v1, LC9/a;->a:LC9/a;

    invoke-virtual {v1}, LC9/a;->a()Lmh/q;

    move-result-object v10

    const v12, 0x36006036

    const/16 v13, 0x4c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v1, v11

    move-object/from16 v11, p2

    invoke-static/range {v1 .. v13}, LN/g;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/f;Lm0/i1;Ls/g;LN/d;Lz/N;Lmh/q;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_3

    :cond_6
    const v1, -0x606c14a3

    invoke-interface {v14, v1}, LT/l;->U(I)V

    sget-object v1, LN9/b;->a:LN9/b;

    invoke-virtual {v1}, LN9/b;->d()Ls9/b;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v3, 0xa

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/o;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v3, 0x14

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v14, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    const/16 v6, 0x30

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v7}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LC9/s$a;->b(ZLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
