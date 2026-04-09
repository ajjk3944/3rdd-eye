.class public final synthetic LEe/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LEe/g;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lmh/l;

.field public final synthetic e:Lmh/r;

.field public final synthetic f:Lmh/r;


# direct methods
.method public synthetic constructor <init>(LEe/g;ZZLmh/l;Lmh/r;Lmh/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEe/q;->a:LEe/g;

    iput-boolean p2, p0, LEe/q;->b:Z

    iput-boolean p3, p0, LEe/q;->c:Z

    iput-object p4, p0, LEe/q;->d:Lmh/l;

    iput-object p5, p0, LEe/q;->e:Lmh/r;

    iput-object p6, p0, LEe/q;->f:Lmh/r;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LEe/q;->a:LEe/g;

    iget-boolean v1, p0, LEe/q;->b:Z

    iget-boolean v2, p0, LEe/q;->c:Z

    iget-object v3, p0, LEe/q;->d:Lmh/l;

    iget-object v4, p0, LEe/q;->e:Lmh/r;

    iget-object v5, p0, LEe/q;->f:Lmh/r;

    move-object v6, p1

    check-cast v6, LA/y;

    invoke-static/range {v0 .. v6}, LEe/z;->l(LEe/g;ZZLmh/l;Lmh/r;Lmh/r;LA/y;)LYg/J;

    move-result-object p1

    return-object p1
.end method
