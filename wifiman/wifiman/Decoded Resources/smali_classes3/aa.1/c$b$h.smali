.class public final Laa/c$b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/c$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Lb1/z;

.field final synthetic c:Lb1/o;

.field final synthetic d:I

.field final synthetic e:LT/q0;


# direct methods
.method public constructor <init>(LT/q0;Lb1/z;Lb1/o;ILT/q0;)V
    .locals 0

    iput-object p1, p0, Laa/c$b$h;->a:LT/q0;

    iput-object p2, p0, Laa/c$b$h;->b:Lb1/z;

    iput-object p3, p0, Laa/c$b$h;->c:Lb1/o;

    iput p4, p0, Laa/c$b$h;->d:I

    iput-object p5, p0, Laa/c$b$h;->e:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 8

    iget-object v0, p0, Laa/c$b$h;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    iget-object v1, p0, Laa/c$b$h;->b:Lb1/z;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    iget-object v5, p0, Laa/c$b$h;->c:Lb1/o;

    iget v7, p0, Laa/c$b$h;->d:I

    move-wide v2, p3

    move-object v6, p2

    invoke-virtual/range {v1 .. v7}, Lb1/z;->i(JLY0/t;Lb1/n;Ljava/util/List;I)J

    move-result-wide p3

    iget-object v0, p0, Laa/c$b$h;->e:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result v2

    invoke-static {p3, p4}, LY0/r;->f(J)I

    move-result v3

    new-instance v5, Laa/c$b$h$a;

    iget-object p3, p0, Laa/c$b$h;->b:Lb1/z;

    invoke-direct {v5, p3, p2}, Laa/c$b$h$a;-><init>(Lb1/z;Ljava/util/List;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
