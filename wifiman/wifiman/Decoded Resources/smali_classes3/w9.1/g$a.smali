.class final Lw9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw9/g;->b(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lw9/b;

.field final synthetic c:Lz/N;

.field final synthetic d:Lz/c$e;

.field final synthetic e:Ls/G;

.field final synthetic f:Z

.field final synthetic g:Lmh/a;

.field final synthetic h:Z

.field final synthetic i:Ls9/b;

.field final synthetic j:J

.field final synthetic k:Ljava/lang/String;

.field final synthetic l:F

.field final synthetic m:LL0/U;


# direct methods
.method constructor <init>(JLw9/b;Lz/N;Lz/c$e;Ls/G;ZLmh/a;ZLs9/b;JLjava/lang/String;FLL0/U;)V
    .locals 0

    iput-wide p1, p0, Lw9/g$a;->a:J

    iput-object p3, p0, Lw9/g$a;->b:Lw9/b;

    iput-object p4, p0, Lw9/g$a;->c:Lz/N;

    iput-object p5, p0, Lw9/g$a;->d:Lz/c$e;

    iput-object p6, p0, Lw9/g$a;->e:Ls/G;

    iput-boolean p7, p0, Lw9/g$a;->f:Z

    iput-object p8, p0, Lw9/g$a;->g:Lmh/a;

    iput-boolean p9, p0, Lw9/g$a;->h:Z

    iput-object p10, p0, Lw9/g$a;->i:Ls9/b;

    iput-wide p11, p0, Lw9/g$a;->j:J

    iput-object p13, p0, Lw9/g$a;->k:Ljava/lang/String;

    iput p14, p0, Lw9/g$a;->l:F

    iput-object p15, p0, Lw9/g$a;->m:LL0/U;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.button.UiButton.<anonymous> (UiButton.kt:110)"

    const v5, 0x26c7c2b2

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v2

    iget-wide v3, v0, Lw9/g$a;->a:J

    invoke-static {v3, v4}, Lm0/v0;->n(J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v2

    new-instance v15, Lw9/g$a$a;

    iget-object v4, v0, Lw9/g$a;->b:Lw9/b;

    iget-object v5, v0, Lw9/g$a;->c:Lz/N;

    iget-object v6, v0, Lw9/g$a;->d:Lz/c$e;

    iget-object v7, v0, Lw9/g$a;->e:Ls/G;

    iget-boolean v8, v0, Lw9/g$a;->f:Z

    iget-object v9, v0, Lw9/g$a;->g:Lmh/a;

    iget-boolean v10, v0, Lw9/g$a;->h:Z

    iget-object v11, v0, Lw9/g$a;->i:Ls9/b;

    iget-wide v12, v0, Lw9/g$a;->j:J

    iget-object v14, v0, Lw9/g$a;->k:Ljava/lang/String;

    iget v3, v0, Lw9/g$a;->l:F

    move-object/from16 p2, v2

    iget-wide v1, v0, Lw9/g$a;->a:J

    move-wide/from16 v16, v1

    iget-object v1, v0, Lw9/g$a;->m:LL0/U;

    move v2, v3

    move-object v3, v15

    move-object v0, v15

    move v15, v2

    move-object/from16 v18, v1

    invoke-direct/range {v3 .. v18}, Lw9/g$a$a;-><init>(Lw9/b;Lz/N;Lz/c$e;Ls/G;ZLmh/a;ZLs9/b;JLjava/lang/String;FJLL0/U;)V

    const/16 v1, 0x36

    const v2, -0x79fd4a0e

    const/4 v3, 0x1

    move-object/from16 v4, p1

    invoke-static {v2, v3, v0, v4, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v1, LT/I0;->i:I

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v2, p2

    invoke-static {v2, v0, v4, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lw9/g$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
