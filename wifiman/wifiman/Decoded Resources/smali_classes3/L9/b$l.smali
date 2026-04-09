.class final LL9/b$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LL9/b$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL9/b$l;

    invoke-direct {v0}, LL9/b$l;-><init>()V

    sput-object v0, LL9/b$l;->a:LL9/b$l;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 23

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

    const-string/jumbo v3, "com.ui.core.ui.component.toolbar.ComposableSingletons$UiToolbarKt.lambda-8.<anonymous> (UiToolbar.kt:196)"

    const v4, 0x2193f8e9

    invoke-static {v4, v0, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance v0, LL9/d$c$b;

    move-object v7, v0

    new-instance v1, Ls9/d$c;

    const-string v3, "Cancel"

    invoke-direct {v1, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, LL9/d$c$b;-><init>(Ls9/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, LL9/b;->a:LL9/b;

    invoke-virtual {v0}, LL9/b;->g()Lmh/q;

    move-result-object v9

    const/16 v21, 0x0

    const/16 v22, 0x7e9

    const/4 v5, 0x0

    const-string/jumbo v6, "Very Long Toolbar Title Little more"

    const/4 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x61b0

    move-object/from16 v19, p1

    invoke-static/range {v5 .. v22}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

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

    invoke-virtual {p0, p1, p2}, LL9/b$l;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
