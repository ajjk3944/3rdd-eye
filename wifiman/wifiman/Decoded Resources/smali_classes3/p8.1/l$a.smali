.class final Lp8/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/l;->a(LCc/a;)LMe/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/l$a;

    invoke-direct {v0}, Lp8/l$a;-><init>()V

    sput-object v0, Lp8/l$a;->a:Lp8/l$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 29

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string/jumbo v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7c50760

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ubnt.usurvey.ui.discovery.asBleDiscoveryResultModel.<anonymous>.<anonymous> (DiscoveryItemFactoryExtensions.kt:56)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v2, LL0/d$a;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, LL0/D;

    move-object v6, v3

    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v1, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$a;->f()J

    move-result-wide v7

    const v27, 0xfffe

    const/16 v28, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v6 .. v28}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v3}, LL0/d$a;->n(LL0/D;)I

    move-result v3

    const v4, 0x7f11007c

    :try_start_0
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v4, "getString(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v3}, LL0/d$a;->l(I)V

    invoke-virtual {v2}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v3}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lp8/l$a;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
