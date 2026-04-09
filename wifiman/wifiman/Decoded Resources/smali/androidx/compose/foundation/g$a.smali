.class final Landroidx/compose/foundation/g$a;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final n:Ly/k;

.field private o:Z

.field private p:Z

.field private q:Z


# direct methods
.method public constructor <init>(Ly/k;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/g$a;->n:Ly/k;

    return-void
.end method

.method public static final synthetic D2(Landroidx/compose/foundation/g$a;)Ly/k;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/g$a;->n:Ly/k;

    return-object p0
.end method

.method public static final synthetic E2(Landroidx/compose/foundation/g$a;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/g$a;->q:Z

    return p0
.end method

.method public static final synthetic F2(Landroidx/compose/foundation/g$a;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/g$a;->p:Z

    return p0
.end method

.method public static final synthetic G2(Landroidx/compose/foundation/g$a;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/g$a;->o:Z

    return p0
.end method

.method public static final synthetic H2(Landroidx/compose/foundation/g$a;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/g$a;->q:Z

    return-void
.end method

.method public static final synthetic I2(Landroidx/compose/foundation/g$a;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/g$a;->p:Z

    return-void
.end method

.method public static final synthetic J2(Landroidx/compose/foundation/g$a;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/g$a;->o:Z

    return-void
.end method


# virtual methods
.method public J(Lo0/c;)V
    .locals 23

    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lo0/c;->X1()V

    iget-boolean v1, v0, Landroidx/compose/foundation/g$a;->o:Z

    if-eqz v1, :cond_0

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->a()J

    move-result-wide v2

    const/16 v8, 0xe

    const/4 v9, 0x0

    const v4, 0x3e99999a    # 0.3f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v11

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v15

    const/16 v21, 0x7a

    const/16 v22, 0x0

    const-wide/16 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v10 .. v22}, Lo0/f;->u0(Lo0/f;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-boolean v1, v0, Landroidx/compose/foundation/g$a;->p:Z

    if-nez v1, :cond_1

    iget-boolean v1, v0, Landroidx/compose/foundation/g$a;->q:Z

    if-eqz v1, :cond_2

    :cond_1
    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->a()J

    move-result-wide v2

    const/16 v8, 0xe

    const/4 v9, 0x0

    const v4, 0x3dcccccd    # 0.1f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v11

    invoke-interface/range {p1 .. p1}, Lo0/f;->c()J

    move-result-wide v15

    const/16 v21, 0x7a

    const/16 v22, 0x0

    const-wide/16 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v10 .. v22}, Lo0/f;->u0(Lo0/f;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public n2()V
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v0

    new-instance v3, Landroidx/compose/foundation/g$a$a;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Landroidx/compose/foundation/g$a$a;-><init>(Landroidx/compose/foundation/g$a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method
