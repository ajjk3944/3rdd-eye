.class final Ls/e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/e;->k(Lj0/d;Lm0/l0;JJZF)Lj0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/l0;

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:Lo0/g;


# direct methods
.method constructor <init>(Lm0/l0;JJLo0/g;)V
    .locals 0

    iput-object p1, p0, Ls/e$b;->a:Lm0/l0;

    iput-wide p2, p0, Ls/e$b;->b:J

    iput-wide p4, p0, Ls/e$b;->c:J

    iput-object p6, p0, Ls/e$b;->d:Lo0/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;)V
    .locals 12

    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object v1, p0, Ls/e$b;->a:Lm0/l0;

    iget-wide v2, p0, Ls/e$b;->b:J

    iget-wide v4, p0, Ls/e$b;->c:J

    iget-object v7, p0, Ls/e$b;->d:Lo0/g;

    const/16 v10, 0x68

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v11}, Lo0/f;->l0(Lo0/f;Lm0/l0;JJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/c;

    invoke-virtual {p0, p1}, Ls/e$b;->a(Lo0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
