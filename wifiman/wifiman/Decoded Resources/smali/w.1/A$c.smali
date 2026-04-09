.class public final Lw/A$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/A;-><init>(Lw/y;Ls/S;Lw/n;Lw/q;ZLx0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/A;


# direct methods
.method constructor <init>(Lw/A;)V
    .locals 0

    iput-object p1, p0, Lw/A$c;->a:Lw/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JI)J
    .locals 2

    iget-object v0, p0, Lw/A$c;->a:Lw/A;

    invoke-static {v0, p3}, Lw/A;->j(Lw/A;I)V

    iget-object v0, p0, Lw/A$c;->a:Lw/A;

    invoke-static {v0}, Lw/A;->f(Lw/A;)Ls/S;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lw/A$c;->a:Lw/A;

    invoke-static {v1}, Lw/A;->h(Lw/A;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p3, p0, Lw/A$c;->a:Lw/A;

    invoke-static {p3}, Lw/A;->b(Lw/A;)I

    move-result p3

    iget-object v1, p0, Lw/A$c;->a:Lw/A;

    invoke-static {v1}, Lw/A;->g(Lw/A;)Lmh/l;

    move-result-object v1

    invoke-interface {v0, p1, p2, p3, v1}, Ls/S;->b(JILmh/l;)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lw/A$c;->a:Lw/A;

    invoke-static {v0}, Lw/A;->e(Lw/A;)Lw/v;

    move-result-object v0

    iget-object v1, p0, Lw/A$c;->a:Lw/A;

    invoke-static {v1, v0, p1, p2, p3}, Lw/A;->i(Lw/A;Lw/v;JI)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public b(JI)J
    .locals 2

    iget-object v0, p0, Lw/A$c;->a:Lw/A;

    invoke-static {v0}, Lw/A;->e(Lw/A;)Lw/v;

    move-result-object v0

    iget-object v1, p0, Lw/A$c;->a:Lw/A;

    invoke-static {v1, v0, p1, p2, p3}, Lw/A;->i(Lw/A;Lw/v;JI)J

    move-result-wide p1

    return-wide p1
.end method
