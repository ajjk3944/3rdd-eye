.class final LC/s$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/s;->h(LB/x;ILC/r;IIIIIIJLw/q;Lf0/c$c;Lf0/c$b;ZJIILjava/util/List;Lx/j;LT/q0;LIi/N;Lmh/q;)LC/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/x;

.field final synthetic b:J

.field final synthetic c:LC/r;

.field final synthetic d:J

.field final synthetic e:Lw/q;

.field final synthetic f:Lf0/c$b;

.field final synthetic g:Lf0/c$c;

.field final synthetic h:Z

.field final synthetic i:I


# direct methods
.method constructor <init>(LB/x;JLC/r;JLw/q;Lf0/c$b;Lf0/c$c;ZI)V
    .locals 0

    iput-object p1, p0, LC/s$d;->a:LB/x;

    iput-wide p2, p0, LC/s$d;->b:J

    iput-object p4, p0, LC/s$d;->c:LC/r;

    iput-wide p5, p0, LC/s$d;->d:J

    iput-object p7, p0, LC/s$d;->e:Lw/q;

    iput-object p8, p0, LC/s$d;->f:Lf0/c$b;

    iput-object p9, p0, LC/s$d;->g:Lf0/c$c;

    iput-boolean p10, p0, LC/s$d;->h:Z

    iput p11, p0, LC/s$d;->i:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)LC/e;
    .locals 13

    iget-object v0, p0, LC/s$d;->a:LB/x;

    iget-wide v2, p0, LC/s$d;->b:J

    iget-object v4, p0, LC/s$d;->c:LC/r;

    iget-wide v5, p0, LC/s$d;->d:J

    iget-object v7, p0, LC/s$d;->e:Lw/q;

    iget-object v8, p0, LC/s$d;->f:Lf0/c$b;

    iget-object v9, p0, LC/s$d;->g:Lf0/c$c;

    invoke-interface {v0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v10

    iget-boolean v11, p0, LC/s$d;->h:Z

    iget v12, p0, LC/s$d;->i:I

    move v1, p1

    invoke-static/range {v0 .. v12}, LC/s;->a(LB/x;IJLC/r;JLw/q;Lf0/c$b;Lf0/c$c;LY0/t;ZI)LC/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LC/s$d;->a(I)LC/e;

    move-result-object p1

    return-object p1
.end method
