.class final LJ/j$l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->L(Ly0/G;ZLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/M;

.field final synthetic b:LJ/j;

.field final synthetic c:Z

.field final synthetic d:LF/p;

.field final synthetic e:Lkotlin/jvm/internal/M;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;LJ/j;ZLF/p;Lkotlin/jvm/internal/M;)V
    .locals 0

    iput-object p1, p0, LJ/j$l;->a:Lkotlin/jvm/internal/M;

    iput-object p2, p0, LJ/j$l;->b:LJ/j;

    iput-boolean p3, p0, LJ/j$l;->c:Z

    iput-object p4, p0, LJ/j$l;->d:LF/p;

    iput-object p5, p0, LJ/j$l;->e:Lkotlin/jvm/internal/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    iget-object p1, p0, LJ/j$l;->a:Lkotlin/jvm/internal/M;

    iget-object p2, p0, LJ/j$l;->b:LJ/j;

    iget-boolean v0, p0, LJ/j$l;->c:Z

    invoke-static {p2, v0}, LJ/j;->g(LJ/j;Z)J

    move-result-wide v0

    invoke-static {v0, v1}, LM/w;->a(J)J

    move-result-wide v0

    iput-wide v0, p1, Lkotlin/jvm/internal/M;->a:J

    iget-object p1, p0, LJ/j$l;->b:LJ/j;

    iget-object p2, p0, LJ/j$l;->d:LF/p;

    iget-object v0, p0, LJ/j$l;->a:Lkotlin/jvm/internal/M;

    iget-wide v0, v0, Lkotlin/jvm/internal/M;->a:J

    invoke-virtual {p1, p2, v0, v1}, LJ/j;->F0(LF/p;J)V

    iget-object p1, p0, LJ/j$l;->e:Lkotlin/jvm/internal/M;

    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->c()J

    move-result-wide v0

    iput-wide v0, p1, Lkotlin/jvm/internal/M;->a:J

    iget-object p1, p0, LJ/j$l;->b:LJ/j;

    const/4 p2, -0x1

    invoke-static {p1, p2}, LJ/j;->u(LJ/j;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LJ/j$l;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
