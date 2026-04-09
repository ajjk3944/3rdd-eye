.class final Lw/A$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/A;-><init>(Lw/y;Ls/S;Lw/n;Lw/q;ZLx0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/A;


# direct methods
.method constructor <init>(Lw/A;)V
    .locals 0

    iput-object p1, p0, Lw/A$e;->a:Lw/A;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 3

    iget-object v0, p0, Lw/A$e;->a:Lw/A;

    invoke-static {v0}, Lw/A;->e(Lw/A;)Lw/v;

    move-result-object v0

    iget-object v1, p0, Lw/A$e;->a:Lw/A;

    invoke-static {v1}, Lw/A;->b(Lw/A;)I

    move-result v2

    invoke-static {v1, v0, p1, p2, v2}, Lw/A;->i(Lw/A;Lw/v;JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lw/A$e;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    return-object p1
.end method
