.class public final synthetic LEe/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LEe/g;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lmh/r;

.field public final synthetic e:Lmh/l;

.field public final synthetic f:Z

.field public final synthetic g:Lmh/r;

.field public final synthetic h:Lmh/q;


# direct methods
.method public synthetic constructor <init>(LEe/g;ZZLmh/r;Lmh/l;ZLmh/r;Lmh/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEe/t;->a:LEe/g;

    iput-boolean p2, p0, LEe/t;->b:Z

    iput-boolean p3, p0, LEe/t;->c:Z

    iput-object p4, p0, LEe/t;->d:Lmh/r;

    iput-object p5, p0, LEe/t;->e:Lmh/l;

    iput-boolean p6, p0, LEe/t;->f:Z

    iput-object p7, p0, LEe/t;->g:Lmh/r;

    iput-object p8, p0, LEe/t;->h:Lmh/q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LEe/t;->a:LEe/g;

    iget-boolean v1, p0, LEe/t;->b:Z

    iget-boolean v2, p0, LEe/t;->c:Z

    iget-object v3, p0, LEe/t;->d:Lmh/r;

    iget-object v4, p0, LEe/t;->e:Lmh/l;

    iget-boolean v5, p0, LEe/t;->f:Z

    iget-object v6, p0, LEe/t;->g:Lmh/r;

    iget-object v7, p0, LEe/t;->h:Lmh/q;

    move-object v8, p1

    check-cast v8, LA/y;

    invoke-static/range {v0 .. v8}, LEe/z;->k(LEe/g;ZZLmh/r;Lmh/l;ZLmh/r;Lmh/q;LA/y;)LYg/J;

    move-result-object p1

    return-object p1
.end method
