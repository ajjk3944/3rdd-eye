.class Landroidx/constraintlayout/core/parser/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/core/parser/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field a:Landroidx/constraintlayout/core/parser/d;

.field b:I


# direct methods
.method constructor <init>(Landroidx/constraintlayout/core/parser/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/constraintlayout/core/parser/d$a;->b:I

    iput-object p1, p0, Landroidx/constraintlayout/core/parser/d$a;->a:Landroidx/constraintlayout/core/parser/d;

    return-void
.end method


# virtual methods
.method public a()Landroidx/constraintlayout/core/parser/c;
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/core/parser/d$a;->a:Landroidx/constraintlayout/core/parser/d;

    iget-object v0, v0, Landroidx/constraintlayout/core/parser/a;->f:Ljava/util/ArrayList;

    iget v1, p0, Landroidx/constraintlayout/core/parser/d$a;->b:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/core/parser/c;

    iget v1, p0, Landroidx/constraintlayout/core/parser/d$a;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroidx/constraintlayout/core/parser/d$a;->b:I

    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Landroidx/constraintlayout/core/parser/d$a;->b:I

    iget-object v1, p0, Landroidx/constraintlayout/core/parser/d$a;->a:Landroidx/constraintlayout/core/parser/d;

    invoke-virtual {v1}, Landroidx/constraintlayout/core/parser/a;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/constraintlayout/core/parser/d$a;->a()Landroidx/constraintlayout/core/parser/c;

    move-result-object v0

    return-object v0
.end method
