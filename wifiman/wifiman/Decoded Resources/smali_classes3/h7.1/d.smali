.class public final synthetic Lh7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/d;->a:Lmh/l;

    iput-object p2, p0, Lh7/d;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lh7/d;->a:Lmh/l;

    iget-object v1, p0, Lh7/d;->b:Ljava/util/List;

    check-cast p1, Lj7/b;

    invoke-static {v0, v1, p1}, Lh7/g;->l(Lmh/l;Ljava/util/List;Lj7/b;)LYg/J;

    move-result-object p1

    return-object p1
.end method
