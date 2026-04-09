.class public final synthetic Lg2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lf2/k;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/List;Lf2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg2/h;->a:Z

    iput-object p2, p0, Lg2/h;->b:Ljava/util/List;

    iput-object p3, p0, Lg2/h;->c:Lf2/k;

    return-void
.end method


# virtual methods
.method public final j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 3

    iget-boolean v0, p0, Lg2/h;->a:Z

    iget-object v1, p0, Lg2/h;->b:Ljava/util/List;

    iget-object v2, p0, Lg2/h;->c:Lf2/k;

    invoke-static {v0, v1, v2, p1, p2}, Lg2/g$e;->a(ZLjava/util/List;Lf2/k;Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    return-void
.end method
