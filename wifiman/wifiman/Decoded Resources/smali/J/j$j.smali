.class final LJ/j$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


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

.field final synthetic b:LJ/j;

.field final synthetic c:Lkotlin/jvm/internal/M;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V
    .locals 0

    iput-object p1, p0, LJ/j$j;->a:Lkotlin/jvm/internal/M;

    iput-object p2, p0, LJ/j$j;->b:LJ/j;

    iput-object p3, p0, LJ/j$j;->c:Lkotlin/jvm/internal/M;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;J)V
    .locals 4

    iget-object v0, p0, LJ/j$j;->a:Lkotlin/jvm/internal/M;

    iget-wide v1, v0, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v1, v2, p2, p3}, Ll0/g;->r(JJ)J

    move-result-wide p2

    iput-wide p2, v0, Lkotlin/jvm/internal/M;->a:J

    iget-object p2, p0, LJ/j$j;->b:LJ/j;

    sget-object p3, LF/p;->Cursor:LF/p;

    iget-object v0, p0, LJ/j$j;->c:Lkotlin/jvm/internal/M;

    iget-wide v0, v0, Lkotlin/jvm/internal/M;->a:J

    iget-object v2, p0, LJ/j$j;->a:Lkotlin/jvm/internal/M;

    iget-wide v2, v2, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v0, v1, v2, v3}, Ll0/g;->r(JJ)J

    move-result-wide v0

    invoke-virtual {p2, p3, v0, v1}, LJ/j;->F0(LF/p;J)V

    iget-object p2, p0, LJ/j$j;->b:LJ/j;

    invoke-virtual {p2}, LJ/j;->X()J

    move-result-wide v0

    invoke-static {p2, v0, v1}, LJ/j;->s(LJ/j;J)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ly0/y;->a()V

    iget-object p1, p0, LJ/j$j;->b:LJ/j;

    invoke-static {p1}, LJ/j;->h(LJ/j;)Lu0/a;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p2, Lu0/b;->a:Lu0/b$a;

    invoke-virtual {p2}, Lu0/b$a;->b()I

    move-result p2

    invoke-interface {p1, p2}, Lu0/a;->a(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly0/y;

    check-cast p2, Ll0/g;

    invoke-virtual {p2}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LJ/j$j;->a(Ly0/y;J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
