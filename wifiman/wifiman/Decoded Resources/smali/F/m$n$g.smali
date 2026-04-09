.class final LF/m$n$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$n;->a(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;

.field final synthetic b:Landroidx/compose/ui/focus/o;

.field final synthetic c:Z


# direct methods
.method constructor <init>(LF/E;Landroidx/compose/ui/focus/o;Z)V
    .locals 0

    iput-object p1, p0, LF/m$n$g;->a:LF/E;

    iput-object p2, p0, LF/m$n$g;->b:Landroidx/compose/ui/focus/o;

    iput-boolean p3, p0, LF/m$n$g;->c:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, LF/m$n$g;->a:LF/E;

    iget-object v1, p0, LF/m$n$g;->b:Landroidx/compose/ui/focus/o;

    iget-boolean v2, p0, LF/m$n$g;->c:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v0, v1, v2}, LF/m;->l(LF/E;Landroidx/compose/ui/focus/o;Z)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/m$n$g;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
