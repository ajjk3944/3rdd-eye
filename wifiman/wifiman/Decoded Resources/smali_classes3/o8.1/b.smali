.class public final synthetic Lo8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:Lo8/d;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lo8/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo8/b;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lo8/b;->b:Lo8/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lo8/b;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lo8/b;->b:Lo8/d;

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lgd/a;

    invoke-static {v0, v1, p1, p2}, Lo8/d;->f(Ljava/util/ArrayList;Lo8/d;Ljava/lang/Integer;Lgd/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
