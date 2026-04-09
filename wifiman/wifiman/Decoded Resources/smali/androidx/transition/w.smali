.class Landroidx/transition/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lo/a;

.field final b:Landroid/util/SparseArray;

.field final c:Lo/t;

.field final d:Lo/a;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo/a;

    invoke-direct {v0}, Lo/a;-><init>()V

    iput-object v0, p0, Landroidx/transition/w;->a:Lo/a;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/transition/w;->b:Landroid/util/SparseArray;

    new-instance v0, Lo/t;

    invoke-direct {v0}, Lo/t;-><init>()V

    iput-object v0, p0, Landroidx/transition/w;->c:Lo/t;

    new-instance v0, Lo/a;

    invoke-direct {v0}, Lo/a;-><init>()V

    iput-object v0, p0, Landroidx/transition/w;->d:Lo/a;

    return-void
.end method
