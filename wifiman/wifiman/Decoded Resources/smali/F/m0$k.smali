.class final LF/m0$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0;->t(Landroidx/compose/ui/e;LL0/d$c;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY0/p;


# direct methods
.method constructor <init>(LY0/p;)V
    .locals 0

    iput-object p1, p0, LF/m0$k;->a:LY0/p;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, LF/m0$k;->a:LY0/p;

    invoke-virtual {v0}, LY0/p;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LF/m0$k;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->b(J)LY0/n;

    move-result-object v0

    return-object v0
.end method
