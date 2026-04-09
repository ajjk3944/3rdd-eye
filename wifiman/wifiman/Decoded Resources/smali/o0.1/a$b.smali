.class public final Lo0/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo0/a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lo0/h;

.field private b:Lp0/c;

.field final synthetic c:Lo0/a;


# direct methods
.method constructor <init>(Lo0/a;)V
    .locals 0

    iput-object p1, p0, Lo0/a$b;->c:Lo0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lo0/b;->a(Lo0/d;)Lo0/h;

    move-result-object p1

    iput-object p1, p0, Lo0/a$b;->a:Lo0/h;

    return-void
.end method


# virtual methods
.method public a(LY0/d;)V
    .locals 1

    iget-object v0, p0, Lo0/a$b;->c:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo0/a$a;->j(LY0/d;)V

    return-void
.end method

.method public b(LY0/t;)V
    .locals 1

    iget-object v0, p0, Lo0/a$b;->c:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo0/a$a;->k(LY0/t;)V

    return-void
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lo0/a$b;->c:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lo0/a$a;->h()J

    move-result-wide v0

    return-wide v0
.end method

.method public d()Lm0/n0;
    .locals 1

    iget-object v0, p0, Lo0/a$b;->c:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v0

    return-object v0
.end method

.method public e()Lo0/h;
    .locals 1

    iget-object v0, p0, Lo0/a$b;->a:Lo0/h;

    return-object v0
.end method

.method public f(J)V
    .locals 1

    iget-object v0, p0, Lo0/a$b;->c:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo0/a$a;->l(J)V

    return-void
.end method

.method public g()Lp0/c;
    .locals 1

    iget-object v0, p0, Lo0/a$b;->b:Lp0/c;

    return-object v0
.end method

.method public getDensity()LY0/d;
    .locals 1

    iget-object v0, p0, Lo0/a$b;->c:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lo0/a$a;->f()LY0/d;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, Lo0/a$b;->c:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lo0/a$a;->g()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public h(Lp0/c;)V
    .locals 0

    iput-object p1, p0, Lo0/a$b;->b:Lp0/c;

    return-void
.end method

.method public i(Lm0/n0;)V
    .locals 1

    iget-object v0, p0, Lo0/a$b;->c:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo0/a$a;->i(Lm0/n0;)V

    return-void
.end method
