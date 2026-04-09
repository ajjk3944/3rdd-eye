.class Landroidx/fragment/app/K$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/K;->a(Landroidx/fragment/app/K$e$c;Landroidx/fragment/app/K$e$b;Landroidx/fragment/app/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/K$d;

.field final synthetic b:Landroidx/fragment/app/K;


# direct methods
.method constructor <init>(Landroidx/fragment/app/K;Landroidx/fragment/app/K$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/K$b;->b:Landroidx/fragment/app/K;

    iput-object p2, p0, Landroidx/fragment/app/K$b;->a:Landroidx/fragment/app/K$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/K$b;->b:Landroidx/fragment/app/K;

    iget-object v0, v0, Landroidx/fragment/app/K;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/K$b;->a:Landroidx/fragment/app/K$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/fragment/app/K$b;->b:Landroidx/fragment/app/K;

    iget-object v0, v0, Landroidx/fragment/app/K;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/K$b;->a:Landroidx/fragment/app/K$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
