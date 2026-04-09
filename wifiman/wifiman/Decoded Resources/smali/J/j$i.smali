.class final LJ/j$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->J(Ly0/G;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/M;

.field final synthetic b:Lkotlin/jvm/internal/M;

.field final synthetic c:LJ/j;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;LJ/j;)V
    .locals 0

    iput-object p1, p0, LJ/j$i;->a:Lkotlin/jvm/internal/M;

    iput-object p2, p0, LJ/j$i;->b:Lkotlin/jvm/internal/M;

    iput-object p3, p0, LJ/j$i;->c:LJ/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LJ/j$i;->a:Lkotlin/jvm/internal/M;

    iget-object v1, p0, LJ/j$i;->b:Lkotlin/jvm/internal/M;

    iget-object v2, p0, LJ/j$i;->c:LJ/j;

    invoke-static {v0, v1, v2}, LJ/j;->b(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;LJ/j;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ/j$i;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
