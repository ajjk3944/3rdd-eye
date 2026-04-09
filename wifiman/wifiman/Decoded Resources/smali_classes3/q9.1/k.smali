.class public final synthetic Lq9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lq9/h;

.field public final synthetic c:LIi/N;

.field public final synthetic d:Lq9/i;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lq9/h;LIi/N;Lq9/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/k;->a:Ljava/util/List;

    iput-object p2, p0, Lq9/k;->b:Lq9/h;

    iput-object p3, p0, Lq9/k;->c:LIi/N;

    iput-object p4, p0, Lq9/k;->d:Lq9/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lq9/k;->a:Ljava/util/List;

    iget-object v1, p0, Lq9/k;->b:Lq9/h;

    iget-object v2, p0, Lq9/k;->c:LIi/N;

    iget-object v3, p0, Lq9/k;->d:Lq9/i;

    check-cast p1, LA/y;

    invoke-static {v0, v1, v2, v3, p1}, Lq9/o;->e(Ljava/util/List;Lq9/h;LIi/N;Lq9/i;LA/y;)LYg/J;

    move-result-object p1

    return-object p1
.end method
