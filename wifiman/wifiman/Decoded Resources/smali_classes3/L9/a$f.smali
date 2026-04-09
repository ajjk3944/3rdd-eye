.class final LL9/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LL9/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL9/a$f;

    invoke-direct {v0}, LL9/a$f;-><init>()V

    sput-object v0, LL9/a$f;->a:LL9/a$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 15

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

    const-string/jumbo v2, "com.ui.core.ui.component.toolbar.ComposableSingletons$UiToolbarBaseKt.lambda-6.<anonymous> (UiToolbarBase.kt:217)"

    const v3, -0x6e00648

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, LL9/a;->a:LL9/a;

    invoke-virtual {v0}, LL9/a;->b()Lmh/p;

    move-result-object v2

    invoke-virtual {v0}, LL9/a;->c()Lmh/p;

    move-result-object v3

    invoke-virtual {v0}, LL9/a;->e()Lmh/q;

    move-result-object v4

    const/16 v13, 0xdb0

    const/16 v14, 0x1f1

    const/4 v1, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, LL9/q;->r(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FLT/l;II)V

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

    invoke-virtual {p0, p1, p2}, LL9/a$f;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
