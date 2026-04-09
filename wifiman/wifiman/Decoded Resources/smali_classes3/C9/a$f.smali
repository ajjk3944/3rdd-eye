.class final LC9/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC9/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC9/a$f;

    invoke-direct {v0}, LC9/a$f;-><init>()V

    sput-object v0, LC9/a$f;->a:LC9/a$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LC9/a$f;->e()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LC9/a$f;->f()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method private static final e()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final f()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public final c(LT/l;I)V
    .locals 16

    move-object/from16 v7, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.notifications.ComposableSingletons$UiNotificationsKt.lambda-6.<anonymous> (UiNotifications.kt:596)"

    const v3, 0x3a6bf080    # 9.000376E-4f

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance v11, Ls9/d$c;

    const-string/jumbo v0, "Expandable notification usually will contain longer message that takes at least two lines"

    invoke-direct {v11, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v12, LC9/i$a$b;

    new-instance v0, Ls9/d$c;

    const-string/jumbo v1, "Notification Action Button"

    invoke-direct {v0, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v12, v0}, LC9/i$a$b;-><init>(Ls9/d;)V

    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->A()Ls9/b;

    move-result-object v0

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v7, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->f()J

    move-result-wide v1

    const-string/jumbo v3, "blue"

    invoke-static {v1, v2, v3}, Lta/c;->g(JLjava/lang/String;)Ls9/b$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v10

    new-instance v1, LC9/i;

    const/16 v14, 0x10

    const/4 v15, 0x0

    const-string v9, ""

    const/4 v13, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v15}, LC9/i;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;LC9/i$a;LC9/i$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x653ce7c2

    invoke-interface {v7, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_3

    new-instance v0, LC9/e;

    invoke-direct {v0}, LC9/e;-><init>()V

    invoke-interface {v7, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v3, v0

    check-cast v3, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v0, 0x653ceba2

    invoke-interface {v7, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_4

    new-instance v0, LC9/f;

    invoke-direct {v0}, LC9/f;-><init>()V

    invoke-interface {v7, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v0

    check-cast v4, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v8, 0x6d80

    const/16 v9, 0x61

    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v10

    move-object/from16 v7, p1

    invoke-static/range {v0 .. v9}, LC9/s;->i(Landroidx/compose/ui/e;LC9/i;Lmh/a;Lmh/a;ZZLC9/h;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LC9/a$f;->c(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
