.class public final synthetic Lfa/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/Fragment;

.field public final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa/c;->a:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lfa/c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput p3, p0, Lfa/c;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfa/c;->a:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lfa/c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget v2, p0, Lfa/c;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lfa/d;->a(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
