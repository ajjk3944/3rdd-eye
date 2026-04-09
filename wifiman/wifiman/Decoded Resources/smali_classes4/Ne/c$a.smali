.class final LNe/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNe/c;->c(Lb8/a;IZ)Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb8/a;

.field final synthetic b:I


# direct methods
.method constructor <init>(Lb8/a;I)V
    .locals 0

    iput-object p1, p0, LNe/c$a;->a:Lb8/a;

    iput p2, p0, LNe/c$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x4ff79046

    invoke-interface {v2, v3}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.domain.getColorString.<anonymous> (InternetAvailabilityExtensions.kt:43)"

    move/from16 v6, p3

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, v1, LNe/c$a;->a:Lb8/a;

    iget v4, v1, LNe/c$a;->b:I

    new-instance v5, LL0/d$a;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v5, v8, v6, v7}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, LL0/D;

    move-object v9, v6

    invoke-static {v3, v2, v8}, LNe/c;->a(Lb8/a;LT/l;I)J

    move-result-wide v10

    const v30, 0xfffe

    const/16 v31, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v9 .. v31}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, LL0/d$a;->n(LL0/D;)I

    move-result v3

    :try_start_0
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "getString(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v5, v3}, LL0/d$a;->l(I)V

    invoke-virtual {v5}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v5, v3}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LNe/c$a;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
