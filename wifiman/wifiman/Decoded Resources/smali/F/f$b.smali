.class final LF/f$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->c(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LR0/Q;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(LR0/Q;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LF/f$b;->a:LR0/Q;

    iput-object p2, p0, LF/f$b;->b:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/Q;)V
    .locals 1

    iget-object v0, p0, LF/f$b;->a:LR0/Q;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LF/f$b;->b:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/Q;

    invoke-virtual {p0, p1}, LF/f$b;->a(LR0/Q;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
