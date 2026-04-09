.class final Lx/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/b;


# instance fields
.field private final a:Lr/i;


# direct methods
.method public constructor <init>(Lr/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/l;->a:Lr/i;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lw/v;Ljava/lang/Object;Ljava/lang/Object;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 6

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lx/l;->b(Lw/v;FFLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lw/v;FFLmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 16

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move/from16 v1, p3

    invoke-static/range {v0 .. v8}, Lr/l;->c(FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v12

    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->signum(F)F

    move-result v1

    mul-float v10, v0, v1

    move-object/from16 v0, p0

    iget-object v13, v0, Lx/l;->a:Lr/i;

    move-object/from16 v9, p1

    move/from16 v11, p2

    move-object/from16 v14, p4

    move-object/from16 v15, p5

    invoke-static/range {v9 .. v15}, Lx/h;->c(Lw/v;FFLr/k;Lr/i;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_0

    return-object v1

    :cond_0
    check-cast v1, Lx/a;

    return-object v1
.end method
