.class final Lcom/ui/wifiman/ui/settings/feedback/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/settings/feedback/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/settings/feedback/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/settings/feedback/f$b;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/settings/feedback/f$b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/settings/feedback/f$b;->a:Lcom/ui/wifiman/ui/settings/feedback/f$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 26

    move-object/from16 v15, p1

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.feedback.ComposableSingletons$AppFeedbackFormUiKt.lambda-2.<anonymous> (AppFeedbackFormUi.kt:74)"

    const v3, -0x25389484

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance v0, Ls9/d$b;

    sget v1, Lm8/c;->p:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    const/4 v1, 0x0

    invoke-static {v0, v15, v1}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v15, v2}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->b()LL0/U;

    move-result-object v21

    invoke-virtual {v1, v15, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->d()J

    move-result-wide v2

    const/16 v24, 0x0

    const v25, 0x1fffa

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p1

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

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

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/settings/feedback/f$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
