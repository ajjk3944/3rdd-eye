.class final LN/n0$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/n0$a;->a(Lr/i;Lmh/l;ZLY0/d;)Lc0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY0/d;

.field final synthetic b:Lmh/l;

.field final synthetic c:Lr/i;

.field final synthetic d:Z


# direct methods
.method constructor <init>(LY0/d;Lmh/l;Lr/i;Z)V
    .locals 0

    iput-object p1, p0, LN/n0$a$b;->a:LY0/d;

    iput-object p2, p0, LN/n0$a$b;->b:Lmh/l;

    iput-object p3, p0, LN/n0$a$b;->c:Lr/i;

    iput-boolean p4, p0, LN/n0$a$b;->d:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/o0;)LN/n0;
    .locals 7

    new-instance v6, LN/n0;

    iget-object v2, p0, LN/n0$a$b;->a:LY0/d;

    iget-object v3, p0, LN/n0$a$b;->b:Lmh/l;

    iget-object v4, p0, LN/n0$a$b;->c:Lr/i;

    iget-boolean v5, p0, LN/n0$a$b;->d:Z

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LN/n0;-><init>(LN/o0;LY0/d;Lmh/l;Lr/i;Z)V

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/o0;

    invoke-virtual {p0, p1}, LN/n0$a$b;->a(LN/o0;)LN/n0;

    move-result-object p1

    return-object p1
.end method
