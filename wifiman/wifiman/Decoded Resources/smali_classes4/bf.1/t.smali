.class public final synthetic Lbf/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Landroidx/compose/runtime/snapshots/k;

.field public final synthetic b:Ljj/g;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lbf/j;

.field public final synthetic e:Lbf/k;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/snapshots/k;Ljj/g;Ljava/util/Map;Lbf/j;Lbf/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/t;->a:Landroidx/compose/runtime/snapshots/k;

    iput-object p2, p0, Lbf/t;->b:Ljj/g;

    iput-object p3, p0, Lbf/t;->c:Ljava/util/Map;

    iput-object p4, p0, Lbf/t;->d:Lbf/j;

    iput-object p5, p0, Lbf/t;->e:Lbf/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lbf/t;->a:Landroidx/compose/runtime/snapshots/k;

    iget-object v1, p0, Lbf/t;->b:Ljj/g;

    iget-object v2, p0, Lbf/t;->c:Ljava/util/Map;

    iget-object v3, p0, Lbf/t;->d:Lbf/j;

    iget-object v4, p0, Lbf/t;->e:Lbf/k;

    move-object v5, p1

    check-cast v5, LA/y;

    invoke-static/range {v0 .. v5}, Lbf/q$b;->e(Landroidx/compose/runtime/snapshots/k;Ljj/g;Ljava/util/Map;Lbf/j;Lbf/k;LA/y;)LYg/J;

    move-result-object p1

    return-object p1
.end method
