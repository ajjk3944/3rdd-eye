.class final LJ/g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/g;-><init>(LI/o1;LJ/j;LI/l1;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/g;


# direct methods
.method constructor <init>(LJ/g;)V
    .locals 0

    iput-object p1, p0, LJ/g$a;->a:LJ/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/d;)J
    .locals 2

    iget-object p1, p0, LJ/g$a;->a:LJ/g;

    invoke-static {p1}, LJ/g;->K2(LJ/g;)Lr/a;

    move-result-object p1

    invoke-virtual {p1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/d;

    invoke-virtual {p0, p1}, LJ/g$a;->a(LY0/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    return-object p1
.end method
