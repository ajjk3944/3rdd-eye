.class final LE0/c$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/c;->J2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/c;


# direct methods
.method constructor <init>(LE0/c;)V
    .locals 0

    iput-object p1, p0, LE0/c$b;->a:LE0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LE0/c$b;->a:LE0/c;

    invoke-virtual {v0}, LE0/c;->D2()Landroidx/compose/ui/e$b;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD0/d;

    iget-object v1, p0, LE0/c$b;->a:LE0/c;

    invoke-interface {v0, v1}, LD0/d;->Z0(LD0/k;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/c$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
