.class public final synthetic Lh7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LW7/d;

.field public final synthetic b:Lmh/l;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LW7/d;Lmh/l;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/e;->a:LW7/d;

    iput-object p2, p0, Lh7/e;->b:Lmh/l;

    iput-object p3, p0, Lh7/e;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lh7/e;->a:LW7/d;

    iget-object v1, p0, Lh7/e;->b:Lmh/l;

    iget-object v2, p0, Lh7/e;->c:Ljava/util/List;

    check-cast p1, Lj7/b;

    invoke-static {v0, v1, v2, p1}, Lh7/g;->k(LW7/d;Lmh/l;Ljava/util/List;Lj7/b;)LYg/J;

    move-result-object p1

    return-object p1
.end method
