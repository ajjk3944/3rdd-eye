.class public final synthetic LA9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA9/g;->a:Ljava/util/List;

    iput-object p2, p0, LA9/g;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LA9/g;->a:Ljava/util/List;

    iget-object v1, p0, LA9/g;->b:Ljava/util/List;

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-static {v0, v1, p1}, LA9/h;->d(Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
