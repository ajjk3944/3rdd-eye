.class final LTe/w0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTe/w0;->o(Landroidx/compose/ui/e;LTe/l0;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LTe/w0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTe/w0$d;

    invoke-direct {v0}, LTe/w0$d;-><init>()V

    sput-object v0, LTe/w0$d;->a:LTe/w0$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 28

    move-object/from16 v0, p2

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x41e4d8de

    invoke-interface {v0, v1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.signal.components.SignalTabConnectionStatsBar.<anonymous>.<anonymous> (SignalTabConnectionStatsBar.kt:99)"

    move/from16 v4, p3

    invoke-static {v1, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v1, LL0/d$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, -0x69b94b14

    invoke-interface {v0, v2}, LT/l;->U(I)V

    new-instance v2, LL0/D;

    move-object v5, v2

    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v0, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->d()J

    move-result-wide v6

    const v26, 0xfffe

    const/16 v27, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v5 .. v27}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, LL0/d$a;->n(LL0/D;)I

    move-result v2

    :try_start_0
    sget v3, Lm8/c;->L2:I

    invoke-static {v3, v0, v4}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, v2}, LL0/d$a;->l(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v1}, LL0/d$a;->p()LL0/d;

    move-result-object v1

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v1

    :catchall_0
    move-exception v0

    invoke-virtual {v1, v2}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LTe/w0$d;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
