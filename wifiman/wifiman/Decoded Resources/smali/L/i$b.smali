.class final LL/i$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL/i;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LL/i;


# direct methods
.method constructor <init>(LL/i;)V
    .locals 0

    iput-object p1, p0, LL/i$b;->a:LL/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/Boolean;
    .locals 35

    move-object/from16 v0, p0

    iget-object v1, v0, LL/i$b;->a:LL/i;

    invoke-static {v1}, LL/i;->E2(LL/i;)LL/f;

    move-result-object v1

    iget-object v2, v0, LL/i$b;->a:LL/i;

    invoke-static {v2}, LL/i;->G2(LL/i;)LL0/U;

    move-result-object v3

    iget-object v2, v0, LL/i$b;->a:LL/i;

    invoke-static {v2}, LL/i;->F2(LL/i;)Lm0/y0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lm0/y0;->a()J

    move-result-wide v4

    goto :goto_0

    :cond_0
    sget-object v2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v2}, Lm0/v0$a;->e()J

    move-result-wide v4

    :goto_0
    const v33, 0xfffffe

    const/16 v34, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v3 .. v34}, LL0/U;->L(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LW0/h;IILL0/B;LW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v2

    invoke-virtual {v1, v2}, LL/f;->o(LL0/U;)LL0/M;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LL/i$b;->a(Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
