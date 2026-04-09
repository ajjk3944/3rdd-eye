.class final LF/m$n$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

.field final synthetic b:LJ0/w;


# direct methods
.method constructor <init>(LF/E;LJ0/w;)V
    .locals 0

    iput-object p1, p0, LF/m$n$c;->a:LF/E;

    iput-object p2, p0, LF/m$n$c;->b:LJ0/w;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/d;)Ljava/lang/Boolean;
    .locals 9

    const/4 v0, 0x1

    iget-object v1, p0, LF/m$n$c;->a:LF/E;

    invoke-virtual {v1}, LF/E;->g()LR0/Z;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, LF/m$n$c;->a:LF/E;

    sget-object v3, LF/W;->a:LF/W$a;

    new-instance v4, LR0/f;

    invoke-direct {v4}, LR0/f;-><init>()V

    new-instance v5, LR0/a;

    invoke-direct {v5, p1, v0}, LR0/a;-><init>(LL0/d;I)V

    const/4 v6, 0x2

    new-array v6, v6, [LR0/i;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    aput-object v5, v6, v0

    invoke-static {v6}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2}, LF/E;->n()LR0/k;

    move-result-object v4

    invoke-virtual {v2}, LF/E;->m()Lmh/l;

    move-result-object v2

    invoke-virtual {v3, v0, v4, v2, v1}, LF/W$a;->g(Ljava/util/List;LR0/k;Lmh/l;LR0/Z;)V

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, LF/m$n$c;->a:LF/E;

    invoke-virtual {v0}, LF/E;->m()Lmh/l;

    move-result-object v0

    new-instance v8, LR0/Q;

    invoke-virtual {p1}, LL0/d;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LL0/d;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/d;

    invoke-virtual {p0, p1}, LF/m$n$c;->a(LL0/d;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
