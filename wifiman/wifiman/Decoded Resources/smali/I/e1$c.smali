.class final LI/e1$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;


# direct methods
.method constructor <init>(LI/e1;)V
    .locals 0

    iput-object p1, p0, LI/e1$c;->a:LI/e1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/d;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LI/e1$c;->a:LI/e1;

    invoke-static {v0}, LI/e1;->K2(LI/e1;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v0, p0, LI/e1$c;->a:LI/e1;

    invoke-virtual {v0}, LI/e1;->f3()LI/o1;

    move-result-object v0

    invoke-virtual {v0, p1}, LI/o1;->s(Ljava/lang/CharSequence;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/d;

    invoke-virtual {p0, p1}, LI/e1$c;->a(LL0/d;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
