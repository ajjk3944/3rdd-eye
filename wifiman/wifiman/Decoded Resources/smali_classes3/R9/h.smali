.class public final synthetic LR9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/Fragment;

.field public final synthetic b:Lmh/p;

.field public final synthetic c:Lmh/p;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR9/h;->a:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, LR9/h;->b:Lmh/p;

    iput-object p3, p0, LR9/h;->c:Lmh/p;

    iput p4, p0, LR9/h;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LR9/h;->a:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, LR9/h;->b:Lmh/p;

    iget-object v2, p0, LR9/h;->c:Lmh/p;

    iget v3, p0, LR9/h;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, LR9/i;->a(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
