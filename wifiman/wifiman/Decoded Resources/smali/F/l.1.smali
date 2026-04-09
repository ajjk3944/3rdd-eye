.class public final LF/l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field final synthetic a:LF/Q;


# direct methods
.method public constructor <init>(LF/Q;)V
    .locals 0

    iput-object p1, p0, LF/l;->a:LF/Q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Ljava/lang/String;
    .locals 3

    const v0, -0x567dd55d

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:98)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p2, p0, LF/l;->a:LF/Q;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LF/Q;->resolvedString(LT/l;I)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/l;->a(LT/l;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
