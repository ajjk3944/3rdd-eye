.class final LF9/u0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/u0;->c(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;Ljava/lang/String;ZLmh/l;Ls9/b;Lmh/a;ZLjava/lang/String;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/l;

.field final synthetic c:Z


# direct methods
.method constructor <init>(ZLmh/l;Z)V
    .locals 0

    iput-boolean p1, p0, LF9/u0$a;->a:Z

    iput-object p2, p0, LF9/u0$a;->b:Lmh/l;

    iput-boolean p3, p0, LF9/u0$a;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 9

    const-string v0, "$this$UiSettingsBase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.component.settings.UiSettingsToggle.<anonymous> (UiSettingsToggle.kt:42)"

    const v1, -0x7ffed0cc

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-boolean v3, p0, LF9/u0$a;->a:Z

    iget-object v4, p0, LF9/u0$a;->b:Lmh/l;

    iget-boolean v5, p0, LF9/u0$a;->c:Z

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v2, 0x0

    move-object v6, p2

    invoke-static/range {v2 .. v8}, LI9/d;->d(Landroidx/compose/ui/e;ZLmh/l;ZLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF9/u0$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
