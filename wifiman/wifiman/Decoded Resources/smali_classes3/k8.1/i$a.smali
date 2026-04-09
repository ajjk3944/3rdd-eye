.class final Lk8/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk8/i;->b(Lb8/d;Z)Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb8/d;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lb8/d;Z)V
    .locals 0

    iput-object p1, p0, Lk8/i$a;->a:Lb8/d;

    iput-boolean p2, p0, Lk8/i$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string/jumbo v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x4abe050b

    invoke-interface {v2, v3}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ubnt.usurvey.ui.common.string.<anonymous> (PacketLossExtensions.kt:23)"

    move/from16 v6, p3

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, v1, Lk8/i$a;->a:Lb8/d;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lb8/d;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    iget-boolean v5, v1, Lk8/i$a;->b:Z

    iget-object v6, v1, Lk8/i$a;->a:Lb8/d;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const v7, 0x2d14efe7

    invoke-interface {v2, v7}, LT/l;->U(I)V

    if-nez v3, :cond_3

    const v3, 0x7f110099

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_1
    move-object v4, v3

    goto :goto_2

    :cond_3
    const-string v7, " %"

    if-eqz v5, :cond_4

    new-instance v5, LL0/d$a;

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct {v5, v9, v8, v4}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, LL0/D;

    move-object v10, v4

    invoke-static {v6, v2, v9}, Lk8/i;->a(Lb8/d;LT/l;I)J

    move-result-wide v11

    const v31, 0xfffe

    const/16 v32, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v10 .. v32}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v4}, LL0/d$a;->n(LL0/D;)I

    move-result v4

    :try_start_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v5, v4}, LL0/d$a;->l(I)V

    invoke-virtual {v5}, LL0/d$a;->p()LL0/d;

    move-result-object v3

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v5, v4}, LL0/d$a;->l(I)V

    throw v0

    :cond_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :goto_2
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_3
    if-nez v4, :cond_5

    const v3, 0x7f1103c6

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v0, "getString(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v4
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lk8/i$a;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
