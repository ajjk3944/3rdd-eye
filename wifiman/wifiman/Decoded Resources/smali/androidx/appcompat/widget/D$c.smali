.class Landroidx/appcompat/widget/D$c;
.super Landroidx/appcompat/widget/D$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Landroidx/appcompat/widget/D;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/D;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/D$c;->b:Landroidx/appcompat/widget/D;

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/D$b;-><init>(Landroidx/appcompat/widget/D;)V

    return-void
.end method


# virtual methods
.method public f(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/D$c;->b:Landroidx/appcompat/widget/D;

    invoke-static {v0, p1}, Landroidx/appcompat/widget/D;->h(Landroidx/appcompat/widget/D;I)V

    return-void
.end method

.method public j(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/D$c;->b:Landroidx/appcompat/widget/D;

    invoke-static {v0, p1}, Landroidx/appcompat/widget/D;->f(Landroidx/appcompat/widget/D;I)V

    return-void
.end method
