.class Lcom/google/android/material/datepicker/i$h;
.super LF1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/i;->K1(Landroid/view/View;Lcom/google/android/material/datepicker/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/google/android/material/datepicker/i;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/i$h;->d:Lcom/google/android/material/datepicker/i;

    invoke-direct {p0}, LF1/a;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;LG1/t;)V
    .locals 1

    invoke-super {p0, p1, p2}, LF1/a;->g(Landroid/view/View;LG1/t;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/i$h;->d:Lcom/google/android/material/datepicker/i;

    invoke-static {p1}, Lcom/google/android/material/datepicker/i;->I1(Lcom/google/android/material/datepicker/i;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/i$h;->d:Lcom/google/android/material/datepicker/i;

    sget v0, LO3/h;->u:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->T(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/i$h;->d:Lcom/google/android/material/datepicker/i;

    sget v0, LO3/h;->s:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->T(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, LG1/t;->s0(Ljava/lang/CharSequence;)V

    return-void
.end method
