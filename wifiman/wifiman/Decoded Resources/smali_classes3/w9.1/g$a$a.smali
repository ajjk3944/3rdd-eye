.class final Lw9/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw9/g$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw9/b;

.field final synthetic b:Lz/N;

.field final synthetic c:Lz/c$e;

.field final synthetic d:Ls/G;

.field final synthetic e:Z

.field final synthetic f:Lmh/a;

.field final synthetic g:Z

.field final synthetic h:Ls9/b;

.field final synthetic i:J

.field final synthetic j:Ljava/lang/String;

.field final synthetic k:F

.field final synthetic l:J

.field final synthetic m:LL0/U;


# direct methods
.method constructor <init>(Lw9/b;Lz/N;Lz/c$e;Ls/G;ZLmh/a;ZLs9/b;JLjava/lang/String;FJLL0/U;)V
    .locals 0

    iput-object p1, p0, Lw9/g$a$a;->a:Lw9/b;

    iput-object p2, p0, Lw9/g$a$a;->b:Lz/N;

    iput-object p3, p0, Lw9/g$a$a;->c:Lz/c$e;

    iput-object p4, p0, Lw9/g$a$a;->d:Ls/G;

    iput-boolean p5, p0, Lw9/g$a$a;->e:Z

    iput-object p6, p0, Lw9/g$a$a;->f:Lmh/a;

    iput-boolean p7, p0, Lw9/g$a$a;->g:Z

    iput-object p8, p0, Lw9/g$a$a;->h:Ls9/b;

    iput-wide p9, p0, Lw9/g$a$a;->i:J

    iput-object p11, p0, Lw9/g$a$a;->j:Ljava/lang/String;

    iput p12, p0, Lw9/g$a$a;->k:F

    iput-wide p13, p0, Lw9/g$a$a;->l:J

    iput-object p15, p0, Lw9/g$a$a;->m:LL0/U;

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

    const-string/jumbo v4, "com.ui.core.ui.component.button.UiButton.<anonymous>.<anonymous> (UiButton.kt:111)"

    const v5, -0x79fd4a0e

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v2, LN/f0;->a:LN/f0;

    sget v3, LN/f0;->b:I

    invoke-virtual {v2, v1, v3}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object v2

    invoke-virtual {v2}, LN/c1;->c()LL0/U;

    move-result-object v2

    new-instance v15, Lw9/g$a$a$a;

    iget-object v4, v0, Lw9/g$a$a;->a:Lw9/b;

    iget-object v5, v0, Lw9/g$a$a;->b:Lz/N;

    iget-object v6, v0, Lw9/g$a$a;->c:Lz/c$e;

    iget-object v7, v0, Lw9/g$a$a;->d:Ls/G;

    iget-boolean v8, v0, Lw9/g$a$a;->e:Z

    iget-object v9, v0, Lw9/g$a$a;->f:Lmh/a;

    iget-boolean v10, v0, Lw9/g$a$a;->g:Z

    iget-object v11, v0, Lw9/g$a$a;->h:Ls9/b;

    iget-wide v12, v0, Lw9/g$a$a;->i:J

    iget-object v14, v0, Lw9/g$a$a;->j:Ljava/lang/String;

    iget v3, v0, Lw9/g$a$a;->k:F

    move-object/from16 p2, v2

    iget-wide v1, v0, Lw9/g$a$a;->l:J

    move-wide/from16 v16, v1

    iget-object v1, v0, Lw9/g$a$a;->m:LL0/U;

    move v2, v3

    move-object v3, v15

    move-object v0, v15

    move v15, v2

    move-object/from16 v18, v1

    invoke-direct/range {v3 .. v18}, Lw9/g$a$a$a;-><init>(Lw9/b;Lz/N;Lz/c$e;Ls/G;ZLmh/a;ZLs9/b;JLjava/lang/String;FJLL0/U;)V

    const/16 v1, 0x36

    const v2, -0x5e0b175f

    const/4 v3, 0x1

    move-object/from16 v4, p1

    invoke-static {v2, v3, v0, v4, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/16 v1, 0x30

    move-object/from16 v2, p2

    invoke-static {v2, v0, v4, v1}, LN/a1;->a(LL0/U;Lmh/p;LT/l;I)V

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

    invoke-virtual {p0, p1, p2}, Lw9/g$a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
