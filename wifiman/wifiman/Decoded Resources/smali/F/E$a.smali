.class final LF/E$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/E;-><init>(LF/S;LT/J0;Landroidx/compose/ui/platform/n1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;


# direct methods
.method constructor <init>(LF/E;)V
    .locals 0

    iput-object p1, p0, LF/E$a;->a:LF/E;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, LF/E$a;->a:LF/E;

    invoke-static {v0}, LF/E;->a(LF/E;)LF/A;

    move-result-object v0

    invoke-virtual {v0, p1}, LF/A;->d(I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/r;

    invoke-virtual {p1}, LR0/r;->p()I

    move-result p1

    invoke-virtual {p0, p1}, LF/E$a;->a(I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
