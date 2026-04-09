.class final LF/m$n$d;
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
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:LF/E;

.field final synthetic d:LJ0/w;

.field final synthetic e:LR0/Q;


# direct methods
.method constructor <init>(ZZLF/E;LJ0/w;LR0/Q;)V
    .locals 0

    iput-boolean p1, p0, LF/m$n$d;->a:Z

    iput-boolean p2, p0, LF/m$n$d;->b:Z

    iput-object p3, p0, LF/m$n$d;->c:LF/E;

    iput-object p4, p0, LF/m$n$d;->d:LJ0/w;

    iput-object p5, p0, LF/m$n$d;->e:LR0/Q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/d;)Ljava/lang/Boolean;
    .locals 10

    const/4 v0, 0x1

    iget-boolean v1, p0, LF/m$n$d;->a:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, LF/m$n$d;->b:Z

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, LF/m$n$d;->c:LF/E;

    invoke-virtual {v1}, LF/E;->g()LR0/Z;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, LF/m$n$d;->c:LF/E;

    sget-object v3, LF/W;->a:LF/W$a;

    new-instance v4, LR0/n;

    invoke-direct {v4}, LR0/n;-><init>()V

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

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, LF/m$n$d;->e:LR0/Q;

    iget-object v1, p0, LF/m$n$d;->c:LF/E;

    invoke-virtual {v0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->n(J)I

    move-result v3

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->i(J)I

    move-result v4

    invoke-static {v2, v3, v4, p1}, Lkotlin/text/t;->K0(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result v0

    invoke-virtual {p1}, LL0/d;->length()I

    move-result p1

    add-int/2addr v0, p1

    invoke-static {v0}, LL0/T;->a(I)J

    move-result-wide v5

    invoke-virtual {v1}, LF/E;->m()Lmh/l;

    move-result-object p1

    new-instance v0, LR0/Q;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/d;

    invoke-virtual {p0, p1}, LF/m$n$d;->a(LL0/d;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
